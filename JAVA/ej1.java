package adru.adruu;

import java.util.Arrays;
import java.util.Scanner;

class Cliente {
    String nombre;
    String apellido;
    int edad;
    int [] telefonos = new int[3];
    public Cliente(String nom, String apel, int eda){
            nombre = nom;
            apellido = apel;
            edad = eda;
            telefono();
        }
    void telefono(){
        for (int i = 0; i < telefonos.length; i++) {
            System.out.println("ingresa un telefono "+ nombre);
            int tele = ej1.scaner.nextInt();
            telefonos[i] = tele;
        }
    }
    @Override
    public String toString() {
        return "Cliente [nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", telefonos="
                + Arrays.toString(telefonos) + "]";
    }
}


public class ej1 {    
    public static void main(String[] args) {
         sistema();    
    }
    
    static Scanner scaner = new Scanner(System.in);
    static String nomb;
    static String apel;
    static int eda;
    private static void sistema() {
            
        
            pedirdatos();
            Cliente cliente = new Cliente(nomb ,apel ,eda);
            System.out.println(cliente);
            pedirdatos();
            Cliente cliente2 = new Cliente(nomb ,apel ,eda);
            System.out.println(cliente2);
            pedirdatos();
            Cliente cliente3 = new Cliente(nomb ,apel ,eda);
            System.out.println(cliente3);
            pedirdatos();            
            Cliente cliente4 = new Cliente(nomb ,apel ,eda);
            System.out.println(cliente4);
            pedirdatos();
            Cliente cliente5 = new Cliente(nomb ,apel ,eda);
            System.out.println(cliente5);
    }

    private static void pedirdatos() {
        System.out.println("ingresa el nombre");
        ej1.nomb = ej1.scaner.next();
        System.out.println("ingresa el apellido");
        ej1.apel = ej1.scaner.next();
        System.out.println("ingresa la edad");
        ej1.eda = ej1.scaner.nextInt();
    }
    
}