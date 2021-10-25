/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package konodioda.t3;

/**
 *
 * @author fco-j
 */
public class BE4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int numero = 1;
         
        while (numero < 11)
        {//Se comprueba la condición primero y si se cumple, se ejecuta el bucle
             System.out.println("Número: " + numero);
             numero++;
        }
        do 
        {//Se ejecuta el bucle primero y luego se comprueba la condición
             System.out.println("Número: " + --numero);
        } while(numero > 1);
        
    }
    
}