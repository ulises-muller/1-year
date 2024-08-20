import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        PerroTP1 perrito = new PerroTP1();
        Duenio dueñito = new Duenio();
        System.out.println("pone el nombre del perro \n");
        Scanner nombrescan = new Scanner(System.in);
        String nom = nombrescan.next();
        perrito.setter(nom);
        System.out.println("su nombre es " + perrito.getter() + "\n");
        dueñito.ordenarladrar(perrito);
    }
}
