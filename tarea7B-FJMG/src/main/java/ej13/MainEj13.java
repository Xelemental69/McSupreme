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
import java.util.*;

public class MainEj13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Cogemos las App del fichero JSON del ejercicio 11, poniéndolas en
        //un ArrayList:
        ArrayList<App> appList = LeerFichero.leerArchivoJSON("appJSON");
        
        //Y mostramos las apps por consola:
        appList.forEach(System.out::println);
        
    }
    
}
