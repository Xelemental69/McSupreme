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
public class B {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Declaramos las variables a usar, junto con el Scanner:

        int vatiosAp, vatP, vatV, vatLl, horasV, horasLl, horasP;
        double kWhP, kWhV, kWhLl, precioP, precioV, precioLl, precioFinal, kvatP, kvatV;
        double kvatLl;
        Scanner entry = new Scanner(System.in);
        boolean punta = true, valle = true, llana = true, exit;

        do {//Este bucle es el que mantendrá reiniciando el programa hasta que el
            //usuario decida salir.

            do {//Se pide los vatios del aparato, y si no entran en el rango, se
                //volverán a pedir hasta que estén en el rango.

                System.out.println("Introduce los vatios que gasta el aparato"
                        + " en total (entre 1 y 4500): ");
                vatiosAp = entry.nextInt();

                if (vatiosAp < 1 || vatiosAp > 4500) {
                    System.out.println("ERROR, el dato no se sitúa"
                            + " en el rango deseado");
                }

                //Pedimos ahora las horas punta, valle y llanas. Si la suma de
                //estas no coincide con la total, damos error y se repite el 
                //bucle.
                System.out.println("¿Cuáles gasta en hora punta?");
                vatP = entry.nextInt();

                System.out.println("¿Cuáles gasta en hora valle?");
                vatV = entry.nextInt();

                System.out.println("¿Cuáles gasta en horas llanas?");
                vatLl = entry.nextInt();

                if (vatP + vatV + vatLl != vatiosAp) {
                    System.out.println("Error, los vatios totales y el conjunto"
                            + " de los de las horas no coinciden");
                }

                //Convertimos los vatios a kilovatios:
                kvatP = vatP / 1000.0;
                kvatV = vatV / 1000.0;
                kvatLl = vatLl / 1000.0;

            } while (vatiosAp < 1 || vatiosAp > 4500 || (vatP + vatV + vatLl != vatiosAp));

            do {//Se pide el tiempo, en horas punta, valle y llanas, que está el 
                //aparato en funcionamiento al día. Si la suma de dichas horas es
                // menor a 1 o mayor a 24, se insiste hasta que entre en el rango.

                System.out.println("Introduce las horas punta en la que está activo"
                        + " el aparato al día: ");
                horasP = entry.nextInt();

                System.out.println("Introduce las horas valle en la que está activo"
                        + " el aparato al día: ");
                horasV = entry.nextInt();

                System.out.println("Introduce las horas llanas en la que está activo"
                        + " el aparato al día: ");
                horasLl = entry.nextInt();

                if ((horasP + horasV + horasLl) < 1 || (horasP + horasV + horasLl) > 24) {
                    System.out.println("ERROR, los datos no se sitúan"
                            + " en el rango deseado (entre 1 y 24 horas)");
                }

            } while ((horasP + horasV + horasLl) < 1 || (horasP + horasV + horasLl) > 24);

            do {//Se pide el precio por kWh en las distintas horas, y si no 
                //entran en el rango o no mantienen su orden en coste, se
                //permitirá al bucle que insista hasta que estén como es deseado, 
                //como Matías Pratz.

                System.out.println("Introduce el precio por Kilovatio/hora "
                        + " en hora punta (entre 0,1 y 0,45): ");
                kWhP = entry.nextDouble();

                if (kWhP < 0.1 || kWhP > 0.45) {
                    System.out.println("ERROR, el dato no se sitúa en"
                            + " el rango deseado");
                    punta = false;
                }

                System.out.println("Introduce el precio por Kilovatio/hora "
                        + " en hora valle (entre 0,1 y 0,45): ");
                kWhV = entry.nextDouble();

                if (kWhV < 0.1 || kWhV >= kWhP) {
                    System.out.println("ERROR, el dato no se sitúa en"
                            + " el rango deseado (o es mayor que el coste en "
                            + "hora punta)");
                    valle = false;
                }

                System.out.println("Introduce el precio por Kilovatio/hora "
                        + " en horas llanas (entre 0,1 y 0,45): ");
                kWhLl = entry.nextDouble();

                if (kWhLl < 0.1 || kWhLl >= kWhV) {
                    System.out.println("ERROR, el dato no se sitúa en"
                            + " el rango deseado (o es mayor que el coste en "
                            + "hora valle)");
                    llana = false;
                }

            } while (!punta && !valle && !llana);

            //Una vez ya tenemos los datos (con o sin insistencia), se calcula
            //el precio final, sumando los de las distintas horas, y se muestra
            //en pantalla:
            precioP = (kvatP * horasP) * kWhP;
            precioV = (kvatV * horasV) * kWhV;
            precioLl = (kvatLl * horasLl) * kWhLl;

            precioFinal = precioP + precioV + precioLl;

            System.out.printf("El precio a pagar es de: %.2f€\n", precioFinal);

            System.out.println("¿Desea salir del programa? (S para sí, N para No)");

            //Se pide al usuario si quiere salir del programa o no, y si 
            //contesta con S (sí), terminará el programa. Cualquier otro input 
            //hará que se repita. Y tomará la primera letra del input solamente.
            switch (entry.next().charAt(0)) {
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

        } while (!exit);

    }

}
