package adru.pedro;

public class tp {
    private String descripcion;
    private double precio;
    private int cantidad;
    public tp(String descripcion, double precio, int cantidad){
        if (precio==0) throw new RuntimeException("Error");
        this.descripcion = descripcion;
        this.precio = precio;
        this.cantidad = cantidad;
        }
    @Override
    public String toString() {
        return "tp [descripcion=" + descripcion + ", precio=" + precio + ", cantidad=" + cantidad + "]";
    }
    }
