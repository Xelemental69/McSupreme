/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daw_fjmg.t6poo;

/**
 *
 * @author fco-j
 */
public class Programador extends Trabajador{
    
    private Categoria tipoCategoria;

    public Programador() {
        
        super();
        this.tipoCategoria = Categoria.JUNIOR;
        
    }

    public Programador(Categoria tipoCategoria, double salario, String nombre, String nif, int edad) {
        super(salario, nombre, nif, edad);
        
        this.tipoCategoria = tipoCategoria;
        
    }

    public Categoria getTipoCategoria() {
        
        return tipoCategoria;
        
    }

    public void setTipoCategoria(Categoria tipoCategoria) {
        
        this.tipoCategoria = tipoCategoria;
        
    }

    // Sobrescribe el método toString() de la clase padre (empleado), 
    // añadiendo además de los atributos de empleado los propios de programador.
    @Override
    public String toString() {
        
        return super.toString() + " tipoCategoria=" + this.tipoCategoria + '}';
        
    }
    
    // Método propio de programador
    public void programar(String lenguaje){
        
        System.out.println("Hola, estoy programando en: " + lenguaje); 
        
    }
    
    // Sobrescribe el método comer() de la clase padre (empleado)
    @Override
    public void comer(){
        
        System.out.println("Soy un programador y estoy comiendo");
        
    }
    
    // Método sobrecargado dentro de la clase programador
    public void comer(String comida){
        
        System.out.println("Soy un programador y estoy comiendo " + comida);
        
    }  

    @Override
    public void cotizar(){
        
        System.out.println("Cotizando como programador");
        
    }
    
}
