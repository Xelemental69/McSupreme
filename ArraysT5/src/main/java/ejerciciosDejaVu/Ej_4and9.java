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

public class Ej_4and9 {

    /**
     * @param args the command line arguments
     */
    
    
    public static void insertarDatos(int [] rec){
    //Método para introducir datos en el array;
        
        //Declaramos el Scanner
        Scanner entry = new Scanner (System.in);
        boolean ldMatiasPratz;//boolean de fallo (temática linea directa)
        
        do{//Bucle para llamar a ldMatiasPratz si algo falla e insistir
            
            try{//Código cuando solo se introducen caracteres numéricos
                                              
                for(int i = 0; i < rec.length; i++){//Bucles dentro de bucles, sí

                    //Se pide por teclado un número entero por cada posición del
                    //array:
                    System.out.println("Introduce el entero nº " + i + ":");
                    rec[i] = entry.nextInt();

                }

                //Si todo sale bien, no habrá que insistir.
                ldMatiasPratz = false;
                
            }catch(InputMismatchException ime){//Si algo sale mal...
                //En caso de que se introduzca un caracter no numérico,
                //salta este error.
                System.out.println("Hay que introducir números");
                System.out.println("PERMÍTEME QUE INSISTA");
                ldMatiasPratz = true;//Hay que insistir
                entry.next();
                
            }
        
        }while(ldMatiasPratz);//La condición del bucle: Matias Pratz
        
    }        
    
    //Método para mostrar el array:
    public static void mostrarArray(int [] rec){
        
        System.out.printf("Array: { ");//Usamos printf para que se muestre el
        //array sin saltar línea.
        
        for(int x = 0; x < rec.length; x++){
            
            if(x < (rec.length - 1)){//Mostramos cada nº del array y un punto y
                //coma (excepto para el último nº del array)
                
                System.out.printf(rec[x] + "; ");
                
            }else{//Mostramos el último nº del array
                
                System.out.printf(rec[x] + "");
                
            }
            
        }
        
        System.out.println("}");//Cerramos la muestra del array
        
    }
    
    //Búsqueda secuencial:
    public static void busquedaSec(int[] sus, int target){
        boolean found = false;
        
        System.out.println("Método: Búsqueda Secuencial");

        for(int i = 0; i < sus.length; i++){
            
            if(sus[i] == target){
                
                System.out.println("El nº " + target + " se halla en la "
                        + "posición " + i );
                        found = true;
                        break;
                        
            }
            
        }
        
        if(!found) System.out.println("Nº no encontrado");

    }
    
    //Búsqueda binaria:
    //Búsqueda secuencial:
    public static void busquedaBin(int[] sus, int target){
        
        System.out.println("Método: Búsqueda Binaria");
        
        if(Arrays.binarySearch(sus, target) > 0){
            
            System.out.println("El nº " + target + " se halla en la posición"
                        + " " + Arrays.binarySearch(sus, target) );
            
        }else{
            
            System.out.println("Nº no encontrado");
            
        }

    }
    
    //Método para ordenar (bubble sort):
    public static void ordenarBubble(int[] arrayOrdenar){
                
	int vibeCheck;
        
        System.out.println("Método coñazo, digo, bubble sort: ");
        
        System.out.println("//FOR WITHIN FOR//");
        
	for (int i = 0; i < arrayOrdenar.length-1; i++){
            
		for (int j = i+1; j < arrayOrdenar.length-1; j++){
                    
			if (arrayOrdenar[i] > arrayOrdenar[j]){
                            
				vibeCheck = arrayOrdenar[i];
				arrayOrdenar[i] = arrayOrdenar[j];
				arrayOrdenar[j] = vibeCheck;
                                
			}
		}
	}

        
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entry = new Scanner(System.in);
        boolean ldMatiasPratz = false;//boolean de fallo (temática linea directa)
        int [] x;
        int wanted;
        
        do{
        
            try{

                System.out.println("¿Cuál es la longitud de su array?");

                x = new int[entry.nextInt()];
                insertarDatos(x);
                                
                System.out.println("Introduzca el nº a buscar");
                wanted = entry.nextInt();
                
                busquedaSec(x, wanted);
                busquedaBin(x, wanted);
                
                ordenarBubble(x);

            }catch(InputMismatchException ime){//Si algo sale mal...
                    //En caso de que se introduzca un caracter no numérico,
                    //salta este error.
                    System.out.println("Hay que introducir números");
                    System.out.println("PERMÍTEME QUE INSISTA");
                    ldMatiasPratz = true;//Hay que insistir
                    entry.next();

                }
            
        }while(ldMatiasPratz);
    
    }
    
}
