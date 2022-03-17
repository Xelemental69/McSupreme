/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package daw_fjmg.t6poo;

/**
 *
 * @author fco-j
 */
import java.util.*;

public class PruebaTrabajadores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Programador programador = new Programador(Categoria.ANALISTA, 2500.96, "Matías", "89632541L", 39);
        Programador programador2 = new Programador(Categoria.ANALISTA, 2500.96, "Matías", "89632541L", 39);
        Persona persona = new Persona("Miguel", "79856423K", 31);    
        Camarero camarero = new Camarero("Jefe de Sala");
        
        
        
        ArrayList<Trabajador> lista = new ArrayList<>();
        // Conversión implícita. Supone guardar un objeto hijo en una referencia
        // padre. Guardar un objeto de una subclase en una referencia de la
        // superclase.
        Persona p1 = new Camarero("Soldao raso");
        Trabajador e = new Camarero("Soldao raso");
        //Camarero c = (Camarero) new Persona(); // Conversión explícita
        lista.add(programador);
        lista.add(camarero);
        // Cuando se guarda un objeto en una referencia de la superclase,
        // esa referencia sólo tiene acceso a los métodos de su propia clase 
        // Si estoy guardando objetos de clases hijas en la referencia de
        // Persona, esa referencia sólo tiene acceso a los métodos de persona
        // Sí hay acceso a los métodos sobrescritos en las clases hijas
        e.cotizar(); // Se ejecuta el del camarero
        e = new Programador();
        
        e.cotizar(); // Se ejecuta el de empleado
        
        // Recorro la lista de persona
        for (Trabajador persona1 : lista) {
            persona1.cotizar();
            // Si persona1 es un programador, entonces que programe
           
            // Esto me sirve para acceder a los métodos propios de cada clase
            // No sobrescritos
            if(persona1 instanceof Programador){
                // Conversión explícita
                System.out.println("Programando.....");
                Programador p = (Programador) persona1;
                p.programar("Javascript");
                
            }
            if (persona1 instanceof Camarero){
                // Conversión explícita
                System.out.println("Sirviendo una mesa.....");
                Camarero c = (Camarero) persona1;
                c.servirMesa("Sopa");
            }
        }
                
        
        //Comprueba como un objeto de una clase hija puede llamar a métodos de 
        //la clase padre, pero no al contrario
        System.out.println(programador.toString());

        //Accedemos al método aumentarSalario desde la misma clase que lo contiene (Empleado)
        programador.setEdad(25);
        programador.aumentarSalario(23);
        
        //Acceso a los métodos de la misma clase Persona
        persona.setEdad(24);
        System.out.println(persona.toString());

        //Desde la clase hija programador podemos acceder a métodos de las clases
        //padres, Empleado y Persona, pero no podría hacerse al contrario
        programador.aumentarSalario(160); //Aumentamos el salario
        programador.setEdad(37); //Cambiamos la edad
        System.out.println(programador.toString());

        //Igual con la clase Empleado con respecto a la clase padre Persona
        System.out.println(programador2.getNombre()); //Imprimo el nombre
        programador2.setNif("85632589G"); //Cambio el nif
        System.out.println(programador2.toString());
        
        persona.comer();
        programador.comer();
        programador.comer("hola");
        
    }
    
}
