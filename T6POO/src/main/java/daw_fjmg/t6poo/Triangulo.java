/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daw_fjmg.t6poo;

/**
 *
 * @author fco-j
 */
public class Triangulo extends Figuras{

    public Triangulo(double base, double altura) {
        
        super(base, altura);
        
    }
    

    @Override
    public String calcularArea() {
        
        return "Área del Triángulo = " + (baseXaltura()/2) + "cm²";
    
    }
                
}
