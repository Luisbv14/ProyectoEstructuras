package proyectoestructuras;

import java.util.Stack;

/* @author Luisb
 */
public class Contenedor {
    private int id;
    private String carga;
    private String descripCarga;
    private String ubicacion;
    private boolean dañado;
    private String tipoRepair;
    private String estadoCapacidad;
    private String fechaSalida;
    private String fechaEntrada;

    public Contenedor() {
        int aux =(int) (Math.random() * (3-1) + 1);
        switch(aux) {
            case 1:
                tipoRepair = "eliminacion de corrosion";
                break;
            case 2:
                tipoRepair = "correcion de imperfercciones";
                break;
            case 3:
                tipoRepair = "Pintura anti-corrosion";
                break;
        }
    }
    
    public Contenedor(Stack stack) {
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

    public String getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(String fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public String getFechaEntrada() {
        return fechaEntrada;
    }

    public void setFechaEntrada(String fechaEntrada) {
        this.fechaEntrada = fechaEntrada;
    }

    @Override
    public String toString() {
        return "Contenedor: " + "id= " + id + ", carga= " + carga + ", descripCarga= " + descripCarga + ", ubicacion= " + ubicacion + ", dañado= " + dañado + ", tipoRepair= " + tipoRepair + ", estadoCapacidad= " + estadoCapacidad + ", fechaSalida= " + fechaSalida + ", fechaEntrada= " + fechaEntrada + ".";
    }
    
    
}
