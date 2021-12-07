package primer_aplicacion;

public class Juego {
    //Metodos Getters y Setters para las variables privadas "puntos" y "vidas"
    //Botón derecho, Insert Code, Getter and Setter, seleccionar variables, Generate
            public int getPuntos() {
                return puntos;
            }

            public void setPuntos(int puntos) {
                this.puntos = puntos;
            }

            public int getVidas() {
                return vidas;
            }

            public void setVidas(int vidas) {
                this.vidas = vidas;
            }
            
    //Variables
    private int puntos, vidas; 
    public String personaje, enemigos, aliados;
    
    //Constructor
    Juego (int puntos, int vidas, String personaje, String enemigos, String aliados){
        this.puntos=puntos;
        this.vidas=vidas;
        this.personaje=personaje;
        this.enemigos=enemigos;
        this.aliados=aliados;
    }
    
    //Metodo
    String mostrarSaludo(){
        return "Hola soy "+this.personaje+", y tengo "+this.vidas+" vidas.";
    }
}
