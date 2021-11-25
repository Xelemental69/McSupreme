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
    
    public Puerta(boolean abierta){
        
        this.abierta = abierta;
        
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
    
}
