/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package legisladores;

/**
 *
 * @author pikac
 */
import java.util.*;

public class PruebaLegislador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Creamos un ArrayList de legisladores:
        ArrayList <Legislador> legisladores = new ArrayList <>(); 
                
        //Añadimos a la lista dos cuentas de cada tipo,
        //una de ellas por defecto, y otra con parámetros:
        legisladores.add(new Diputado ());
        legisladores.add(new Senador());
        legisladores.add(new Diputado (108, "Luna de Plutón",
                "Argentina", "Dross", "Rotzank"));
        legisladores.add(new Senador(234.56, "Raíz Vacua",
                "Charbon", "Lorkshawn", "Doppel"));
        
        for (Legislador l : legisladores){
            //Mostramos el resultado del método abstracto en cada clase
            //, además de mostrar cada clase:
            
            System.out.println("Cámara: " + l.getCamara());
            System.out.println(l);
            
        }
        
    }
    
}
