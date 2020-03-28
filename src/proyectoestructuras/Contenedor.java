package proyectoestructuras;
/* @author Luisb
 */
public class Contenedor {
    private int id;
    private String carga;
    private String descripCarga;
    private String ubicacion;
    private boolean dañado;
    private String condicion;
    private String tipoRepair;
    private String estadoCapacidad;

    public Contenedor() {
    }

    public Contenedor(int id, String carga, String descripCarga, String ubicacion, boolean dañado, String condicion, String tipoRepair, String estadoCapacidad) {
        this.id = id;
        this.carga = carga;
        this.descripCarga = descripCarga;
        this.ubicacion = ubicacion;
        this.dañado = dañado;
        this.condicion = condicion;
        this.tipoRepair = tipoRepair;
        this.estadoCapacidad = estadoCapacidad;
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
        return "Contenedor: " + id + ", carga=" + carga + ", descripCarga=" + descripCarga + ", ubicacion=" + ubicacion + ".";
    }

    public String getCondicion() {
        return condicion;
    }

    public void setCondicion(String condicion) {
        this.condicion = condicion;
    }

    public String getTipoRepair() {
        return tipoRepair;
    }

    public void setTipoRepair(String tipoRepair) {
        this.tipoRepair = tipoRepair;
    }

    public boolean isDañado() {
        return dañado;
    }

    public void setDañado(boolean dañado) {
        this.dañado = dañado;
    }

    public String getEstadoCapacidad() {
        return estadoCapacidad;
    }

    public void setEstadoCapacidad(String estadoCapacidad) {
        this.estadoCapacidad = estadoCapacidad;
    }
    
    
}
