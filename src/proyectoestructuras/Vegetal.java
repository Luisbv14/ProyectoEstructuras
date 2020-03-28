package proyectoestructuras;
/* @author Luisb
 */
public class Vegetal {
    private String tipo;
    private int cant;
    private boolean seco = false;

    public Vegetal() {
        int aux =(int) (Math.random() * (3-1) + 1);
        switch(aux) {
            case 1:
                tipo = "Zanahorias";
                seco = true;
                break;
            case 2:
                tipo = "Lechuga";
                break;
            case 3:
                tipo = "Arroz";
                seco = true;
                break;
        }
        this.setCant((int) (Math.random() * (50-20)+20));
    }

    public Vegetal(String tipo, int cant, boolean seco) {
        this.tipo = tipo;
        this.cant = cant;
        this.seco = seco;
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
        return "Vegetal: " + "tipo= " + tipo + ", cant= " + cant + ".";
    }

    public boolean isSeco() {
        return seco;
    }

    public void setSeco(boolean seco) {
        this.seco = seco;
    }
}
