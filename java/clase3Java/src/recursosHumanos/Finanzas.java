
package recursosHumanos;

import departamento.Departamento;

public class Finanzas extends Departamento{
    public String cargo;
    public Finanzas(String nombre, String apellido, String domicilio, int edad, String depto, String cargo) {
        super(nombre, apellido, domicilio, edad, depto);
        this.cargo=cargo;
    }
    public float AbonarSueldo(){
        switch (cargo) {
            case "gerente":
                return 90200;
            case "asistente":
                return 60500;
            default:
                return 0;
        }
    }
}
