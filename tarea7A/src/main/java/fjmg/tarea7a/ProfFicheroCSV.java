package fjmg.tarea7a;

import java.io.BufferedWriter;
import java.util.*;
import java.io.FileNotFoundException;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;

/**
 *
 * @author JCarlos
 *
 */
public class LeerFicheroCSV {

    public static void main(String[] args) {

        // Fichero a leer con datos de ejemplo
        String idFichero = "RelPerCen.csv";
        String idFicheroNew = "profesoresPorDepartamento.csv";

        // Variables para guardar los datos que se van leyendo
        String[] tokens;
        String linea;
        SortedMap<String, Profesor> profesores = new TreeMap<>();
        //ArrayList <Profesor> profesores = new ArrayList<>();
        Profesor plantilla = new Profesor();
        String[] aux;
        int contador = 0;
        

        System.out.println("Leyendo el fichero: " + idFichero);

        // Inicialización del flujo "datosFichero" en función del archivo llamado "idFichero"
        // Estructura try-with-resources. Permite cerrar los recursos una vez finalizadas
        // las operaciones con el archivo
        try (Scanner datosFichero = new Scanner(new File(idFichero), "ISO-8859-3")) {
            // hasNextLine devuelve true mientras haya líneas por leer
            while (datosFichero.hasNextLine()) {
                // Guarda la línea completa en un String
                linea = datosFichero.nextLine();
                // Se guarda en el array de String cada elemento de la
                // línea en función del carácter separador de campos del fichero CSV
                tokens = linea.split(",");
                for (String string : tokens) {
                    System.out.print(string + "\t");
                }
                System.out.println();
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
        
        try (Scanner datosFichero = new Scanner(new File(idFichero), "ISO-8859-3")) {
            // hasNextLine devuelve true mientras haya líneas por leer
            datosFichero.nextLine();
            while (datosFichero.hasNextLine()) {
                // Guarda la línea completa en un String                
                linea = datosFichero.nextLine();
                // Se guarda en el array de String cada elemento de la
                // línea en función del carácter separador de campos del fichero CSV
                tokens = linea.split(",");
                for (String string : tokens) {
                    
                    switch(contador){
                        
                        case 0:
                            plantilla.setNombre(string);
                            break;
                        
                        case 1:
                            plantilla.setApellidos(string);
                            break;
                        
                        case 2:
                            plantilla.setDni(string);
                            break;
                        
                        case 3:
                            plantilla.setPuesto(string);
                            break;
                        
                        case 4:
                            plantilla.setFechaIni(string);
                            break;
                            
                        case 5:
                            plantilla.setFechaCese(string);
                            break;
                            
                        case 6:
                            plantilla.setTelefono(string);
                            break;
                            
                        case 7:
                            if(string.equals("Sí")){
                                
                                plantilla.setEvaluador(true);
                                
                            }else{
                                
                                plantilla.setEvaluador(false);
                                
                            }
                            break;
                        
                    }
                    
                    contador++;
                    
                    System.out.print(string + "\t");
                }                
                profesores.put(plantilla.getDni(), plantilla);
                plantilla = new Profesor();
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
                
        //Collections.sort(profesores, (Profesor p1,Profesor p2)->p1.getDni().compareTo(p2.getDni()));
        
        try ( BufferedWriter flujo = new BufferedWriter(new FileWriter(idFicheroNew))) {

            flujo.write("Empleado/a\",\"DNI/Pasaporte\",\"Puesto\",\"Fecha de toma de posesión\",\"Fecha de cese\",\"Teléfono\",\"Evaluador\",\"Coordinador");
            flujo.newLine();
            
//            profesores.forEach((clave, valor) -> System.out.println("Clave " +
//                clave + " -- Objeto " + valor));
            
            for(String key : profesores.keySet()){
                                               
                //Escribe el valor de linea:
                flujo.write(profesores.get(key).toString());
                // Metodo newLine() añade línea en blanco
                flujo.newLine();
                
            }
            // Metodo flush() guarda cambios en disco 
            flujo.flush();

        } catch (IOException e) {
            
            System.out.println(e.getMessage());
            
        }
        
    }
}
