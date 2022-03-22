/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package legisladores;

/**
 *
 * @author fco-j
 */
public abstract class Legislador extends Persona {//Clase abstracta

    //Atributos de la clase:
    protected String partidoPolitico;
    protected String provincia;

    //Constructor parametrizado:
    public Legislador(String partidoPolitico, String provincia,
            String nombre, String apellidos) {

        super(nombre, apellidos);
        this.partidoPolitico = partidoPolitico;
        this.provincia = provincia;

    }

    public Legislador() {//Constructor por defecto:

        super();
        this.partidoPolitico = "Road to Heaven";
        this.provincia = "Infernus";

    }

    //GETTERS Y SETTERS:
    
    public String getPartidoPolitico() {

        return partidoPolitico;

    }

    public void setPartidoPolitico(String partidoPolitico) {

        this.partidoPolitico = partidoPolitico;

    }

    public String getProvincia() {

        return provincia;

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

    public void setProvincia(String provincia) {

        this.provincia = provincia;

    }

    public abstract String getCamara();//Método abstracto

    @Override
    public String toString() {

        return super.toString() + "\nLegislador{" + "\nPartido Politico: " + partidoPolitico
                + "\nProvincia: " + provincia + '}';

    }

}
