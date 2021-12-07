
package operaciones;

public class Operaciones {
    public float num1, num2;
    public String op;
    public Operaciones(float num1, float num2, String op){
        this.num1=num1;
        this.num2=num2;
        this.op=op;
    }
    public float operacion(){
        if(op.equals("+")){
            return num1 + num2;
        }else if(op.equals("-")){
            return num1 - num2;
        }else if(op.equals("*")){
            return num1 * num2;
        }else if(op.equals("/")){
            return num1 / num2;
        }else{
        return 0;
        }
    }
}