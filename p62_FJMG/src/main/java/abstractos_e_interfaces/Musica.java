/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abstractos_e_interfaces;

/**
 *
 * @author fco-j
 */
public class Musica extends Producto {

    private String grupo;
    
    //()

    public Musica(String grupo, String codigo,
            double precio, double iva, String descripcion) {

        super(codigo, precio, iva, descripcion);
        this.grupo = grupo;

    }

    public Musica() {

        super();
        this.grupo = "The Ricks & Rolls";

    }

    public String getGrupo() {

        return grupo;

    }

    public void setGrupo(String grupo) {

        this.grupo = grupo;

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
    public void enviar(String direccion) {//Polimórfico

        System.out.println("Más le vale enseñarme una forma de enviar"
                + " sonido por SEUR, porque yo no la veo");

    }

    @Override
    public void descargar() {//Polimórfico

        System.out.println("http://franjose.daw/" + hashCode());

    }

    @Override
    public String toString() {
        return super.toString() + "\nEl grupo es " + grupo;
    }

}
