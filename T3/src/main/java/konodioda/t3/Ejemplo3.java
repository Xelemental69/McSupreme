/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package konodioda.t3;

/**
 *
 * @author fco-j
 */
public class Ejemplo3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        for (int i = 1; i <= 10; i++) {
            if (i % 2 != 0) {
                continue;  //el continue interrumpe la ejecución y vuelve al
                          //inicio del bucle.
            }

            System.out.println("Números pares: " + i);

        }

        
    }
    
}
