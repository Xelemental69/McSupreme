/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daw_fjmg.t6poo;

/**
 *
 * @author fco-j
 */
public class Persona {
    
    private String nombre;
    private String nif;
    private int edad;
    private boolean persona_user;
    private String persona; //Referencia a Shin Megami Tensei: Persona

    public Persona(String nombre, String nif, int edad, String persona) {
        
        this.nombre = nombre;
        this.nif = nif;
        this.edad = edad;
        this.persona_user = true;
        this.persona = persona;
        
    }
    
    public Persona(String nombre, String nif, int edad) {
        
        this.nombre = nombre;
        this.nif = nif;
        this.edad = edad;
        this.persona_user = false;
        
    }
    
    public Persona(){
        
        this.nombre = "Pul Luzbel";
        this.nif = "21052011Z";
        this.edad = 18;
        this.persona_user = true;
        this.persona = "Apolos";
        
    }

    public String getNombre() {
        
        return nombre;
        
    }

    public void setNombre(String nombre) {
        
        this.nombre = nombre;
        
    }

    public String getNif() {
        
        return nif;
        
    }

    public void setNif(String nif) {
        
        this.nif = nif;
        
    }

    public int getEdad() {
        
        return edad;
        
    }

    public void setEdad(int edad) {
        
        this.edad = edad;
        
    }

    public boolean isPersona_user() {
        
        return persona_user;
        
    }

    public void setPersona_user(boolean persona_user) {
                        
            this.persona_user = persona_user;               
                        
    }

    public String getPersona() {
        
        if(persona_user){
        
            return persona;
        
        }else{
            
            return null;
            
        }
        
    }

    public void setPersona(String persona) {
        
        if(persona_user){
        
            this.persona = persona;
        
        }else{
            
            System.out.println("ERROR. No es un usuario de Persona");
            
        }
        
    }
    
    public void comer(){
        
        System.out.println("Soy una persona y estoy comiendo");
        
    }

    @Override
    public String toString() {
        
        if(persona_user){
        
            return "Persona{" + "\nNombre: " + nombre + "\nNif: "
                    + nif + "\nEdad: " + edad + "\nPersona: " + persona + "\n" + '}';
            
        }else{
            
            return "Persona{" + "\nNombre: " + nombre + "\nNif: "
                    + nif + "\nEdad: " + edad  + "\n" + '}';
            
        }
        
    }
    
    
    
}
