/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daw1st_fjmg.clasest4;

/**
 *
 * @author fco-j
 */
import java.util.*;

public class Ventana {
    
    boolean abierta;
    boolean tintada;
    
    public Ventana(boolean abierta, boolean tintada){
        
        this.abierta = abierta;
        this.tintada = tintada;
        
    }

    public Ventana() {
        
        Random giveaway = new Random();
    
        abierta = giveaway.nextBoolean();
        tintada = giveaway.nextBoolean();
    
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

    @Override
    public String toString() {
        return "¿Está abierta? " + abierta + "; ¿Está tintada? "
                + tintada;
    }
    
}
