/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abstractos_e_interfaces;

/**
 *
 * @author fco-j
 */
public class LibroPapel extends Libro{
    
    private int numPaginas;

    public LibroPapel(int numPaginas, String isbn,
            String codigo, double precio, double iva, String descripcion) {
        
        super(isbn, codigo, precio, iva, descripcion);
        this.numPaginas = numPaginas;
        
    }
            
    public LibroPapel() {
        
        super();
        this.numPaginas = 435;
        
    }

    public int getNumPaginas() {
        
        return numPaginas;
        
    }

    public void setNumPaginas(int numPaginas) {
        
        this.numPaginas = numPaginas;
        
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
        hash = 59 * hash + this.numPaginas;
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
        final LibroPapel other = (LibroPapel) obj;
        return this.numPaginas == other.numPaginas;
        
    }
    
    @Override
    public void descargar() {//Polimórfico

        System.out.println("ERROR, no se puede descargar, no es"
                + " una versión digital");
        
    }
    
    public void enviar(String direccion){//Polimórfico
        
        System.out.println("Este libro, " + toString()
                + "\nSerá enviado a " + direccion);
        
    }
    
    public void sonidoPasarPagina(){
        
        System.out.println("Fshsshhwlh");
        
    }

    @Override
    public String toString() {//Polimórfico
        
        return super.toString() + " Posee " + numPaginas + " páginas";
        
    }
            
}
