/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daw.tareavuelosfjmg;
import org.apache.commons.lang3.RandomStringUtils;
/**
 *
 * @author fco-j
 */
public class NIF {
    
    private String numDNI; //Atributo que indica el número del DNI
    private char letraDNI; //Atributo que indica la letra correspondiente al DNI
    private static int cantidad; //Nos indica el número de clases creadas (este 
    //es el mismo en todas las clases creadas)

    public NIF(String numDNI) {//Constructor que toma de parámetro un string de
        //ocho caracteres numéricos:
        
        if(numDNI.length() == 8){//Comprueba si el parámetro es de ocho cifras
            //En caso afirmativo, se continua
            this.numDNI = numDNI;//El string será del valor del parámetro
            int x = Integer.parseInt(numDNI) % 23;//x será del valor del resto
            //número del DNI entre 23
            cantidad++;//Se aumenta la cantidad de DNIs creados
            switch(x){//Con el resto en x, se asigna una letra según su valor
                //mediante este switch:

                case 0:
                    this.letraDNI = 'T';
                break;

                case 1:
                    this.letraDNI = 'R';
                break;

                case 2:
                    this.letraDNI = 'W';
                break;

                case 3:
                    this.letraDNI = 'A';
                break;

                case 4:
                    this.letraDNI = 'G';
                break;

                case 5:
                    this.letraDNI = 'M';
                break;

                case 6:
                    this.letraDNI = 'Y';
                break;

                case 7:
                    this.letraDNI = 'F';
                break;

                case 8:
                    this.letraDNI = 'P';
                break;

                case 9:
                    this.letraDNI = 'D';
                break;

                case 10:
                    this.letraDNI = 'X';
                break;

                case 11:
                    this.letraDNI = 'B';
                break;

                case 12:
                    this.letraDNI = 'N';
                break;

                case 13:
                    this.letraDNI = 'J';
                break;

                case 14:
                    this.letraDNI = 'Z';
                break;

                case 15:
                    this.letraDNI = 'S';
                break;

                case 16:
                    this.letraDNI = 'Q';
                break;

                case 17:
                    this.letraDNI = 'V';
                break;

                case 18:
                    this.letraDNI = 'H';
                break;

                case 19:
                    this.letraDNI = 'L';
                break;

                case 20:
                    this.letraDNI = 'C';
                break;

                case 21:
                    this.letraDNI = 'K';
                break;

                case 22:
                    this.letraDNI = 'E';
                break;

            }
  
        }else{//Si la condición resulta negativa, se lanza un mensaje de error
            //por pantalla, y esta clase no será contada.
            System.out.println("ERROR. Debes insertar 8 cifras");
        }                
        
    }
    
    public NIF() {//Constructor por defecto (SAQUEN SUS RULETAS, SEÑORES)
    
        //Se genera al azar un nº de hasta 8 cifras para el DNI:
        numDNI = RandomStringUtils.randomNumeric(8).toUpperCase();
        cantidad++; //Se aumenta la cantidad de DNIs creados
        int x = Integer.parseInt(numDNI) % 23;//x será del valor del resto
            //número del DNI entre 23
            
        switch(x){//Con el resto en x, se asigna una letra según su valor
                //mediante este switch:
            
            case 0:
                this.letraDNI = 'T';
            break;
            
            case 1:
                this.letraDNI = 'R';
            break;
            
            case 2:
                this.letraDNI = 'W';
            break;
            
            case 3:
                this.letraDNI = 'A';
            break;
            
            case 4:
                this.letraDNI = 'G';
            break;
            
            case 5:
                this.letraDNI = 'M';
            break;
            
            case 6:
                this.letraDNI = 'Y';
            break;
            
            case 7:
                this.letraDNI = 'F';
            break;
            
            case 8:
                this.letraDNI = 'P';
            break;
            
            case 9:
                this.letraDNI = 'D';
            break;
            
            case 10:
                this.letraDNI = 'X';
            break;
            
            case 11:
                this.letraDNI = 'B';
            break;
            
            case 12:
                this.letraDNI = 'N';
            break;
            
            case 13:
                this.letraDNI = 'J';
            break;
            
            case 14:
                this.letraDNI = 'Z';
            break;
            
            case 15:
                this.letraDNI = 'S';
            break;
            
            case 16:
                this.letraDNI = 'Q';
            break;
            
            case 17:
                this.letraDNI = 'V';
            break;
            
            case 18:
                this.letraDNI = 'H';
            break;
            
            case 19:
                this.letraDNI = 'L';
            break;
            
            case 20:
                this.letraDNI = 'C';
            break;
            
            case 21:
                this.letraDNI = 'K';
            break;
            
            case 22:
                this.letraDNI = 'E';
            break;
            
        }
        
    }

    public String getNumDNI() {//Este método devuelve el String que contiene el
        //número del DNI:
        return numDNI;
    }

    public char getLetraDNI() {//Este método devuelve el String que contiene la
        //letra del DNI:
        return letraDNI;
    }

    @Override
    public String toString() {//Este método devuelve en String el nº y la letra 
        //del DNI
        return "NIF = " + numDNI + "-" + letraDNI ;
    }    

    public static int getCantidad() {//Este método devuelve la cantidad de 
        //clases creadas:
        return cantidad;
    }
                       
    
    
}
