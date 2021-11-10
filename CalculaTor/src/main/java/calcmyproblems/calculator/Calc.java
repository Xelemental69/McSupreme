/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calcmyproblems.calculator;

import java.util.*;

/**
 *
 * @author Xelemental
 */
public class Calc {

    /**
     * @param args the command line arguments
     */
    private static void menu() {//Muestra el menú de opciones

        System.out.println("Bienvenido a la calculadora.");
        System.out.println("¿Qué función desea realiar?");
        System.out.println("1: Suma");
        System.out.println("2: Resta");
        System.out.println("3: Multiplicación");
        System.out.println("4: División");
        System.out.println("5: Módulo");
        System.out.println("6: Devolver el nº entero introducido");
        System.out.println("7: Salir");

    }

    private static double leerDouble() {
        //Pide por pantalla los números, dando error si lo introducido es otro
        //tipo de caracter.
        double x = 0;
        Scanner calc = new Scanner(System.in);
        boolean matiasPratz;

        do {

            try {

                x = calc.nextDouble();

                matiasPratz = false;

            } catch (InputMismatchException ime) {
                //Si lo introducido no es un número, salta error
                //y se vuelven a pedir los nºs para la operación
                System.out.println("ERROR: Tiene que introducir un "
                        + "número");
                x = 0;
                calc.nextLine();
                matiasPratz = true;
            }

        } while (matiasPratz);

        return x;//Devuelve el operando con return
    }

    private static double suma(double x, double y) {//Realiza la suma de los
        //dos parámetros introducidos

        double z = x + y;
        return z;//Devuelve el resultado con return

    }

    private static double resta(double x, double y) {//Realiza la resta de los
        //dos parámetros introducidos

        double z = x - y;
        return z;//Devuelve el resultado con return

    }

    private static double multi(double x, double y) {//Realiza la multiplicación
        //de los dos parámetros introducidos

        double z = x * y;
        return z;//Devuelve el resultado con return

    }

    private static double divi(double x, double y) {//Realiza la división de los
        //dos parámetros introducidos

        double z = x / y;
        return z;//Devuelve el resultado con return

    }

    private static double mod(double x, double y) {//Realiza el módulo de los
        //dos parámetros introducidos

        double z = x % y;
        return z;//Devuelve el resto con return

    }

    private static int mostrarLoIntroducido() {

        int x;
        boolean permitemeQueInsista;
        Scanner entry = new Scanner(System.in);

        do {

            try {

                System.out.println("Introduzca un número entero");
                x = entry.nextInt();
                permitemeQueInsista = false;

            } catch (InputMismatchException ime) {
                //Si lo introducido no es un número, salta error
                //y se vuelven a pedir los nºs para la operación
                System.out.println("ERROR: Tiene que introducir un "
                        + "número");
                x = 0;
                entry.nextLine();
                permitemeQueInsista = true;
            }

        } while (permitemeQueInsista);

        return x;//Devuelve el nº con return

    }

    public static void main(String[] args) {
        // TODO code application logic here

        //Declaramos las variables:
        Scanner calc = new Scanner(System.in);
        int option = 0;
        double op1, op2;
        //double res;
        boolean exit = false;
        char y;

        do {

            do {

                try {//Pedimos la opción para operar:

                    menu();

                    option = calc.nextInt();

                    if (option < 1 || option > 7) {
                        //Si el nº introducido no es entre 1 y 6, se insiste
                        System.out.println("Introduce un número válido");
                    }

                } catch (InputMismatchException ime) {
                    //Si no es un número, salta error y formateamos el búffer
                    System.out.println("ERROR: Formato incorrecto");
                    calc.nextLine();
                }

            } while (option < 1 || option > 6);

            switch (option) {

                case 1:

                    //Opción 1: Suma
                    System.out.println("Opción elegida: Suma");

                    //Se pide los números y se realiza la suma, mostrando 
                    //por pantalla el resultado:
                    System.out.println("Introduzca el 1er sumando:");
                    op1 = leerDouble();

                    System.out.println("Introduzca el 2º sumando:");
                    op2 = leerDouble();

                    //res = op1 + op2;
                    System.out.println("El resultado es: "
                            + suma(op1, op2));

                    break;

                case 2:

                    //Opción 2: Resta
                    System.out.println("Opción elegida: Resta");

                    //Se pide los números y se realiza la resta, mostrando 
                    //por pantalla el resultado:
                    System.out.println("Introduzca el 1er operador:");
                    op1 = leerDouble();

                    System.out.println("Introduzca el 2º operador:");
                    op2 = leerDouble();

                    //res = op1 - op2;
                    System.out.println("El resultado es: "
                            + resta(op1, op2));

                    break;

                case 3:

                    //Opción 3: Multiplicación
                    System.out.println("Opción elegida: Multiplicación");

                    //Se pide los números y se realiza la multiplicación,
                    //mostrando por pantalla el resultado:
                    System.out.println("Introduzca el 1er factor:");
                    op1 = leerDouble();

                    System.out.println("Introduzca el 2º factor:");
                    op2 = leerDouble();

                    //res = op1 * op2;
                    System.out.println("El resultado es: "
                            + multi(op1, op2));

                    break;

                case 4:

                    //Opción 4: División
                    System.out.println("Opción elegida: División");

                    //Se pide los números y se realiza la división,
                    //mostrando por pantalla el resultado:
                    System.out.println("Introduzca el 1er número:");
                    op1 = leerDouble();

                    System.out.println("Introduzca el divisor:");
                    op2 = leerDouble();

                    //res = op1 / op2;
                    System.out.println("El resultado es: "
                            + divi(op1, op2));

                    break;

                case 5:

                    //Opción 5: Módulo
                    System.out.println("Opción elegida: Módulo");

                    //Se pide los números y se realiza la división, mostrando 
                    //por pantalla el resto de la misma:
                    System.out.println("Introduzca el 1er operando:");
                    op1 = leerDouble();

                    System.out.println("Introduzca el 2º operando:");
                    op2 = leerDouble();

                    //res = op1 % op2;
                    System.out.println("El resto de la división es: "
                            + mod(op1, op2));

                    break;

                case 6:

                    System.out.println("El nº introducido es: "
                            + mostrarLoIntroducido());

                    break;

                default:
                    //Opción 6: Esta hará que se salga directamente del programa
                    System.out.println("Saliendo del programa...");
                    exit = true;
                    break;

            }

            calc.nextLine();//Limpiamos el búffer

            if (!exit) {//Si no se ha seleccionado la opción de salir al inicio,
                //se pide al usuario si quiere reiniciar el programa:
                System.out.println("¿Desea reiniciar el programa?");
                System.out.println("(Si es así, escriba: Y) ");
                y = calc.nextLine().charAt(0);
                if (y == 'Y' || y == 'y') {
                    System.out.println("Reiniciando programa...");
                    exit = false;
                } else {
                    System.out.println("Terminando el programa...");
                    exit = true;
                }
            }

        } while (!exit);

    }

}
