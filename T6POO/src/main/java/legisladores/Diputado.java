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
public class Diputado extends Legislador{
    
    private int numeroAsiento;

    //Constructor por defecto:
    public Diputado(int numeroAsiento, String partidoPolitico,
            String provincia, String nombre, String apellidos) {
        
        super(partidoPolitico, provincia, nombre, apellidos);
        this.numeroAsiento = numeroAsiento;
        
    }
    
    public Diputado(){//Constructor parametrizado:
        
        super();
        numeroAsiento = 1315;
        
    }

    @Override
    public String getCamara() {//Clase heredada, devolverá Diputado
        
        return "Diputado";
    
    }
    
    //GETTERS Y SETTERS:
        
    public int getNumeroAsiento() {
        
        return numeroAsiento;
        
    }

    public void setNumeroAsiento(int numeroAsiento) {
        
        this.numeroAsiento = numeroAsiento;
        
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
        return super.toString() + "\nDiputado{" + "\nNumero de Asiento: " + numeroAsiento + '}';
    }
            
}
