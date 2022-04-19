/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daw.tareavuelosfjmg;

/**
 *
 * @author pikac
 */
import java.util.*;

public class Vuelo {
    
    private int codVuelo;
    private String origen;
    private String destino;
    private int duracion;
    private ArrayList <Persona> pasajeros;        

    public Vuelo(int codVuelo, String origen, String destino, int duracion, ArrayList<Persona> pasajeros) {
        
        this.codVuelo = codVuelo;
        this.origen = origen;
        this.destino = destino;
        this.duracion = duracion;
        this.pasajeros = pasajeros;
        
    }

    public Vuelo() {
        
        Random generate = new Random();
        
        codVuelo = generate.nextInt(1000);
        origen = "Estepobras";
        destino = "Magala";
        duracion = generate.nextInt(400);
        pasajeros = new ArrayList<>();
        
    }

    public int getCodVuelo() {
        return codVuelo;
    }

    public void setCodVuelo(int codVuelo) {
        this.codVuelo = codVuelo;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public ArrayList<Persona> getPasajeros() {
        return pasajeros;
    }

    public void setPasajeros(ArrayList<Persona> pasajeros) {
        this.pasajeros = pasajeros;
    }

    @Override
    public String toString() {
        return "Vuelo{" + "codVuelo=" + codVuelo + ", origen="
                + origen + ", destino=" + destino + ", duracion="
                + duracion + ", pasajeros=" + pasajeros + '}';
    }
    
}
