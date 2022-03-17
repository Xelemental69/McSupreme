/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daw_fjmg.t6poo;

/**
 *
 * @author fco-j
 */
public enum Categoria {
    
    ANALISTA("Analista"),
    SENIOR("Senior"),
    JUNIOR("Junior");

    //Atributos
    private String tipo;
    
    //Constructor parametrizado
    private Categoria(String tipo) {
        
        this.tipo = tipo;
        
    }
    
    //Método get
    public String getTipo() {
        
        return tipo;
        
    }
    
    //Método toString
    @Override
    public String toString() {
        
        return "Categoria{" + "tipo=" + tipo + '}';
        
    }
    
}
