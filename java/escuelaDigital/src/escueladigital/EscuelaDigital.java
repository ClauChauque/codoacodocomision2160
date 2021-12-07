
package escueladigital;

import alumnos.Alumno;
import docentes.Docente;

public class EscuelaDigital {

    public static void main(String[] args) {
        Docente docente1 = new Docente(6,"Juan","Sanches",45);
        Alumno alumno1 = new Alumno(16,"Roberto","Caceres",20,10);
        Campus campus = new Campus(14,"CaC4.0");
        campus.setPassword("123456");
        Campus docente = new Campus(12,"CaC4.0");
        docente.setPassword("147258");
        System.out.println(docente.ingresar(12, "147258"));
    }
    
}
