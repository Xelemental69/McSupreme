/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daw.fjmg;

import java.util.Objects;

/**
 *
 * @author fco-j
 */
public class Meme {
    
    private String nombre;
    private String descripcion;
    private int anioOrigen;

    public Meme(String nombre, String descripcion, int anioOrigen) {
        
        this.nombre = nombre;
        this.descripcion = descripcion;
        if (anioOrigen > 0){
        this.anioOrigen = anioOrigen;
        }
        
    }

    public Meme() {
        
        nombre = "Rickroll";
        descripcion = "Un enlace llamativo que es en realidad una "
                + "trampa que conduce a la canción \"Never Gonna "
                + "Give You Up\" de Rich Ashley";
        anioOrigen = 2007;
        
    }

    public String getNombre() {
        
        return nombre;
        
    }

    public void setNombre(String nombre) {
        
        this.nombre = nombre;
        
    }

    public String getDescripcion() {
        
        return descripcion;
        
    }

    public void setDescripcion(String descripcion) {
        
        this.descripcion = descripcion;
        
    }

    public int getAnioOrigen() {
        
        return anioOrigen;
        
    }

    public void setAnioOrigen(int anioOrigen) {
        
        this.anioOrigen = anioOrigen;
        
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + Objects.hashCode(this.nombre);
        hash = 53 * hash + Objects.hashCode(this.descripcion);
        hash = 53 * hash + this.anioOrigen;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            
            return true;
            
        }
        if (obj == null) {
            
            return false;
            
        }
        if (getClass() != obj.getClass()) {
            
            return false;
            
        }
        final Meme other = (Meme) obj;
        if (this.anioOrigen != other.anioOrigen) {
            
            return false;
            
        }
        if (!Objects.equals(this.nombre, other.nombre)) {
            
            return false;
            
        }
        return Objects.equals(this.descripcion, other.descripcion);
    }

    @Override
    public String toString() {
        return "\nMeme{ " + "Nombre: " + nombre + "\t Año de Origen: "
                + anioOrigen + "\n Descripcion: " + descripcion + " " + '}';
    }
    
    
    
}
