
import java.util.Scanner;
public class Alumno {
    private
        String nombre;
        int edad;
        float promedio;
    public
        Alumno(){
            nombre="Juan";
            edad=23;
            promedio=8.25f;
            System.out.println("se creo el alumno " + nombre);
        }
        Alumno(String nom1, int eda, float pro){
            nombre=nom1;
            edad=eda;
            promedio=pro;
            System.out.println("se creo el alumno " + nombre);
        }
        void setterEdad(int eda){
            edad=eda;
        }
        void setterPromedio(float pro){
            promedio=pro;
        } 
        void setterNombre(String nom){
            nombre=nom;
        }
        int getEdad(){
            return edad;
        }
        float getPromedio(){
            return promedio;
        }
        String getNombre(){
            return nombre;
        }
        @Override
        public String toString(){
            return getNombre() +" - "+ getEdad() +" - "+ getPromedio();
        }
        public static void main(String[] args) {
        Alumno alu1 = new Alumno();
        System.out.println("ingrese algo y precione enter para continuar..");
        Scanner pause = new Scanner(System.in);
        String pau = pause.next();
        Alumno alu2 = new Alumno("Ana", 22, 9.25f);
        System.out.println("ingrese algo y precione enter para continuar..");
        String pau1 = pause.next();
        System.out.println(alu1);
        System.out.println("ingrese algo y precione enter para continuar..");
        String pau2 = pause.next();
        System.out.println(alu2);
        }
}
