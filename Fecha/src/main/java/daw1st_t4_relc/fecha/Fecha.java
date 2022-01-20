/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daw1st_t4_relc.fecha;
import java.time.*;
import java.time.temporal.ChronoUnit;

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
            
            System.out.println("(IllegalArgumentException)");
            vibeCheck = false;
            
        }catch(DateTimeException dte){
            
            System.out.println("(DateTimeException)");
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
    
    public void mostrarFechaCorta(){
        
        System.out.println(dia + "-" + mes + "-" + ano);
        
    }
    
    public void mostrarFechaLarga(){
        
        String mmm;
        
        switch(mes){
            
            case 1:
                mmm = "Enero";
                break;
            
            case 2:
                mmm = "Febrero";
                break;
                
            case 3:
                mmm = "Marzo";
                break;
            
            case 4:
                mmm = "Abril";
                break;
            case 5:
                mmm = "Mayo";
                break;
            
            case 6:
                mmm = "Junio";
                break;
            
            case 7:
                mmm = "Julio";
                break;
                
            case 8:
                mmm = "Agosto";
                break;
            
            case 9:
                mmm = "Septiembre";
                break;
                
            case 10:
                mmm = "Octubre";
                break;
            
            case 11:
                mmm = "Noviembre";
                break;
            
            case 12:
                mmm = "Diciembre";
                break;
                
            default:
                mmm = "??";
                break;
                
        }
        
        System.out.println(this.diaSemana() + " " + dia + " de " + mmm 
        + " de " + ano);        
        
    }
    
    public String diaSemana(){
        
        String weekDay;
        
        LocalDate check = LocalDate.of(ano, mes, dia);
        switch(check.getDayOfWeek().getValue()){
            
            case 1:
                weekDay = "Lunes";
                break;
            
            case 2:
                weekDay = "Martes";
                break;
                
            case 3:
                weekDay = "Miércoles";
                break;
            
            case 4:
                weekDay = "Jueves";
                break;
            case 5:
                weekDay = "Viernes";
                break;
            
            case 6:
                weekDay = "Sábado";
                break;
            
            case 7:
                weekDay = "Domingo";
                break;
                
            default:
                weekDay = "??";
                break;
                
        }
        
        return weekDay;
        
    }
    
    public long diaEntreFechas(Fecha i, Fecha f){
        
        LocalDate ini = LocalDate.of(i.getDia(), i.getMes(), i.getAno());
        LocalDate fin = LocalDate.of(f.getDia(), f.getMes(), f.getAno());
        
        long r = ChronoUnit.DAYS.between(ini, fin);
        
        return r;
        
    }
    
    public void diaSig(){
        
        LocalDate fec = LocalDate.of(ano, mes, dia);
        LocalDate fec2 = LocalDate.of(ano, mes, dia);
        
        fec2 = fec.plusDays(1);
        
        System.out.println("Día Siguiente " + fec2.getDayOfMonth() + "-" 
                + fec2.getMonthValue() + "-" + fec2.getYear());
        
        this.dia = fec2.getDayOfMonth();
        this.mes = fec2.getMonthValue();
        this.ano = fec2.getYear();
        
    }
    
    public static Fecha copia(Fecha aux){
        
        Fecha n = new Fecha(aux.dia, aux.mes, aux.ano);
        
        return n;
        
    }
    
    public boolean igual(Fecha z){
        
        LocalDate fParametro = LocalDate.of(z.getAno(), z.getMes(), z.getDia());
        LocalDate fCompuesta = LocalDate.of(ano, mes, dia);
        
        return fParametro.equals(fCompuesta);
        
    }
    
    public boolean mayorFecha(Fecha x){
        
        LocalDate fParametro = LocalDate.of(x.getAno(), x.getMes(), x.getDia());
        LocalDate fCompuesta = LocalDate.of(ano, mes, dia);
        
        return fCompuesta.isAfter(fParametro);
        
    }
    
    public boolean menorFecha(Fecha y){
        
        LocalDate fParametro = LocalDate.of(y.getAno(), y.getMes(), y.getDia());
        LocalDate fCompuesta = LocalDate.of(ano, mes, dia);
        
        return fCompuesta.isBefore(fParametro);
        
    }
    
}
