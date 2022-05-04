/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej12;

/**
 *
 * @author pikac
 */

import ej11.*;
import java.util.*;

public class MainEj12 {
    
    public static void main(String[] args) {
        
        //Creamos una lista donde almacenamos las 50 apps del XML ejercicio 11:
        List<App> appList = LeerFichero.lecturaFicheroXML("appXML");

        //Y las mostramos por consola:
        appList.forEach(System.out::println);
        
    }
    
}
