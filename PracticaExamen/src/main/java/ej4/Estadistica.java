/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej4;

/**
 *
 * @author pikac
 */
import java.util.*;
import ej2.*;
import org.apache.commons.lang3.*;

public class Estadistica {
    
    private ArrayList <Integer> notas;

    public Estadistica(String modulo, ArrayList<RegistroJSON> registros) {
        
        notas = new ArrayList<>();
        
        for (String tmp : calificaciones(modulo, registros)){
            
            notas.add(converterNum(tmp));
            
        }
        
    }

    public ArrayList<Integer> getNotas() {
        return notas;
    }

    public void setNotas(ArrayList<Integer> notas) {
        this.notas = notas;
    }
    
    private ArrayList<String> calificaciones(String modulo, ArrayList<RegistroJSON> registros){
        
        ArrayList <String> result = new ArrayList<>();
        
        for( RegistroJSON r : registros){
            
            switch(modulo){
                
                case "oACV":
                case "OACV":
                case "oacv":
                    result.add(r.getoACV());
                    break;
                    
                case "eA":
                case "EA":
                case "ea":
                    result.add(r.geteA());
                    break;
                
                case "tII":
                case "TII":
                case "tii":
                    result.add(r.gettII());
                    break;
                
                case "tC":
                case "TC":
                case "tc":
                    result.add(r.gettC());
                    break;
                
                case "iNG":
                case "ING":
                case "ing":
                    result.add(r.getiNG());
                    break;
                    
                case "fOL":
                case "FOL":
                case "fol":
                    result.add(r.getfOL());
                    break;
                
                case "cEAC":
                case "CEAC":
                case "ceac":
                    result.add(r.getcEAC());
                    break;                
                                                                
            }
            
        }
        
        return result;
        
    }
    
    private int converterNum(String recipient){
        
        if(StringUtils.isNumeric(recipient)){
            
            return Integer.parseInt(recipient);
            
        }else{
            
            return -1;
            
        }
        
    }

    @Override
    public String toString() {
        return "Estadistica{" + "notas=" + notas + '}';
    }
    
}
