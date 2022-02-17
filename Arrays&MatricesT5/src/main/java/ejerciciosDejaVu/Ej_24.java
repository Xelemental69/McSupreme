/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciosDejaVu;

/**
 *
 * @author fco-j
 */
public class Ej_24 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        ListaReproduccion los40 = new ListaReproduccion();

        los40.grabarCancion(new Cancion("Poker Face", "Lady GaGa"));
        los40.grabarCancion(new Cancion("Paparazzi", "Lady GaGa"));
        los40.grabarCancion(new Cancion("Left Outside Alone", "Anastasia"));
        los40.grabarCancion(new Cancion("Hips Don't Lie", "Shakira"));
        los40.grabarCancion(new Cancion("Viva la Vida", "Coldplay"));
        los40.grabarCancion(new Cancion("Zapatillas", "El Canto del Loco"));
        los40.grabarCancion(new Cancion("Rain Over Me", "Pitbull"));

        los40.eliminaCancion(new Cancion("Rain Over Me", "Pitbull"));
        
        System.out.println("Ordenado por como fue introducido:");

        los40.imprimirLista(los40);

        los40.ordenarLista();
        
        System.out.println("Ordenado por Título de la canción: ");

        System.out.println(los40.buscaCancion(new Cancion("Zapatillas", "El Canto del Loco")));
        
        los40.imprimirLista(los40);

        los40.ordenarComparatorAutor();
        
        System.out.println("Ordenado por Autor de la canción: ");

        System.out.println(los40.buscaCancion(new Cancion("Zapatillas", "El Canto del Loco")));

        los40.imprimirLista(los40);
        
    }

}
