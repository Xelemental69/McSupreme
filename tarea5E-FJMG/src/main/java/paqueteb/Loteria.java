/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paqueteb;

import java.util.*;

/**
 *
 * @author Xelemental
 */
public class Loteria {

    private Map<String, String> cupon;

    public Loteria() {//Declaramos el Map (como TreeMap)

        cupon = new TreeMap<>();

    }

    public void anadirCupon(String numLot, String premio) {
        //Método para añadir cupones:

        cupon.put(numLot, premio);

    }

    public void borrarCupon(String numLot, String premio) {
        //Método para añadir cupones:

        cupon.remove(numLot, premio);

    }

    public Map<String, String> getCupon() {
        

        return cupon;

    }

    public String consultarPremio(String cupon) {
        //Método para consultar el premio del cupón 

        if (this.cupon.containsKey(cupon)) {

            return this.cupon.getOrDefault(cupon, "No hay premio");

        } else {

            return "No se ha encontrado nada";

        }

    }

}
