/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciosDejaVu;

/**
 *
 * @author fco-j
 */
import java.util.*;

public class Ej_23 {

    /**
     * @param args the command line arguments
     */
    
    
    public static int introducirTamano(){
        
        boolean fallo;
        Scanner entry = new Scanner(System.in);
        int newSize;
        
        do{
        
            try{
                            
                System.out.println("Introduce un tamaño para la lista 5:");
                newSize = entry.nextInt();
                fallo = false;
                
            }catch(InputMismatchException ime){
                
                fallo = true;
                entry.nextLine();
                newSize = 0;
                System.out.println("TIENE QUE INTRODUCIR UN NÚMERO");
                System.out.println("PERMÍTEME QUE INSISTA");
                
            }
            
        }while(fallo);
        
        return newSize;
        
    }
    
    public static void rellenarListaAzar(int tamano, ArrayList recipiente){
        
        //Inicializamos el random
        Random numGenerator = new Random();
        
        for(int i = 0; i < tamano; i++){
            //Generamos los nºs de la lista al azar:
            
            recipiente.add(numGenerator.nextInt(50) + 50);
            
        }
        
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Inicializamos el random
        Random numGenerator = new Random();
        
        //Declaramos las 4 listas:
        ArrayList<Integer> lista1 = new ArrayList<>();
        ArrayList<Integer> lista2 = new ArrayList<>();
        ArrayList<Integer> lista3 = new ArrayList<>();
        ArrayList<Integer> lista4 = new ArrayList<>();
        ArrayList<Integer> lista5 = new ArrayList<>();
        
        //La cantidad de elementos serán:
        int tamano1 = numGenerator.nextInt(10) + 5;//entre 5 y 15 en la 1ª lista
        int tamano2 = numGenerator.nextInt(10) + 10;//entre 10 y 20 en la 2ª lista
                
        rellenarListaAzar(tamano1, lista1);
        
        System.out.printf("Lista 1: [ - ");
        
        //Mostramos la 1ª lista:        
        for(int tmp: lista1){
            
            System.out.printf(tmp + " - ");
            
        }
        
        rellenarListaAzar(tamano2, lista2);
        
        System.out.printf("]\nLista 2: [ - ");
        
        //Mostramos la 2ª lista:        
        for(int tmp: lista2){
            
            System.out.printf(tmp + " - ");
            
        }
        
        System.out.println("]");
        
        for(int i = 0; i < lista1.size(); i++){
            
            if(!lista2.contains(lista1.get(i))){
                //Si un nº de la 1ª lista NO se halla en la 2ª,
                //se le añade a la tercera lista
                
                lista3.add(lista1.get(i));
                
            }
        
        }
        
        System.out.printf("Lista 3: [ - ");
        
        //Mostramos la 2ª lista:        
        for(int tmp: lista3){
            
            System.out.printf(tmp + " - ");
            
        }
        
        System.out.println("]");
        
        for (int k = 0; k < lista1.size(); k++){
            
            if(lista1.get(k) % 2 == 0){
                //Si el nº de la lista es par, se le añade a la 4ª lista
                lista4.add(lista1.get(k));
                
            }
            
        }
        
        for (int k = 0; k < lista2.size(); k++){
            
            if(lista2.get(k) % 2 != 0){
                //Si el nº de la lista es impar, se le añade a la 4ª lista
                lista4.add(lista2.get(k));
                
            }
            
        }
        
        System.out.printf("Lista 4: [ - ");
        
        lista4.forEach((x) -> System.out.printf(x + " - "));//Usar printf en lambda
        
        System.out.println("]");
        
        rellenarListaAzar(introducirTamano(), lista5);
        
        System.out.printf("Lista 5: [ - ");
        
        lista4.forEach((x) -> System.out.printf(x + " - "));//Usar printf en lambda
        
        System.out.println("]");
        
    }
           
}
