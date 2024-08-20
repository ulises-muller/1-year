package adru.pedro;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class error {
    public static void main(String[] args) {
        try{
            FileReader lector = new FileReader("lee.txt");
                System.out.println("Encontrado");
                    System.out.println(lector);
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }    
}

