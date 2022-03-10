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

public class TeatroMain {

    public static void mostrarMenu(){
        
        System.out.println("Escoge una opción:");
        System.out.println("1: Mostrar asientos");
        System.out.println("2: Reservar asiento");
        System.out.println("3: Cancelar reserva");
        System.out.println("0: Salir");
        
    }        
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Teatro teatro5x7 = new Teatro(5, 7);
        
        //Además, declaramos un escáner para escoger opciones,
        //un int para la opción escogida y nuestro clásico 
        //boolean para los do while con try catch:
        Scanner select = new Scanner(System.in);
        int option, fila, columna;
        boolean matiasPratz = true;//Nuestro boolean de confianza.

        do {//Clásico bucle de repetición de un menú de selección

            try {

                mostrarMenu();
                option = select.nextInt();

                switch (option) {//Una vez se escoge la opción...

                    case 1:
                        //Muestra todos los asientos

                        System.out.println("Mostrando asientos: ");
                        
                        teatro5x7.mostrarEnPantalla();
                        
                        System.out.println("(L = libre, V = reservado,"
                                + " X = no disponible (por COVID)");
                        
                        break;

                    case 2:
                        //Pide fila y columna para ir al método de reserva:
                        
                        System.out.println("Escoja fila: ");
                        fila = select.nextInt();
                        
                        System.out.println("Escoja columna: ");
                        columna = select.nextInt();

                        teatro5x7.reservar(fila, columna);
                        
                        break;

                    case 3:
                        //Pide fila y columna para ir al método de cancelación:
                        
                        System.out.println("Escoja fila: ");
                        fila = select.nextInt();
                        
                        System.out.println("Escoja columna: ");
                        columna = select.nextInt();

                        teatro5x7.cancelar(fila, columna);
                        
                        break;                    

                    case 0:
                        //Se sale del programa

                        System.out.println("Saliendo del programa...");
                        matiasPratz = false;
                        break;

                    default:
                        //Cuando el nº introducido no coincide con ninguna opción:

                        System.out.println("PERMÍTEME QUE INSISTA EN"
                                + " QUE ESCOGA UNA OPCIÓN");
                        break;

                }

            } catch (InputMismatchException ime) {
                //Cuando se introduce un caracter no numérico:

                System.out.println("PERMÍTEME QUE INSISTA EN QUE PONGAS UN NÚMERO");
                select.nextLine();

            }

        } while (matiasPratz);
        
    }
    
}
