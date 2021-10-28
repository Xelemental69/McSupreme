/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package konodioda.mavenproject1;

/**
 *
 * @author fco-j
 */
public class EjToFor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        int n = 5; // n se inicializa a 5 para calcular 5!
        int factorial = 1; // factorial se inicializa a 1

        for (int i = 1; i <= 5; i++) {  // el valor inicial de i es 1

            factorial = factorial * i;

        }

        System.out.println("El factorial de " + n + " es " + factorial);

    }

}
