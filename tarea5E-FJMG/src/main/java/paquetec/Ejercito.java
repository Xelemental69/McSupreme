/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package paquetec;

/**
 *
 * @author fco-j
 */
import java.util.*;

public class Ejercito {

    private Set ejercito;//Declaramos el Set

    public Ejercito() {
        //Lo inicializamos en el constructor
        
        this.ejercito = new TreeSet <>();
        
    }

    public Set getEjercito() {
        //El getter del Set:
        
        return ejercito;
        
    }

    @Override
    public String toString() {
        //Para poder imprimirlo:
        
        return "{\n" + ejercito + "\n" + '}';
        
    }
    
    
    
}
