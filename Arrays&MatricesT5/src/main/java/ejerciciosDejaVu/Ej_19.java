/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciosDejaVu;

/**
 *
 * @author fco-j
 */
import java.util.*;

public class Ej_19 {

    /**
     * @param args the command line arguments
     */
    public static void mostrarDisponibles(boolean[][] matrix) {
        //Recorre la matriz para mostrar los asientos disponibles:

        System.out.println("Asientos Disponibles:");

        for (int m = 0; m < matrix.length; m++) {

            for (int n = 0; n < matrix[m].length; n++) {

                if (matrix[m][n]) {//Condición que comprueba el boolean.
                    //Si la condición se cumple, está el asiento disponible.

                    System.out.println("-Fila " + m + " --> Asiento " + n);

                }

            }

        }

    }

    public static void mostrarOcupados(boolean[][] matrix) {
        //Recorre la matriz para mostrar los asientos ocupados:

        System.out.println("Asientos Ocupados:");

        for (int m = 0; m < matrix.length; m++) {

            for (int n = 0; n < matrix[m].length; n++) {

                if (!matrix[m][n]) {//Condición que comprueba el boolean.
                    //Si la condición se cumple, está el asiento ocupado.

                    System.out.println("-Fila " + m + " --> Asiento " + n);

                }

            }

        }

    }

    public static void reservarAsiento(boolean[][] matrix, int fila, int asiento) {
        //Método para reservar un asiento:

        if (matrix[fila][asiento]) {//Comprueba si el asiento está disponible:

            //Si está disponible, lo reserva:
            matrix[fila][asiento] = false;

            System.out.println("Reserva realizada con éxito");

        } else {//Si no está disponible, salta error:

            System.out.println("Lo sentimos, pero el asiento ya ha sido reservado");

        }

    }

    public static void cancelarReserva(boolean[][] matrix, int fila, int asiento) {
        //Método para cancelar la reserva de un asiento:

        if (!matrix[fila][asiento]) {//Si el asiento está reservado (no disponible),
            //Cancela dicha reserva:

            matrix[fila][asiento] = true;

            System.out.println("Reserva cancelada con éxito");

        } else {//Si el asiento está ya disponible, salta error:

            System.out.println("ERROR. No hay reserva que cancelar de dicho asiento");

        }

    }

    public static void mostrarMenu() {//Muestra el menú de opciones:

        System.out.println("Elige una opción: ");
        System.out.println("1: Reservar Asiento");
        System.out.println("2: Cancelar Reserva");
        System.out.println("3: Mostrar Asientos Disponibles");
        System.out.println("4: Mostrar Asientos Ocupados");
        System.out.println("0: Salir");

    }

    public static void main(String[] args) {
        //Declaramos una matriz de 25x4 que indicará 
        //qué asiento estará disponible o no y dos int,
        //uno para las filas y otro para los asientos:
        int fila, asiento;
        boolean[][] disponibles = new boolean[25][4];

        //Además, declaramos un escáner para escoger opciones,
        //un int para la opción escogida y nuestro clásico 
        //boolean para los do while con try catch:
        Scanner select = new Scanner(System.in);
        int option;
        boolean matiasPratz = true;//Nuestro boolean de confianza.

        do {//Clásico bucle de repetición de un menú de selección

            try {

                mostrarMenu();
                option = select.nextInt();

                switch (option) {//Una vez se escoge la opción

                    case 1:
                        //Pide fila y asiento para ir al método de reserva

                        System.out.println("HA ESCOGIDO RESERVAR");

                        System.out.println("Escoja fila: ");
                        fila = select.nextInt();

                        if (fila >= 0 && fila < 25) {

                            System.out.println("Escoja asiento: ");
                            asiento = select.nextInt();

                            if (asiento >= 0 && asiento < 4) {

                                reservarAsiento(disponibles, fila, asiento);

                            } else {

                                System.out.println("ERROR, se sale "
                                        + "del rango de asientos");

                            }

                        } else {

                            System.out.println("ERROR, se sale del rango de filas");

                        }
                        break;

                    case 2:
                        //Pide fila y asiento para ir al método de cancelar reserva

                        System.out.println("HA ESCOGIDO CANCELAR RESERVA");

                        System.out.println("Escoja fila: ");
                        fila = select.nextInt();

                        System.out.println("Escoja asiento: ");
                        asiento = select.nextInt();

                        if (fila >= 0 && fila < 25) {

                            System.out.println("Escoja asiento: ");
                            asiento = select.nextInt();

                            if (asiento >= 0 && asiento < 4) {

                                cancelarReserva(disponibles, fila, asiento);

                            } else {

                                System.out.println("ERROR, se sale del"
                                        + " rango de asientos");

                            }

                        } else {

                            System.out.println("ERROR, se sale del rango de filas");

                        }
                        break;

                    case 3:
                        //Llama al método de mostrar asientos disponibles:

                        mostrarDisponibles(disponibles);
                        break;

                    case 4:
                        //Llama al método de mostrar asientos ocupados:

                        mostrarOcupados(disponibles);
                        break;

                    case 0:
                        //Se sale del programa

                        System.out.println("Saliendo del programa...");
                        matiasPratz = false;
                        break;

                    default:
                        //Cuando el nº introducido no coincide con ninguna opción:

                        System.out.println("PERMÍTEME QUE INSISTA EN"
                                + " QUE ESCOGA UNA OPCIÓN");
                        break;

                }

            } catch (InputMismatchException ime) {
                //Cuando se introduce un caracter no numérico:

                System.out.println("PERMÍTEME QUE INSISTA EN QUE PONGAS UN NÚMERO");
                select.nextLine();

            }

        } while (matiasPratz);

    }

}
