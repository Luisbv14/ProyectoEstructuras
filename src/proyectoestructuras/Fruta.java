package proyectoestructuras;
/* @author Luisb
 */
public class Fruta {
    private String tipo;
    private int cant;

    public Fruta() {
        int aux =(int) (Math.random() * (3-1) + 1);
        switch(aux) {
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
        }
        this.set
    }

    public Fruta(String tipo, int cant) {
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

    @Override
    public String toString() {
        return "Fruta: " + "tipo= " + tipo + ", estadoCapacidad= " + cant + ".";
    }
}
