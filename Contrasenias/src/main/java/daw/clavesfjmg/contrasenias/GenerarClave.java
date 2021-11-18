/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daw.clavesfjmg.contrasenias;

import java.util.*;

/**
 *
 * @author fco-j
 */
public class GenerarClave {

    public static void main(String[] args) {

        Random candado = new Random();
        int v, w, x, y;
        char z;

        do {

            do {
                //Generamos los números dentro de un bucle en el cual solo podrán
                //salir si la suma de ambos es impar
                v = candado.nextInt(10);
                y = candado.nextInt(10);

                System.out.println("Prueba de v&y: " + v + y);

            } while (((v + y) % 2 == 0));

            do {
                //Generamos los números dentro de un bucle en el cual solo podrán
                //salir si el producto de ambos es par
                w = candado.nextInt(10);
                x = candado.nextInt(10);

                System.out.println("Prueba de w&x: " + w + x);

            } while ((w * x) % 2 != 0);

            System.out.println("Probando: " + v + w + x + y);

        } while (v == y || v == w || v == x || y == w || y == x || w == x);

        //Generamos una letra
        z = (char) (candado.nextInt(122 - 33 + 1) + 33);

        System.out.println("Su clave generara es: " + v + w + x + y + z);

    }

}
