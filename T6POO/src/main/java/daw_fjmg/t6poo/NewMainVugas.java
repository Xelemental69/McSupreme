/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package daw_fjmg.t6poo;

/**
 *
 * @author fco-j
 */
import java.util.*;

public class NewMainVugas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        ArrayList<Vehiculo> lista = crearCatalogoVehiculos();

        for (Vehiculo v : lista) {

            // Llamada método polimórfico toString()
            System.out.println(v.getAtributos());
            System.out.println("");
            v.metodoVehiculo();
            System.out.println("");

            // Conversiones explícitas
            if (v instanceof Deportivo) {

                ((Deportivo) v).metodoDeportivo();

            } else if (v instanceof Furgoneta) {

                ((Furgoneta) v).metodoFurgoneta();

            } else if (v instanceof Turismo) {

                ((Turismo) v).metodoTurismo();

            }
            System.out.println("--------------------------------");
        }

    }

    public static ArrayList<Vehiculo> crearCatalogoVehiculos() {

        ArrayList<Vehiculo> lista = new ArrayList<>();

        lista.add(new Vehiculo());

        lista.add(new Vehiculo(2345334543L, "0944 TTF",
                "Seat", "León", "Rojo", 12.3, true));

        // Conversiones implícitas        
        lista.add(new Turismo());
        lista.add(new Turismo(3, 1345334543L, "0955 TTF",
                "Peugeot", "308", "Verde", 2.3, true));
        lista.add(new Turismo(3, 1345334543L, "0955 TTF",
                "Peugeot", "308", "Verde", 2.3, true));
        lista.add(new Deportivo());
        lista.add(new Deportivo(3, 5545334543L, "2355 DRG",
                "Ford", "Mustang", "Negro", 1.3, true));
        lista.add(new Furgoneta());
        lista.add(new Furgoneta(1200, 12, 4444434543L, "1111 TTF",
                "Peugeot", "Partner", "Verde", 14.8, true));

        return lista;
    }

}
