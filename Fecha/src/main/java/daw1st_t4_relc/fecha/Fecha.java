/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daw1st_t4_relc.fecha;
import java.time.*;

/**
 *
 * @author fco-j
 */
public class Fecha {
    
    private int dia;
    private int mes;
    private int ano;

    public Fecha(int dia, int mes, int ano) {
        
        if(DateCheck(dia,mes,ano)){
        
            this.dia = dia;
            this.mes = mes;
            this.ano = ano;
        
        }else{
            
            System.out.println("ERR0R. La fecha introducida no es válida");
            
        }
        
    }

    public Fecha() {
        
        dia = 1;
        mes = 1;
        ano = 2022;
        
    }
    
    
    
    private boolean DateCheck(int dia, int mes, int ano){
        boolean vibeCheck;
        
        try{
            
            LocalDate check = LocalDate.of(ano, mes, dia);
            vibeCheck = true;
            
        }catch(IllegalArgumentException iae){
            
            vibeCheck = false;
            
        }
        
        return vibeCheck;
        
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        
        if(DateCheck(dia,mes,ano)){
        
            this.dia = dia;
        
        }else{
            
            System.out.println("ERR0R. El día introducido no es válido");
            
        }
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        if(DateCheck(dia,mes,ano)){
        
            this.mes = mes;
        
        }else{
            
            System.out.println("ERR0R. El mes introducido no es válida");
            
        }
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        if(DateCheck(dia,mes,ano)){
            
            this.ano = ano;
        
        }else{
            
            System.out.println("ERR0R. El año introducido no es válida");
            
        }
    }
    
    public void bisiesto(){
        
        LocalDate check = LocalDate.of(ano, mes, dia);
        String bisi = (check.isLeapYear()) ? "Sí" : "No";
        System.out.println("Bisiesto? " + bisi);
        
    }
    
    public void diasMes(){
        
        LocalDate check = LocalDate.of(ano, mes, dia);
        System.out.println("Días del mes actual " + check.lengthOfMonth());
        
    }
    
    public void MostrarFechaCorta(){
        
        System.out.println(dia + "-" + mes + "-" + ano);
        
    }
    
    public void MostrarFechaLarga(){
        
        LocalDate check = LocalDate.of(ano, mes, dia);
        String weekDay;
        
        switch(check.getDayOfWeek().getValue()){
            
            case 0:
                weekDay = "Lunes";
                break;
            
            
        }
        
    }
    
}
