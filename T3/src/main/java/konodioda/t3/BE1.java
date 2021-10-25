/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package konodioda.t3;

/**
 *
 * @author pikac
 */
public class BE1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // El programa se dedica a mostrar los números del 1 al 100 en pantalla.

        int x = 1;

        while (x <= 100) {
            System.out.print(x);
            System.out.print(" - ");
            x = x + 1;
        }

    }

}
