/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicios.exbloque1fjmg;

import java.util.*;
import javax.swing.JOptionPane;

/**
 *
 * @author fco-j
 */
public class Ej1 {

    /**
     * @param args the command line arguments
     */
    private static double x1(int a, int b, int c) {//Fórmula para calcular x1
        double x;
        double bres = b * (-1);
        double bsq = b * b;
        double ac4 = 4 * a * c;
        
        System.out.println(bres);
        System.out.println(bsq);
        System.out.println(ac4);

        x = (double)(bres + Math.sqrt(bsq - ac4)) / (2 * a);

        return x;

    }

    private static double x2(int a, int b, int c) {//Fórmula para calcular x2
        double x;
        double bres = b * (-1);
        double bsq = b * b;
        double ac4 = 4 * a * c;

        x = (double)(bres - Math.sqrt(bsq - ac4)) / (2 * a);

        return x;

    }

    private static double xSinA(int b, int c) {//Fórmula alternativa (a = 0)
        double x;

        x = (-c) / b;

        return x;

    }

    public static void main(String[] args) {
        // TODO code application logic here

        //Declaramos las variables:
        String entry;
        int a, b, c;

        //Pedimos los números:
        entry = JOptionPane.showInputDialog(null, "Introduzca el 1er"
                + " nº (a) : ");
        a = Integer.parseInt(entry);

        entry = JOptionPane.showInputDialog(null, "Introduzca el 2º"
                + " nº (b) : ");
        b = Integer.parseInt(entry);

        entry = JOptionPane.showInputDialog(null, "Introduzca el 3er"
                + " nº (c) : ");
        c = Integer.parseInt(entry);

        //Los mostramos por pantalla:
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);

        if (a == 0 && b == 0) {

            //Si tanto a como b son 0; indicamos que no hay solución
            System.out.println("La ecuación no tiene solución");

        } else if (a == 0) {

            //Si a es 0; pasamos a una fórmula alternativa
            System.out.println("El valor x es: " + xSinA(b, c));

        } else {

            if ((b * b) < (4 * a * c)) {

                //Si b² es menor que 4ac, salta error por no poder resolver
                //la ecuación
                System.out.println("Los valores suministrados no permiten "
                        + "calcular la ecuación");

            } else {//Calculamos la ecuación con dos fórmulas (una para cada 
                //valor de x

                System.out.println("El 1er valor de x es: " + x1(a, b, c));

                System.out.println("El 2º valor de x es: " + x2(a, b, c));

            }

        }

    }

}
