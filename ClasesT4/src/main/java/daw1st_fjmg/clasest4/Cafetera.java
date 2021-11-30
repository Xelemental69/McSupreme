/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daw1st_fjmg.clasest4;

/**
 *
 * @author fco-j
 */
public class Cafetera {
    
    double capacidadMaxima;
    double cantidadActual;
    
    public Cafetera(){
        
        this.capacidadMaxima = 1000;
        this.cantidadActual = 0;
        
    }
    
    public Cafetera(double capacidadMaxima){
        
        this.capacidadMaxima = capacidadMaxima;
        this.cantidadActual = capacidadMaxima;
        
    }
    
    public Cafetera(double capacidadMaxima, double capacidadActual){
        
        this.capacidadMaxima = capacidadMaxima;
        this.cantidadActual = capacidadActual;
        
    }
    
    public void llenarCafetera(){
        
        this.cantidadActual = this.capacidadMaxima;
        
    }
    
    public void servirTaza(double cantidadAServir){
        
        if(this.cantidadActual>cantidadAServir){
            this.cantidadActual -= cantidadAServir;
            System.out.println("Se ha servido " + cantidadAServir + "u "
                    + "de café.");
        }else{
            System.out.println("Se ha servido " + this.cantidadActual 
                    + "u " + "de café.");
            this.cantidadActual = 0;
            
        }
        
    }
    
    public void vaciarCafetera(){
        
        this.cantidadActual = 0;
        
    }
    
    public void agregarCafe(double cantidadAgregar){
        
        if(this.cantidadActual + cantidadAgregar <= this.capacidadMaxima){
            
            System.out.println("Se ha añadido " + cantidadAgregar + "u"
            + "de café a la cafetera");
            
        }else{
            
            System.out.println("Se ha añadido " + (this.capacidadMaxima - 
                    this.cantidadActual) + "u de café a la cafetera "
                            + "y se ha desbordado " + (this.capacidadMaxima
                                    - (this.cantidadActual + cantidadAgregar)
                                        + "u de café"));
            
        }
        
    }
    
}
