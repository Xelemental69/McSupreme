/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej11;

/**
 *
 * @author pikac
 */
import java.util.*;

public class MainEj11 {

    public static void main(String[] args) {

        //Crea 50 aplicaciones por defecto, guardándolas en una lista
        //y mostrándolas por pantalla.
        List<App> listaApp = new ArrayList<>();

        for (int i = 0; i < 50; i++) {

            listaApp.add(new App());

        }

        listaApp.forEach(System.out::println);

        //Guarda los datos de todas las clases App de la lista, en un fichero de texto llamado aplicacionestxt.txt, dentro del directorio "./appstxt".
        EscribirFichero.escribirFichero("appstxt", listaApp);
        
        //Guarda los datos de todas las clases App de la lista, en un fichero JSON llamado aplicacionesxml.json, dentro del directorio "./appsjson".
        EscribirFichero.escribirFicheroJSON("appJSON", listaApp);

        //Guarda los datos de todas las clases App de la lista, en un fichero XML llamado aplicacionesxml.xml, dentro del directorio "./appsxml".
        EscribirFichero.escribirFicheroXML("appXML", listaApp);
    }
}
