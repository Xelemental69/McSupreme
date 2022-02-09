/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daw.fjmg;

/**
 *
 * @author fco-j
 */
import java.util.*;

public class ListaLibros {
    
    ArrayList <Libro> libros;

    public ListaLibros() {
        
        libros = new ArrayList<>();
        
    }
    
    public void addLibro(Libro libro){
        
        libros.add(libro);
        
    }
    
    public boolean delLibro(Libro libro){
        
        return libros.remove(libro);
        
    }
    
    public Libro getLibro(int posicion){
        
        return libros.get(posicion);
        
    }
    
    public boolean findLibro(Libro libro){
        
        return libros.contains(libro);
        
    }

    public ArrayList<Libro> getLibros() {
        
        return libros;
    
    }
    
    public int searchLibro(String titulo){
        
        int pos = -1;
        
        for (int i = 0; i < libros.size(); i++){
            
            if (titulo.equalsIgnoreCase(libros.get(i).getTitulo())){
                
                pos = i;
                break;
                
            }
            
        }
        
        return pos;
        
    }

    @Override
    public String toString() {
        return "ListaLibros{ " + libros + " " + '}';
    }
    
    
    
    
}
