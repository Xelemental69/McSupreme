/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daw1st_fjmg.clasest4;

/**
 *
 * @author fco-j
 */
import java.util.*;

public class Coche1 {

    Motor motor;
    Puerta puerta1;
    Puerta puerta2;
    Rueda rueda1;
    Rueda rueda2;
    Rueda rueda3;
    Rueda rueda4;
    String modelo;
    String color;
    
    public Coche1() {
        
        Random giveaway = new Random();
        int m = giveaway.nextInt(10);//Generamos el nº de marca al azar
        int c = giveaway.nextInt(10);//Generamos el nº de color al azar
        
        motor = new Motor();
        puerta1 = new Puerta();
        puerta2 = new Puerta();
        rueda1 = new Rueda();
        rueda2 = new Rueda();
        rueda3 = new Rueda();
        rueda4 = new Rueda();
        
        switch(m){//El nº de marca determinará la marca a la que el coche
            //pertenece:
            
            case 0:
                
                modelo = "Opel Corsa";
                
            break;
            
            case 1:
                
                modelo = "Hyundai Bayon";
                
            break;
            
            case 2:
                
                modelo = "Ford Focus";
                
            break;
            
            case 3:
                
                modelo = "Dacia Duster";
                
            break;
            
            case 4:
                
                modelo = "Toyota Yaris";
                
            break;
            
            case 5:
                
                modelo = "Renault Clio";
                
            break;
            
            case 6:
                
                modelo = "Daewoo Compact";
                System.out.println("PD: Daewoo está muertísimo como compañía");
                
            break;
            
            case 7:
                
                modelo = "BMW X5";
                
            break;
            
            case 8:
                
                modelo = "Chevrolet Orlando";
                
            break;
            
            case 9:
                
                modelo = "Kia Sportage";
                
            break;
            
        }
        
        switch(c){//El nº de color determinará el color del coche:
            
            case 0:
                
                color = "Azul";
                
            break;
            
            case 1:
                
                color = "Rojo";
                
            break;
            
            case 2:
                
                color = "Verde";
                
            break;
            
            case 3:
                
                color = "Púrpura";
                
            break;
            
            case 4:
                
                color = "Rosa";
                
            break;
            
            case 5:
                
                color = "Blanco";
                
            break;
            
            case 6:
                
                color = "Negro";
                
            break;
            
            case 7:
                
                color = "Naranja";
                
            break;
            
            case 8:
                
                color = "Amarillo";
                
            break;
            
            case 9:
                
                color = "Marrón";
                
            break;
            
        }
        
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public Puerta getPuerta1() {
        return puerta1;
    }

    public void setPuerta1(Puerta puerta1) {
        this.puerta1 = puerta1;
    }

    public Puerta getPuerta2() {
        return puerta2;
    }

    public void setPuerta2(Puerta puerta2) {
        this.puerta2 = puerta2;
    }

    public Rueda getRueda1() {
        return rueda1;
    }

    public void setRueda1(Rueda rueda1) {
        this.rueda1 = rueda1;
    }

    public Rueda getRueda2() {
        return rueda2;
    }

    public void setRueda2(Rueda rueda2) {
        this.rueda2 = rueda2;
    }

    public Rueda getRueda3() {
        return rueda3;
    }

    public void setRueda3(Rueda rueda3) {
        this.rueda3 = rueda3;
    }

    public Rueda getRueda4() {
        return rueda4;
    }

    public void setRueda4(Rueda rueda4) {
        this.rueda4 = rueda4;
    }

    @Override
    public String toString() {
        return "Y tu coche es...\n" + "Modelo: " + modelo + " (color " + color
                + ")\nCaracterísticas {\n" + "Motor: " + motor + "\n Puerta1: " 
                + puerta1 + "\n Puerta2: " + puerta2 + "\n Rueda1: " + rueda1 
                + "\n Rueda2: " + rueda2 + "\n Rueda3: " + rueda3 + "\n Rueda4: "  
                + rueda4 + "\n}";
    }

}
