/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package konodioda.t3;

/**
 *
 * @author fco-j
 */
public class Ejemplo2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numero;
        // este programa muestra números enteros aleatorios
        // entre 0 y 100 hasta que sale el 25 o el 50
        do {
            numero = (int) (100 * Math.random());
            System.out.println("Número aleatorio: " + numero);

            if (numero == 25) {
                break;//Rompe el bucle, saliéndose de este en el proceso
            }

        } while (numero != 50);

    }
    
}
