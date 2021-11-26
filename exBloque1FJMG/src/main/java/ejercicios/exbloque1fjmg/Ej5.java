/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios.exbloque1fjmg;

import java.util.*;

/**
 *
 * @author fco-j
 */
public class Ej5 {

    private static void menu() {//Muestra el menú de opciones

        System.out.println("¡Bienvenido!");
        System.out.println("¿Qué desea hacer?");
        System.out.println("1: Cuenta atrás");
        System.out.println("2: Juego de Dados");
        System.out.println("3: Salir");

    }

    private static void countdown() {//Método para la cuenta atrás:

         for (int i = 1000; i >= 100; i -= 5) {//Vamos mostrando múltiplos de 5
                  //entre 1000 y 100

            System.out.println("| " + i + " |");

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

                            //Vamos al método de la cuenta atrás (countdown)
                            countdown();

                            break;

                        case 2://Juego de Dados

                            System.out.println("Ha seleccionado el juego de "
                                    + "dados");
                            break;

                        default://Salir del programa

                            entry.nextLine();//Limpiamos búfer

                            System.out.println("¿Desea salir?");
                            exit = entry.nextLine();

                            switch (exit) {//Para todas las variaciones de si

                                case "SI":

                                case "si":

                                case "Si":

                                case "sI":

                                    System.out.println("Saliendo del "
                                            + "programa...");
                                    break;

                                default://Si no hay "si", se repite

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
