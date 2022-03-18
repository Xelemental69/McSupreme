/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daw_fjmg.t6poo;

import java.util.*;

/**
 *
 * @author fco-j
 */
public class Moneda extends Azar{
    
    //Declaramos un random:        
    private Random tirada;
    
    public Moneda() {//Al construir la clase, se le asigna a posibilidades
        //el nº 2 (2 caras de la moneda)
    
        tirada = new Random();
        posibilidades = 2;
        
    }
    
    @Override
    public int lanzar(){        
        
        //Y devolvemos un valor Random con el int
        //posibilidades tomado como rango (y se suma
        //1 para empezar en 1 en vez de 0)
        return tirada.nextInt(posibilidades) + 1;
        
    }
    
}