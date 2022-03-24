/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programa;

/**
 *
 * @author fco-j
 */
import java.util.*;
import herencia.*;

public class Prueba {
    
    public static void main(String[] args) {
        
        //Creamos una lista donde poner las clases hijas de la Clase A:
        ArrayList <Ser> gente = new ArrayList <>();
        
        //Creamos tres clases que usaremos más adelante fuera de la lista:
        Persona starterP4 = new Persona(false, "Izanagi", "El Loco", "P4-001",
                MetodoActivacion.NAIPE, "Yu", "Narukami");
        
        UsuarioPersona protaP3 = new UsuarioPersona("P3-001",
                MetodoActivacion.PISTOLA, "Makoto", "Yüki");
        
        HumanoComun transeunte = new HumanoComun("28132013S", "Sho", "Minazuki");
        
        //Añadimos clases a la lista:
        gente.add(new Persona());
        gente.add(new UsuarioPersona());
        gente.add(new HumanoComun());
        gente.add(starterP4);
        gente.add(protaP3);
        gente.add(transeunte);
        
        for (Ser h : gente){//Se muestra cada clase antes de ordenar la lista
            
            System.out.println(h);
            
        }
        
        Collections.sort(gente);//Se ordena la lista
        
        for (Ser h : gente){//Se muestra cada clase tras ordenar la lista
            
            System.out.println(h);
            h.esUsuarioPersonas();//Y se ejecuta el método A en cada elemento
            
        }
        
        //Se ejecutan los otros métodos característicos:
        transeunte.datoAdicional();//Método C
        System.out.println("Estado del Persona: " + protaP3.estadoPersona());//Método B1
        System.out.println("Estado del Persona: " + starterP4.estadoPersona());//Método B1 (sobrescrito)
        starterP4.fraseCaracteristica();//Método B2
        
    }
    
}
