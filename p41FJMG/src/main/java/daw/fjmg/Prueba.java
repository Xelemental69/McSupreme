/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package daw.fjmg;

import javax.swing.JOptionPane;

/**
 *
 * @author fco-j
 */

/*

En esta clase incluye el método main() y realiza las siguientes acciones:
Crea dos libros con el constructor por defecto. Muestra por consola los datos de estos libros usando el método
toString. 
Crea dos libros con el constructor parametrizado, con los datos que tú quieras. Usando JOption y toString,
muestra los datos estos objetos.
Prueba a crear un nuevo libro con 12000 páginas y 12 MB. Muestra los datos de este objeto usando la consola y
toString.
Establece 13000 páginas en el primer libro creado. Muestra los datos de este objeto usando la consola y toString.
Establece como tamaño 15MB en el segundo libro creado. Muestra los datos de este objeto usando la consola y
toString.
Prueba los métodos pasarPagina(), retrocederPagina() y saltar(int) con cualquiera de los libros creados y
muestra los datos por consola para comprobar su funcionamiento.

*/
public class Prueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Aquí probaremos la clase LibroElectrónico
        //Construimos dos clases por defecto:
        LibroElectronico default1 = new LibroElectronico();
        LibroElectronico default2 = new LibroElectronico();
        
        //Las mostramos por pantalla:
        System.out.println(default1);
        default2.retrocederPagina();//Intentamos retroceder página (sin resultado
        System.out.println(default2);
                        
        //Construimos dos clases (libros) con parámetros:
        LibroElectronico meme1 = new LibroElectronico("Pesadilla antes de LaCañada",
        420, 6.9);
        LibroElectronico meme2 = new LibroElectronico("50 Sombras de Patricio "
                + "Estrella", 180, 2.7);
        JOptionPane.showMessageDialog(null, meme1);
        JOptionPane.showMessageDialog(null, meme2);
        
        //Pasamos página en Pesadilla antes de LaCañada
        meme1.pasarPagina();        
        System.out.println(meme1);
        
        //Trateamos con la función de saltar páginas en 50 Sombras de Patricio:
        meme2.saltar(70);
        meme2.saltar(-2);
        meme2.retrocederPagina();
        meme2.saltar(999);
        meme2.saltar(-999);
        meme2.pasarPagina();
        
        System.out.println("\n" + meme2);
                       
        //Intentamos avanzar más allá del final en Pesadilla antes de LaCañada
        meme1.saltar(418);
        meme1.pasarPagina();
        
        System.out.println("\n" + meme1);
        
        //Creamos un tercer libro (uno largo, y muuuuuy interminable)
        LibroElectronico libroEternidad = new LibroElectronico("El Secreto de "
                + "Puenteviejo", 12000, 12);
        //Nos rechazará el tamaño y el nº de páginas (es Puenteviejo, es demasiado
        //largo)
        System.out.println("\n" + libroEternidad);
        JOptionPane.showMessageDialog(null, libroEternidad);
        
        //Ponemos unos valores para sustituir los hechos por default (y el titulo
        //por si acaso):
        libroEternidad.setTitulo("El Secreto de Puenteviejo DELUXE");
        libroEternidad.setPaginasT(999);
        libroEternidad.setSize(10);
        
        //Intentamos hacerlo más largo y grande de lo que se admite:
        libroEternidad.setPaginasT(13000);
        libroEternidad.setSize(15);
        System.out.println("\n" + libroEternidad);
        JOptionPane.showMessageDialog(null, libroEternidad);
        
    }
    
}
