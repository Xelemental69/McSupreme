/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mahomie.parenonefjmg;
import java.util.*;
/**
 *
 * @author Xelemental
 */
public class PareNone {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Declaramos las variables:
        Scanner entry = new Scanner(System.in);        
        int j1 = 12, j2 = 12, n;
        boolean j1pares = false, reset;
        char choice;
        Random slap = new Random();
        

        do{

            //Pedimos por pantalla si los números son introducidos o RNG
          // try{
            System.out.println("¿Cómo quiere jugar?\n"
            + "A (PvsP)\n" + "B (PvsCPU)");

            choice = entry.next().charAt(0);

            switch (choice) {

                case 'a':

                case 'A':

                    do{

                      try{

                        System.out.println("J1, ¿Pares o Nones? (1 para Pares, "
                                  + "2 o el resto de nºs para Nones");

                        if(entry.nextInt() == 1){

                            j1pares = true;

                        }else{

                            j1pares = false;

                        }
                        
                        reset = false;

                      }catch(InputMismatchException ime){
                        System.out.println("ERROR: Tienes que introducir un"
                                  + " número.\n");
                        
                        entry.nextLine();

                        reset = true;

                      }
                      
                    }while(reset);
                      
                      do{//Pedimos manualmente los dedos (un nº de dedos
                      //por jugador)

                      try{

                        System.out.println("Jugador 1, ¿cuántos dedos contamos?");                    
                        j1 = entry.nextInt();

                        System.out.println("Jugador 2, ¿cuántos dedos contamos?");                    
                        j2 = entry.nextInt();

                        if(j1>11 || j1<0 || j2>11 || j2<0){
                            System.out.println("ERROR DE INPUT");
                        }

                        }catch(InputMismatchException ime){
                        System.out.println("ERROR: Tienes que introducir un"
                                  + " número.\n");

                        entry.nextLine();

                        }


                    //"¿Lo introducido se sale del rango (0-10)? 
                   //PERMÍTEME QUE INSISTA"
                    }while(j1>11 || j1<0 || j2>11 || j2<0);

                    break;

                case 'b':

                case 'B':

                    do{//Pedimos manualmente los dedos (un nº de dedos
                      //por jugador)

                        try{

                            System.out.println("J1, ¿Pares o Nones? (1 para Pares, "
                                      + "2 o el resto de nºs para Nones");

                            if(entry.nextInt() == 1){

                                j1pares = true;

                            }else{

                                j1pares = false;

                            }
                            
                            reset = false;

                        }catch(InputMismatchException ime){
                            System.out.println("ERROR: Tienes que introducir un"
                                      + " número.\n");

                            entry.nextLine();
                            
                            reset = true;

                        }
                        
                        }while(reset);
                        
                        do{

                        try{

                            System.out.println("Jugador 1, ¿cuántos dedos contamos?");                    
                            j1 = entry.nextInt();

                            if(j1>11 || j1<0){
                                System.out.println("ERROR DE INPUT");
                            }

                        }catch(InputMismatchException ime){
                            System.out.println("ERROR: Tienes que introducir un"
                                      + " número.\n");

                            entry.nextLine();

                        }

                    //"¿Lo introducido se sale del rango (0-10)? 
                   //PERMÍTEME QUE INSISTA"
                    }while(j1>11 || j1<0);

                    System.out.println("La máquina generará los números "
                    + "al azar.");

                    j2 = slap.nextInt(11);
                    System.out.println("J2 = " + j2 + " dedos");

                    break;

                default://Si lo introducido no coincide con las 2 opciones
                    //Salta error
                    System.out.println("ERROR. Reseteando programa.\n");

                    break;

            }

       //"¿No coincide la opción con lo introducido? PERMÍTEME QUE INSISTA"
           //}catch(){

           //}
        }while(choice != 'A' && choice != 'B');

        //Se suman los números y se muestra si ha salido PARES o NONES
        n = j1+j2;

        System.out.println("La suma es " + n);

        if(n % 2 == 0){
            System.out.println("Según el resultado, ha salido PARES");
            System.out.printf("El ganador es...");
            if(j1pares){
                System.out.println("El jugador 1");
            }else{
                System.out.println("El jugador 2");
            }

        }else{
            System.out.println("Según el resultado, ha salido NONES");
            System.out.printf("El ganador es...");
            if(j1pares){
                System.out.println("El jugador 2");
            }else{
                System.out.println("El jugador 1");
            }
        }

            
        
        
        
    }
        
    
}
