/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package setOrdenado;

/**
 *
 * @author fco-j
 */
import java.util.*;

public class EjercitoOrdenado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //Creamos un TreeSet (Set, pero ordenado)
        Set<Soldado> ejercito = new TreeSet<>();

        //Mostramos funciones del set en pantalla, 
        //como el que muestra si está vacío (dará true)
        System.out.println("¿Está vacío el ejército? --> " + ejercito.isEmpty());

        //Añadimos nuestros soldados. Puros y "competentes" personajes
        //de nuestra Españita:
        ejercito.add(new Soldado("69696969X", "Torrente", "El", "Pajillero", 56));
        ejercito.add(new Soldado("19581394M", "Mortadelo", "Calvo", "Pulgarcito", 58));
        ejercito.add(new Soldado("19581394F", "Filemón", "Pi", "Pulgarcito", 58));
        ejercito.add(new Soldado("19690123P", "Vicente", "El", "Súper", 58));

        //Intentaremos añadir un impostor de Filemón, el cual será rechazado,
        //porque el TreeSet no acepta duplicados.
        ejercito.add(new Soldado("19581394F", "Filemón", "De", "Hacendado", 58));

        //Mostramos de nuevo si está vacío (dará false)
        System.out.println("¿Está vacío el ejército? --> " + ejercito.isEmpty());

        for (Soldado s : ejercito) {//Mostramos nuestros orgullosos
            //e infalibles soldados por pantalla:

            System.out.println(s);

        }

        //Mostramos el tamaño de nuestra potente escuadra:
        System.out.println("Nuestro ejército de pulgarcitos"//Referencia a la serie de revistas Pulgarcito, de donde originó Mortadelo y Filemón
                + " (y Torrente) se compone de " + ejercito.size() + " soldados");

        //Comprobamos si el gran casi calvo Filemón está en nuestro ejército:
        System.out.println("¿Está el perezoso Filemón"
                + " en el ejército? --> " + ejercito.contains(new Soldado("19581394F", "Filemón", "Pi", "Pulgarcito", 58)));

        //Echamos a Torrente del ejército porque se rasca mucho los huevos:
        System.out.println("Torrente será desmatriculado por desastre...");
        ejercito.remove(new Soldado("69696969X", "Torrente", "El", "Pajillero", 56));

        //Creamos un ArrayList donde depositaremos los datos de nuestros agentes
        ArrayList<Soldado> tia = new ArrayList<>();

        for (Soldado s : ejercito) {
            //Añadimos nuestros soldados el arrayList (la TIA):

            tia.add(s);

        }

        //Y la mostramos por pantalla:
        System.out.println("Soldados: " + tia);

    }

}
