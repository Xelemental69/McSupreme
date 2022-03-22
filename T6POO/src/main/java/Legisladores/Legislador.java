/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Legisladores;

/**
 *
 * @author fco-j
 */
public abstract class Legislador {
    
    protected String partidoPolitico;
    protected String provincia;

    public Legislador(String partidoPolitico, String provincia) {
        
        this.partidoPolitico = partidoPolitico;
        this.provincia = provincia;
        
    }
    
    public Legislador() {
        
        this.partidoPolitico = "Hades Reaper";
        this.provincia = "Inferno";
        
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
    
    
    
}
