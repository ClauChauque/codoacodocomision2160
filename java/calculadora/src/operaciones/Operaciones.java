
package operaciones;

public class Operaciones {
    //Creamos las variables
    public float num1, num2;
    public String op;
    
    //Creamos la función constructor
    public Operaciones(float num1, float num2, String op){
        this.num1=num1; /*inicializamos los atributos*/
        this.num2=num2;
        this.op=op;
    }
    
    //Creamos una función con if anidados y lo reacomodamos en un Switch
    public float operacion(){
        switch (op) {
            case "+":
                return num1 + num2;
            case "-":
                return num1 - num2;
            case "*":
                return num1 * num2;
            case "/":
                return num1 / num2;
            default:
                return 0;
        }
    }
    /*A diferencia de las funciones, los metodos se encargan de modificar el valor 
    de un atributo pero no retorna nada*/
}