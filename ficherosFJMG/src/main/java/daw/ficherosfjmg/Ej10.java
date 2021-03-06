/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daw.ficherosfjmg;

/**
 *
 * @author fcoj
 */
import vugas.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

//Definición de la clase.
public class Ej10 {

    /*10.- Implementa un programa para leer los ficheros de texto del ejercicio anterior, de forma que se guarden en una única lista de Vehículos los objetos leídos de cada fichero. El programa debe realizar lo siguiente:
    - Copiar los tres ficheros *.csv a un directorio previamente creado en “./copias”.
    - Mostrar los ficheros contenidos en “copias”.
    - Leer los ficheros de la carpeta “copias” e ir guardando los objetos en una lista de vehículos.
    - Imprimir la lista por pantalla. 
    - Ordena la lista por bastidor.
    - Imprimir la lista ordenada.
    - Borrar los ficheros *.csv originales.
    - Mostrar el contenido de la carpeta donde estaban los *.csv originales.
    - Usando Streams, realiza las siguientes acciones sobre la lista de vehículos:
        - Imprime por pantalla todos los coches blancos, distintos, ordenador por matrícula.
        - Imprime por pantalla todas las marcas de coches distintas de aquellos coches que estén disponibles.
        - Saber la cantidad de vehículos Citroen.
        - Comprueba si hay algún Peugeot negro disponible en la lista.*/
    public static void main(String[] args) throws FileNotFoundException {
        //ArrayList de Vehículos en el que almacenaré todos los objetos de tipo Vehiculo.
        ArrayList<Vehiculo> listaVehiculos = new ArrayList<>();

        //Nombre de los ficheros.
        String ficheroTurismos = "Turismos.csv";
        String ficherosDeportivos = "Deportivos.csv";
        String ficherosFurgonetas = "Furgonetas.csv";
        //Variables para utilizar en los try-with-resources.
        String[] tokens;
        String linea;

        //try-with-resources para leer el fichero "vehiculos.txt".
        try ( Scanner datosFichero = new Scanner(new FileReader(ficheroTurismos))) {
            while (datosFichero.hasNextLine()) {

                linea = datosFichero.nextLine();

                // Se guarda en el array de String cada elemento de la
                // línea en función del carácter separador coma
                tokens = linea.split(";");
                Turismo v1 = new Turismo();
                v1.setMatricula(tokens[0]);
                v1.setKilometros(Double.parseDouble(tokens[1]));
                v1.setBastidor(Long.parseLong(tokens[2]));
                v1.setMarca(tokens[3]);
                v1.setModelo(tokens[4]);
                v1.setColor(tokens[5]);
                v1.setTarifa(Double.parseDouble(tokens[8]));
                v1.setNumeroPuertas(Integer.parseInt(tokens[6]));
                v1.setDisponible(Boolean.parseBoolean(tokens[9]));
                v1.setMarchaAutomatica(Boolean.parseBoolean(tokens[7]));
                v1.setColorChapa(tokens[10]);

                listaVehiculos.add(v1);
            }
        }
        try ( Scanner datosFichero = new Scanner(new FileReader(ficherosDeportivos))) {
            while (datosFichero.hasNextLine()) {

                linea = datosFichero.nextLine();

                // Se guarda en el array de String cada elemento de la
                // línea en función del carácter separador coma
                tokens = linea.split(";");
                Deportivo v1 = new Deportivo();
                v1.setMatricula(tokens[0]);
                v1.setKilometros(Double.parseDouble(tokens[1]));
                v1.setBastidor(Long.parseLong(tokens[2]));
                v1.setMarca(tokens[3]);
                v1.setModelo(tokens[4]);
                v1.setColor(tokens[5]);
                v1.setTarifa(Double.parseDouble(tokens[8]));
                v1.setNumeroPuertas(Integer.parseInt(tokens[6]));
                v1.setDisponible(Boolean.parseBoolean(tokens[9]));
                v1.setMarchaAutomatica(Boolean.parseBoolean(tokens[7]));
                v1.setCilindrada(Integer.parseInt(tokens[10]));

                listaVehiculos.add(v1);
            }
        }
        try ( Scanner datosFichero = new Scanner(new FileReader(ficherosFurgonetas))) {
            while (datosFichero.hasNextLine()) {

                linea = datosFichero.nextLine();

                // Se guarda en el array de String cada elemento de la
                // línea en función del carácter separador coma
                tokens = linea.split(";");
                Furgoneta v1 = new Furgoneta();
                v1.setMatricula(tokens[0]);
                v1.setKilometros(Double.parseDouble(tokens[1]));
                v1.setBastidor(Long.parseLong(tokens[2]));
                v1.setMarca(tokens[3]);
                v1.setModelo(tokens[4]);
                v1.setColor(tokens[5]);
                v1.setTarifa(Double.parseDouble(tokens[8]));
                v1.setNumeroPuertas(Integer.parseInt(tokens[6]));
                v1.setDisponible(Boolean.parseBoolean(tokens[9]));
                v1.setMarchaAutomatica(Boolean.parseBoolean(tokens[7]));
                v1.setCarga(Integer.parseInt(tokens[10]));
                v1.setVolumen(Integer.parseInt(tokens[11]));

                listaVehiculos.add(v1);
            }
        }
        //Creamos el directorio
        crearDirectorio("./copias");

        //Copiamos los ficheros en el directorio creado anteriormente.
        System.out.println("--------------------------------------------------------");
        copiarFicheros(ficheroTurismos, "copias/turismos.csv");
        System.out.println("--------------------------------------------------------");
        copiarFicheros(ficherosDeportivos, "copias/deportivos.csv");
        System.out.println("--------------------------------------------------------");
        copiarFicheros(ficherosFurgonetas, "copias/furgonetas.csv");

        //Listamos los ficheros de un directorio.
        System.out.println("--------------------------------------------------------");
        listarFicheros("./copias");

        //Prueba imprimiendo la lista de Vehículos.
        System.out.println("--------------------------------------------------------");
        System.out.println("Imprimiendo la lista de Vehículos:\n");
        listaVehiculos.forEach(System.out::println);

        //Ordenamos la lista por número de bastidor.
        listaVehiculos.sort(new Comparator<Vehiculo>() {
            @Override
            public int compare(Vehiculo v1, Vehiculo v2) {
                return v1.getBastidor().compareTo(v2.getBastidor());
            }
        });

        //Imprimimos la lista ordenada por bastidor.
        System.out.println("--------------------------------------------------------");
        System.out.println("\n\nImprimiendo la lista ordenada por bastidor:\n");
        listaVehiculos.forEach(System.out::println);

        //Borramos los ficheros csv originales.
//        borradoElemento("./turismos.csv");
//        borradoElemento("./deportivos.csv");
//        borradoElemento("./furgonetas.csv");
        //Listamos la carpeta donde están/estaban los ficheros .csv originales.
        listarFicheros("./");

        //USAMOS API STREAM:
        //Imprime por pantalla todos los coches blancos, distintos, ordenador por matrícula.
        List<Vehiculo> cochesBlancos = listaVehiculos.stream()
                .filter(v -> v.getColor().equalsIgnoreCase("blanco")) //Stream de vehículos de color blanco. FILTRA.
                .sorted((v1, v2) -> v1.getMatricula().compareTo(v2.getMatricula()))//Stream de vehiculos ordenados por matrícula. ORDENA.
                .distinct() //Distintos.
                .collect(Collectors.toList()); //Devuelve una colección de tipo List, con el stream anterior concatenado. ALMACENA/TRANSFORMA.

        System.out.println("\nImprimiendo lista de coches blancos, ordenados por matrícula: ");
        cochesBlancos.forEach(System.out::println);

        //Imprime por pantalla todas las marcas de coches distintas de aquellos coches que estén disponibles.
        List<String> marcasCochesDisponibles = listaVehiculos.stream()
                .filter(v -> v.isDisponible())//Filtrado por disponibles.
                .map(v -> v.getMarca())//Mapeo de Stream de tipo Vehiculo a String.
                .distinct()//Distintos
                .collect(Collectors.toList());

        System.out.println("\nImprimiendo lista de coches disponibles, de distintas marcas: ");
        marcasCochesDisponibles.forEach(System.out::println);

        //Saber la cantidad de vehículos Citroen.
        long cantidadCitroen = listaVehiculos.stream()
                .filter(v -> v.getMarca().equalsIgnoreCase("Citroen"))
                .count();//Cuenta. Devuelve long
        System.out.println("\nImprimiendo cantidad de coches Citroen: " + cantidadCitroen);

        //Comprueba si hay algún Peugeot negro disponible en la lista
        boolean hayPeugeot = listaVehiculos.stream()
                .anyMatch(v -> v.getMarca().equalsIgnoreCase("peugeot") && v.getColor().equalsIgnoreCase("negro"));
        System.out.println("\nHay Peugeot: " + hayPeugeot);
    }

