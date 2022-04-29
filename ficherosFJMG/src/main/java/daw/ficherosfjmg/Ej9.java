/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daw.ficherosfjmg;

/**
 *
 * @author fcoj
 */
import java.util.*;
import vugas.*;
import java.io.*;

public class Ej9 {

    public static void main(String[] args) {

        ArrayList<Vehiculo> vehiculos = lectura();

        escritura(vehiculos);

    }

    public static void escritura(ArrayList<Vehiculo> vehiculos) {
        ArrayList<Vehiculo> turismos = new ArrayList<>();
        ArrayList<Vehiculo> furgonetas = new ArrayList<>();
        ArrayList<Vehiculo> deportivos = new ArrayList<>();

        vehiculos.forEach(vehiculo -> {
            
            if (vehiculo instanceof Turismo) {
                
                turismos.add((Turismo) vehiculo);
                
            } else if (vehiculo instanceof Deportivo) {
                
                deportivos.add((Deportivo) vehiculo);
                
            } else if (vehiculo instanceof Furgoneta) {
                
                furgonetas.add((Furgoneta) vehiculo);
                
            }
        });

        escribirFile(turismos, "Turismos.txt");
        escribirFile(furgonetas, "Furgonetas.txt");
        escribirFile(deportivos, "Deportivos.txt");
    }

    private static void escribirFile(ArrayList<Vehiculo> vehiculos, String nombre) {
        try ( BufferedWriter bw = new BufferedWriter(new FileWriter(nombre))) {
            
            for (Vehiculo vehiculo : vehiculos) {
                
                bw.write(vehiculo.getAtributos());
                bw.newLine();
                
            }
            bw.flush();
            
        } catch (IOException e) {
            
            throw new RuntimeException(e);
            
        }
    }

    public static ArrayList<Vehiculo> lectura() {
        ArrayList<Vehiculo> vehiculos = new ArrayList<>();

        //Ruta
        String ruta = "vehiculos.txt";

        //Lectura
        try ( Scanner sc = new Scanner(new FileReader(ruta))) {
            
            while (sc.hasNextLine()) {
                
                String linea = sc.nextLine();
                String[] parts = linea.substring(2).split(":");

                if(linea.charAt(0)=='0'){ //Turismo
                                                            
                    Turismo turismo = new Turismo();
                    turismo.setMatricula(parts[0]);
                    turismo.setKilometros(Double.parseDouble(parts[1]));
                    turismo.setBastidor(Long.parseLong(parts[2]));
                    turismo.setMarca(parts[3]);
                    turismo.setModelo(parts[4]);
                    turismo.setColor(parts[5]);
                    turismo.setTarifa(Double.parseDouble(parts[8]));
                    turismo.setNumeroPuertas(Integer.parseInt(parts[6]));
                    turismo.setDisponible(Boolean.parseBoolean(parts[9]));
                    turismo.setMarchaAutomatica(Boolean.parseBoolean(parts[7]));
                    turismo.setColorChapa(parts[10]);
                    vehiculos.add(turismo);

                }else if(linea.charAt(0)=='1'){//Deportivo
                    
                    Deportivo deportivo = new Deportivo();
                    deportivo.setMatricula(parts[0]);
                    deportivo.setKilometros(Double.parseDouble(parts[1]));
                    deportivo.setBastidor(Long.parseLong(parts[2]));
                    deportivo.setMarca(parts[3]);
                    deportivo.setModelo(parts[4]);
                    deportivo.setColor(parts[5]);
                    deportivo.setTarifa(Double.parseDouble(parts[8]));
                    deportivo.setNumeroPuertas(Integer.parseInt(parts[6]));
                    deportivo.setDisponible(Boolean.parseBoolean(parts[9]));
                    deportivo.setMarchaAutomatica(Boolean.parseBoolean(parts[7]));
                    deportivo.setCilindrada(Integer.parseInt(parts[10]));
                    vehiculos.add(deportivo);
                    
                }else{//Furgoneta
                                        
                    Furgoneta furgoneta = new Furgoneta();
                    furgoneta.setMatricula(parts[0]);
                    furgoneta.setKilometros(Double.parseDouble(parts[1]));
                    furgoneta.setBastidor(Long.parseLong(parts[2]));
                    furgoneta.setMarca(parts[3]);
                    furgoneta.setModelo(parts[4]);
                    furgoneta.setColor(parts[5]);
                    furgoneta.setTarifa(Double.parseDouble(parts[8]));
                    furgoneta.setNumeroPuertas(Integer.parseInt(parts[6]));
                    furgoneta.setDisponible(Boolean.parseBoolean(parts[9]));
                    furgoneta.setMarchaAutomatica(Boolean.parseBoolean(parts[7]));
                    furgoneta.setCarga(Integer.parseInt(parts[10]));
                    furgoneta.setVolumen(Integer.parseInt(parts[11]));
                    vehiculos.add(furgoneta);
                }
            }

        } catch (FileNotFoundException e) {
            
            e.printStackTrace();
            
        }

        return vehiculos;
    }

}
