/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abstractos_e_interfaces;

import java.util.Objects;
import org.apache.commons.lang3.RandomStringUtils;

/**
 *
 * @author fco-j
 */
public abstract class Producto implements SeEnvia, SeDescarga{

    protected String codigo;
    protected double precio;
    protected double iva;
    protected String descripcion;

    public Producto(String codigo, double precio, double iva, String descripcion) {

        this.codigo = codigo;
        this.precio = precio;
        this.iva = iva;
        this.descripcion = descripcion;

    }

    public Producto() {

        codigo = RandomStringUtils.randomAlphanumeric(4);
        precio = 45.2;
        iva = 11;
        descripcion = "LMAO XD";

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
    public int hashCode() {

        int hash = 3;
        hash = 53 * hash + Objects.hashCode(this.codigo);
        hash = 53 * hash + (int) (Double.doubleToLongBits(this.precio) ^ (Double.doubleToLongBits(this.precio) >>> 32));
        hash = 53 * hash + (int) (Double.doubleToLongBits(this.iva) ^ (Double.doubleToLongBits(this.iva) >>> 32));
        hash = 53 * hash + Objects.hashCode(this.descripcion);
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

        final Producto other = (Producto) obj;

        if (Double.doubleToLongBits(this.precio) != Double.doubleToLongBits(other.precio)) {

            return false;

        }

        if (Double.doubleToLongBits(this.iva) != Double.doubleToLongBits(other.iva)) {

            return false;

        }

        if (!Objects.equals(this.codigo, other.codigo)) {

            return false;

        }

        return Objects.equals(this.descripcion, other.descripcion);

    }

    @Override
    public String toString() {

        return "De código " + codigo + ", cuesta " + precio
                + "€, con un iva aplicado del " + iva
                + "%, y cuya descripción es: " + descripcion;

    }

}
