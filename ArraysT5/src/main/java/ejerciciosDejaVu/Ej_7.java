/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosDejaVu;

/**
 *
 * @author fco-j
 */
import java.util.*;

public class Ej_7 {

    public static void generarArrays(int[] recipient) {
        Random rnYisus = new Random();

        for (int i = 0; i < recipient.length; i++) {

            recipient[i] = rnYisus.nextInt(100) + 1;

        }

    }

    public static int[] res(int[] x, int[] y) {

        int[] z = new int[x.length];

        for (int j = 0; j < z.length; j++) {

            z[j] = x[j] * y[j];

        }

        return z;

    }

    public static void muestra(int[] recipient) {

        System.out.printf("Array: {");

        for (int k = 0; k < recipient.length; k++) {

            if (k < (recipient.length - 1)) {

                System.out.printf(recipient[k] + "; ");

            } else {

                System.out.printf(recipient[k] + "");

            }

        }

        System.out.println("}");

    }

    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);

        int tamano;
        boolean permitemeQueInsista;

        do {

            try {

                System.out.println("Introduce la cantidad de números de "
                        + "los arrays:");
                tamano = entry.nextInt();

                int[] x = new int[tamano];
                int[] y = new int[tamano];

                generarArrays(x);
                generarArrays(y);

                System.out.printf("X ");
                muestra(x);
                
                System.out.printf("Y ");
                muestra(y);

                System.out.println("Resultado de la multiplicación: ");
                muestra(res(x, y));

                permitemeQueInsista = false;

            } catch (InputMismatchException ime) {

                permitemeQueInsista = true;
                System.out.println("ERROR. INTRODUCE UN NÚMERO");

            }

        } while (permitemeQueInsista);

    }

}
