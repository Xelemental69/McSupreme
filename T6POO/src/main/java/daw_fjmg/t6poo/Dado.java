/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daw_fjmg.t6poo;

/**
 *
 * @author fco-j
 */
import java.util.*;

public class Dado extends Azar{
    
    //Declaramos un random:        
    private Random tirada;

    public Dado() {
        //Al construir la clase, se le asigna a posibilidades
        //el nº 6 (6 caras del dado)
    
        tirada = new Random();
        posibilidades = 6;
        
    }
            
    @Override
    public int lanzar(){
                        
        //Devolvemos un valor Random con el int
        //posibilidades tomado como rango (y se suma
        //1 para empezar en 1 en vez de 0)
        return tirada.nextInt(posibilidades) + 1;
        
    }
    
}
