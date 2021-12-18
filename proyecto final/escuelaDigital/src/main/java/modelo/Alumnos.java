
package modelo;

public class Alumnos {
    private int id;
    private String nombre;
    private String apellido;
    private String email;
    private int telefono;
    
    //Getters and Setters 
    //Get y Set de ID
    public int getId() { 
        return id; 
    }
    public void setId(int id) { 
        this.id = id; 
    }
    //Get y Set de NOMBRE
    public String getNombre() { 
        return nombre;
    }
    public void setNombre(String nombre) { 
        this.nombre = nombre;
    }
    //Get y Set de APELLIDO
    public String getApellido() { 
        return apellido;
    }
    public void setApellido(String apellido) { 
        this.apellido = apellido;
    }
    //Get y Set de EMAIL
    public String getEmail() { 
        return email; 
    }
    public void setEmail(String email) { 
        this.email = email; 
    }
    //Get y Set de TELEFONO
    public int getTelefono() { 
        return telefono; 
    }
    public void setTelefono(int telefono) { 
        this.telefono = telefono; 
    }
    
    //Constructor
    public Alumnos(int id, String nombre, String apellido, String email, int telefono){
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.telefono = telefono;
    }
}
