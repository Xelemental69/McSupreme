/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package yisuskun.rnjesus;

import java.util.*;

/**
 *
 * @author Xele
 */
public class Random_numba_1 {

    /**
     *
     * @param args the command line arguments
     *
     * Opción de introducir un nº positivo o que sea rng Rangu: 2-600.000.000
     *
     * Si nº es par => NO PRIMO Si no, recorre rango de impares desde 3 hasta
     * nº/2
     *
     */
    public static void main(String[] args) {
        // TODO code application logic here
        long chicken;
        boolean random, primo = true;
        Scanner entry = new Scanner(System.in);

        Random pita = new Random();

        do {

            System.out.println("Desea introducir el número (N) o sacarlo"
                    + " al azar (R) :");
            switch (entry.next().charAt(0)) {
                case 'N':

                case 'n':
                    random = false;
                    
                    break;
                case 'R':

                case 'r':
                    random = true;
                    
                    break;
                default:
                    System.out.println("ERROR DE ENTRADA. EL PRIMER CARACTER "
                            + "NO COINCIDE. EL PROCESO NO COMPUTA.");
                    chicken = (long) 0;
                    continue;

            }

            if (random) {

                chicken = pita.nextInt(600_000_000) + 2;

            } else {

                System.out.println("Introduce el número del rango aceptado: ");
                chicken = entry.nextInt();

            }

            if (chicken < 2 || chicken > 600_000_000) {

                System.out.println("ERROR, NÚMERO FUERA DE RANGO.");

            }

        } while (chicken < 2 || chicken > 600_000_000);

        System.out.println("El nº introducido es " + chicken);

        if(chicken==2){
            primo = true;
        }else if (chicken % 2 == 0) {
            primo = false;
        }else {
            for (int i = 3; i < chicken / 2; i += 2) {
                if (chicken % i == 0) {
                    primo = false;
                }
            }
        }

        if (primo) {
            System.out.println("El nº: " + chicken + " ES primo");
        } else {
            System.out.println("El nº: " + chicken + " NO es primo");
        }
    }

}
