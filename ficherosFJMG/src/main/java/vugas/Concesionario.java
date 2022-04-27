/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vugas;

/**
 *
 * @author fcoj
 */
import java.util.*;

public class Concesionario {
    
    private ArrayList<Vehiculo> vehiculos = new ArrayList<>();

    public Concesionario() {
        for (int i = 0; i < 30; i++) {
            Random rd = new Random();
            String[] marcas = {"Renault", "Seat", "Opel", "Mercedes", "Citroen"};
            Vehiculo vehiculo = null;
            if (i <=10) {
                vehiculo = new Turismo("Blanco", 4, 21312l, "1231a", 123.4, marcas[rd.nextInt(marcas.length)], "Miami", 8.67, false, true);
            } else if (i <= 20 && i > 10) {
                vehiculo = new Deportivo(7, 21312l, "1231a", 123.4, marcas[rd.nextInt(marcas.length)], "Runner", 8.67, false, true, 4);
            } else if (i <= 30 && i>20) {
                vehiculo = new Furgoneta(55, 679, 21312l, "1231a", 123.4, marcas[rd.nextInt(marcas.length)], "FreeCandy", 8.67, false, true, 4);
            }
            vehiculos.add(vehiculo);
            
            /*
            
            (String matricula, double kilometros, String numeroBastidor, String marca)
            
            int carga, int volumen, Long bastidor,
            String matricula, double kilometros, String marca, String modelo,
             double tarifa, boolean disponible
            , boolean marchaAutomatica, int numeroPuertas
            
            */

        }
    }

    public ArrayList<Vehiculo> getVehiculos() {
        return vehiculos;
    }

    @Override
    public String toString() {
        return "Concecionario{" +
                "ejercicio04.vehiculos=" + vehiculos +
                '}';
    }

    public static void main(String[] args) {
        Concesionario c = new Concesionario();

        c.getVehiculos().forEach((vehiculo) -> {
            System.out.println(vehiculo);
        });
    }
    
}
