/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daw1st_fjmg.clasest4;

/**
 *
 * @author fco-j
 */
public class Ventana {
    
    boolean abierta;
    
    public Ventana(boolean abierta){
        
        this.abierta = abierta;
        
    }
    
    public void abrir() {
        
        this.abierta = true;
        
        System.out.println("Abriendo ventana...");
        
    }
    
    public void cerrar() {
        
        this.abierta = false;
        
        System.out.println("Cerrando ventana...");
        
    }
    
    public boolean getVentana(){
        
        return this.abierta;
        
    }
    
    public void setVentana(boolean abierta){
        
        this.abierta = abierta;
        
    }
    
}
