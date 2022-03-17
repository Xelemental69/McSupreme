/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daw_fjmg.t6poo;

/**
 *
 * @author fco-j
 */
public class Rectangulo extends Figuras{

    public Rectangulo(double base, double altura) {
        
        super(base, altura);
        
    }
    
    public String calcularArea(){
        
        return "Área del Rectángulo = " + area() + "cm²";
        
    }
    
}
