/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tetimofuerte.bancofranj;

import java.util.*;

/**
 *
 * @author fco-j
 */
public class BancoEmoSidoEnganiaos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Declaramos las variables necesarias:
        Scanner entry = new Scanner(System.in);
        int edad, anosHipoteca;
        double maxEuros, sueldoBruto, cantEulos;
        final double FACTOR_TETIMO = 5.85;
        //Empezamos a pedir los datos, comenzando por la edad y el sueldo bruto:
        System.out.println("Bienvenido al banco TeTimo, cliente.\n"
                + "Introduzca su edad: ");
        edad = entry.nextInt();
        System.out.println("Introduce el sueldo bruto que posee: ");
        sueldoBruto = entry.nextDouble();
        //Comprobamos si entra en el rango de edad deseado
        if (edad < 65 && edad >= 18) {
            //Si su edad es apta, seguimos, si no, saltamos hacia el else nº1

            //Pedimos cantidad para el préstamo:
            System.out.println("¿Cuánta cantidad de dinero solicita usted?");
            cantEulos = entry.nextDouble();
            //Comprobamos el máximo de euros posible para prestar:
            maxEuros = sueldoBruto * FACTOR_TETIMO;

            //Si se mantiene en el rango, seguimos, si no, al else nº2
            if (cantEulos <= maxEuros) {
                //Pedimos los años hasta la devolución
                System.out.println("¿En cuántos años estima la devolución?");
                anosHipoteca = entry.nextInt();
                //Continuamos por el if si la duración no es excesiva
                //No obstante, si dura más de 30 años o si sumado a la edad
                //superan los 75, saltamos al else nº3
                if ((anosHipoteca < 30 && anosHipoteca > 5)
                        && (anosHipoteca + edad) < 75) {
                    //Una vez todos los requisitos son cumplidos, se considera
                    //al cliente apto para el club EmoSido Engañaos de
                    //TeTimo(Fuerte)^TM
                    System.out.println("Estupendo, es usted apto para hacer el "
                            + "engaño, digo, préstamo de " + cantEulos + "euros.");

                } else {//Else nº3. Damos error por ser demasiada duración.
                    //Y tras ello, termina el programa
                    System.out.println("Perdone, pero no podemos mantener un "
                            + "préstamo por tanto tiempo.");
                }

            } else {//Else nº2. Damos error por el exceso de cantidad y 
                //terminamos
                System.out.println("Lo sentimos, pero no podemos darle "
                        + "tanta cantidad.");
            }

        } else //Else nº1. Si su edad no es apta, salta error y termina esto
        {
            System.out.println("No posee la edad necesaria para el préstamo.");
        }

    }

}
