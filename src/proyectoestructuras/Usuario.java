package proyectoestructuras;
/* @author Luisb
 */
public class Usuario {
    private String contraseña;
    private int id;

    public Usuario() {
    }

    public Usuario(String contraseña, int id) {
        this.contraseña = contraseña;
        this.id = id;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Usuario: " + "contraseña=" + contraseña + ", id=" + id + ".";
    }
    
    
}
