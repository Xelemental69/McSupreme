/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daw.tareavuelosfjmg;

/**
 *
 * @author pikac
 */
import java.util.*;

public class NewMainVuelos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Map<String, Vuelo> vuelosDestino = new HashMap<>();

        SortedMap<String, Vuelo> vuelosOrdenadosDestino = new TreeMap<>();
        
        Map<Integer, Vuelo> vuelosCodigo = new HashMap<>();

        vuelosDestino.put("Magala", new Vuelo());
        vuelosDestino.put("Magala", new Vuelo(3, "Mursia", "Magala", 40, new ArrayList<>()));
        vuelosDestino.put("Andorra", new Vuelo(7, "Madril", "Andorrra", 190, new ArrayList<>()));
        vuelosDestino.put("Andorra", new Vuelo(34, "Barcechona", "Andorrra", 120, new ArrayList<>()));

        recargaPasajeros(vuelosDestino);

        for (String key : vuelosDestino.keySet()) {

            System.out.println(vuelosDestino.get(key).getDestino()
                    + "NumPasajeros = "
                    + vuelosDestino.get(key).getPasajeros().size());

        }

        vuelosOrdenadosDestino.put("Magala", new Vuelo());
        vuelosOrdenadosDestino.put("Magala", new Vuelo(78, "Mursia", "Magala", 40, new ArrayList<>()));
        vuelosOrdenadosDestino.put("Andorra", new Vuelo(21, "Madril", "Andorrra", 190, new ArrayList<>()));
        vuelosOrdenadosDestino.put("Andorra", new Vuelo(65, "Barcechona", "Andorrra", 120, new ArrayList<>()));

        recargaPasajeros(vuelosOrdenadosDestino);
        
        for (String key : vuelosOrdenadosDestino.keySet()) {

            System.out.println(vuelosOrdenadosDestino.get(key).getDestino()
                    + "NumPasajeros = "
                    + vuelosOrdenadosDestino.get(key).getPasajeros().size());

        }
        
        vuelosCodigo.put(956, new Vuelo());
        vuelosCodigo.put(478, new Vuelo(42, "Mursia", "Magala", 40, new ArrayList<>()));
        vuelosCodigo.put(239, new Vuelo(95, "Madril", "Andorrra", 191, new ArrayList<>()));
        vuelosCodigo.put(487, new Vuelo(69, "Barcechona", "Andorrra", 124, new ArrayList<>()));
        
        recargarPasajeros(vuelosCodigo);

        for (Integer key : vuelosCodigo.keySet()) {

            System.out.println(vuelosOrdenadosDestino.get(key).getCodVuelo()
                    + "Pasajeros = " + vuelosOrdenadosDestino.get(key).getPasajeros());

        }
        
    }

    public static Map<String, Vuelo> recargaPasajeros(Map<String, Vuelo> vuelos) {

        Random generate = new Random();

        for (String key : vuelos.keySet()) {

            for (int i = 0; i < (generate.nextInt(10) + 1); i++) {

                vuelos.get(key).getPasajeros().add(new Persona());

            }

        }

        return vuelos;

    }
    
    public static Map<Integer, Vuelo> recargarPasajeros(Map<Integer, Vuelo> vuelos) {

        Random generate = new Random();

        for (Integer key : vuelos.keySet()) {

            for (int i = 0; i < (generate.nextInt(10) + 1); i++) {

                vuelos.get(key).getPasajeros().add(new Persona());

            }

        }

        return vuelos;

    }

}
