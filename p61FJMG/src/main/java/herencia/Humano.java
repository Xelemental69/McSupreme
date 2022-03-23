/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herencia;

import java.util.Objects;

/**
 *
 * @author fco-j
 */
public abstract class Humano implements Comparable<Humano> {//CLASE A
    
    //Atributos de la clase:
    protected String nombre;
    protected String apellidos;

    public Humano(String nombre, String apellidos) {
        //Constructor parametrizado
        
        this.nombre = nombre;
        this.apellidos = apellidos;
        
    }

    public Humano() {
        
        nombre = "Xora";
        apellidos = "Reditus";
        
    }
    
    public abstract void esUsuarioPersonas();//Método abstracto A
    
    //GETTERS Y SETTERS:
        
    public String getNombre() {
        
        return nombre;
        
    }

    public void setNombre(String nombre) {
        
        this.nombre = nombre;
        
    }

    public String getApellidos() {
        
        return apellidos;
        
    }

    public void setApellidos(String apellidos) {
        
        this.apellidos = apellidos;
        
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 67 * hash + Objects.hashCode(this.nombre);
        hash = 67 * hash + Objects.hashCode(this.apellidos);
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
        final Humano other = (Humano) obj;
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        return Objects.equals(this.apellidos, other.apellidos);
    }
    
    public int compareTo(Humano h) {

        return this.nombre.compareTo(h.nombre);

    }
        
    @Override
    public String toString() {
        
        return "El nombre y apellidos de este sujeto son "
                + nombre + " " + apellidos;
        
    }
    
    
    
}
