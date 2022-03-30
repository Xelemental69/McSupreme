/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej14;

import java.util.Objects;

/**
 *
 * @author fco-j
 */
public abstract class Electrodomestico {

    protected double consumo;
    protected String modelo;

    public Electrodomestico(double consumo, String modelo) {
        
        this.consumo = consumo;
        this.modelo = modelo;
        
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
    public int hashCode() {
        int hash = 5;
        hash = 29 * hash + (int) (Double.doubleToLongBits(this.consumo) ^ (Double.doubleToLongBits(this.consumo) >>> 32));
        hash = 29 * hash + Objects.hashCode(this.modelo);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Electrodomestico other = (Electrodomestico) obj;
        if (Double.doubleToLongBits(this.consumo) != Double.doubleToLongBits(other.consumo)) {
            return false;
        }
        return Objects.equals(this.modelo, other.modelo);
    }

    @Override
    public String toString() {
        return modelo + " consume " + consumo + " vatios";
    }
        
}
