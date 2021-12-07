
package calculadora;

import java.util.Scanner;
import operaciones.Operaciones;

public class Calculadora {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el primer número");
        float num1 = entrada.nextFloat();
        System.out.println("Ingrese el segundo número");
        float num2 = entrada.nextFloat();
        System.out.println("Ingrese la operacion a realizar\n pulsa \"+\", \"-\", \"*\", \"/\"");
        String op = entrada.next();
        Operaciones operacion = new Operaciones(num1, num2, op);
        System.out.println("El resultado de la operación es: " + operacion.operacion());
    }
    
}
