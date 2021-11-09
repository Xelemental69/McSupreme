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
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner calc = new Scanner(System.in);
        int option = 0;
        double op1, op2, res;
        boolean infinite, exit = false;

        do {

            try {

                System.out.println("Bienvenido a la calculadora.");
                System.out.println("¿Qué función desea realiar?");
                System.out.println("1: Suma");
                System.out.println("2: Resta");
                System.out.println("3: Multiplicación");
                System.out.println("4: División");
                System.out.println("5: Resto");
                System.out.println("6: Salir");
                option = calc.nextInt();

                if (option < 1 || option > 6) {
                    System.out.println("Introduce un número válido");
                }

            } catch (InputMismatchException ime) {
                System.out.println("ERROR: Formato incorrecto");
                calc.nextLine();
            }

        } while (option < 1 || option > 6);

        switch (option) {

            case 1:

                do{
                
                System.out.println("Opción elegida: Suma");
                                
                try{
                
                System.out.println("Introduzca el 1er sumando:");
                op1 = calc.nextDouble();
                
                System.out.println("Introduzca el 2º sumando:");
                op2 = calc.nextDouble();
                
                res = op1 + op2;
                System.out.println("El resultado es: " + res);
                
                infinite = false;
                
                } catch (InputMismatchException ime) {
                    System.out.println("ERROR: Formato incorrecto");
                    calc.nextLine();
                    infinite = true;
                }
                
                }while(infinite);
                
                break;

            case 2:

                break;

            case 3:

                break;

            case 4:

                break;

            case 5:

                break;

            default:
                System.out.println("Saliendo del programa.");
                exit = true;
                break;

        }

    }

}
