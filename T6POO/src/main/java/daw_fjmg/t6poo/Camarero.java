/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daw_fjmg.t6poo;

/**
 *
 * @author fco-j
 */
public class Camarero extends Trabajador{
    
    private String rango;

    public Camarero(String rango) {
        
        // super();
        this.rango = rango;
        
    }

    public Camarero(String rango, double salario, String nombre, String nif, int edad) {
        
        super(salario, nombre, nif, edad);        
        this.rango = rango;
        
    }

    public Camarero(double salario, String nombre, String nif, int edad) {
        
        super(salario, nombre, nif, edad);
        this.rango = "Sumellier";
        
    }
    
    
    
    
    public void servirMesa(String comida){
        
        System.out.println("El camarero " + this.getNombre() + " está sirviendo "
         + comida);
        
    }
   
    
    // Método polimórfico
    @Override
    public void cotizar(){
    
        System.out.println("Cotizando como camarero");
        
    }
}
