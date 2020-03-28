package proyectoestructuras;
/* @author Luisb
 */
public class Fruta {
    private String tipo;
    private int estadoCapacidad;
    private String fechaExpiracion;

    public Fruta() {
    }

    public Fruta(String tipo, int cant, String fechaExpiracion) {
        this.tipo = tipo;
        this.estadoCapacidad = cant;
        this.fechaExpiracion = fechaExpiracion;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getEstadoCapacidad() {
        return estadoCapacidad;
    }

    public void setEstadoCapacidad(int estadoCapacidad) {
        this.estadoCapacidad = estadoCapacidad;
    }

    public String getFechaExpiracion() {
        return fechaExpiracion;
    }

    public void setFechaExpiracion(String fechaExpiracion) {
        this.fechaExpiracion = fechaExpiracion;
    }
    
}
