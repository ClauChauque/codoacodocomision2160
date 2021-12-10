
package departamento;

import personal.Personal;

public class Departamento extends Personal{
    public Departamento(String nombre, String apellido, String domicilio, int edad, String depto){
        /*Se llama a la clase padre*/
        super(nombre, apellido, domicilio, edad); 
    }
    public String mostrarDatos(){
        return "\n Nombre: "+nombre+"\n Apellido: "+apellido+
                "\n Domicilio: "+domicilio+"\n Edad: "+edad+"\n Sueldo: "+ getSueldo();
    }
}
