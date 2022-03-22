/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package legisladores;

/**
 *
 * @author pikac
 */
public class Senador extends Legislador{
    
    private double complemento;

    //Constructor por defecto:
    public Senador(double complemento, String partidoPolitico, String provincia,
            String nombre, String apellidos) {
        
        super(partidoPolitico, provincia, nombre, apellidos);        
        this.complemento = complemento;
        
    }

    public Senador() {//Constructor parametrizado:
        
        super();
        complemento = 450.87;
        
    }    
               
    @Override
    public String getCamara() {//Clase heredada, devolverá Senador
        
        return "Senador";
    
    }
    
    //GETTERS Y SETTERS:

    public double getComplemento() {
        
        return complemento;
        
    }

    public void setComplemento(double complemento) {
        
        this.complemento = complemento;
        
    }            

    public String getPartidoPolitico() {
        
        return partidoPolitico;
        
    }

    public void setPartidoPolitico(String partidoPolitico) {
       
        this.partidoPolitico = partidoPolitico;
        
    }

    public String getProvincia() {
        
        return provincia;
        
    }

    public void setProvincia(String provincia) {
        
        this.provincia = provincia;
        
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
        
        return super.toString() + "\nSenador{" + "\nComplemento: " + complemento + '€' + '}';
    
    }
    
    
    
}
