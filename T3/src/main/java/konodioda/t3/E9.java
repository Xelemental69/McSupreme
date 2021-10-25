/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package konodioda.t3;

/**
 *
 * @author fco-j 
 * Es para DEBUG
 */
public class E9 {

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
                //No obstante, la carencia del break mueve hacia otro case...
                if (variable2 < 20) {
                    System.out.println("variable2 = " + variable2);
                } else {
                    System.out.println("variable2 pasa a ser  " + variable2);
                }
            case 4:
                //...pasando por aquí...
                variable2 = 10;
                if (variable2 < 20) {
                    System.out.println("variable2 = " + variable2);
                }
            default:
                //y terminando en default, siendo al final 100 el valor de
                //variable2
                variable2 = 100;
                if (variable2 > 20) {
                    System.out.println("variable2 = " + variable2);
                }
                break;

        }

    }

}
