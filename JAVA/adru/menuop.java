
package adru;

import java.util.Scanner;

public class menuop {
    public static void main(String[] args) {
        menu();
    }

    private static void menu() {
        Scanner scanner = new Scanner(System.in);
        int opc;
        do {
            do {
                System.out.println("MENU DE OPERACIONES");
                System.out.println("1 - compras");
                System.out.println("2 - ventas");
                System.out.println("3 - reclamos");
                System.out.println("4 - salir");
                System.out.println("Ingrese una opcion: ");
                opc = scanner.nextInt();

                if (opc == 4) {
                    System.out.println("Fin Programa");
                }

            } while (opc < 1 && opc > 4);

            switch (opc) {
                case 1:
                    compras();
                    seguir(scanner);
                    break;
                case 2:
                    ventas();
                    seguir(scanner);
                    break;
                case 3:
                    reclamos();
                    seguir(scanner);
                    break;
            }

        } while (opc != 4);
    }

    private static void reclamos() {
        System.out.println("entraste a reclamos");
    }

    private static void ventas() {
        System.out.println("entraste a ventas");
    }

    private static void compras() {
        System.out.println("entraste en compras");
    }

    static void seguir(Scanner Teclado) {
        int x;
        System.out.print("Si quiere continuar apriete cualquier número \n");
        x = Teclado.nextInt();
    }
}
