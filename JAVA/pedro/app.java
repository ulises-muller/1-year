package adru.pedro;

import java.time.LocalDate;

public class app {
    public static void main(String[] args) {
        Remito remito = new Remito("00352", "juan", LocalDate.now());
        remito.agregarItems("Silla", 12000, 1);
        remito.agregarItems("Mesa", 12000, 1);
        System.out.println(remito);
    }
}
