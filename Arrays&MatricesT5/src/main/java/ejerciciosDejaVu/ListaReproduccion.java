/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosDejaVu;

/**
 *
 * @author fco-j
 */
import java.util.*;

public class ListaReproduccion {

    private ArrayList<Cancion> canciones;

    public ListaReproduccion() {//Constructor por defecto:

        canciones = new ArrayList<>();

    }

    public ListaReproduccion(ArrayList<Cancion> canciones) {
        //Constructor parametrizado
        
        this.canciones = canciones;

    }

    public boolean estaVacia() {//Comprueba si está la lista vacía

        return (canciones.size() == 0) ? true : false;

    }

    public void grabarCancion(Cancion cancion) {
        //Añade una canción a la lista

        canciones.add(cancion);

    }

    public Cancion escucharCancion(int num) {
        //Devuelve una canción de la lista
        
        return canciones.get(num);

    }

    public int numCanciones() {
        //Devuelve el nº de canciones:

        return canciones.size();

    }

    public void cambiarCancion(int num, Cancion newCancion) {
        //Cambia una canción de una posición establecida por
        //la indicada en parámetro:

        canciones.set(num, newCancion);

    }

    public void eliminaCancion(int num) {
        //Quita una canción de la lista, según su posición

        canciones.remove(num);

    }

    public void eliminaCancion(Cancion cancion) {
        //Quita una canción de la lista, según la canción

        canciones.remove(cancion);

    }

    public void imprimirLista(ListaReproduccion tmp) {
        //Muestra por pantalla todas las canciones de la lista:

        for (int i = 0; i < tmp.numCanciones(); i++) {

            System.out.println(tmp.escucharCancion(i));

        }

    }

    public void ordenarLista() {//Ordena las canciones por título:

        Collections.sort(this.canciones);

    }

    public int buscarCancion(Cancion c) {
        //Busca la canción del parámetro en la lista:

        return Collections.binarySearch(canciones, c);

    }

    public void ordenarComparatorAutor() {
        //Ordena las canciones por autor:

        Collections.sort(canciones,
                (Cancion c1, Cancion c2)
                -> c1.getAuthor().compareTo(c2.getAuthor()));

    }

    public int buscarBinariaAutor(Cancion c) {
        //Busca las canciones por autor:

        return Collections.binarySearch(canciones, c,
                (Cancion c1, Cancion c2)
                -> c1.getAuthor().compareTo(c2.getAuthor()));

    }

    public int buscaCancion(Cancion c) {
        //Busca una canción usando IndexOf:

        return canciones.indexOf(c);

    }

}
