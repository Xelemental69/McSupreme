/*
 *  Crea las siguientes clases (cada una en su archivo) dentro 
 *       del mismo proyecto y del mismo paquete:
 *
 *      Motor: con métodos para arrancar el motor y apagarlo.
 *
 *      Rueda: con métodos para inflar la rueda y desinflarla.
 *
 *      Ventana: con métodos para abrirla y cerrarla.
 *
 *      Puerta: con una ventana y métodos para abrir la puerta y cerrar la puerta.
 *
 *      Coche: con un motor, cuatro ruedas y dos puertas; con los métodos 
 *       te parezcan adecuados.
 *
 *          Inventa un atributo para cada clase, creando los constructores,
 *           métodos set y get.
 */
package daw1st_fjmg.clasest4;

/**
 *
 * @author fco-j
 */
import java.util.*;

public class Motor {

    boolean enMarcha;
    double cilindrada;

    public Motor(boolean enMarcha, double cilindrada) {

        this.enMarcha = enMarcha;
        this.cilindrada = cilindrada;

    }

    public Motor() {

        Random giveaway = new Random();

        enMarcha = giveaway.nextBoolean();
        cilindrada = giveaway.nextInt(100) + giveaway.nextDouble();

    }

    public void arrancar() {

        this.enMarcha = true;

        System.out.println("Motor encendido");

    }

    public void apagar() {

        this.enMarcha = false;

        System.out.println("Motor apagado");

    }

    public boolean getMotor() {

        return this.enMarcha;

    }

    public void setMotor(boolean enMarcha) {

        this.enMarcha = enMarcha;

    }

    @Override
    public String toString() {
        return "¿Está en marcha? " + enMarcha + "; Cilindrada: "
                + cilindrada;
    }

}
