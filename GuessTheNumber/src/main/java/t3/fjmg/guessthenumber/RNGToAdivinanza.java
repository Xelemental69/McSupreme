/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t3.fjmg.guessthenumber;

import java.util.*;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author fco-j
 */
public class RNGToAdivinanza {

    /**
     * @param args the command line arguments
     */
    private static int wheelOfGuessing(int n, int m) {
        Random ruleta = new Random();

        int guest = ruleta.nextInt(n - m + 1) + m;

        return guest;

    }

    public static void main(String[] args) {

        // Declaramos las variables:        
        Scanner limit = new Scanner(System.in);
        int x, y, guess, target, chances;
        boolean repeat, reset, win = false;
        char exit;

        do {
            //Establecemos las oportunidades:
            chances = 3;

            do {

                try {

                    System.out.println("Bienvenido a la Ruleta de la Adivinanza");

                    try {//Delay de 1 segundo...            
                        TimeUnit.SECONDS.sleep(1);
                    } catch (InterruptedException ie) {
                        Thread.currentThread().interrupt();
                    }

                    //Pedimos por pantalla los números:
                    System.out.println("Para el rango de nºs con los cuales opera"
                            + " nuestra ruleta del azar...");

                    System.out.println("Introduzca el primer nº entero:");
                    x = limit.nextInt();

                    System.out.println("Introduzca el segundo nº entero:");
                    y = limit.nextInt();

                    repeat = false;

                } catch (InputMismatchException ime) {
                    //Si se introduce algo que no sea un nº, salta este error:
                    System.out.println("ERROR: Introduzca solo NÚMEROS.");
                    repeat = true;
                    x = y = 0;
                    //Para evitar problemas, limpiamos el búffer:
                    limit.nextLine();

                }

            } while (repeat);

            //Calculamos el nº a adivinar:
            if (x >= y) {

                target = wheelOfGuessing(x, y);

            } else {

                target = wheelOfGuessing(y, x);

            }

            System.out.println("Ya tenemos los parámetros.");

            try {//Delay de 1 segundo...            
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException ie) {
                Thread.currentThread().interrupt();
            }

            System.out.println("\n¡QUE EMPIEZE EL ESPECTÁCULO!\n");

            while (!win && chances > 0) {

                try {

                    //Pedimos el nº que el usuario cree que es por teclado:
                    System.out.println("¿Qué nº cree usted que es?");
                    guess = limit.nextInt();

                    if (guess == target) {
                        //Si el usuario acierta:
                        System.out.println("\nENHORABUENA");
                        
                        try {//Delay de 1 segundo...            
                            TimeUnit.SECONDS.sleep(1);
                        } catch (InterruptedException ie) {
                            Thread.currentThread().interrupt();
                        }
                        
                        System.out.println("Ha adivinado el número.");
                        win = true;

                    } else if (guess < target) {
                        //Si el usuario escribe un nº menor, y por tanto,
                        //no acierta:
                        System.out.println("Qué pena. El nº es mayor que el "
                                + "que has dicho");
                        win = false;
                        chances--;
                        System.out.println("Oportunidades restantes: " + chances);

                    } else if (guess > target) {
                        //Si el usuario escribe un nº mayor, y por tanto,
                        //no acierta:
                        System.out.println("Qué pena. El nº es menor que el "
                                + "que has dicho");
                        win = false;
                        chances--;
                        System.out.println("Oportunidades restantes: " + chances);

                    }

                } catch (InputMismatchException ime) {
                    //Si se introduce algo que no sea un nº, salta este error:
                    System.out.println("ERROR: Introduzca solo NÚMEROS.");
                    win = false;
                    //Para evitar problemas, limpiamos el búffer:
                    limit.nextLine();

                }

            }

            if (chances < 1) {
                
                try {//Delay de 1 segundo...            
                        TimeUnit.SECONDS.sleep(1);
                    } catch (InterruptedException ie) {
                        Thread.currentThread().interrupt();
                    }
                
                System.out.println("Qué lastima, se ha quedado sin oportunidades.");
                System.out.println("Buena suerte a la próxima.");
            }
            
            //Para evitar problemas, limpiamos el búffer:
            limit.nextLine();

            System.out.println("¿Desea volver a tentar a la suerte?"
                    + "\n(Escriba Y si es así)");

            exit = limit.nextLine().charAt(0);

            switch (exit) {

                case 'Y':

                case 'y':
                    System.out.println("Iniciando el reseteo...");
                    reset = true;
                    break;

                default:
                    System.out.println("Saliendo del programa...");
                    reset = true;
                    break;

            }

        } while (reset);

    }

}
