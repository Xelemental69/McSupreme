/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daw.fjmg;

/**
 *
 * @author fco-j
 */
import java.util.*;

public class ListaLibros {

    ArrayList<Libro> libros;

    public ListaLibros() {

        libros = new ArrayList<>();

    }

    public void addLibro(Libro libro) {

        libros.add(libro);

    }

    public boolean delLibro(Libro libro) {

        return libros.remove(libro);

    }

    public Libro getLibro(int posicion) {

        return libros.get(posicion);

    }

    public boolean findLibro(Libro libro) {

        return libros.contains(libro);

    }

    public ArrayList<Libro> getLibros() {

        return libros;

    }

    public int searchLibro(String titulo) {

        int pos = -1;

        for (int i = 0; i < libros.size(); i++) {

            if (titulo.equalsIgnoreCase(libros.get(i).getTitulo())) {

                pos = i;
                break;

            }

        }

        return pos;

    }

    // Collections.sort(lista) lista debe contener objetos que implementan
    // comparable
    public void ordenarISBN() {
        
        Collections.sort(this.libros);
        
    }

    // Búsqueda binaria de un objeto según la ordenación natural
    // binarySearch no funciona si la lista está desordenada
    public int buscarISBN(Libro l) {

        return Collections.binarySearch(libros, l);
        
    }

    public void ordenarComparatorNombre() {
        
        Collections.sort(libros, (Libro l1, Libro l2) -> l1.getTitulo().compareTo(l2.getTitulo()));
        
    }

    public int buscarBinariaNombre(Libro l) {
        
        // lista debe estar ordenada según el criterio que se pasa a este método (nombre)
        return Collections.binarySearch(libros, l, (Libro l1, Libro l2) -> l1.getTitulo().compareTo(l2.getTitulo()));
        
    }

    public void ordenarComparatorPaginas() {
        
        //Collections.sort(lista, (Libro l1,Libro l2)->l1.getNumeroPags() - l2.getNumeroPags());
        Collections.sort(libros, (l1, l2) -> Integer.compare(l1.getPaginasT(), l2.getPaginasT()));
        
    }

    public void ordenarNombrePaginas() {
        
        Comparator<Libro> criterioNombre = (l1, l2) -> l1.getTitulo().compareTo(l2.getTitulo());
        
        Comparator<Libro> criterioPaginas = (l1, l2) -> Integer.compare(l1.getPaginasT(), l2.getPaginasT());
        
        Comparator<Libro> criterioNombrePaginas = criterioNombre.thenComparing(criterioPaginas);
        
        Collections.sort(libros, criterioNombrePaginas);
        
    }

    @Override
    public String toString() {
        return "ListaLibros{ " + libros + " " + '}';
    }

}
