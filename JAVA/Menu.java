import java.util.Scanner;
public class Menu 
{	
	void menu()
	        {
		        Scanner Teclado = new Scanner(System.in);
	            int opc, x;
	            do
	            {
	                do
	               {	                   
	                    System.out.println("MENU DE OPERACIONES");
	                    System.out.println("1 - Sumar") ;
	                    System.out.println("2 - Restar") ;
	                    System.out.println("3 - Multiplicar") ;
	                    System.out.println("4 - Dividir") ;
	                    System.out.println("5 - Salir")   ;
	                    System.out.println("Ingrese una opcion: ");
	                    opc=Teclado.nextInt();
	                   
	                    if(opc==5)
	                    {
	                    	System.out.println("Fin Programa");	
	                    }
	                    else
                                seguir(Teclado);
         
	                } while(opc < 1 && opc > 5);

	                switch (opc)
	                {
	                    case 1:                    	
	                    	sumar();
	                        seguir(Teclado);
	                        break;
	                    case 2:
	                        restar();
	                        seguir(Teclado);
	                        break;
	                    case 3:
	                        multiplicar();	                        
                            seguir(Teclado);
	                        break;
	                    case 4:
	                        dividir();
	                        seguir(Teclado);                                
	                        break;
	               }

	            }while (opc != 5);
	 }





	 void sumar()
	 {
	     Scanner teclado = new Scanner(System.in);
	     int a,b,r;
	     System.out.println("Estoy en Sumar");
	     System.out.println("Ingrese un valor entero: ");
	     a=teclado.nextInt();
	     System.out.println("Ingrese un valor entero: ");
	     b=teclado.nextInt();
	     r=a+b;
	     System.out.println("\nLa suma de a: "+ a +" y b: "+ b +" El resultado es: " + r);
	 }
	  void restar()
	 {
	     Scanner teclado = new Scanner(System.in);
	     int a,b,r;
	     System.out.println("Estoy en Restar");
	     System.out.println("Ingrese un valor entero: ");
	     a=teclado.nextInt();
	     System.out.println("Ingrese un valor entero: ");
	     b=teclado.nextInt();
	     r=a-b;
	     System.out.println("\nLa resta de a: "+ a +" y b: "+ b +" El resultado es: " + r);
	 }
	  void multiplicar()
	 {
	     Scanner teclado = new Scanner(System.in);
	     int a,b,r;
	     System.out.println("Estoy en Multiplicar");
	     System.out.println("Ingrese un valor entero: ");
	     a=teclado.nextInt();
	     System.out.println("Ingrese un valor entero: ");
	     b=teclado.nextInt();
	     r=a*b;
	     System.out.println("\nEl Producto de a: "+ a +" y b: "+ b +" El resultado es: " + r);
	 }
	 void dividir()
	 {
	     Scanner teclado = new Scanner(System.in);
	     int a,b,r;
	     System.out.println("Estoy en Dividir");
	     System.out.println("Ingrese un valor entero: ");
	     a=teclado.nextInt();
	     System.out.println("Ingrese un valor entero: ");
	     b=teclado.nextInt();
	     r=a/b;
	     System.out.println("\nEl Cociente de a: "+ a +" y b: "+ b +" El resultado es: " + r);
	 }

	public static void main(String[] args) 
	{
		Menu menu= new Menu();	
		menu.menu();		
	}
	static void seguir(Scanner Teclado)
	{
		int x;
		System.out.print("Si quiere continuar apriete cualquier número");
        x=Teclado.nextInt();
	}
    }


