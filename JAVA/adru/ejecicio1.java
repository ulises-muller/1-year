
package adru;

import java.util.Scanner;

public class ejecicio1 {
    public static void main(String[] args) {
        Calcu();
    }

    public static void Calcu() {
        int op;
        do{
        System.out.println("ingresa los numero que quieras operar");
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        System.out.println("que operacion queres realizar");
        System.out.println("1-suma");
        System.out.println("2-resta");
        System.out.println("3-multiplicar");
        System.out.println("4-dividir");
        System.out.println("5-salir");
        op = scanner.nextInt();
        
            if (op == 1){
                System.out.println(suma(num1, num2));
                op = salir();
            } else if (op == 2){
                System.out.println(restar(num1, num2));
                op = salir();

            } else if (op == 3){
                System.out.println(multiplicar(num2, num1));
                op = salir();                
            } else if (op == 4){
                System.out.println(dividir(num1, num2));
                op = salir();
                
            } else if (op == 5){
                System.out.println("fin del programa");
                
            }
        }  while (op!=5);
    }

    private static int salir() {
        System.out.println("si quieres salir preciona 5");
        Scanner scanner = new Scanner(System.in);
        int fin = scanner.nextInt();
        return fin;
    }

    private static int suma(int x, int c) {
        return x + c;
    }

    private static int restar(int x, int c) {
        return x - c;
    }

    private static int multiplicar(int x, int c) {
        return x * c;
    }

    private static double dividir(double x, double c){
            return x/c;
    }
}