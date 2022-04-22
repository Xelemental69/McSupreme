package fjmg.tarea7a;

import java.io.BufferedWriter;
import java.util.*;
import java.io.FileNotFoundException;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;

/**
 *
 * @author JCarlos
 *
 */
public class ProfFicheroCSV {

    public static void main(String[] args) {

        // Fichero a leer con datos de ejemplo
        String idFichero = "RelPerCen.csv";
        String idFicheroNew = "profesoresPorDepartamento.csv";
        String idFichero100plus = "profesoresmasde100dias.csv";

        // Variables para guardar los datos que se van leyendo
        String[] tokens;
        String linea;
        SortedMap<String, Profesor> profesores = new TreeMap<>();
        ArrayList<Profesor> profesores100plus = new ArrayList<>();
        ArrayList<Profesor> empleados = new ArrayList<>();
        Profesor plantilla = new Profesor();//Lo usaremos para pasar los datos
        int contador = 0;//Nos ayudará a pasar los datos
        int tmp = 0;//Nos ayudará a ordenar los datos del Map
        LocalDate fecini, fecfin;//Paa la comparación de días

        System.out.println("Leyendo el fichero: " + idFichero);

        // Inicialización del flujo "datosFichero" en función del archivo llamado "idFichero"
        // Estructura try-with-resources. Permite cerrar los recursos una vez finalizadas
        // las operaciones con el archivo
        try ( Scanner datosFichero = new Scanner(new File(idFichero), "ISO-8859-3")) {
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

        try ( Scanner datosFichero = new Scanner(new File(idFichero), "ISO-8859-3")) {
            // hasNextLine devuelve true mientras haya líneas por leer
            if (datosFichero.hasNextLine()) {
                datosFichero.nextLine();//Saltamos la primera línea:
                System.out.println("Leyendo el fichero hacia el map...");
            }
            while (datosFichero.hasNextLine()) {
                // Guarda la línea completa en un String                
                linea = datosFichero.nextLine();
                // Se guarda en el array de String cada elemento de la
                // línea en función del carácter separador de campos del fichero CSV
                tokens = linea.split(",");//Cáracter separador
                for (String string : tokens) {
                    //System.out.println("contador: " + contador);
                    switch (contador) {//Dependiendo del valor de contador, se añadirá
                        //el contenido de string en el atributo correspondiente:

                        case 0:
                            plantilla.setApellidos(string);
                            //System.out.println("nombre recibido");
                            break;

                        case 1:
                            plantilla.setNombre(string);
                            //System.out.println("apellido recibido");
                            break;

                        case 2:
                            plantilla.setDni(string);
                            //System.out.println("dni recibido");
                            break;

                        case 3:
                            plantilla.setPuesto(string);
                            //System.out.println("puesto recibido");
                            break;

                        case 4:
                            plantilla.setFechaIni(string);
                            //System.out.println("fecini recibido");
                            break;

                        case 5:
                            plantilla.setFechaCese(string);
                            //System.out.println("fecfin recibido");
                            break;

                        case 6:
                            plantilla.setTelefono(string);
                            //System.out.println("telefono recibido");
                            break;

                        case 7:
                            if (string.equals("\"Sí\"")) {//Recoge el sí junto a sus comillas

                                plantilla.setEvaluador(true);

                            } else {

                                plantilla.setEvaluador(false);

                            }
                            //System.out.println("eval recibido");
                            break;

                        case 8:
                            if (string.equals("\"Sí\"")) {//Recoge el sí junto a sus comillas

                                plantilla.setCoordinador(true);

                            } else {

                                plantilla.setCoordinador(false);

                            }
                            //System.out.println("coord recibido");
                            break;

                    }

                    contador++;
                    tmp++;
                }
                profesores.put(plantilla.getPuesto() + tmp, plantilla);
                plantilla = new Profesor();
                contador = 0;
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }

        for (String key : profesores.keySet()) {
            System.out.println(profesores.get(key).toString());
        }

        try ( BufferedWriter flujo = new BufferedWriter(new FileWriter(idFicheroNew))) {

            System.out.println("Generando el fichero...");
            //Imprimimos las categorías primero:
            flujo.write("Empleado/a\tDNI/Pasaporte\tPuesto\tFecha de toma de posesión\tFecha de cese\tTeléfono\tEvaluador\tCoordinador");
            flujo.newLine();

            for (String key : profesores.keySet()) {

                //Escribe el valor del elemento del map (su toString()):
                flujo.write(profesores.get(key).toString());
                // Metodo newLine() añade línea en blanco
                flujo.newLine();

            }
            // Metodo flush() guarda cambios en disco 
            flujo.flush();

        } catch (IOException e) {

            System.out.println(e.getMessage());

        }

        //Saca y comprueba las fechas (100+ días):
        for (String key : profesores.keySet()) {

            //Mete los strings en tokens, separándolos por el caracter "/":           
            tokens = profesores.get(key).getFechaIni().split("/");

            //Para poder usarlo como fecha inicial, quitamos las comillas de los strings:
            fecini = LocalDate.of(Integer.parseInt(tokens[2].replace("\"", "")),
                    Integer.parseInt(tokens[1]),
                    Integer.parseInt(tokens[0].replace("\"", "")));

            //Procederá a recoger la fecha si contiene el separador
            //(en caso contrario, es que está vacío):
            if (profesores.get(key).getFechaCese().contains("/")) {

                //Mete los strings en tokens, separándolos por el caracter "/":
                tokens = profesores.get(key).getFechaCese().split("/");

                //Para poder usarlo como fecha inicial, quitamos las comillas de los strings:
                fecfin = LocalDate.of(Integer.parseInt(tokens[2].replace("\"", "")),
                        Integer.parseInt(tokens[1]),
                        Integer.parseInt(tokens[0].replace("\"", "")));

                //En caso de que la fecha de cese no esté en vacío, comprobamos si la
                //diferencia entre ambas fechas es de más de 100 días:
                if (ChronoUnit.DAYS.between(fecini, fecfin) > 100) {

                    //Si se cumple la condición, agregamos la clase al ArrayList "profesores100plus"
                    profesores100plus.add(profesores.get(key));

                }

            }

            for (Profesor p : profesores100plus) {

                System.out.println(p.toString());

            }

        }

        //Imprimimos el ArrayList en un fichero nuevo, con cada línea por clase y usando el toString:
        try ( BufferedWriter flujo = new BufferedWriter(new FileWriter(idFichero100plus))) {

            System.out.println("Generando el fichero...");
            //Imprimimos las categorías primero:
            flujo.write("Empleado/a\tDNI/Pasaporte\tPuesto\tFecha de toma de posesión\tFecha de cese\tTeléfono\tEvaluador\tCoordinador");
            flujo.newLine();

            for (Profesor p : profesores100plus) {

                //Escribe el valor del elemento del map (su toString()):
                flujo.write(p.toString());
                // Metodo newLine() añade línea en blanco
                flujo.newLine();

            }
            // Metodo flush() guarda cambios en disco 
            flujo.flush();

        } catch (IOException e) {

            System.out.println(e.getMessage());

        }

/*--------------------------------------------------------------------------*/
        //Ahora, los usos de la clase Utils:
        
        //Primero, depositamos todos los valores del map en la lista creada:
        for (String key : profesores.keySet()) {

            empleados.add(profesores.get(key));

        }

        //Usamos el método de comprobación de letras:
        System.out.println("¿Hay algún empleado\n con una X en su DNI? --> "
                + Utils.comprobarLetra(empleados, 'X'));
        System.out.println("¿Hay algún empleado\n con una U en su DNI? --> "
                + Utils.comprobarLetra(empleados, 'U'));

        //Usamos el método para contar Coordinadores:
        System.out.println("De todos los empleados, "
                + Utils.numCoordinadores(empleados) + " son coordinadores.");

        //Usamos el método para devolver una lista con los empleados con una
        //letra específica en su DNI:
        System.out.println("Los profesores con la letra Z en su DNI son:");

        for (Profesor p : Utils.coincideLetra(empleados, 'Z')) {

            System.out.println(p.toString());

        }

        //Usamos el método para devolver una lista con los empleados que se
        //unieron en una fecha determinada:
        System.out.println("Los profesores que se unieron el 1/9/2020 son:");

        for (Profesor p : Utils.coincideFecha(empleados,
                LocalDate.of(2020, 9, 1))) {

            System.out.println(p.toString());

        }

    }
}
