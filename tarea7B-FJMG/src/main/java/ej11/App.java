/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej11;

/**
 *
 * @author pikac
 */
import org.apache.commons.lang3.RandomStringUtils;
import javax.xml.bind.annotation.*;
import java.util.*;
import java.util.stream.*;

//Ajustamos las anotaciones que tendr� cada app en XML:
@XmlRootElement(name = "app")
@XmlAccessorType(XmlAccessType.FIELD)

public class App {

    private int codigo;
    private String nombre;
    private String descripcion;
    private double sizeKB;
    private int numDescargas;

    private static int instances;
    private static Random rng = new Random();
    private static String[] descripciones = {"App para reproducir musica",
        "App para la edición de fotos", "App que comprueba la hora dorada",
        "App dedicada a la grabación de audio",
        "App hecha para grabar la pantalla del dispositivo",
        "App de gestión de archivos", "App que actúa como una red social",
        "App para jugar", "App para ver videos en streaming",
        "App para llevar las operaciones contabilidad de una empresa"};

    //Constructores...
    public App() {//Por defecto
        
        this.codigo = instances;
        this.nombre = "app" + this.codigo + RandomStringUtils.randomAlphabetic(1).toLowerCase();
        this.descripcion = descripciones[rng.nextInt(descripciones.length)];
        DoubleStream dobles = rng.doubles(1, 100.0, 1024.0);

        //NOTA: Solo puedo permitirme hacer la siguiente línea porque
        //el tamaño del DoubleStream es 1,si llegase a ser mayor el tamaño,
        // no tendría ni idea de cómo hacer esto
        this.sizeKB = dobles.reduce(0, Double::sum);

        IntStream enteros = rng.ints(1, 0, 50000);

        //NOTA: Solo puedo permitirme hacer la siguiente línea porque
        //el tamaño del IntStream es 1,si llegase a ser mayor el tamaño,
        // no tendría ni idea de cómo hacer esto
        this.numDescargas = enteros.reduce(0, Integer::sum);

        instances++;
        
    }

    public App(String nombre, String descripcion,
            double sizeKB, int numeroDescargas) {//Parametrizado
        
        this.codigo = instances;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.sizeKB = sizeKB;
        this.numDescargas = numeroDescargas;
        instances++;
    }
    

    //Getter y setters
    public int getCodigo() {

        return codigo;

    }

    public void setCodigo(int codigo) {

        this.codigo = codigo;

    }

    public String getNombre() {

        return nombre;

    }

    public void setNombre(String nombre) {

        this.nombre = nombre;

    }

    public String getDescripcion() {

        return descripcion;

    }

    public void setDescripcion(String descripcion) {

        this.descripcion = descripcion;

    }

    public double getsizeKB() {

        return sizeKB;

    }

    public void setsizeKB(double sizeKB) {

        this.sizeKB = sizeKB;

    }

    public int getNumeroDescargas() {

        return numDescargas;

    }

    public void setNumeroDescargas(int numeroDescargas) {

        this.numDescargas = numeroDescargas;

    }

    //toString
    @Override
    public String toString() {

        return codigo + ";" + nombre + ";" + descripcion
                + ";" + sizeKB + ";" + numDescargas;
    }

    public static void main(String[] args) {
    //Este main nos servirá para comprobar la clase:
        
        App ap1 = new App();
        System.out.println(ap1);

    }
}
