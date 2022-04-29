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
import java.util.*;
import java.io.*;

public class Ej9_1 {

    /*9.- Realiza una modificación sobre el programa del ejercicio 7 para que divida la única lista de objetos Vehiculo en tres listas específicas de objetos Turismo, Deportivo y Furgoneta. 
    Una vez generadas las tres listas, guarda en tres ficheros CSV (*.csv) los vehículos correspondientes a cada lista, separando cada campo usando el carácter delimitador punto y coma (;).
    Abre los ficheros CSV usando un programa de hoja de cálculo, indicando que la separación de campos se realiza usando ;, y comprueba que cada campo se encuentra en una columna diferente.*/
    public static void main(String[] args) throws IOException {
        //COPIO EL EJERCICIO 7
        //ArrayList en el que almacenaré todos los objetos de tipo Vehiculo.
        ArrayList<Turismo> listaTurismos = new ArrayList<>();
        ArrayList<Deportivo> listaDeportivos = new ArrayList<>();
        ArrayList<Furgoneta> listaFurgonetas = new ArrayList<>();

        String idFichero = "vehiculos.txt";

        String ficheroTurismos = "Turismos.csv";
        String ficherosDeportivos = "Deportivos.csv";
        String ficherosFurgonetas = "Furgonetas.csv";

        String[] tokens;
        String linea;

        //try-with-resources para leer el fichero "vehiculos.txt".
        try ( Scanner datosFichero = new Scanner(new FileReader(idFichero))) {
            while (datosFichero.hasNextLine()) {

                linea = datosFichero.nextLine();

                // Se guarda en el array de String cada elemento de la
                // línea en función del carácter separador coma
                tokens = linea.substring(4).split(":");

                if (linea.charAt(0) == '0') {
                    Turismo t1 = new Turismo();
                    t1.setMatricula(tokens[0]);
                    t1.setKilometros(Double.parseDouble(tokens[1]));
                    t1.setBastidor(Long.parseLong(tokens[2]));
                    t1.setMarca(tokens[3]);
                    t1.setModelo(tokens[4]);
                    t1.setColor(tokens[5]);
                    t1.setTarifa(Double.parseDouble(tokens[8]));
                    t1.setNumeroPuertas(Integer.parseInt(tokens[6]));
                    t1.setDisponible(Boolean.parseBoolean(tokens[9]));
                    t1.setMarchaAutomatica(Boolean.parseBoolean(tokens[7]));
                    t1.setColorChapa(tokens[10]);

                    listaTurismos.add(t1);
                } else if (linea.charAt(0) == '1') {
                    Deportivo d1 = new Deportivo();
                    d1.setMatricula(tokens[0]);
                    d1.setKilometros(Double.parseDouble(tokens[1]));
                    d1.setBastidor(Long.parseLong(tokens[2]));
                    d1.setMarca(tokens[3]);
                    d1.setModelo(tokens[4]);
                    d1.setColor(tokens[5]);
                    d1.setTarifa(Double.parseDouble(tokens[8]));
                    d1.setNumeroPuertas(Integer.parseInt(tokens[6]));
                    d1.setDisponible(Boolean.parseBoolean(tokens[9]));
                    d1.setMarchaAutomatica(Boolean.parseBoolean(tokens[7]));
                    d1.setCilindrada(Integer.parseInt(tokens[10]));

                    listaDeportivos.add(d1);
                } else {
                    Furgoneta f1 = new Furgoneta();
                    f1.setMatricula(tokens[0]);
                    f1.setKilometros(Double.parseDouble(tokens[1]));
                    f1.setBastidor(Long.parseLong(tokens[2]));
                    f1.setMarca(tokens[3]);
                    f1.setModelo(tokens[4]);
                    f1.setColor(tokens[5]);
                    f1.setTarifa(Double.parseDouble(tokens[8]));
                    f1.setNumeroPuertas(Integer.parseInt(tokens[6]));
                    f1.setDisponible(Boolean.parseBoolean(tokens[9]));
                    f1.setMarchaAutomatica(Boolean.parseBoolean(tokens[7]));
                    f1.setCarga(Integer.parseInt(tokens[10]));
                    f1.setVolumen(Integer.parseInt(tokens[11]));

                    listaFurgonetas.add(f1);
                }

            }
        }
        try ( BufferedWriter flujo = new BufferedWriter(new FileWriter(ficheroTurismos))) {
            for (Turismo tur : listaTurismos) {
                flujo.write(tur.getMatricula() + ";" + tur.getKilometros() + ';' + tur.getBastidor() + ";" + tur.getMarca() + ";" + tur.getModelo() + ";"
                        + tur.getColor() + ";" + tur.getNumeroPuertas() + ";" + tur.isMarchaAutomatica() + ';' + tur.getTarifa() + ";" + tur.isDisponible() + ';'
                        + tur.getColorChapa());
                flujo.newLine();

            }
            // Metodo flush() guarda cambios en disco 
            flujo.flush();
            System.out.println("Fichero " + ficheroTurismos + " creado correctamente.");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        try ( BufferedWriter flujo = new BufferedWriter(new FileWriter(ficherosDeportivos))) {
            for (Deportivo dep : listaDeportivos) {
                flujo.write(dep.getMatricula() + ";" + dep.getKilometros() + ';' + dep.getBastidor() + ";" + dep.getMarca() + ";" + dep.getModelo() + ";"
                        + dep.getColor() + ";" + dep.getNumeroPuertas() + ";" + dep.isMarchaAutomatica() + ';' + dep.getTarifa() + ";" + dep.isDisponible()
                        + ";" + dep.getCilindrada());
                flujo.newLine();
            }
            // Metodo flush() guarda cambios en disco 
            flujo.flush();
            System.out.println("Fichero " + ficherosDeportivos + " creado correctamente.");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        try ( BufferedWriter flujo = new BufferedWriter(new FileWriter(ficherosFurgonetas))) {
            for (Furgoneta fur : listaFurgonetas) {
                flujo.write(fur.getMatricula() + ";" + fur.getKilometros() + ';' + fur.getBastidor() + ";" + fur.getMarca() + ";" + fur.getModelo() + ";"
                        + fur.getColor() + ";" + fur.getNumeroPuertas() + ";" + fur.isMarchaAutomatica() + ';' + fur.getTarifa() + ";" + fur.isDisponible()
                        + ";" + fur.getCarga() + ";" + fur.getVolumen());
                flujo.newLine();
            }
            // Metodo flush() guarda cambios en disco 
            flujo.flush();
            System.out.println("Fichero " + ficherosFurgonetas + " creado correctamente.");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

}
