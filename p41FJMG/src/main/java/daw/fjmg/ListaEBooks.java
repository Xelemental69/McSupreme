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

public class ListaEBooks {
    
    ArrayList <LibroElectronico> libros;

    public ListaEBooks() {
        
        libros = new ArrayList<>();
        
    }
    
    public void addLibro(LibroElectronico libro){
        
        libros.add(libro);
        
    }
    
    public boolean delLibro(LibroElectronico libro){
        
        return libros.remove(libro);
        
    }
    
    public LibroElectronico getLibro(int posicion){
        
        return libros.get(posicion);
        
    }
    
    public boolean findLibro(Libro libro){
        
        return libros.contains(libro);
        
    }

    public ArrayList<LibroElectronico> getLibros() {
        
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
