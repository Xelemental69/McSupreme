/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cuentas;

/**
 *
 * @author fco-j
 */
import daw_fjmg.t6poo.*;
import java.util.*;

public class Cliente {
    
    private String nombre;
    private String dni;
    private int edad;

    // NO se omiten constructores, getters, setters

    public Cliente(String nombre, String dni, int edad) {
        
        this.nombre = nombre;
        this.dni = dni;
        this.edad = edad;
        
    }

    public Cliente() {
        
        nombre = "Lethi";
        dni = "04082874L";
        edad = 19;
        
    }
    
    public String getNombre() {
        
        return nombre;
        
    }

    public void setNombre(String nombre) {
        
        this.nombre = nombre;
        
    }

    public String getDni() {
        
        return dni;
        
    }

    public void setDni(String dni) {
        
        this.dni = dni;
        
    }

    public int getEdad() {
        
        return edad;
        
    }

    public void setEdad(int edad) {
        
        this.edad = edad;
        
    }
        
    @Override
    public int hashCode() {

        int hash = 3;
        hash = 59 * hash + Objects.hashCode(this.nombre);
        hash = 59 * hash + Objects.hashCode(this.dni);
        hash = 59 * hash + this.edad;
        return hash;

    }

    @Override
    public boolean equals(Object obj){

        if (this == obj) {
            
              return true;
              
        }

        if (obj == null) {
            
              return false;
              
        }

        if (getClass() != obj.getClass()) {
            
              return false;
              
        }

        Cliente other = (Cliente) obj;

        // Se comparan los estados de los objetos

        if (this.edad != other.edad) {
            
               return false;
               
        }
        if (!Objects.equals(this.nombre, other.nombre)) {
            
               return false;
               
        }
        if (!Objects.equals(this.dni, other.dni)) {
            
               return false;
               
        }
        
        return true;
    }	

    @Override
    public String toString() {
        return "Cliente{" + "\nNombre: " + nombre + "\nDNI: "
                    + dni + "\nEdad: " + edad  + "\n" + '}';
    }
    
    
    
}
