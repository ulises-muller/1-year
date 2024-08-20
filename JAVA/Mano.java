 class DedoPulgar
{
    String nombre;
    int identif;
public
    DedoPulgar()
    {
        this.nombre="Dedo Pulgar";
        this.identif=1;
        System.out.println("Se crea el Ojeto: "+this.nombre +" Identificado Dedo: "+ this.identif);
    }
};
class DedoIndice
{
    String nombre;
    int identif;
public
    DedoIndice()
    {
        this.nombre="Dedo Indice";
        this.identif=2;
        System.out.println("Se crea el Ojeto: "+this.nombre + " Identificado Dedo: "+this.identif);
    }
};
class DedoMedio
{
    String nombre;
    int identif;
public
    DedoMedio()
    {
        this.nombre="Dedo Medio";
        this.identif=3;
        System.out.println("Se crea el Ojeto: "+this.nombre+" Identificado Dedo: "+this.identif);
    }
};
class DedoAnular
{
    String nombre;
    int identif;
public
    DedoAnular()
    {
        this.nombre="Dedo Anular";
        this.identif=4;
        System.out.println("Se crea el Ojeto: "+this.nombre+" Identificado Dedo: "+this.identif);
    }
};
class DedoMenique
{
    String nombre;
    int identif;
public
    DedoMenique()
    {
        this.nombre="Dedo Menique";
        this.identif=5;
        System.out.println("Se crea el Ojeto: "+this.nombre+" Identificado Dedo: "+this.identif);
    }
}
public class Mano 
{
	String nombre; 
    DedoPulgar dedoPulgar = new DedoPulgar();
    DedoIndice dedoIndice = new DedoIndice();
    DedoMedio dedoMedio   = new DedoMedio();
    DedoAnular dedoAnular = new DedoAnular();
    DedoMenique dedoMenique= new DedoMenique();
public
    Mano()
    {
        this.nombre="Mano Humana";
        System.out.println("Se crea Objeto mano1 con nombre: "+this.nombre+" con sus cinco dedos");
    }


	public static void main(String[] args) 
	{
		Mano mano1= new Mano();
	}
}