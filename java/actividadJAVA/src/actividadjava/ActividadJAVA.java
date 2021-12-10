
package actividadjava;

import java.util.Scanner;

public class ActividadJAVA {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese su nombre: ");
        String nombre = entrada.next();
        System.out.println("Ingrese su apellido: ");
        String apellido = entrada.next();
        System.out.println("Ingrese su edad: ");
        int edad = entrada.nextInt();
        System.out.println("Ingrese su hobbie: ");
        String hobbie = entrada.next();
        System.out.println("Ingrese su editor de código preferido: ");
        String editorCodigo = entrada.next();
        System.out.println("Ingrese el sistema operativo que utiliza: ");
        String sistemaOperativo = entrada.next();
        System.out.println("\n Los datos ingresados indican que usted es "+nombre+" "+apellido
        +", tiene "+edad+" años, su hobbie es "+hobbie+", su editor de código favorito es "+editorCodigo
        +" y usa el sistema operativo "+sistemaOperativo);
    }
    
}