    //Método para crear un directorio.
    public static void crearDirectorio(String rutaDirectorio) {
        Path directorio = Paths.get(rutaDirectorio); //Ruta del directorio.
        try {
            Files.createDirectory(directorio);
            System.out.println("Directorio creado correctamente.");
        } catch (IOException e) {
            System.out.println("Problema creando el directorio.");
            System.out.println(e.toString());
        }
    }

    //Método para copiar ficheros de una ruta a otra.
    public static void copiarFicheros(String rutaOrigen, String rutaDestino) {
        Path origen = Paths.get(rutaOrigen);
        Path destino = Paths.get(rutaDestino);
        try {
            Files.copy(origen, destino);
            System.out.println("Archivo copiado correctamente.");
        } catch (IOException e) {
            System.out.println("Problema copiando el archivo.");
            System.out.println(e.toString());
        }
    }

    //Método para listar ficheros
    public static void listarFicheros(String listarRuta) {
        File f = new File(listarRuta);
        if (f.exists()) {
            File[] ficheros = f.listFiles();
            System.out.println("LISTADO DE FICHEROS:");
            for (File file2 : ficheros) {
                System.out.println(file2.getName());
            }
        } else {
            System.out.println("El directorio a listar no existe");
        }
    }

    //Método para eliminar un fichero/directorio.
    public static void borradoElemento(String rutaElementoBorrar) {
        Path element = Paths.get(rutaElementoBorrar);
        try {
            Files.delete(element);
            System.out.println("Elemento borrado correctamente.");
        } catch (IOException e) {
            System.out.println("Problema borrando el archivo.");
            System.out.println(e.toString());
        }

    }

}
