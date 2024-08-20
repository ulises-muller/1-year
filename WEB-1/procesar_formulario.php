<html>
<head>
<title>procesarformulario</title>
</head>
<body>
<?php
if ($_SERVER['REQUEST_METHOD'] === 'POST') {
   $nombre = $_POST['nombre'];
   $apellido = $_POST['apellido'];
   $dni = $_POST['dni'];
   $telefono = $_POST['telefono'];
   $email = $_POST['email'];
   $consulta =$_POST['consulta'];
   $fecha = date("d/m/Y");
  $datos = "Fecha: $fecha\nNombre: $nombre\nEmail: $email\n fecha";

  $file = 'datos.txt';

  file_put_contents($file, $datos, FILE_APPEND);

   $para = 'noAndaGmail' ;
   $mensajecorreo = "Nombre y apellido: $nombre $apellido\n DNI: $dni\n Telefono: $telefono\n Email: $email\n Consulta: $consulta";
   $cabecera = "From: $email";
   mail($para, $titulo, $mensajecorreo, $cabecera);

   echo "FUNCIONO";

   header('Location: index.html');
}

?>
</body>
</html>