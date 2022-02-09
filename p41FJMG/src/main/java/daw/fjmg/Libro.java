/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daw.fjmg;

import org.apache.commons.lang3.RandomStringUtils;

/**
 *
 * @author fco-j
 */

/*

CLASE LIBROELECTRONICO
Esta clase permitirá crear objetos de tipo LibroElectronico. Estos objetos tendrán sus atributos encapsulados. 

De un libro electrónico queremos mantener la siguiente información:
Identificador. Se puede almacenar como una cadena de texto de tres dígitos (000-999). 
Una cadena de texto para saber el título del libro que se está leyendo.
Número de páginas totales del libro. No se pueden almacenar libros de más de 9999 páginas. 
Tamaño en MB que ocupa el libro en la memoria del dispositivo. No se pueden almacenar libros de más de 10MB.
Número de página actual por el que se va leyendo.
Esta clase además contará con la siguiente funcionalidad:
Constructor por defecto, que crea objetos con identificador aleatorio entre 000 y 999, el libro que contiene
es "Don Quijote de la Mancha" con 1435 páginas y 5MB de espacio. 
Constructor parametrizado. En caso de crear libros de más de 9999 páginas o más de 10 MB, se deben establecer estos valores a cero.
Getter y setter.
toString.
pasarPagina(), que pasa a la siguiente página.
retrocederPagina(), que retrocede una página.
saltar(int numero), que salta hacia adelante (si el parámetro numero es positivo) o hacia atrás (si el parámetro numero es negativo)
tantas páginas como indique el parámetro.
En los tres métodos anteriores, si la página a moverse no es válida, no se realiza la operación.
Incluye comentarios en esta clase para identificar las partes principales de una clase. Dentro de los métodos, 
identifica los métodos constructores, getter/setter, toString.

Señala la utilidad de los modificadores de acceso public y private en los elementos de una clase.

 */
public class LibroElectronico {

    //Para que no se tenga acceso externo, sin métodos, a las variables,
    //se las declara como private
    private String id;
    private String titulo;
    private int paginasT;
    private double size;
    private int pagActual;

    public LibroElectronico() {//Este constructor generará los valores por 
        //defecto:
        //(El ID se generará al azar)
        id = RandomStringUtils.randomNumeric(3).toUpperCase();
        titulo = "Don Quijote de la Mancha";
        paginasT = 1435;
        size = 5;
        pagActual = 1;

    }

    public LibroElectronico(String titulo, int paginasT,
            double size) {//Constructor parametrizado

        //(El ID se generará al azar)
        this.id = RandomStringUtils.randomNumeric(3).toUpperCase();
        //Pedimos el título
        this.titulo = titulo;
        //Pedimos las páginas en total (si no son entre 0 y 9999, se le da de
        //valor 0)
        if (paginasT >= 0 && paginasT < 10000) {
            this.paginasT = paginasT;
        } else {
            this.paginasT = 0;
        }
        //Pedimos el tamaño del e-Book (si no es entre 0 y 10MB, se le da de
        //valor 0MB)
        if (size >= 0 && size <= 10) {
            this.size = size;
        } else {
            this.size = 0;
        }
        //Ponemos la página actual a 1 (principio)
        this.pagActual = 1;

    }

    public String getId() {//Devuelve el ID
        return id;
    }

    public String getTitulo() {//Devuelve el título del e-Book
        return titulo;
    }

    public int getPaginasT() {//Devuelve el nº de páginas del e-Book
        return paginasT;
    }

    public double getSize() {//Devuelve el tamaño del e-Book
        return size;
    }

    public int getPagActual() {//Devuelve la página actual del libro
        return pagActual;
    }

    public void setTitulo(String titulo) {//Nos permite ajustar el título
        this.titulo = titulo;
    }

    public void setPaginasT(int paginasT) {//Nos permite ajustar el nº de páginas
        //Si no son entre 0 y 9999 páginas, se le da de valor 0
        if (paginasT >= 0 && paginasT < 10000) {
            this.paginasT = paginasT;
        } else {
            this.paginasT = 0;
            System.out.println("No se pudo poner el nº de páginas deseado "
                    + "\n(fuera del rango de 0 a 9999).");
        }
    }

    public void setSize(double size) {//Nos permite ajustar el tamaño del libro
        //si el tamaño no es entre 0 y 10MB, se le da de valor 0MB:
        if (size >= 0 && size <= 10) {
            this.size = size;
        } else {
            this.size = 0;
            System.out.println("No se pudo poner el tamaño deseado "
                    + "\n(fuera del rango de 0MB a 10MB).");
        }
    }

    public void pasarPagina() {//Nos permite avanzar una página (si no es la 
        //última página, por supuesto)

        if (pagActual <= paginasT) {

            pagActual++;

        } else {

            System.out.println("No quedan más páginas");

        }
    }

    public void retrocederPagina() {//Nos permite retroceder una página (si no es
        //la primera página, por supuesto)

        if (pagActual > 0) {

            pagActual--;

        } else {

            System.out.println("No se puede retroceder más");

        }

    }

    public void saltar(int numero) {//Nos permite saltar un nº de páginas
        //establecido (siempre dentro del nº de páginas del libro

        if ((numero + pagActual) < 0) {

            System.out.println("No se puede retroceder tanto");

        } else if ((numero + pagActual) > paginasT) {

            System.out.println("No se puede saltar más páginas de las que tiene"
                    + " el libro.");

        } else {

            pagActual = pagActual + numero;

        }

    }

    @Override
    public String toString() {//Muestra todos los datos de la clase:
        return "-LibroElectronico{\n" + " ·ID (id) = " + id + "\n ·Título (titulo) = "
                + titulo + "\n ·Páginas en total (paginasT) = " + paginasT 
                + " páginas\n ·Tamaño (size) = " + size + "MB\n ·Página actual"
                + " (pagActual) = página " + pagActual + "\n}";
    }

}


//public void retrocederPagina()
