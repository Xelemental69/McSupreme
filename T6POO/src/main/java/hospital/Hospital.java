/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hospital;

/**
 *
 * @author fco-j
 */
import java.util.*;

public class Hospital {
    
    private String nombre;
    private String direccion;
    private int numeroCamas;    
    ArrayList<Empleado> trabajadores = new ArrayList<>();
    ArrayList<Paciente> pacientes = new ArrayList<>();

    public Hospital(String nombre, String dirección, int numeroCamas) {
        
        this.nombre = nombre;
        this.direccion = dirección;
        this.numeroCamas = numeroCamas;
        
    }

    public Hospital() {
        
        nombre = "Hospital (CLARAMENTE BIEN APROVECHADO) de Estepona";
        direccion = "Calle Irene Villa, 29680 Estepona, Málaga";
        numeroCamas = 13;
        
    }
    
    public void contratarEmpleado(Empleado empleado){
        
        trabajadores.add(empleado);
        
    }
    
    public void ingresarPaciente(Paciente paciente){
        
        pacientes.add(paciente);
        
    }
    
    //GETTERS Y SETTERS

    public String getNombre() {
        
        return nombre;
        
    }

    public void setNombre(String nombre) {
        
        this.nombre = nombre;
        
    }

    public String getDireccion() {
        
        return direccion;
        
    }

    public void setDireccion(String direccion) {
        
        this.direccion = direccion;
        
    }

    public int getNumeroCamas() {
        
        return numeroCamas;
        
    }

    public void setNumeroCamas(int numeroCamas) {
        
        this.numeroCamas = numeroCamas;
        
    }

    public ArrayList<Empleado> getTrabajadores() {
        
        return trabajadores;
        
    }
    
    public ArrayList<Paciente> getPacientes() {
        
        return pacientes;
        
    }

    @Override
    public String toString() {
        
        return "El " + nombre + ", ubicado en la " + direccion
                + ", con " + numeroCamas + "camas\nSus trabajadores son: \n"
                + trabajadores + "\nY sus pacientes son: \n" + pacientes;
        
    }

    
            
}
