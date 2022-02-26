/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paqueteb;

/**
 *
 * @author pikac
 */
import org.apache.commons.lang3.RandomStringUtils;
import java.util.*;

public class LoteriaMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Declaramos e inicializamos las variables:
        Loteria cuponesDeLaOnce = new Loteria();//Es nuestro Map
        final int MAX = 1000;
        String numCupon;
        String premio = "";
        Random suerte = new Random();
        Scanner entry = new Scanner(System.in);
        int manoInocente;
        
        while(cuponesDeLaOnce.getCupon().size() < MAX){
            //Mediante un for, añadimos 1000
            //cupones al Map (cupones De La Once)
            
            manoInocente = suerte.nextInt(5);//Escogemos al azar un nº
            //para determinar el premio en el siguiente switch:
            
            switch(manoInocente){
                
                case 0:
                    
                    premio = "Ha ganado nada. Qué lástima";
                    break;
                
                case 1:
                    premio = "Ha ganado 50€";
                    break;
                    
                case 2:
                    premio = "Ha ganado 100€";
                    break;
                    
                case 3:
                    premio = "Ha ganado 1000€";
                    break;
                    
                case 4:
                    premio = "Ha ganado 5000€. ¡Menuda Suerte!";
                    break;
                    
                
            }
            
            //Generamos al azar el nº del cupón (siempre será de 5 dígitos)
            //, lo mostramos por pantalla y lo agregamos al Map:
            numCupon = RandomStringUtils.randomNumeric(5).toUpperCase();
            System.out.println(numCupon);
            
            cuponesDeLaOnce.anadirCupon (numCupon, premio);
            
        }
        //Pedimos el nº de cupón para comprobar su premio:
        System.out.println("¿Qué cupón desea consultar?");
        numCupon = entry.nextLine();
        
        System.out.println(cuponesDeLaOnce.consultarPremio(numCupon));
        
    }
    
}
