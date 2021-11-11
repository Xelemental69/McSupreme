/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tetimofuerte.bancofranj;

import java.util.*;

/**
 *
 * @author fco-j
 */
public class BancoEmoSidoEnganiados_Reloaded {

    private static boolean edad(int viejo) {

        boolean viejete;

        //Comprobamos si entra en el rango de edad deseado
        if (viejo > 65 || viejo < 18) {
            System.out.println("No posee la edad necesaria para el"
                    + " préstamo.");
            //permitemeQueInsista = true;

            viejete = false;
        } else {

            viejete = true;
        }

        return viejete;

    }

    private static boolean nosRenta(final double TIMO, double robo,
            double ilusion) {

        boolean rentaTimar;

        //Comprobamos el máximo de euros posible para prestar:
        double maxEuros = robo * TIMO;

        if (ilusion > maxEuros) {
            System.out.println("Lo sentimos, pero no podemos darle "
                    + "tanta cantidad.");
            rentaTimar = false;
        } else {
            rentaTimar = true;
        }

        return rentaTimar;

    }

    private static boolean anus(int viejo, int prepareYourAnus) {

        //Scanner oak = new Scanner(System.in);
        boolean leTimo;

        //Continuamos por el if si la duración no es excesiva
        //No obstante, si dura más de 30 años o si sumado a la edad
        //superan los 75, saltamos al else nº3
        if (prepareYourAnus > 30 || (prepareYourAnus + viejo) > 75) {
            System.out.println("Perdone, pero no podemos mantener un "
                    + "préstamo por tanto tiempo.");

            leTimo = false;

        } else if (prepareYourAnus < 5) {
            System.out.println("Perdone, pero no podemos mantener un "
                    + "préstamo por tan poco tiempo.");
            leTimo = false;
        } else {
            leTimo = true;
        }

        return leTimo;

    }

    public static void main(String[] args) {
        // TODO code application logic here
        //Declaramos las variables necesarias:
        Scanner entry = new Scanner(System.in);
        boolean exit = true, permitemeQueInsista;
        int edad, anosHipoteca;
        double sueldoBruto, cantEulos;
        final double FACTOR_TETIMO = 5.85;

        do {

            do {

                try {

                    //Empezamos a pedir los datos, comenzando por la edad 
                    //y el sueldo bruto:                    
                    System.out.println("Bienvenido al banco TeTimo, cliente.\n"
                            + "Introduzca su edad: ");
                    edad = entry.nextInt();

                    System.out.println("Introduce el sueldo bruto que posee: ");
                    sueldoBruto = entry.nextDouble();

                    permitemeQueInsista = false;

                } catch (InputMismatchException ime) {
                    System.out.println("ERROR. Introduce un número.");
                    edad = 0;
                    permitemeQueInsista = true;
                    entry.nextLine();
                    sueldoBruto = 0;

                }
            } while (permitemeQueInsista);

            //Comprobamos con el método
            if (edad(edad)) {

                do {
                    try {
                        //Pedimos cantidad para el préstamo:
                        System.out.println("¿Cuánta cantidad de dinero "
                                + "solicita usted?");
                        cantEulos = entry.nextDouble();

                    //Si es un nº, seguimos, si no, terminamos
                    } catch (InputMismatchException ime) {
                        System.out.println("ERROR. Introduce un número.");
                        cantEulos = 0;
                        permitemeQueInsista = true;
                        entry.nextLine();
                        sueldoBruto = 0;

                    }
                } while (permitemeQueInsista);

                //Comprobamos con el método
                if (nosRenta(FACTOR_TETIMO, sueldoBruto, cantEulos)) {

                    //Pedimos los años hasta la devolución
                    do {
                        try {

                            System.out.println("¿En cuántos años estima"
                                    + " la devolución?");
                            anosHipoteca = entry.nextInt();

                        } catch (InputMismatchException ime) {
                            System.out.println("ERROR. Introduce un número.");
                            anosHipoteca = 0;
                            permitemeQueInsista = true;
                            entry.nextLine();

                        }
                    } while (permitemeQueInsista);

                    //Comprobamos con el método
                    if (anus(edad, anosHipoteca)) {

                        //Una vez todos los requisitos son cumplidos, se considera
                        //al cliente apto para el club EmoSido Engañaos de
                        //TeTimo(Fuerte)^TM
                        System.out.println("Estupendo, es usted"
                                + " apto para hacer el "
                                + "engaño, digo, préstamo de "
                                + cantEulos + "euros.");
                    }

                }

            }

        } while (!exit);

    }

}
