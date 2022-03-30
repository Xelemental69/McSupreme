/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej14;

/**
 *
 * @author fco-j
 */
public class Frigorifico extends Electrodomestico implements MuestraInformacion, Comparable<Electrodomestico> {

    private int capacidad;

    public Frigorifico(int capacidad, double consumo, String modelo) {

        super(consumo, modelo);
        this.capacidad = capacidad;

    }

    public void muestra() {

        System.out.println("Es un frigorífico con capacidad de " + capacidad + 'l');

    }

    public int getCapacidad() {

        return capacidad;

    }

    public void setCapacidad(int capacidad) {

        this.capacidad = capacidad;

    }

    public double getConsumo() {

        return consumo;

    }

    public void setConsumo(double consumo) {

        this.consumo = consumo;

    }

    public String getModelo() {

        return modelo;

    }

    public void setModelo(String modelo) {

        this.modelo = modelo;

    }

    @Override
    public int compareTo(Electrodomestico t) {

        return this.modelo.compareTo(t.modelo);

    }

    @Override
    public String toString() {

        return "El frigorífico " + super.toString()
                + " y posee una capacidad de " + capacidad + " litros";

    }

}
