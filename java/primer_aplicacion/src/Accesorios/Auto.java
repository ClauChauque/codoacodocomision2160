package Accesorios;

public class Auto {
    public int velocidad;
    private boolean encendido;
    public int cantPasajeros;
    public String color, modelo, año, patente;
    
    //Getter y Setter de "encendido"
    public boolean isEncendido() {
        return encendido;
    }

    public void setEncendido(boolean encendido) {
        this.encendido = encendido;
    }
    //Constructor de Auto
    public Auto(int velocidad,int cantPasajeros, String color, String modelo, String año,String patente){
        this.velocidad=velocidad;
        this.cantPasajeros=cantPasajeros;
        this.color=color;
        this.modelo=modelo;
        this.año=año;
        this.patente=patente;
    }
    public boolean encender_auto(){
        if(this.isEncendido()){
            System.out.println("El auto está encendido!!");
            return false;
        }else{
            System.out.println("El auto se está encendiendo");
            return true;
        }
    }

}
