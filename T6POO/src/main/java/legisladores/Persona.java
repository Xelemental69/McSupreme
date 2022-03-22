/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package legisladores;

/**
 *
 * @author fco-j
 */
public class Persona {

    protected String nombre;
    protected String apellidos;

    public Persona() {//Constructor por defecto:

        nombre = "Lethi";
        apellidos = "Lux";

    }

    public Persona(String nombre, String apellidos) {//Constructor parametrizado:

        this.nombre = nombre;
        this.apellidos = apellidos;

    }

    //GETTERS Y SETTERS
    
    public String getNombre() {

        return nombre;

    }

    public String getApellidos() {

        return apellidos;

    }

    public void setNombre(String nombre) {

        this.nombre = nombre;

    }

    public void setApellidos(String apellidos) {

        this.apellidos = apellidos;

    }

    @Override
    public String toString() {

        return "Persona{" + "\nNombre: " + nombre + "\nApellidos: " + apellidos + '}';

    }

}
