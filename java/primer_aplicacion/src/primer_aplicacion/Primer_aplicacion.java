package primer_aplicacion;

public class Primer_aplicacion {
    public static void main(String[] args) { //Dentro de este metodo se ejecuta lo que es la aplicación
        //VARIABLES
        int numero;
        String nombre;
        float porcentaje;
        boolean llueve = false;
        numero = 13;
        float resultado;
        resultado = numero + 19; //float + entero = entero
        porcentaje= (numero + 19) / 2;
        System.out.println("Hola esta es mi primer aplicación");
        System.out.println(resultado);
        System.out.println("El promedio es: " + porcentaje);
        System.out.println(45 > 19 && 19 < 2);
        System.out.println("");
        if (llueve == true){
            System.out.println("Usamos paraguas");
        } else {
            System.out.println("No usaremos paraguas");
        }
        //Uso del constructor "Juego"
        Juego jugador = new Juego(0,3,"Mario","Hongos","Luigi");
        Juego jugador2 = new Juego(0,3,"Juan","Hongos","Martillo");

        System.out.println("Mi nombre es: " + jugador.personaje);
        System.out.println("Tengo: " + jugador.getVidas() + " vidas");
        System.out.println(jugador.mostrarSaludo());
        System.out.println(jugador2.mostrarSaludo());
    }
    
}