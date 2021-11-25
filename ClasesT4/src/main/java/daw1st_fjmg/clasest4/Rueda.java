/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daw1st_fjmg.clasest4;

/**
 *
 * @author fco-j
 */
public class Rueda {
    
    boolean inflada;
    
    public Rueda(boolean inflada){
        
        this.inflada = inflada;
        
    }
    
    public void inflar() {
        
        this.inflada = true;
        
        System.out.println("Inflando la rueda...");
        
    }
    
    public void desinflar() {
        
        this.inflada = false;
        
        System.out.println("Desinflando la rueda...");
        
    }
    
    public boolean getRueda(){
        
        return this.inflada;
        
    }
    
    public void setRueda(boolean enMarcha){
        
        this.inflada = enMarcha;
        
    }
    
}
