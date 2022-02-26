/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquetec;

import java.util.*;

/**
 *
 * @author Xelemental
 */
public class EjercitosMap {
    
    public static void main(String[] args) {
                    
        //Creamos un TreeMap de TreeSets (Map y Sets ordenados)
        Map <String, Ejercito> ejercitos = new TreeMap<>();
        
        ejercitos.put("TIA", new Ejercito());        
        ejercitos.put("A&O", new Ejercito());

        //Añadimos nuestros soldados. Puros y "competentes" personajes
        //de nuestra Españita y de Galia:
        ejercitos.get("TIA").getEjercito().add(new Soldado("19011978O", "Ofelia", "La", "Secretaria", 53));
        ejercitos.get("TIA").getEjercito().add(new Soldado("19581394M", "Mortadelo", "Calvo", "Pulgarcito", 58));
        ejercitos.get("TIA").getEjercito().add(new Soldado("19581394F", "Filemón", "Pi", "Pulgarcito", 58));
        ejercitos.get("TIA").getEjercito().add(new Soldado("19690123P", "Vicente", "El", "Súper", 58)); 
        
        ejercitos.get("A&O").getEjercito().add(new Soldado("29101959A", "Astérix", "El", "Galo", 37));
        ejercitos.get("A&O").getEjercito().add(new Soldado("29101959O", "Obélix", "El", "Galo", 36));
        ejercitos.get("A&O").getEjercito().add(new Soldado("29101959P", "Panoramix", "El", "Druida", 58));
        ejercitos.get("A&O").getEjercito().add(new Soldado("29101959I", "Ideafix", "El", "Perrete", 58));
        
        //Y por último, los mostramos en pantalla
        ejercitos.forEach((clave, valor) -> System.out.println("Nombre: " + clave + "\nSoldados: " + valor));
        
    }   
    
}
