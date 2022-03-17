/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daw_fjmg.t6poo;

/**
 *
 * @author fco-j
 */
public abstract class Trabajador extends Persona{
    
    private double salario;

    public Trabajador(){
        
        // Implícitamente llama a super()
        this.salario = 2000.0;
                
    }
    
    public Trabajador(double salario, String nombre, String nif, int edad) {
        
        super(nombre, nif, edad);
        this.salario = salario;
        
    }

    
    public double getSalario() {
        
        return salario;
        
    }

    public void setSalario(double salario) {
        
        this.salario = salario;
        
    }

    // Sobrescribe el método toString() de la clase padre, 
    // añadiendo además de los atributos de persona los propios de empleado.
    @Override
    public String toString() {
        
        return super.toString() + " salario=" + this.salario + '}';
        
    }

    // Aumenta el salario según el plus que se pasa 
    public void aumentarSalario(double plus) {
        
        this.salario += Math.abs(plus);
        
    }
    
    @Override
    // Sobrescribe el método comer() de la clase padre
    public void comer(){
        
        System.out.println("Soy un empleado y estoy comiendo");
        
    }
    
    public abstract void cotizar();
    
}
