/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciosDejaVu;

import java.util.*;

/**
 *
 * @author fco-j
 */
public class EjClase1 {

    /**
     * @param args the command line arguments
     */
    public static void insertarDatosAzar(int[][] rec) {
        //Método para introducir datos en el array;

        //Declaramos el Random
        Random lucky = new Random();

        for (int m = 0; m < rec.length; m++) {

            for (int n = 0; n < rec[m].length; n++) {//Bucles dentro de bucles, sí
                //Introducimos los nºs al azar (rango: entre 1 y 100)

                rec[m][n] = lucky.nextInt(100) + 1;

            }

        }

    }

    public static void mostrarEntera(int[][] matrix) {

        System.out.println("La matriz resultante es la siguiente:");

        for (int m = 0; m < matrix.length; m++) {

            for (int n = 0; n < matrix[m].length; n++) {

                System.out.printf(matrix[m][n] + " ");

            }

            System.out.println("");

        }

    }

    public static void mostrarMenu() {//Muestra el menú de opciones:

        System.out.println("Elige una opción: ");
        System.out.println("1: Recorrer Fila");
        System.out.println("2: Recorrer Columna");
        System.out.println("3: Recorrer Vecinas");
        System.out.println("4: Mostrar la matriz entera");
        System.out.println("0: Salir");

    }

    public static void recorrerFila(int x, int[][] matrix) {

        System.out.println("Fila " + x + ":");

        for (int y = 0; y < matrix[x].length; y++) {

            System.out.println("Columna " + y + ": " + matrix[x][y]);

        }

    }

    public static void recorrerColumna(int y, int[][] matrix) {

        System.out.println("Columna " + y + ":");

        for (int x = 0; x < matrix.length; x++) {

            System.out.println("Fila " + x + ": " + matrix[x][y]);

        }

    }

    public static void recorrerVecinas(int x, int y, int[][] matrix) {
        //Coje la fila y la columna como posiciones de un int del cual se mostrará
        //los valores de sus vecinas:

        System.out.println("Valores de las vecinas de matriz "
                + "[" + x + "] [" + y + "]: ");

        for (int m = x - 1; m <= (x + 1); m++) {

            for (int n = y - 1; n <= (y + 1); n++) {
                
                if (m >= 0 && n >= 0 && m < matrix.length
                        && n < matrix[0].length && !(m == x && n == y)) {

                    System.out.printf(matrix[m][n] + " ");

                } else if (m == x && n == y) {

                    System.out.printf("   ");

                }

            }

            System.out.println("");

        }

    }

    public static void main(String[] args) {
        // TODO code application logic here

        int[][] ejemplo = new int[8][8];

        insertarDatosAzar(ejemplo);

        //Además, declaramos un escáner para escoger opciones,
        //un int para la opción escogida y nuestro clásico 
        //boolean para los do while con try catch:
        Scanner select = new Scanner(System.in);
        int option, fila, columna;
        boolean matiasPratz = true;//Nuestro boolean de confianza.

        do {//Clásico bucle de repetición de un menú de selección

            try {

                mostrarMenu();
                option = select.nextInt();

                switch (option) {//Una vez se escoge la opción...

                    case 1:
                        //Pide fila y ir al método de recorrerFila:

                        System.out.println("Escoja fila: ");
                        fila = select.nextInt();

                        if (fila >= 0 && fila < ejemplo.length) {

                            recorrerFila(fila, ejemplo);

                        } else {

                            System.out.println("ERROR, se sale "
                                    + "del rango de filas");

                        }
                        break;

                    case 2:
                        //Pide columna para ir al método de recorrerColumna:

                        System.out.println("Escoja columna: ");
                        columna = select.nextInt();

                        if (columna >= 0 && columna < ejemplo[0].length) {

                            recorrerColumna(columna, ejemplo);

                        } else {

                            System.out.println("ERROR, se sale "
                                    + "del rango de columnas");

                        }
                        break;

                    case 3:
                        //Pide fila y columna para ir al método de recorrerVecinas:

                        System.out.println("Escoja fila: ");
                        fila = select.nextInt();

                        if (fila >= 0 && fila < ejemplo.length) {

                            System.out.println("Escoja columna: ");
                            columna = select.nextInt();

                            if (columna >= 0 && columna < ejemplo[0].length) {

                                recorrerVecinas(fila, columna, ejemplo);

                            } else {

                                System.out.println("ERROR, se sale del "
                                        + "rango de columnas");

                            }

                        } else {

                            System.out.println("ERROR, se sale "
                                    + "del rango de filas");

                        }

                        break;

                    case 4:
                        //Mostrará la matriz entera usando el método mostrarEntera:

                        mostrarEntera(ejemplo);
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
