/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios.exbloque1fjmg;

import java.util.*;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author fco-j
 */
public class Ej6 {

    private static void menu() {//Muestra el menú de opciones

        System.out.println("¡Bienvenido!");
        System.out.println("¿Qué desea hacer?");
        System.out.println("1: Cuenta atrás");
        System.out.println("2: Juego de Dados");
        System.out.println("3: Salir");

    }

    private static void countdown() {//Método para la cuenta atrás:

        for (int i = 1000; i > 100; i -= 5) {//Vamos mostrando múltiplos de 5
            //entre 1000 y 100

            System.out.println("| " + i + " |");

        }

    }

    private static void dadoJuego() {//Método para el juego de dados (pero no tronos)
        int destination;
        boolean cara;
        Random lucky = new Random();//RNG

        for (int i = 0; i < 20; i++) {//Realizamos la función para 20 jugadores

            cara = lucky.nextBoolean();//Determinamos si sale cara o cruz

            System.out.printf("Jugador " + (i + 1) + ", la moneda ha caído en ");

            if (cara) {//Si cae en cara, gana un viaje

                System.out.println("cara.");

                System.out.println("¡Felicidades, ha ganado un viaje!");

                destination = lucky.nextInt(6) + 1;//Determinamos el dado

                System.out.println("Dado: " + destination);

                System.out.println("El dado le indicará el lugar al que ha "
                        + "sido invitado...");

                try {//Testeando una forma de pausar el programa por 1 segundo...            
                    TimeUnit.SECONDS.sleep(1);
                } catch (InterruptedException ie) {
                    Thread.currentThread().interrupt();
                }

                switch (destination) {//Según el valor del dado, será escogida
                    //la ubicación del viaje
                    case 1:
                    case 3:

                        System.out.println("¡A LA CHARCA DE LA NUTRIA!");

                        System.out.println("");

                        break;

                    case 2:
                    case 6:

                        System.out.println("¡AL PARQUE DE LOS PEDREGALES!");

                        break;

                    default:

                        System.out.println("¡A LOS DÓLMENES DE COROMINAS");

                        break;

                }

            } else {//Si cae en cruz, no se gana nada

                System.out.println("cruz.");

                System.out.println("OOOooooh, ¡qué lástima! No ha ganado nada");
                System.out.println("Suerte a la próxima");

            }

            System.out.println("");

            try {//Testeando una forma de pausar el programa por 1 segundo...            
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException ie) {
                Thread.currentThread().interrupt();
            }

        }

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner entry = new Scanner(System.in);
        int option;
        boolean repeat;
        String exit;

        do {

            try {//Pedimos la opción para operar:

                menu();

                option = entry.nextInt();

                if (option < 1 || option > 3) {
                    //Si el nº introducido no es entre 1 y 3, se insiste
                    System.out.println("Introduce un número válido");
                    repeat = true;
                } else {

                    repeat = false;

                    switch (option) {//Cuenta atrás
                        case 1:

                            System.out.println("Ha seleccionado la cuenta "
                                    + "atrás");

                            //Vamos al método de cuenta atrás (countdown)
                            countdown();

                            break;

                        case 2://Juego de dados

                            System.out.println("Ha seleccionado el juego de "
                                    + "dados");

                            //Vamos al método de juego de dados
                            dadoJuego();

                            break;

                        default:

                            entry.nextLine();

                            System.out.println("¿Desea salir?");
                            exit = entry.nextLine();

                            switch (exit) {

                                case "SI":

                                case "si":

                                case "Si":

                                case "sI":

                                    System.out.println("Saliendo del "
                                            + "programa...");
                                    break;

                                default:

                                    repeat = true;
                                    break;

                            }

                            break;

                    }
                }

            } catch (InputMismatchException ime) {
                //Si no es un número, salta error y formateamos el búffer
                System.out.println("ERROR: Formato incorrecto");
                entry.nextLine();
                repeat = true;
            }

        } while (repeat);

    }

}
