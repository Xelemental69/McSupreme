/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ext15fjmg;

/**
 *
 * @author fco-j
 */
public class Teatro {
    
    private int fila;
    private int columna;
    private char[][] matrix;//Matriz, pero acaba en x, para hacer referencia a la película Matrix.

    public Teatro(int fila, int columna) {
        
        this.fila = fila;
        this.columna = columna;
        
        matrix = crearMatriz(fila, columna);
        
    }
    
    private char[][] crearMatriz(int x, int y){
        
        char[][] matriz = new char[x][y];
        
        for(int m = 0; m < x; m++){
            
            for(int n = 0; n < y; n++){
                
                if((m % 2 != 0) && (n % 2 != 0)){
                    
                    //Asiento libre si la fila y/o la columna es par.
                    matriz [m] [n] = 'L';
                    
                }else{
                    
                    //Reservado por coronavirus si la fila y/o la columna es par.
                    matriz [m] [n] = 'X';
                    
                }
                
            }
            
        }
        
        return matriz;
        
    }
    
    public void reservar(int fila, int columna){
        
        if(fila > 0 && columna > 0 && fila < this.fila && columna < this.columna){
            
            switch(matrix [fila] [columna]){
                
                case 'L':
                    
                    System.out.println("Asiento reservado con éxito.");
                    matrix [fila] [columna] = 'V';
                    break;
                    
                case 'V':
                    System.out.println("Lo sentimos, el asiento está vendido.");
                    break;
                    
                case 'X':
                    System.out.println("Por medidas de prevención de COVID,"
                            + " no podemos reservar el asiento solicitado");
                    break;
                
            }
            
        }else{
            
            System.out.println("ERROR. Se sale del rango.");
            
        }
        
    }
    
    public void cancelar(int fila, int columna){
        
        if(fila > 0 && columna > 0 && fila < this.fila && columna < this.columna){
            
            switch(matrix [fila] [columna]){
                
                case 'L':
                    
                    System.out.println("El asiento ya está libre.");
                    break;
                    
                case 'V':
                    System.out.println("Reserva cancelada con éxito.");
                    matrix [fila] [columna] = 'L';
                    break;
                    
                case 'X':
                    System.out.println("Por medidas de prevención de COVID,"
                            + " no podemos dejar libre el asiento solicitado");
                    break;
                
            }
            
        }else{
            
            System.out.println("ERROR. Se sale del rango.");
            
        }
        
    }
    
    public void mostrarEnPantalla(){
        
        System.out.println("La matriz resultante es la siguiente:");
        
        for (int m = 0; m < matrix.length; m++){
            
            for (int n = 0; n < matrix[m].length; n++){
                
                System.out.printf(matrix [m] [n] + " ");
                
            }
            
            System.out.println("");
            
        }
        
    }
    
}
