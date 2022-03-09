/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquetea;

import java.util.Objects;

/**
 *
 * @author Xelemental
 */
import java.util.*;

public class Traduccion {
    
<<<<<<< HEAD
    private Map<String, String> traduccion;

    public Traduccion() {
        //Creamos el map (y la clase):
        
        traduccion = new HashMap<>();
        
    }

    public void guardarEntrada(String wrdEng, String palEsp){
        //Método para almacenar una entrada de traducción:
        
        traduccion.put(wrdEng, palEsp);
        
    }
    
    public void borrarEntrada(String wrdEng, String palEsp){
        //Método para borrar una entrada de traducción:
        
        traduccion.remove(wrdEng, palEsp);
=======
    private Map<String, String> traductor;

    public Traduccion() {
        
        traductor = new TreeMap<>();
        
    }

    public Traduccion(Map<String, String> traductor) {
        
        this.traductor = traductor;
        
    }
    
    public void insertarValores (String english, String espagnolo){
        
        traductor.put(english, espagnolo);
        
    }
    
    public void borrarValores(String english, String espagnolo){
        
        traductor.remove(english, espagnolo);
        
    }
    
    public void editarValores(String english, String espagnolo){
        
        traductor.replace(english, espagnolo);
        
    }
    
    public ArrayList<String> listaEngWords(){
        
        ArrayList <String> engList = new ArrayList <String> (traductor.keySet());
        
        return engList;
        
    }
    
    public ArrayList<String> listaEspPalabras(){
        
        ArrayList <String> espLista = new ArrayList <String> (traductor.values());
        
        return espLista;
>>>>>>> Terminado
        
    }
    
    public void modificarEntrada(String wrdEng, String palEsp){
        //Método para editar una entrada de traducción,
        //reemplazando una existente:
        
        traduccion.replace(wrdEng, palEsp);
        
    }
    
    public ArrayList<String> listEng(){
        //Crea un ArrayList con cada palabra inglesa:
        
        ArrayList <String> list = new ArrayList <String>
         (traduccion.keySet());

        return list;
        
    }
    
    public ArrayList<String> listaEsp(){
        //Crea un ArrayList con cada traducción al español:
        
        ArrayList <String> list = new ArrayList <String>
         (traduccion.values());

        return list;
        
    }
               
}
