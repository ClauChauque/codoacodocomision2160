
package clase2java;

public class Ingreso {
    private String usuario, pass;
    private String miUsuario = "Clau";
    private String miPass = "123456";
    
    public String getUsuario(){
     return usuario;
    }
    public void setUsuario(String us){
        usuario = us;
    }

    public String getPass() {
        return pass;
    }
    public void setPass(String pass) {
        this.pass = pass;
    }
    
    public boolean validar (){
        if (usuario.equals(miUsuario) && pass.equals(miPass)){
        return true;
        } else {
            return false;
        }
    }
}
