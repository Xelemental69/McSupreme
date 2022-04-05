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
public abstract class Libro extends Producto implements Comparable<Libro> {

    protected String isbn;

    public Libro(String isbn, String codigo, double precio,
            double iva, String descripcion) {

        super(codigo, precio, iva, descripcion);

        boolean validISBN = true;

        for (int i = 0; i < isbn.length(); i++) {

            if (!Character.isDigit(isbn.charAt(i))) {

                validISBN = false;
                break;

            }

        }
        if (validISBN) {

            this.isbn = isbn;

        } else {

            //(El ID se generará al azar)
            this.isbn = RandomStringUtils.randomNumeric(3).toUpperCase();

        }

    }
    
    public abstract void sonidoPasarPagina();

    public String getIsbn() {

        return isbn;

    }

    public void setIsbn(String isbn) {
        boolean validISBN = true;

        for (int i = 0; i < isbn.length(); i++) {

            if (!Character.isDigit(isbn.charAt(i))) {

                validISBN = false;
                break;

            }

        }
        if (validISBN) {

            this.isbn = isbn;

        } else {

            //(El ID se generará al azar)
            this.isbn = RandomStringUtils.randomNumeric(3).toUpperCase();

        }

    }

    public Libro() {

        super();
        isbn = RandomStringUtils.randomNumeric(3).toUpperCase();

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

        int hash = 7;
        hash = 67 * hash + Objects.hashCode(this.isbn);
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
        final Libro other = (Libro) obj;
        return Objects.equals(this.isbn, other.isbn);
        
    }

    @Override
    public int compareTo(Libro l) {//Polimórfico
        
        return this.isbn.compareTo(l.isbn);
        
    }
        
    @Override
    public String toString() {//Polimórfico

        return super.toString() + "\nComo libro, su ISBN es " + isbn;

    }

}
