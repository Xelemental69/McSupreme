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
import java.lang.Character;
import java.util.*;

public class Libro implements Comparable<Libro>{

    //Para que no se tenga acceso externo, sin métodos, a las variables,
    //se las declara como private
    private String isbn;
    private String titulo;
    private String editorial;
    private int paginasT;
    private double precio;

    public Libro() {//Este constructor generará los valores por 
        //defecto:
        Random sale = new Random();
        
        //(El ID se generará al azar)
        isbn = RandomStringUtils.randomNumeric(3).toUpperCase();
        titulo = "Don Quijote de la Mancha";
        editorial = "Hispanito";
        paginasT = 1435;
        precio = sale.nextInt(20) + sale.nextDouble();

    }

    public Libro(String isbn, String titulo, String editorial,
            int paginasT, double precio) {//Constructor parametrizado
        
        boolean validISBN = true;
        
        for(int i = 0; i < isbn.length(); i++){
            
           if(!Character.isDigit(isbn.charAt(i))){
               
               validISBN = false;
               break;
               
           }
            
        }
        if(validISBN){
            
            this.isbn = isbn;
            
        }else{
            
            //(El ID se generará al azar)
            this.isbn = RandomStringUtils.randomNumeric(3).toUpperCase();
            
        }
        
        
        //Pedimos el título
        this.titulo = titulo;
        //Pedimos la editorial:
        this.editorial = editorial;
        //Pedimos las páginas en total (si no son entre 0 y 9999, se le da de
        //valor 0)
        if (paginasT >= 0 && paginasT < 10000) {
            this.paginasT = paginasT;
        } else {
            this.paginasT = 0;
        }
        //Pedimos el precio:
        this.precio = precio;

    }

    public String getISBN() {//Devuelve el ISBN
        
        return isbn;
    
    }

    public String getTitulo() {//Devuelve el título del e-Book
    
        return titulo;
    
    }

    public int getPaginasT() {//Devuelve el nº de páginas del Libro

        return paginasT;

    }

    public double getPrecio() {//Devuelve la página actual del libro
        
        return precio;
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

    public void setIsbn(String isbn) {
        
        this.isbn = isbn;
        
    }

    public void setEditorial(String editorial) {
        
        this.editorial = editorial;
        
    }

    public void setPrecio(double precio) {
        
        this.precio = precio;
        
    }

    @Override
    public String toString() {
        return "Libro{" + "ISBN: " + isbn + "; Título: " + titulo
                + "\nEditorial: " + editorial + "; Páginas: "
                + paginasT + "; Precio: " + precio + '}';
    }

    @Override
    public int compareTo(Libro t) {
        
        return this.isbn.compareTo(t.isbn);
        
    }

}