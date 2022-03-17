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

public class NewMainCliente {

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) {
        
       //Hacemos nuestros clientes (3 iguales, 2 distintos):
        Cliente c1 = new Cliente();
        Cliente c2 = new Cliente();
        Cliente c3 = new Cliente();
        Cliente c4 = new Cliente("Volcanus", "94238620F", 34);
        Cliente c5 = new Cliente("Pul Luzbel", "21052011Z", 18);
        int contador = 0;//Declaramos e inicializamos el contador
        
        //Hacemos un array y un arraylist para realizar el método en ambos tipos:
        Cliente[] clientes = {c1, c2, c3, c4, c5};
        ArrayList <Cliente> clientes2 = new ArrayList <>();
        clientes2.add(c1);
        clientes2.add(c2);
        clientes2.add(c3);
        clientes2.add(c4);
        clientes2.add(c5);
        
        //Creamos dos listas de tanto los iguales y los distintos
        //(para Array y para ArrayList):
        ArrayList <Cliente> clientesDif = new ArrayList <>();
        ArrayList <Cliente> clientesIg = new ArrayList <>();
        ArrayList <Cliente> clientesDif2 = new ArrayList <>();
        ArrayList <Cliente> clientesIg2 = new ArrayList <>();
                
        //Con Arrays normales:
        for(int i = 0; i < clientes.length; i++){            
            
            System.out.println("Hashcode: " + clientes[i].hashCode());
            contador = 0;//Reseteamos el contador
            
            for(int j = 0; j < clientes.length; j++){
                                               
                if(clientes[i].equals(clientes[j])){
                    
                    contador++;//Si el equals se cumple, el contador aumentará
                    //Ya que se cumplirá al menos una vez, comprobaremos
                    //según se cumpla una o más veces
                    
                }
                
            }
            
            if(contador > 1){//Hay más de una coincidencia:
                                
                if(!clientesIg.contains(clientes[i])){
                    
                    //Se añade a la lista de iguales, si no está ya añadido:            
                    clientesIg.add(clientes[i]);
                
                }
                
            }else if (contador == 1){//Solo hay una coincidencia
                
                //Se añade en la lista de distintos:
                clientesDif.add(clientes[i]);
                
            }
            
        }
        
        //Con ArrayLists:
        for(int i = 0; i < clientes2.size(); i++){            
            
            System.out.println("Hashcode: " + clientes2.get(i).hashCode());
            contador = 0;
            
            for(int j = 0; j < clientes2.size(); j++){
                                                
                if(clientes2.get(i).equals(clientes2.get(j))){
                    
                    contador++;//Si el equals se cumple, el contador aumentará
                    //Ya que se cumplirá al menos una vez, comprobaremos
                    //según se cumpla una o más veces
                    
                }
                
            }
            
            if(contador > 1){//Hay más de una coincidencia:
                
                if(!clientesIg2.contains(clientes2.get(i))){
                    
                    clientesIg2.add(clientes2.get(i));
                
                }
                
            }else if (contador == 1){//Solo hay una coincidencia
                
                //Se añade en la lista de distintos:                
                clientesDif2.add(clientes2.get(i));
                
            }
            
        }
        
        System.out.println("Iguales (A): " + clientesIg);
        System.out.println("Iguales (AL): " + clientesIg2);
        
        System.out.println("Diferentes (A): " + clientesDif);
        System.out.println("Diferentes (AL): " + clientesDif2);
                        
        System.out.println("Comparando c1 con null --> " + c1.equals(null));
        
    }
    
}
