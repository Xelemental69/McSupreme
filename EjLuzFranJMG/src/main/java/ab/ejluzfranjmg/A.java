/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ab.ejluzfranjmg;
import java.util.*;
/**
 *
 * @author Francisco José Mateos Gil (Xelemental)
 */
public class A {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Declaramos las variables a usar, junto con el Scanner:
        
        int vatiosAp, horas;
        double kWh, kW, precioFinal;
        Scanner entry = new Scanner(System.in);
        boolean exit;
        
        do{//Este bucle es el que mantendrá reiniciando el programa hasta que el
          //usuario decida salir.
        
            do{//Se pide los vatios del aparato, y si no entran en el rango, se
              //volverán a pedir hasta que estén en el rango.
                
                System.out.println("Introduce los vatios que gasta el aparato" +
                        "(entre 1 y 4500): ");
                vatiosAp = entry.nextInt();

                if(vatiosAp<1 || vatiosAp>4500){
                    System.out.println("ERROR, el dato no se sitúa"
                            + " en el rango deseado");
                }

            }while(vatiosAp<1 || vatiosAp>4500);
            
            kW = vatiosAp/1000.0;

            do{//Se pide el tiempo que está el aparato en funcionamiento al día
              //si es menor a 1 o mayor a 24, se insiste hasta que entre en el
             //rango.
            System.out.println("Introduce las horas en la que está activo el" +
                        " aparato al día: ");
            horas = entry.nextInt();
            
            if(horas<1 || horas>24){
                    System.out.println("ERROR, el dato no se sitúa"
                            + " en el rango deseado (entre 1 y 24 horas)");
                }
            
            }while(horas<1 || horas>24);

            do{//Se pide el precio por kWh, y si no entra en el rango, se
              //permitirá al bucle que insista hasta que esté en el rango, 
              //como Matías Pratz.

                System.out.println("Introduce el precio por Kilovatio/hora " +
                        " (entre 0,1 y 0,45): ");
                kWh = entry.nextDouble();

                if(kWh<0.1 || kWh>0.45){
                    System.out.println("ERROR, el dato no se sitúa en" 
                            + " el rango deseado");
                }

            }while(kWh<0.1 || kWh>0.45);

            //Una vez ya tenemos los datos (con o sin insistencia), se calcula
           //el precio final y se muestra en pantalla:
            precioFinal = (kW*horas)*kWh;

            System.out.printf("El precio a pagar es de: %.2f€\n", precioFinal);

            System.out.println("¿Desea salir del programa? (S para sí, N para No)");

            
            //Se pide al usuario si quiere salir del programa o no, y si 
           //contesta con S (sí), terminará el programa. Cualquier otro input 
           //hará que se repita. Y tomará la primera letra del input solamente.
            switch(entry.next().charAt(0)){
                //Es más óptimo con if, pero por variar, aquí está en switch.

                case 'S':
                    System.out.println("Ha elegido salir del programa.");
                    exit = true;
                    break;
                case 's'://(Para que valga con la minúscula)
                    System.out.println("Ha elegido salir del programa.");
                    exit = true;
                    break;
                case 'N':
                    System.out.println("Ha elegido reiniciar el programa.");
                    exit = false;
                    break;
                case 'n'://(Para que valga con la minúscula)
                    System.out.println("Ha elegido reiniciar el programa.");
                    exit = false;
                    break;
                default:
                    System.out.println("Lo introducido no cumple con un sí o no."
                            + " Se repetirá el programa");
                    exit = false;
                    break;

                }
        
        }while(!exit);
        
    }
    
}
