/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciosDejaVu;
import java.util.*;
/**
 *
 * @author fco-j
 */
public class Ej_5 {

    /**
     * @param args the command line arguments
     */
    
    public static void insertarDatos(int [] rec){
    //Método para introducir datos en el array;
        
        //Declaramos el Scanner
        Scanner entry = new Scanner (System.in);
        boolean ldMatiasPratz;//boolean de fallo (temática linea directa)
        
        do{//Bucle para llamar a ldMatiasPratz si algo falla e insistir
            
            try{//Código cuando solo se introducen caracteres numéricos
                                              
                for(int i = 0; i < rec.length; i++){//Bucles dentro de bucles, sí

                    //Se pide por teclado un número entero por cada posición del
                    //array:
                    System.out.println("Introduce el entero nº " + i + ":");
                    rec[i] = entry.nextInt();

                }

                //Si todo sale bien, no habrá que insistir.
                ldMatiasPratz = false;
                
            }catch(InputMismatchException ime){//Si algo sale mal...
                //En caso de que se introduzca un caracter no numérico,
                //salta este error.
                System.out.println("Hay que introducir números");
                System.out.println("PERMÍTEME QUE INSISTA");
                ldMatiasPratz = true;//Hay que insistir
                entry.next();
                
            }
        
        }while(ldMatiasPratz);//La condición del bucle: Matias Pratz
        
    }
    
    public static int contadorPos(int [] rec){//Método para contar nºs positivos
        
        //Inicializamos a 0 el contador:
        int recuentoP = 0;
        
        for(int j = 0; j< rec.length; j++){//Hacemos un bucle
            
            if(rec[j] > 0){//Condición (el nº es positivo)
                
                recuentoP++;//Sumamos por cada nº positivo
                
            }
            
        }
        
        return recuentoP;//Devuelve el contador
        
    }
    
    public static int contadorNeg(int [] rec){//Método para contar nºs negativos
        
        //Inicializamos a 0 el contador:
        int recuentoN = 0;
        
        for(int k = 0; k< rec.length; k++){//Hacemos un bucle
            
            if(rec[k] < 0){//Condición (el nº es negativo)
                
                recuentoN++;//Sumamos por cada nº negativo
                
            }
            
        }
        
        return recuentoN;//Devuelve el contador
        
    }
    
    public static int contadorCeros(int [] rec){//Método para contar 0s
        
        //Inicializamos a 0 el contador:
        int recuento0 = 0;
        
        for(int o = 0; o< rec.length; o++){//Hacemos un bucle
            
            if(rec[o] == 0){//Condición (el nº es 0)
                
                recuento0++;//Sumamos por cada 0
                
            }
            
        }
        
        return recuento0;//Devuelve el contador
        
    }
    
    public static void mostrarArray(int [] rec){
        
        System.out.printf("Array: { ");
        
        for(int x = 0; x < rec.length; x++){
            
            if(x < (rec.length - 1)){
                
                System.out.printf(rec[x] + "; ");
                
            }else{
                
                System.out.printf(rec[x] + "");
                
            }
            
        }
        
        System.out.println("}");
        
    }
    
    public static void mediaPos(int [] rec){
        
        double medP;
        int totalP = 0;
        
        for(int jj = 0; jj< rec.length; jj++){
            
            if(rec[jj] > 0){
                
                totalP += rec[jj];
                
            }
            
        }
        
        medP = (double) totalP / contadorPos(rec);
        
        System.out.println("Media de nºs positivos = " + medP);
        
    }
    
    public static void mediaNeg(int [] rec){
        
        double medN;
        int totalN = 0;
        
        for(int kk = 0; kk< rec.length; kk++){
            
            if(rec[kk] < 0){
                
                totalN += rec[kk];
                
            }
            
        }
        
        medN = (double) totalN / contadorNeg(rec);
        
        System.out.println("Media de nºs positivos = " + medN);
        
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        int [] pipo = new int[10];
        
        insertarDatos(pipo);
        
        mostrarArray(pipo);
        
        System.out.println("Nºs positivos: " + contadorPos(pipo));
        System.out.println("Nºs negativos: " + contadorNeg(pipo));
        System.out.println("0s: " + contadorCeros(pipo));
        
        mediaPos(pipo);
        mediaNeg(pipo);
        
    }
    
}
