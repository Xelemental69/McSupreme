/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vugas;

/**
 *
 * @author fco-j
 */
public class Furgoneta extends Vehiculo {
    
    private int carga; // En kg
    private int volumen; // En m3

    public Furgoneta(int carga, int volumen, Long bastidor,
            String matricula, double kilometros, String marca, String modelo,
             double tarifa, boolean disponible
            , boolean marchaAutomatica, int numeroPuertas) {
        
        super(bastidor, matricula, kilometros, marca, modelo, tarifa,
                disponible, marchaAutomatica, numeroPuertas);
        this.carga = carga;
        this.volumen = volumen;
        
    }

    public Furgoneta() {
        
        super();
        this.carga = 1000;
        this.volumen = 8;
        
    }

    public int getCarga() {
        
        return carga;
        
    }

    public void setCarga(int carga) {
        
        this.carga = carga;
        
    }

    public int getVolumen() {
        
        return volumen;
        
    }

    public void setVolumen(int volumen) {
        
        this.volumen = volumen;
        
    }

    @Override
    public String getAtributos() {
        
        return super.getAtributos() + ":" + carga + ":" + volumen;
        
    }   
    
    public void metodoFurgoneta(){
        
        System.out.println("Este método es de la clase Furgoneta");
        
    }

    @Override
    public String toString() {
        return super.toString() + "Furgoneta{" + "carga=" + carga
                + ", volumen=" + volumen + '}';
    }
    
}
