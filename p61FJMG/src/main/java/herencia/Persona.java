/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herencia;

/**
 *
 * @author fco-j
 */
public class Persona extends UsuarioPersona {

    private boolean evolucionado;
    private String nomPersona;
    private String tarot;

    public Persona(boolean evolucionado, String nomPersona, String tarot,
            String id, MetodoActivacion metodo, String nombre, String apellidos) {

        super(id, metodo, nombre, apellidos);
        this.evolucionado = evolucionado;
        this.nomPersona = nomPersona;
        this.tarot = tarot;

    }

    public Persona() {//Constructor por defecto.

        super();
        evolucionado = false;
        nomPersona = "Luzciel";
        tarot = "La Muerte";

    }

    @Override
    public String estadoPersona() {//Método B2

        return "Activo";

    }

    public void fraseCaracteristica() {//Método D

        System.out.println("I am thou, thou art I");

    }

    //GETTERS Y SETTERS:
    public boolean isEvolucionado() {

        return evolucionado;

    }

    public void setEvolucionado(boolean evolucionado) {

        this.evolucionado = evolucionado;

    }

    public String getNomPersona() {

        return nomPersona;

    }

    public void setNomPersona(String nomPersona) {

        this.nomPersona = nomPersona;

    }

    public String getTarot() {

        return tarot;

    }

    public void setTarot(String tarot) {

        this.tarot = tarot;

    }

    public String getNombre() {

        return nombre;

    }

    public void setNombre(String nombre) {

        this.nombre = nombre;

    }

    public String getApellidos() {

        return apellidos;

    }

    public void setApellidos(String apellidos) {

        this.apellidos = apellidos;

    }

    @Override
    public String toString() {

        if (!evolucionado) {
            return super.toString() + "\nSu persona es conocido con el nombre "
                    + nomPersona + ", del Tarot " + tarot + "\n"
                    + "Aún le queda potencial para evolucionar";
        } else {

            return super.toString() + "\nSu persona es conocido con el nombre "
                    + nomPersona + ", del Tarot " + tarot + "\n"
                    + "Ha alcanzado su máximo potencial";

        }

    }

}
