/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daw1st_fjmg.clasest4;

/**
 *
 * @author fco-j
 */
public class Complejo {

    private double a; //Parte real del nº complejo (z)
    private double b; //Parte imaginaria del nº complejo (z)
    private static int contador; //Contador de instancias. 
    //Indica la cantidad de clases creadas (y el nº se mantiene igual en todas 
    //las clases).

    public Complejo(double a, double b) {
        //Constructor que recoge los parametros de a y b para darles su respectivo
        //valor:
        this.a = a;
        this.b = b;
        contador++; //Aumenta el contador acordemente
        
    }

    public Complejo() {
        //Constructor por defecto que pone los valores en 0
        a = 0;
        b = 0;
        contador++; //Aumenta el contador acordemente

    }

    public double getA() {//Método que permite modificar la parte real de z
        
        return a;
        
    }

    public void setA(double a) {
        
        this.a = a;
        
    }

    public double getB() {//Método que devuelve la parte imaginaria de z
        
        return b;
        
    }

    public void setB(double b) {//Método que permite modificar
        //la parte imaginaria de z
        this.b = b;
        
    }
    
    public void suma(double x, double y){
        //Método que suma dos nºs imaginarios...
        a = a + x; //Sumándose las partes reales
        b = b + y; //Y sumándose las partes imaginarias
        
    } 
    
    public void resta(double x, double y){
        //Método que resta dos nºs imaginarios...
        a = a - x; //Restándose las partes reales
        b = b - y; //Y restándose las partes imaginarias
        
    } 
    
    public void multiplicacion(double x, double y){
        //Método que multiplica dos nºs imaginarios...
        double a2, b2;
        a2 = a * x - b * y; //Así sería la operación en la parte real
        //(se le resta a la multiplicación de las partes reales la de las
        //imaginarias)
        
        b2 = b * x + y * a; //Y así sería en la parte imaginaria
        //(se suman los productos de una parte real con la parte imaginaria del
        //otro nº)
        
        a = a2;
        b = b2;
        
    } 
    
    public void division(double x, double y){
        //Método que multiplica dos nºs imaginarios...
        double a2, b2,
               xsqr = x * x,
               ysqr = y * y;
        a2 = (a * x + b * y) / (xsqr + ysqr); 
        //Así sería la operación en la parte real (se le suma a la 
        //multiplicación de las partes reales la de las
        //imaginarias y se divide entre la suma de los cuadrados de las partes
        //del nº introducido)
        
        b2 = (b * x - y * a) / (xsqr + ysqr); //Y así sería en la parte imaginaria
        //(se restan los productos de una parte real con la parte imaginaria del
        //otro nº y se divide entre la suma de los cuadrados de las partes del
        //nº introducido))
        
        a = a2;
        b = b2;
        
    }
    
    public void igualdad(double x, double y){
        
        if(a == x && b == y){
            System.out.println("Los números son iguales");
        }else{
            System.out.println("Los números no son iguales");
        }
        
        if(x<a){
            System.out.println("La parte real de la clase es menor a"
                    + " la introducida");
        }        
        if(x>a){
            System.out.println("La parte real de la clase es mayor a"
                    + " la introducida");
        }
        
        if(y<b){
            System.out.println("La parte imaginaria de la clase es menor a"
                    + " la introducida");
        }        
        if(y>b){
            System.out.println("La parte imaginaria de la clase es mayor a"
                    + " la introducida");
        }
        
        
        
    }
    
    public boolean igual(double x, double y) {

        if (a == x && b == y) {

            return true;

        } else {

            return false;

        }

    }

    public static int getContador() {
        
        return contador;
        
    }

    @Override
    public String toString() {//Método que devuelve z
        
        return "Complejo{\n" + "z = " + a + " + " + b + "i\n" + '}';
        
    }

}
