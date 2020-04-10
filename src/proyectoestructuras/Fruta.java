package proyectoestructuras;
/* @author Luisb
 */
public class Fruta {
    private String tipo;
    private int cant;
    private boolean seco = false;

    public Fruta() {
        int aux =(int) (Math.random() * (4-1) + 1);
        System.out.println("Fruta aux = " + aux);
        switch(aux) {
            case 1:
                tipo = "Naranjas";
                break;
            case 2:
                tipo = "Fresas";
                break;
            case 3:
                tipo = "Bananos";
                break;
        }
        this.setCant((int) (Math.random() * (51-20)+20));
    }

    public Fruta(String tipo, int cant, boolean seco) {
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
        return "Fruta: " + "tipo= " + tipo + ", estadoCapacidad= " + cant + ".";
    }

    public boolean isSeco() {
        return seco;
    }

    public void setSeco(boolean seco) {
        this.seco = seco;
    }
}
