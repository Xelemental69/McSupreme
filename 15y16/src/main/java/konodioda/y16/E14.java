/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package konodioda.y16;
import java.util.*;

/**
 *
 * @author Xelemental
 */
public class E14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Declaramos e inicializamos las variables a usar
        Scanner entry = new Scanner(System.in);        
        int s,min,h;
        //Pedimos la cantidad de tiempo en segundos
        System.out.println("Introduce la cantidad de tiempo (en segundos): ");
        s = entry.nextInt();
        //Convertimos el valor en horas, minutos y segundos
        min = s / 60;        
        h = min / 60;
        s -= min * 60;
        min -= h * 60;
        //Mostramos el resulltado por pantalla
        System.out.println("El tiempo introducido es de " + h + " hora(s), " 
        + min + " minuto(s) y " + s + " segundo(s)");        
        
    }
    
}
