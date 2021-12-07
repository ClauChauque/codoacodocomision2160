
package escueladigital;

public class Campus {
    public int id;
    public String nombre;
    private String password;
    
    public void setPassword(String pass){
        this.password = pass;
    }
    public String getPassword(){
        return this.password;
    }
    public Campus(int id, String nombre){
        this.id=id;
        this.nombre=nombre;
    }
    public boolean ingresar(int id, String password){
        if (this.id == id && (this.password == null ? password == null : this.password.equals(password))){
            return true;
        } else {
            return false;
        }
    }
}
