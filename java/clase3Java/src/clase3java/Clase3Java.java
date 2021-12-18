package clase3java;

import departamento.Departamento;
import personal.Personal;
import recursosHumanos.Finanzas;

public class Clase3Java {

    public static void main(String[] args) {
        Personal administrativo = new Personal("Claudia","Chauque","Suarez 1036",23);
        administrativo.setSueldo(20500);
        System.out.println("Nombre: "+administrativo.nombre);
        System.out.println(administrativo.getSueldo());
        
        Personal it = new Personal("Tomas", "Caceres","CABA",30);
        it.setSueldo(30500);
        System.out.println("Nombre: "+it.nombre);
        System.out.println(it.getSueldo());
        
        Departamento legales = new Departamento("Juan", "Martinez","CABA",20,"Legales");
        legales.setSueldo(40500);
        System.out.println(legales.mostrarDatos());
        
        Finanzas juana= new Finanzas("Juana", "Elias","CABA",45,"Finanzas","asistente");
        System.out.println("\n Le abonamos el sueldo a: "+juana.nombre+" por la cantidad de: "+juana.AbonarSueldo()
        +" pesos");
    }
}
