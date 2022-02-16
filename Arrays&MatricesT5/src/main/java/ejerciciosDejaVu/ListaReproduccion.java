/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosDejaVu;

/**
 *
 * @author fco-j
 */
import java.util.*;

public class ListaReproduccion {
 
    private ArrayList <Cancion> canciones;

    public ListaReproduccion() {
        
        canciones = new ArrayList <>();
        
    }

    public ListaReproduccion(ArrayList<Cancion> canciones) {
        
        this.canciones = canciones;
        
    }
    
    public boolean estaVacia(){
        
        return (canciones.size() == 0) ? true : false;
        
    }
    
    public void grabarCancion(Cancion cancion) {
        
        canciones.add(cancion);
        
    }
    
    public Cancion escucharCancion(int num){
        
        return canciones.get(num);
        
    }
    
    public int numCanciones(){
        
        return canciones.size();
        
    }
    
    public void cambiarCancion(int num, Cancion newCancion){
        
        canciones.set(num, newCancion);
        
    }
    
    public void eliminaCancion(int num){
        
        canciones.remove(num);
        
    }
    
    public void eliminaCancion(Cancion cancion){
        
        canciones.remove(cancion);
        
    }
        
}
