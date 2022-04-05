/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abstractos_e_interfaces;

import java.util.Objects;

/**
 *
 * @author fco-j
 */
public abstract class Ropa extends Producto {

    protected String marca;

    public Ropa(String marca, String codigo, double precio,
            double iva, String descripcion) {

        super(codigo, precio, iva, descripcion);
        this.marca = marca;

    }

    public Ropa() {

        super();
        this.marca = "Slappin DRIP";

    }

    public String getMarca() {

        return marca;

    }

    public void setMarca(String marca) {

        this.marca = marca;

    }

    public String getCodigo() {

        return codigo;

    }

    public void setCodigo(String codigo) {

        this.codigo = codigo;

    }

    public double getPrecio() {

        return precio;

    }

    public void setPrecio(double precio) {

        this.precio = precio;

    }

    public double getIva() {

        return iva;

    }

    public void setIva(double iva) {

        this.iva = iva;

    }

    public String getDescripcion() {

        return descripcion;

    }

    public void setDescripcion(String descripcion) {

        this.descripcion = descripcion;

    }

    @Override
    public int hashCode() {//Polimórfico
        int hash = 5;
        hash = 23 * hash + Objects.hashCode(this.marca);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {//Polimórfico
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Ropa other = (Ropa) obj;
        return Objects.equals(this.marca, other.marca);
    }

    @Override
    public String toString() {//Polimórfico
        
        return super.toString() + "\nLa Marca es " + marca;
        
    }
    
}
