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
    private static double suma(double x, double y) {

        double z = x + y;
        return z;

    }

    private static double resta(double x, double y) {

        double z = x - y;
        return z;

    }

    private static double multi(double x, double y) {

        double z = x * y;
        return z;

    }

    private static double divi(double x, double y) {

        double z = x / y;
        return z;

    }

    private static double mod(double x, double y) {

        double z = x % y;
        return z;

    }

    public static void main(String[] args) {
        // TODO code application logic here

        //Declaramos las variables:
        Scanner calc = new Scanner(System.in);
        int option = 0;
        double op1, op2;
        //double res;
        boolean exit = false, matiasPratz;
        char y;

        do {

            do {

                try {//Pedimos la opción para operar:

                    System.out.println("Bienvenido a la calculadora.");
                    System.out.println("¿Qué función desea realiar?");
                    System.out.println("1: Suma");
                    System.out.println("2: Resta");
                    System.out.println("3: Multiplicación");
                    System.out.println("4: División");
                    System.out.println("5: Módulo");
                    System.out.println("6: Salir");
                    option = calc.nextInt();

                    if (option < 1 || option > 6) {
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

                    do {//Opción 1: Suma

                        System.out.println("Opción elegida: Suma");

                        try {//Se pide los números y se realiza la suma, mostrando 
                            //por pantalla el resultado:

                            System.out.println("Introduzca el 1er sumando:");
                            op1 = calc.nextDouble();

                            System.out.println("Introduzca el 2º sumando:");
                            op2 = calc.nextDouble();

                            //res = op1 + op2;
                            System.out.println("El resultado es: " + suma(op1, op2));

                            matiasPratz = false;

                        } catch (InputMismatchException ime) {
                            //Si lo introducido no es un número, salta error
                            //y se vuelven a pedir los nºs para la operación
                            System.out.println("ERROR: Formato incorrecto");
                            calc.nextLine();
                            matiasPratz = true;
                        }

                    } while (matiasPratz);

                    break;

                case 2:

                    do {//Opción 2: Resta

                        System.out.println("Opción elegida: Resta");

                        try {//Se pide los números y se realiza la resta, mostrando 
                            //por pantalla el resultado:

                            System.out.println("Introduzca el 1er operador:");
                            op1 = calc.nextDouble();

                            System.out.println("Introduzca el 2º operador:");
                            op2 = calc.nextDouble();

                            //res = op1 - op2;
                            System.out.println("El resultado es: " + resta(op1, op2));

                            matiasPratz = false;

                        } catch (InputMismatchException ime) {
                            //Si lo introducido no es un número, salta error
                            //y se vuelven a pedir los nºs para la operación
                            System.out.println("ERROR: Formato incorrecto");
                            calc.nextLine();
                            matiasPratz = true;
                        }

                    } while (matiasPratz);

                    break;

                case 3:

                    do {//Opción 3: Multiplicación

                        System.out.println("Opción elegida: Multiplicación");

                        try {//Se pide los números y se realiza la multiplicación,
                            //mostrando por pantalla el resultado:

                            System.out.println("Introduzca el 1er factor:");
                            op1 = calc.nextDouble();

                            System.out.println("Introduzca el 2º factor:");
                            op2 = calc.nextDouble();

                            //res = op1 * op2;
                            System.out.println("El resultado es: " + multi(op1, op2));

                            matiasPratz = false;

                        } catch (InputMismatchException ime) {
                            //Si lo introducido no es un número, salta error
                            //y se vuelven a pedir los nºs para la operación
                            System.out.println("ERROR: Formato incorrecto");
                            calc.nextLine();
                            matiasPratz = true;
                        }

                    } while (matiasPratz);

                    break;

                case 4:

                    do {//Opción 4: División

                        System.out.println("Opción elegida: División");

                        try {//Se pide los números y se realiza la división, mostrando 
                            //por pantalla el resultado:

                            System.out.println("Introduzca el 1er número:");
                            op1 = calc.nextDouble();

                            System.out.println("Introduzca el divisor:");
                            op2 = calc.nextDouble();

                            //res = op1 / op2;
                            System.out.println("El resultado es: " + divi(op1, op2));

                            matiasPratz = false;

                        } catch (InputMismatchException ime) {
                            //Si lo introducido no es un número, salta error
                            //y se vuelven a pedir los nºs para la operación
                            System.out.println("ERROR: Formato incorrecto");
                            calc.nextLine();
                            matiasPratz = true;
                        }

                    } while (matiasPratz);

                    break;

                case 5:

                    do {//Opción 5: Módulo

                        System.out.println("Opción elegida: Módulo");

                        try {//Se pide los números y se realiza la división, mostrando 
                            //por pantalla el resto de la misma:

                            System.out.println("Introduzca el 1er operando:");
                            op1 = calc.nextDouble();

                            System.out.println("Introduzca el 2º operando:");
                            op2 = calc.nextDouble();

                            //res = op1 % op2;
                            System.out.println("El resto de la división es: "
                                    + mod(op1, op2));

                            matiasPratz = false;

                        } catch (InputMismatchException ime) {
                            //Si lo introducido no es un número, salta error
                            //y se vuelven a pedir los nºs para la operación
                            System.out.println("ERROR: Formato incorrecto");
                            calc.nextLine();
                            matiasPratz = true;
                        }

                    } while (matiasPratz);

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
