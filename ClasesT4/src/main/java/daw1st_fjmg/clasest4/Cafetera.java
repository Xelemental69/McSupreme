/*
 * Click https://www.youtube.com/watch?v=dQw4w9WgXcQ
 * Click https://www.youtube.com/watch?v=dQw4w9WgXcQ
 */
package daw1st_fjmg.clasest4;

/**
 *
 * @author fco-j
 */
public class Cafetera {

    private double capacidadMaxima;
    private double cantidadActual;

    public Cafetera() {

        this.capacidadMaxima = 1000;
        this.cantidadActual = 0;

    }

    public Cafetera(double capacidadMaxima) {

        this.capacidadMaxima = Math.abs(capacidadMaxima);
        this.cantidadActual = Math.abs(capacidadMaxima);

    }

    public Cafetera(double capacidadMaxima, double capacidadActual) {

        this.capacidadMaxima = Math.abs(capacidadMaxima);
        this.cantidadActual = Math.abs(capacidadActual);

        if (this.cantidadActual > this.capacidadMaxima) {
            this.cantidadActual = this.capacidadMaxima;
        }

    }

    public void llenarCafetera() {

        this.cantidadActual = this.capacidadMaxima;

    }

    public void servirTaza(double cantidadAServir) {

        if (this.cantidadActual > cantidadAServir) {
            this.cantidadActual -= cantidadAServir;
            System.out.println("Se ha servido " + cantidadAServir + "u "
                    + "de café.");
        } else {
            System.out.println("Se ha servido " + this.cantidadActual
                    + "u " + "de café.");
            this.cantidadActual = 0;

        }

    }

    public void vaciarCafetera() {

        this.cantidadActual = 0;

    }

    public void agregarCafe(double cantidadAgregar) {

        if (this.cantidadActual + cantidadAgregar <= this.capacidadMaxima) {

            System.out.println("Se ha añadido " + cantidadAgregar + "u"
                    + "de café a la cafetera");

        } else {

            System.out.println("Se ha añadido " + (this.capacidadMaxima
                    - this.cantidadActual) + "u de café a la cafetera "
                    + "y se ha desbordado " + (this.capacidadMaxima
                    - (this.cantidadActual + cantidadAgregar)
                    + "u de café"));

        }

    }

    @Override
    public String toString() {
        return "Cafetera{" + "capacidadMaxima=" + capacidadMaxima
                + "u, cantidadActual=" + cantidadActual + "u}";
    }

}
