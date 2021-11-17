/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package daw.vehiculos.coches;

import java.util.*;

/**
 *
 * @author fco-j
 */
public class MisVehiculos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner entry = new Scanner(System.in);

        String mat;
        String mar;
        String mode;
        String col;
        double tar;
        char disp;
        boolean repeat;

        Vehiculos miCacharro = new Vehiculos("6969 XXX", "LaLínea",
                 "Blurred Lines", "Negro", 4.20);

        miCacharro.color = "Blanco";

        miCacharro.setTarifa(420.0);

        System.out.println("Datos de miCacharro: \n");

        System.out.println("Matrícula: " + miCacharro.getMatricula());
        System.out.println("Marca: " + miCacharro.getMarca());
        System.out.println("Modelo: " + miCacharro.getModelo());
        System.out.println("Color: " + miCacharro.getColor());
        System.out.println("Tarifa: " + miCacharro.getTarifa());
        System.out.println("¿Disponible? => " + miCacharro.getDisponible());

        Vehiculos newVuga = new Vehiculos("", "",
                 "", "", 0);

        System.out.println("Introduzca la matrícula");
        mat = entry.nextLine();

        System.out.println("Introduzca la marca");
        mar = entry.nextLine();

        System.out.println("Introduzca el modelo");
        mode = entry.nextLine();

        System.out.println("Introduzca el color");
        col = entry.nextLine();

        do {
            System.out.println("Introduzca la tarifa");
            try {
                tar = entry.nextDouble();
                repeat = false;
            } catch (InputMismatchException ime) {
                //Si se introduce algo que no sea un nº, salta este error:
                System.out.println("ERROR: Introduzca solo NÚMEROS.");
                tar = 0;
                //Para evitar problemas, limpiamos el búffer:
                entry.nextLine();
                repeat = true;
            }
        } while (repeat);

        System.out.println("¿Está disponible? (S para sí)");
        disp = entry.nextLine().charAt(0);

        newVuga.matricula = mat;
        newVuga.marca = mar;
        newVuga.modelo = mode;
        newVuga.color = col;
        newVuga.setTarifa(tar);

        if (disp == 's' || disp == 'S') {
            newVuga.setDisponible(true);
        } else {
            newVuga.setDisponible(false);
        }

        System.out.println("Datos de newVuga: \n");

        System.out.println("Matrícula: " + newVuga.getMatricula());
        System.out.println("Marca: " + newVuga.getMarca());
        System.out.println("Modelo: " + newVuga.getModelo());
        System.out.println("Color: " + newVuga.getColor());
        System.out.println("Tarifa: " + newVuga.getTarifa());
        System.out.println("¿Disponible? => " + newVuga.getDisponible());

    }

}
