package adru.pedro;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Remito {

private String numRemito;
private String nomCliente;
private LocalDate fecha;
private List<tp> items = new ArrayList<tp>();
public Remito(String numRemito, String nomCliente, LocalDate fecha) {
if(numRemito.equals(""))
throw new RuntimeException("Numero no debe estar vacio");
this.numRemito = numRemito;
this.nomCliente = nomCliente;
this.fecha = fecha;
}
public void agregarItems(String descripcion, double precio, int cantidad) {
tp item = new tp(descripcion, precio, cantidad);
items.add(item);
}
@Override
    public String toString() {
        return "Remito [numRemito=" + numRemito + ", nomCliente=" + nomCliente + ", fecha=" + fecha + ", items=" + items
                + "]";
    }
}