/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej13;

/**
 *
 * @author fco-j
 */
public class Direccion {
    
    private String nomCalle;
    private String nomCiudad;
    private String cPostal;
    private String pais;

    public Direccion(String nomCalle, String nomCiudad, String cPostal,
            String pais){
        
        this.nomCalle = nomCalle;
        this.nomCiudad = nomCiudad;
        this.cPostal = cPostal;
        this.pais = pais;
    
    }
    
    public Direccion(){
        
        nomCalle = "Never Gonna Give You Up";
        nomCiudad = "Rick Ashley";
        cPostal = "54546";
        pais = "England";
    
    }

    public String getNomCalle() {
        
        return nomCalle;
        
    }

    public void setNomCalle(String nomCalle) {
        
        this.nomCalle = nomCalle;
        
    }

    public String getNomCiudad() {
        
        return nomCiudad;
        
    }

    public void setNomCiudad(String nomCiudad) {
        
        this.nomCiudad = nomCiudad;
        
    }

    public String getcPostal() {
        
        return cPostal;
        
    }

    public void setcPostal(String cPostal) {
        
        this.cPostal = cPostal;
        
    }

    public String getPais() {
        
        return pais;
        
    }

    public void setPais(String pais) {
        
        this.pais = pais;
        
    }

    @Override
    public String toString() {
        return "Calle " + nomCalle + " de la ciudad " + nomCiudad + ", " + cPostal + "\n País: " + pais ;
    }
            
}
