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

    /**************************************************************************
    *                                                                         *
    * @param args the command line arguments                                 //
    *                                                                        //
    * Opción de introducir un nº positivo o que sea rng Rangu: 2-600.000.000 //
    *                                                                        //
    * Si nº es 2 => PRIMO.                                                   //
    *                                                                        //
    * Si nº es par => NO PRIMO.                                              //
    * Si no, recorre rango de impares desde 3 hasta                          
    * nº/2 para comprobar si es primo o no.                                  //
    *                                                                        //
    **************************************************************************/
    public static void main(String[] args) {
        // Declaramos las variables (entre ellas, nuestro Long Chicken del BK)
        long chicken;
        boolean random, primo = true;
        Scanner entry = new Scanner(System.in);
        //Declaramos e inicializamos nuestro RNG
        Random pita = new Random();

        do {//Pedimos si se introduce el nº manualmente o lo genera nuestro RNG
           //(a través del boolean random):
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
                    
                default://¿La opción no es una tecla aceptada? 
                    //PERMÍTEME QUE INSISTA
                    System.out.println("ERROR DE ENTRADA. EL PRIMER CARACTER "
                            + "NO COINCIDE. EL PROCESO NO COMPUTA.");
                    chicken = (long) 0;
                    continue;

            }

            if (random) {//Si random es true, el RNG genera el número:

                chicken = pita.nextInt(600_000_000) + 2;

            } else {//Si es false, se nos pide el nº por pantalla

                System.out.println("Introduce el número del rango aceptado: ");
                chicken = entry.nextInt();

            }

            if (chicken < 2 || chicken > 600_000_000) {
                //¿Y si se sale del rango...? PERMÍTEME QUE INSISTA
                System.out.println("ERROR, NÚMERO FUERA DE RANGO.");

            }

        } while (chicken < 2 || chicken > 600_000_000);

        //Mostramos el número del pedido de nuestro Long Chicken en pantalla:        
        System.out.println("El nº introducido es " + chicken);

        //Comprobamos si el número es primo (si es 2, es primo, si es múltiplo
       //de 2, no es primo, y si no es ni 2 ni su múltiplo, se comprueba si es
      //divisible por algún número menor a su mitad).
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
        
        //Mostramos si es primo o no por pantalla:
        if (primo) {
            System.out.println("El nº: " + chicken + " ES primo");
        } else {
            System.out.println("El nº: " + chicken + " NO es primo");
        }
    }

}
