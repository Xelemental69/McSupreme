/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abstractos_e_interfaces;

/**
 *
 * @author fco-j
 */
public class LibroDigital extends Libro{
    
    private double numKBytes;

    public LibroDigital(double numKBytes, String isbn,
            String codigo, double precio, double iva, String descripcion) {
        
        super(isbn, codigo, precio, iva, descripcion);
        this.numKBytes = numKBytes;
        
    }
            
    public LibroDigital() {
        
        super();
        this.numKBytes = 435;
        
    }

    public double getNumKBytes() {
        
        return numKBytes;
        
    }

    public void setNumKBytes(int numKBytes) {
        
        this.numKBytes = numKBytes;
        
    }

    public String getIsbn() {
        
        return isbn;
        
    }

    public void setIsbn(String isbn) {
        
        this.isbn = isbn;
        
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
        hash = 23 * hash + (int) (Double.doubleToLongBits(this.numKBytes) ^ (Double.doubleToLongBits(this.numKBytes) >>> 32));
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
        final LibroDigital other = (LibroDigital) obj;
        return Double.doubleToLongBits(this.numKBytes) == Double.doubleToLongBits(other.numKBytes);
    }
        
    @Override
    public void descargar() {//Polimórfico

        System.out.println("http://franjose.daw/" + hashCode());
        
    }
    
    public void enviar(String direccion){//Polimórfico
        
        System.out.println("Buena suerte enviando bytes por correo convencional");
        
    }

    public void sonidoPasarPagina(){
        
        System.out.println("Click!");
        
    }
    
    @Override
    public String toString() {//Polimórfico
        
        return super.toString() + " Ocupa " + numKBytes + " KB";
        
    }
            
}
