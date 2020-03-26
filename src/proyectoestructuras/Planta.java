package proyectoestructuras;
/* @author Luisb
 */
public class Planta {
    private String tipo;
    private int cant;

    public Planta() {
    }

    public Planta(String tipo, int cant) {
        this.tipo = tipo;
        this.cant = cant;
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
    
}
