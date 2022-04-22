/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fjmg.tarea7a;

/**
 *
 * @author fcoj
 */
import java.time.*;
import java.util.*;

public class Utils {
    //No posee ningún atributo, solo métodos.
    
    public static boolean comprobarLetra(ArrayList<Profesor> lista, char letra) {

        boolean comprobacion = false;//Inicializamos el boolean a devolver

        for (Profesor p : lista) {//Recorremos la lista

            if (p.getDni().contains("" + letra)) {
                //Si el DNI contiene la letra del parámetro, se pone
                //el boolean a true, y termina el bucle:

                comprobacion = true;
                break;

            }

        }

        return comprobacion;//Devolvemos el boolean

    }

    public static int numCoordinadores(ArrayList<Profesor> lista) {

        int contador = 0;//Inicializamos el int que contará los Coordinadores

        for (Profesor p : lista) {//Recorremos la lista

            if (p.isCoordinador()) {
                //Si el empleado es un coordinador, se aumenta en 1 el contador
                
                contador++;

            }

        }

        return contador;//Devolvemos el contador (int)

    }

    public static ArrayList<Profesor> coincideLetra(ArrayList<Profesor> lista,
            char letra) {

        //Inicializamos un ArrayList:
        ArrayList<Profesor> resultado = new ArrayList<>();

        for (Profesor p : lista) {//Recorremos la lista:

            if (p.getDni().contains("" + letra)) {
                //Si el DNI del empleado contiene la letra parametrizada,
                //se añade a la lista:
                
                resultado.add(p);

            }

        }

        //Ordenamos la lista según el Apellido:
        Collections.sort(resultado, (Profesor p1, Profesor p2)
                -> p1.getApellidos().compareTo(p2.getApellidos()));

        return resultado;//Devolvemos la lista

    }

    public static ArrayList<Profesor> coincideFecha(ArrayList<Profesor> lista,
            LocalDate fecha) {

        //Inicializamos una lista y declaramos un array y un LocalDate:
        ArrayList<Profesor> resultado = new ArrayList<>();
        String[] filtro;
        LocalDate fecComprobar;

        for (Profesor p : lista) {//Recorremos la lista:

            //Separamos los números de día, mes y año en el array
            filtro = p.getFechaIni().split("/");
            //Lo metemos en el LocalDate, procurando eliminar 
            //las barras diagonales que rodean los nºs:
            fecComprobar = LocalDate.of(Integer.parseInt(filtro[2].replace("\"", "")),
                    Integer.parseInt(filtro[1]),
                    Integer.parseInt(filtro[0].replace("\"", "")));
            
            if(fecComprobar.equals(fecha)){
                
                //Si el LocalDate sacado coincide con el del parámetro,
                //lo añadimos a lista:
                resultado.add(p);
                
            }

        }

        //Ordenamos la lista según el DNI:
        Collections.sort(resultado, (Profesor p1, Profesor p2)
                -> p1.getDni().compareTo(p2.getDni()));
        //Una vez ordenada, invertimos dicho orden:
        Collections.reverse(resultado);

        return resultado;//Devolvemos la lista resultante

    }

}
