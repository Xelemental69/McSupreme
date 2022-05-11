/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package clases;

/**
 *
 * @author fcoj
 */
import backend_java_json.*;
import java.util.*;

public class PruebaURL {

    public static void main(String[] args) {
        
        String link = "https://jsonplaceholder.typicode.com/users";
        
        muestra(link);
        
    }
    
    public static void muestra(String link){                
        
        String getBuck = "";
        ConexionHTTP connect = new ConexionHTTP();
        Json jason = new Json();
        
        try {
            getBuck = connect.peticionHttpGet(link);
            ArrayList<User> lista = jason.stringToList(getBuck);
            lista.forEach(l -> System.out.println(l.getId() + " " + l.getName()
            + " (" + l.getUsername() + " ; Email: " + l.getEmail() + ")"));
        } catch (Exception e) {
            // Manejar excepción
            System.out.println("Error durante la conexión HTTP");
            e.printStackTrace();
        }
        
    }
    
}
