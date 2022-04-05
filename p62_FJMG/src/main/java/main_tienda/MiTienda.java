/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main_tienda;

/**
 *
 * @author fco-j
 */
import abstractos_e_interfaces.*;
import java.util.*;

public class MiTienda {

    //Las listas específicas:
    private ArrayList<Producto> productosSeEnvian;
    private ArrayList<Libro> libros;

    public MiTienda() {

        this.productosSeEnvian = new ArrayList<>();
        this.libros = new ArrayList<>();

    }

    public MiTienda(ArrayList<Producto> productosSeEnvian, ArrayList<Libro> libros) {

        this.productosSeEnvian = productosSeEnvian;
        this.libros = libros;

    }

    public ArrayList<Producto> getProductosSeEnvian() {

        return productosSeEnvian;

    }

    public void setProductosSeEnvian(ArrayList<Producto> productosSeEnvian) {

        this.productosSeEnvian = productosSeEnvian;

    }

    public ArrayList<Libro> getLibros() {

        return libros;

    }

    public void setLibros(ArrayList<Libro> libros) {

        this.libros = libros;

    }

    public static void main(String[] args) {        
        //Declaramos e inicializamos las clases necesarias:

        MiTienda tienda = new MiTienda();

        Musica april1 = new Musica("Lovely Internet", "6r34p",
                55.42, 14, "We YePrank for you");
        
        //La lista general:
        ArrayList<Producto> productos = new ArrayList<>();
        
        //Añadimos clases a las listas:
        productos.add(new Pantalon());//Conversión implícita
        productos.add(new Pantalon("XL", "AZZ", "9s7d", 06.45, 11,
                "Este pantalon requiere\n"
                + " de un cinturón para que no"
                + " se caiga al segundo."
                + "\n Cinturón no incluido"));
        productos.add(new LibroDigital());
        productos.add(new LibroDigital(29.79, "1336", "7x4p",
                09.25, 11, "Libro de cómo un tortazo elevó"
                + " la popularidad de los Óscars"));
        productos.add(new LibroPapel(291, "1352", "7w6e",
                09.10, 10, "Libro de cómo un tortazo elevó"
                + " la popularidad de los Óscars"));
        productos.add(new Musica());
        productos.add(new Musica("Lovely Internet", "5r34p",
                56.42, 14, "We RickRoll for you"));

        tienda.getProductosSeEnvian().add(new Pantalon("XL", "AZZ", "9s7d", 06.45, 11,
                "Este pantalon requiere\n"
                + " de un cinturón para que no"
                + " se caiga al segundo."
                + "\n Cinturón no incluido"));
        tienda.getProductosSeEnvian().add(new LibroPapel(291, "1352", "7w6e",
                09.10, 10, "Libro de cómo un tortazo elevó"
                + " la popularidad de los Óscars"));

        //Mostramos la lista general
        for (Producto p : productos) {

            System.out.println(p + "\n");

            //Yo consideraría que toString es un método polimórfico,
            //cuyo resultado se expande o cambia por cada hija que
            //sobreescribe el método
        }

        //La ordenamos por precio y la mostramos de nuevo:
        Collections.sort(productos,
                (x, y) -> Double.compare(x.getPrecio(), y.getPrecio()));

        for (Producto p : productos) {

            System.out.println(p + "\n");

        }

        //La ordenamos por código y la mostramos otra vez:
        Collections.sort(productos,
                (x, y) -> (x.getCodigo()).compareTo(y.getCodigo()));

        for (Producto p : productos) {

            System.out.println(p + "\n");

        }
        
        //Realizamos las búsquedas binarias:
        
        System.out.println("/**********Búsquedas*Binarias****************/");
        
        System.out.println(Collections.binarySearch(productos, april1,
                (x, y) -> (x.getCodigo()).compareTo(y.getCodigo())));
        
        System.out.println("");

        System.out.println(Collections.binarySearch(productos, new Musica("Lovely Internet", "5r34p",
                56.42, 14, "We RickRoll for you"), (x, y)
                -> (x.getCodigo()).compareTo(y.getCodigo())));
        
        System.out.println("");
        
        System.out.println(Collections.binarySearch(productos, new Pantalon("XL", "AZZ", "9s7d", 06.45, 11,
                "Este pantalon requiere\n"
                + " de un cinturón para que no"
                + " se caiga al segundo."
                + "\n Cinturón no incluido"), (x, y)
                -> (x.getCodigo()).compareTo(y.getCodigo())));
        
        System.out.println("\n/********************************************/");

        for (Producto p : productos) {
            //Añadimos a la lista libros todos los libros de la clase general

            if (p instanceof Libro) {//Comprueba si se trata de una clase Libro

                tienda.getLibros().add((Libro) p);//Conversión explícita (casteo)

            }

        }

        //Mostramos la lista de libros
        for (Libro l : tienda.getLibros()) {

            System.out.println(l + "\n");

        }

        //Ordenamos la lista por ISBN y la mostramos una vez más:
        Collections.sort(tienda.getLibros(),
                (x, y) -> (x.getIsbn()).compareTo(y.getIsbn()));

        for (Libro l : tienda.getLibros()) {

            l.sonidoPasarPagina();

            if (l instanceof LibroDigital) {

                l.descargar();

            } else {

                l.enviar("Calle Pingas");

            }
            
            System.out.println("");
            
        }

        //Comprobamos que funciona el contains()
        System.out.println("Contiene la lista el libro del hostión? --> "
                + tienda.getLibros().contains(new LibroPapel(291, "1352", "7w6e",
                        09.10, 10, "Libro de cómo un tortazo elevó"
                        + " la popularidad de los Óscars")));

        //Mostramos la lista de productos por enviar:
        for (Producto p : tienda.getProductosSeEnvian()) {

            System.out.println(p);

            p.enviar("Calle Xokas");//Usamos el comando enviar
            
            System.out.println("");

        }

    }
}
