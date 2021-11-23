/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daw.poo;

/**
 *
 * @author fco-j
 */
public class CajaCarton {
    
    int ancho;   //milímetros
    int alto;   //milímetros
    int largo; //milímetros
    int peso; //gramos
    
    public CajaCarton(int ancho, int alto, int largo, int peso){
        
        this.ancho = ancho;
        this.alto = alto;
        this.largo = largo;
        this.peso = peso;
        
    }
    
    
    public String getancho() {
        return "Ancho: " + this.ancho + "mm";
    }
    
    public String getalto() {
        return "Alto: " + this.alto + "mm";
    }
    
    public String getlargo() {
        return "Largo: " + this.largo + "mm";
    }
    
    public String getpeso() {
        return "Peso: " + this.peso + "g";
    }
    
    public void setancho(int ancho) {
        this.ancho = ancho;
    }
    
    public void setalto(int alto) {
        this.alto = alto;
    }
    
    public void setlargo(int largo) {
        this.largo = largo;
    }
    
    public void setpeso(int peso) {
        this.peso = peso;
    }
    
    public void abrir(){
        
        
        
    }
    
    public void cerrar(){
        
        
        
    }
    
}
