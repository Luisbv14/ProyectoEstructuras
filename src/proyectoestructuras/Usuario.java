package proyectoestructuras;
/* @author Luisb
 */
public class Usuario {
    private String contraseña;
    private String id;

    public Usuario() {
    }

    public Usuario(String contraseña, String id) {
        this.contraseña = contraseña;
        this.id = id;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Usuario: " + "contraseña=" + contraseña + ", id=" + id + ".";
    }
    
    
}
