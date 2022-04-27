/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vugas;

/**
 *
 * @author fco-j
 */
import java.util.*;

public class Vehiculo {

    private Long bastidor;
    private String matricula;
    private double kilometros;
    private String marca;
    private String modelo;
    private double tarifa;
    private boolean disponible;
    private boolean marchaAutomatica;
    private int numeroPuertas;

    public Vehiculo(Long bastidor, String matricula, double kilometros,
            String marca, String modelo,
            double tarifa, boolean disponible, boolean marchaAutomatica,
            int numeroPuertas) {

        this.bastidor = bastidor;
        this.matricula = matricula;
        this.kilometros = kilometros;
        this.marca = marca;
        this.modelo = modelo;
        this.tarifa = tarifa;
        this.disponible = disponible;
        this.marchaAutomatica = marchaAutomatica;

    }

    public Vehiculo() {
        
        Random r = new Random();

        this.bastidor = 1L;
        this.matricula = "0000 AAA";
        kilometros = 1600;
        this.marca = "Sin marca";
        this.modelo = "Sin modelo";
        marchaAutomatica = r.nextBoolean();
        disponible = r.nextBoolean();
        this.numeroPuertas = 5;

    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 41 * hash + Objects.hashCode(this.bastidor);
        hash = 41 * hash + Objects.hashCode(this.matricula);
        hash = 41 * hash + (int) (Double.doubleToLongBits(this.kilometros) ^ (Double.doubleToLongBits(this.kilometros) >>> 32));
        hash = 41 * hash + Objects.hashCode(this.marca);
        hash = 41 * hash + Objects.hashCode(this.modelo);
        hash = 41 * hash + (int) (Double.doubleToLongBits(this.tarifa) ^ (Double.doubleToLongBits(this.tarifa) >>> 32));
        hash = 41 * hash + (this.disponible ? 1 : 0);
        hash = 41 * hash + (this.marchaAutomatica ? 1 : 0);
        hash = 41 * hash + this.numeroPuertas;
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
        final Vehiculo other = (Vehiculo) obj;
        if (Double.doubleToLongBits(this.kilometros) != Double.doubleToLongBits(other.kilometros)) {
            return false;
        }
        if (Double.doubleToLongBits(this.tarifa) != Double.doubleToLongBits(other.tarifa)) {
            return false;
        }
        if (this.disponible != other.disponible) {
            return false;
        }
        if (this.marchaAutomatica != other.marchaAutomatica) {
            return false;
        }
        if (this.numeroPuertas != other.numeroPuertas) {
            return false;
        }
        if (!Objects.equals(this.matricula, other.matricula)) {
            return false;
        }
        if (!Objects.equals(this.marca, other.marca)) {
            return false;
        }
        if (!Objects.equals(this.modelo, other.modelo)) {
            return false;
        }
        return Objects.equals(this.bastidor, other.bastidor);
    }

    

    public int getNumeroPuertas() {

        return numeroPuertas;

    }

    public void setNumeroPuertas(int numeroPuertas) {

        this.numeroPuertas = numeroPuertas;

    }
    
    public double getKilometros() {
        return kilometros;
    }

    public void setKilometros(double kilometros) {
        this.kilometros = kilometros;
    }

    public boolean isMarchaAutomatica() {
        return marchaAutomatica;
    }

    public void setMarchaAutomatica(boolean marchaAutomatica) {
        this.marchaAutomatica = marchaAutomatica;
    }

    public Long getBastidor() {

        return bastidor;

    }

    public void setBastidor(Long bastidor) {

        this.bastidor = bastidor;

    }

    public String getMatricula() {

        return matricula;

    }

    public void setMatricula(String matricula) {

        this.matricula = matricula;

    }

    public String getMarca() {

        return marca;

    }

    public void setMarca(String marca) {

        this.marca = marca;

    }

    public String getModelo() {

        return modelo;

    }

    public void setModelo(String modelo) {

        this.modelo = modelo;

    }

    public double getTarifa() {

        return tarifa;

    }

    public void setTarifa(double tarifa) {

        this.tarifa = tarifa;

    }

    public boolean isDisponible() {

        return disponible;

    }

    public void setDisponible(boolean disponible) {

        this.disponible = disponible;

    }

    public void metodoVehiculo() {

        System.out.println("Método de vehículo");

    }

    public String getAtributos() {

        return matricula + ':'  + kilometros + ':'
                + bastidor + ':' + marca + ':' + modelo
                + ':' + numeroPuertas + ':' + marchaAutomatica
                + ':' + tarifa + ':' + disponible;

    }
    
    
    
    /*
    
    
    private String modelo;
    private String color;
    private double tarifa;
    private boolean disponible;
    private boolean marchaAutomatica;
    private int numeroPuertas;
    
    */

    

}
