package adru;

import java.util.Scanner;

public class rand {
    //datos
    static int p2;
    static int p1;
    static int puntaje1;
    static int puntaje2;
    static int salir;
    static Scanner scanf = new Scanner(System.in);
    static String a;
    static String a1;
    static String barraArray[] = {
            "----------",
            "#---------",
            "##--------",
            "###-------",
            "####------",
            "#####-----",
            "######----",
            "#######---",
            "########--",
            "#########-",
            "##########"
    };
    //datos

    private static void juego() {
    
        do {
            System.out.println("--> Jugador 1 / adivina el proximo numero 1 a 10 ");
            System.out.println("tu puntaje es " + puntaje1 + " tu progreso es <" + barra1() + "> ");
            p1 = scanf.nextInt();
            System.out.println("--> Jugador 2 / adivina el proximo numero 1 a 10 ");
            System.out.println("tu puntaje es " + puntaje2 + " tu progreso es <" + barra2() + "> ");
            p2 = scanf.nextInt();
            tirada();
            if (puntaje1 == 10) {
                System.out.println("Jugador 1 Ganasteeeeeee!");
                break;
            }
            if (puntaje2 == 10) {
                System.out.println("Jugador 2 Ganasteeeeee!");
                break;
            } else {
                salirr();
            }
        } while (salir != 11);
    }

    private static void tirada() {
        if (rando() == p1) {
            System.out.println("Jugador 1 le pegaste!!! +1 ");
            puntaje1 += 1;
        } else {
            System.out.println("Jugador 1 / le erraste :c ");
        }
        if (rando() == p2) {
            System.out.println("Jugador 2 le pegaste!!! +1 ");
            puntaje2 += 1;
        } else {
            System.out.println("Jugador 2 / le erraste :c ");
        }
    }

    private static String barra2() {
        for (int i = 0; i <= puntaje2; i++) {
            a1 = barraArray[i];
        }
        return a1;
    }

    private static String barra1() {
        for (int i = 0; i <= puntaje1; i++) {
            a = barraArray[i];
        }
        return a;
    }

    private static void salirr() {
        System.out.println("Quieres salir ingresa -> 11");
        salir = scanf.nextInt();
    }

    static int rando() {
        int a = (int) (Math.random() * 3);
        return a;
    }

    public static void main(String[] args) {
        juego();
    }

}
