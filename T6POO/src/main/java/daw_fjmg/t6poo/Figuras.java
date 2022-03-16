/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daw_fjmg.t6poo;

/**
 *
 * @author fco-j
 */
public class Figuras {
    
    private double base;
    private double altura;

    public Figuras(double base, double altura) {
        
        this.base = base;
        this.altura = altura;
        
    }    

    public double getBase() {
        
        return base;
        
    }
    
    public void setBase(double base) {
        
        this.base = base;
        
    }

    public double getAltura() {
        
        return altura;
        
    }

    public void setAltura(double altura) {
        
        this.altura = altura;
        
    }
    
    public double baseXaltura(){
    
        return base * altura;
    
    }
    
    public String calcularArea(){
        
        return "Área de la figura = " + baseXaltura() + "cm²";
        
    }

    @Override
    public String toString() {
        
        return "Figuras{" + "Base = " + base + ", Altura = " + altura + '}';
        
    }
    
            
}
