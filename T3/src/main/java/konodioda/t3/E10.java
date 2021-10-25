/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package konodioda.t3;

/**
 *
 * @author fco-j
 */
public class E10 {

    public static void main(String args[]) {
        int variable = 3, variable2;
        switch (variable) {
            //Dado que variable es dado el valor 3, variable2 valdrá 30 (case 3)
            //...
            case 1:
                variable2 = 5;
                System.out.println("variable2 = " + variable2);
                break;
            case 2:
                variable2 = 20;
                System.out.println("variable2 = " + variable2);
                break;
            case 3:
                variable2 = 30;
                System.out.println("variable2 = " + variable2);
                break;//Ahora que hay un break, acaba el switch y variable2
            //se mantiene en 30
            case 4:
                variable2 = 10;
                System.out.println("variable2 = " + variable2);
                break;
            default:
                variable2 = 100;
                System.out.println("variable2 = " + variable2);
                break;

        }

    }

}
