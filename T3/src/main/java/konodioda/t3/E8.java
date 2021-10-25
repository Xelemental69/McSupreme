/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package konodioda.t3;

/**
 *
 * @author fco-j
 */
public class E8 {
    
    public static void main(String args[]){
      //Declara e inicializa una variable llamada departamento y le da una letra
      char departamento = 'B';

      switch(departamento)
      {
      //Si la letra es entre A y D, indica el departamento correspondiente
         case 'A' :
            System.out.println("Desarrollo");
            break;
         case 'B' :
    	System.out.println("Recursos Humanos");
            break;
         case 'C' :
            System.out.println("Finanzas");
            break;
         case 'D' :
            System.out.println("Mercadeo");
      //En caso contrario, salta error
         default :
            System.out.println("Departamento no válido");
      }
      //Muestra el valor de departamento:
      System.out.println("Código para el departamento es " + departamento);
   }

    
}
