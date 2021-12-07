
package clase2java;

import java.util.Scanner;

public class Clase2java {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese su nombre: ");
        String nombre = entrada.nextLine();
        /*System.out.println("Ingrese su edad: ");
        int edad = entrada.nextInt();
        
        System.out.println("Bienvenid@! "+nombre+", usted tiene "+edad+" años");*/

        System.out.println("Ingrese su contraseña: ");
        String pass = entrada.nextLine();
        
        Ingreso ingresar = new Ingreso();
        ingresar.setUsuario(nombre);
        ingresar.setPass(pass);
        if(ingresar.validar()){
            System.out.println("Bienvenid@ "+ ingresar.getUsuario());
        }else{
            System.out.println("Los datos son incorrectos!!");
        }
    }
    
}
