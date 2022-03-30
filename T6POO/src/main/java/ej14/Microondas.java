/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej14;

/**
 *
 * @author fco-j
 */
public class Microondas extends Electrodomestico implements MuestraInformacion, Comparable<Electrodomestico> {

    private int consumoMax;

    public Microondas(int consumoMax, double consumo, String modelo) {

        super(consumo, modelo);
        this.consumoMax = consumoMax;

    }

    public void muestra() {

        System.out.println("Es un microondas con un consumo máximo de "
                + consumoMax + 'W');

    }

    public int getConsumoMax() {

        return consumoMax;

    }

    public void setConsumoMax(int consumoMax) {

        this.consumoMax = consumoMax;

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

        return "El microondas " + super.toString()
                + " y posee una consumo máximo de " + consumoMax + " vatios";

    }

}
