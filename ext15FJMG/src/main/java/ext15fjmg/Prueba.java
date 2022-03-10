/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ext15fjmg;

/**
 *
 * @author fco-j
 */
import java.util.*;
import java.time.*;

public class Prueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Declaramos e inicializamos las empresas:
        Empresa empresaA = new Empresa ("I Have The High Ground", "190505");
        Empresa empresaB = new Empresa ("You Were The Chosen One", "19052005");
        
        //Declaramos e inicializamos los trabajadores:        
        Trabajador t1 = new Trabajador("Anakin", "Skywalker", 
                LocalDate.of(2004, 3, 9), CategoriaEmpleado.INICIAL);
        
        Trabajador t2 = new Trabajador("Yoda", "Jedi Master", 
                LocalDate.of(1980, 10, 3), CategoriaEmpleado.MEDIA);
        
        Trabajador t3 = new Trabajador("Obi-wan", "Kenobi", 
                LocalDate.of(2003, 3, 9), CategoriaEmpleado.INICIAL);
        
        Trabajador t4 = new Trabajador("Palpatine", "Emperador no-Muerto (por qué)", 
                LocalDate.of(1983, 5, 25), CategoriaEmpleado.MEDIA);
        
        Trabajador t5 = new Trabajador("Han", "Solo Fanservice", 
                LocalDate.of(1977, 11, 7), CategoriaEmpleado.AVANZADA);
        
        Trabajador t6 = new Trabajador(t3);
        
        empresaA.contratar(t1);
        empresaA.contratar(t2);
        empresaA.contratar(t3);
        empresaB.contratar(t4);
        empresaB.contratar(t5);
        empresaB.contratar(t6);
        
        empresaA.imprimir();
        empresaB.imprimir();
        
        empresaB.despedir(t5);
        empresaA.contratar(t5);
        
        empresaA.ordenarNombre();
        empresaB.ordenarNombre();
        
        System.out.println("Después de ordenar por nombre...");
        
        System.out.println("Posición de Obi-wan en " + empresaA.getNombre()
                + ": " + empresaA.buscarNombre(t3));
        
        System.out.println("Posición de Obi-wan en " + empresaB.getNombre()
                + ": " + empresaB.buscarNombre(t6));
        
    }
    
}
