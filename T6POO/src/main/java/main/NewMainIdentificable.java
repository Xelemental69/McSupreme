/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

/**
 *
 * @author fco-j
 */
import java.util.*;
import ej13.*;

public class NewMainIdentificable {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        ArrayList <Persona> personas = new ArrayList<>();        
        Random ruleta = new Random();
        
        for (int i = 0; i < 12; i++){
            
            if(ruleta.nextBoolean()){
                
                personas.add(new Profesor());
                                
            }else{
                
                personas.add(new Estudiante());
                
            }
            
        }
        
        for(Persona p : personas){
            
            p.identificate();
            
        }
        
    }
    
}
