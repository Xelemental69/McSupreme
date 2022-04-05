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
public class Pantalon extends Ropa{
    
    private String talla;
    

    
    public Pantalon(String talla, String marca, String codigo,
            double precio, double iva, String descripcion) {
        
        super(marca, codigo, precio, iva, descripcion);
        this.talla = talla;
        
    }
    
    public Pantalon() {
        
        super();
        talla = "M";
        
    }

    public void enviar(String direccion){//Polimórfico
        
        System.out.println("Esta ropa, " + toString()
                + "\nSerá enviada a " + direccion);
        
    }
    
    public String getTalla() {
        
        return talla;
        
    }

    public void setTalla(String talla) {
        
        this.talla = talla;
        
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
        hash = 43 * hash + Objects.hashCode(this.talla);
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
        final Pantalon other = (Pantalon) obj;
        return Objects.equals(this.talla, other.talla);
    }

    @Override
    public String toString() {//Polimórfico
        return super.toString() + " y la talla es " + talla;
    }

    @Override
    public void descargar() {//Polimórfico

        System.out.println("ERROR, no se puede descargar tela");
        
    }
    
}
