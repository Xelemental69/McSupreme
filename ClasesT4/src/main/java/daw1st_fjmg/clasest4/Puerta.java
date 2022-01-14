/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daw1st_fjmg.clasest4;

/**
 *
 * @author fco-j
 */
public class Puerta {
    
    boolean abierta;
    Ventana v;
    
    public Puerta(boolean abierta, Ventana v){
        
        this.abierta = abierta;
        this.v = v;
        
    }

    public Puerta() {
        
        abierta = false;
        v = new Ventana();
        
    }
    
    public void abrir() {
        
        this.abierta = true;
        
        System.out.println("Abriendo puerta...");
        
    }
    
    public void cerrar() {
        
        this.abierta = false;
        
        System.out.println("Cerrando puerta...");
        
    }
    
    public boolean getPuerta(){
        
        return this.abierta;
        
    }
    
    public void setPuerta(boolean abierta){
        
        this.abierta = abierta;
        
    }

    public Ventana getVentana() {
        return v;
    }

    public void setVentana(Ventana v) {
        this.v = v;
    }

    @Override
    public String toString() {
        return "Puerta{" + "abierta=" + abierta + ", v=" + v + '}';
    }
    
}
