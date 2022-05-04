/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej13;

/**
 *
 * @author pikac
 */
import ej11.*;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.*;
import java.util.*;

public class LeerFichero {

    public static ArrayList<App> leerArchivoJSON(String nombre) {

        //Creamos un ArrayList donde almacenar las apps y un ObjectMapper que
        //ayudará a extraer los datos:
        ArrayList<App> apps = new ArrayList<>();
        ObjectMapper mapeador = new ObjectMapper();

        try {
            
            apps.addAll(mapeador.readValue(new File(nombre),
                    mapeador.getTypeFactory().constructCollectionType(ArrayList.class, App.class)));

        } catch (IOException e) {

            e.printStackTrace();

        }

        return apps;
    }
}
