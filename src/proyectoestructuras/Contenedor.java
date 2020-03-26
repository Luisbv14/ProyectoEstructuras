package proyectoestructuras;
/* @author Luisb
 */
public class Contenedor {
    private int id;
    private String carga;
    private String descripCarga;
    private String ubicacion;

    public Contenedor() {
    }

    public Contenedor(int id, String carga, String descripCarga, String ubicacion) {
        this.id = id;
        this.carga = carga;
        this.descripCarga = descripCarga;
        this.ubicacion = ubicacion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCarga() {
        return carga;
    }

    public void setCarga(String carga) {
        this.carga = carga;
    }

    public String getDescripCarga() {
        return descripCarga;
    }

    public void setDescripCarga(String descripCarga) {
        this.descripCarga = descripCarga;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    @Override
    public String toString() {
        return "Contenedor: " + "id=" + id + ", carga=" + carga + ", descripCarga=" + descripCarga + ", ubicacion=" + ubicacion + ".";
    }
    
    
}
