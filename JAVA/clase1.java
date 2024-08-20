public class clase1
{  
   
	private
	int a=5;
	int b=10;
	public	
    int FunSuma()
   {
	return this.a + this.b;
   }
	public static void main(String[] args) 
	{
		clase1 sumador=new clase1();
		int suma=0;		
		sumador.a=20;
		sumador.b=30;
		suma=sumador.FunSuma();
		System.out.println("La suma de a y b es: "+ suma+" / "+ sumador.a);
	}
}