/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Legisladores;

/**
 *
 * @author fco-j
 */
public class Persona {
    
    protected String nombre;
    protected String apellidos;

    public Persona() {
        
        nombre = "Lethi";
        apellidos = "Lux";
        
    }

    public Persona(String nombre, String apellidos) {
        
        this.nombre = nombre;
        this.apellidos = apellidos;
        
    }

    public String getNombre() {
        
        return nombre;
        
    }

    public String getApellidos() {
        
        return apellidos;
        
    }
                    
}
