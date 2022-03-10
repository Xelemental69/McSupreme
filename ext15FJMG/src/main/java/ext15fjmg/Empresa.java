/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ext15fjmg;

/**
 *
 * @author fco-j
 */
import java.util.*;

public class Empresa {
    
    private ArrayList<Trabajador> trabajadores;
    private String nombre;
    private String cif;

    public Empresa(String nombre, String cif) {
        
        this.nombre = nombre;
        this.cif = cif;
        this.trabajadores = new ArrayList<>();
        
    }
    
    public void imprimir(){
        
        System.out.println("Nombre: " + nombre);
        System.out.println("CIF: " + cif);
        System.out.println("Trabajadores: ");
        
        for(Trabajador t: trabajadores) {
            
 		System.out.println(t);
                System.out.println("");
                
        }
                
    }
    
    public void contratar(Trabajador t){
        
        trabajadores.add(t);
        
    }
    
    public boolean despedir(Trabajador t){
        
        if(trabajadores.contains(t)){
        
            trabajadores.remove(t);
            return true;
            
        }else{
            
            return false;
            
        }
        
    }

    public String getNombre() {
        
        return nombre;
        
    }

    public void setNombre(String nombre) {
        
        this.nombre = nombre;
        
    }

    public String getCif() {
        
        return cif;
        
    }

    public void setCif(String cif) {
        
        this.cif = cif;
        
    }        
    
    public ArrayList<Integer> buscarTodosNombre(String nombre){
        ArrayList <Integer> posiciones = new ArrayList<>();
        
        for(int i = 0; i < trabajadores.size(); i++){
            
            if(trabajadores.get(i).getNombre().equals(nombre)){
                
                posiciones.add(i);
                
            }
            
        }
        
        if(posiciones.size() > 0){
            
            return posiciones;
            
        }else{
            
            return null;
            
        }
        
    }
    
    public void ordenarNombre(){
        
        Collections.sort(this.trabajadores);
        
    }
    
    public int buscarNombre(Trabajador t){
        
        if(trabajadores.contains(t)){
            
            return Collections.binarySearch(trabajadores, t);
            
        }else{
            
            return -1;
            
        }
        
    }
    
}
