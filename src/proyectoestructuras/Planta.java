package proyectoestructuras;
/* @author Luisb
 */
public class Planta {
    private String tipo;
    private int cant;

    public Planta() {
        int aux =(int) (Math.random() * (3-1) + 1);
        switch(aux) {
            case 1:
                tipo = "Orquídeas";
                break;
            case 2:
                tipo = "Aloe Vera";
                break;
            case 3:
                tipo = "Romero";
                break;
        }
        this.setCant((int) (Math.random() * (50-20)+20));
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

    public final void setCant(int cant) {
        this.cant = cant;
    }

    @Override
    public String toString() {
        return "Planta: " + "tipo= " + tipo + ", cant= " + cant + ".";
    }
}
