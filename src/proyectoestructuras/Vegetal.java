package proyectoestructuras;
/* @author Luisb
 */
public class Vegetal {
    private String tipo;
    private int cant;
    private String fechaExpiracion;

    public Vegetal() {
    }

    public Vegetal(String tipo, int cant, String fechaExpiracion) {
        this.tipo = tipo;
        this.cant = cant;
        this.fechaExpiracion = fechaExpiracion;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getCant() {
        return cant;
    }

    public void setCant(int cant) {
        this.cant = cant;
    }

    public String getFechaExpiracion() {
        return fechaExpiracion;
    }

    public void setFechaExpiracion(String fechaExpiracion) {
        this.fechaExpiracion = fechaExpiracion;
    }

    @Override
    public String toString() {
        return "Vegetal: " + "tipo= " + tipo + ", cant= " + cant + ", fechaExpiracion= " + fechaExpiracion + ".";
    }
    
}
