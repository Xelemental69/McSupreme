/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package daw1st_fjmg.clasest4;

/**
 *
 * @author fco-j
 */
public class LoComplejo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Declaramos los números imaginarios "complejito1" y "complejito2":
        Complejo complejito1 = new Complejo(); //Construido sin parámetros
        Complejo complejito2 = new Complejo(6,9); //Construido con parámetros
        
        System.out.println(complejito1); //Muestra los valores por defecto
        System.out.println("");
        
        //Se le asigna valores a complejito1:
        complejito1.setA(8);
        complejito1.setB(4);
        
        //Se muestran los valores de ambos complejitos:
        System.out.println(complejito1);
        System.out.println(complejito2);
        System.out.println("");
        
        //Se crea un nuevo nº complejo ("complejito12"), que usaremos para 
        //realizar operaciones:
        Complejo complejito12 = new Complejo(complejito1.getA(),complejito1.getB());
        
        //Se muestra el valor original de complejito12:        
        System.out.println(complejito12);
        
        //A continuación, se realizan las siguientes operaciones, junto a sus
        //resultados:
        
        //Suma:
        complejito12.suma(complejito2.getA(), complejito2.getB());
        System.out.println(complejito12);
        //Multiplicación:
        complejito12.multiplicacion(complejito2.getA(), complejito2.getB());
        System.out.println(complejito12);
        //Resta:
        complejito12.resta(complejito2.getA(), complejito2.getB());
        System.out.println(complejito12);
        //División:
        complejito12.division(complejito2.getA(), complejito2.getB());
        System.out.println(complejito12);
        
        //Mostramos el contador de clases (da igual de que clase la cogemos
        //, mostrado a continuación):
        System.out.println("\n Nº de clases creadas: " + complejito1.getContador());
        System.out.println("\n Nº de clases creadas: " + complejito2.getContador());
        System.out.println("\n Nº de clases creadas: " + complejito12.getContador());
        
    }
    
}
