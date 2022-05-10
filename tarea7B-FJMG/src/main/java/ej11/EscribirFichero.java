/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej11;

/**
 *
 * @author pikac
 */
import com.fasterxml.jackson.databind.*;
import org.w3c.dom.ls.LSOutput;
import javax.xml.bind.*;
import java.io.*;
import java.util.*;

public class EscribirFichero {
    
    public static void escribirFichero(String nombreFichero, List<App> datos){
        
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(nombreFichero))) {
            
            for (App app : datos) {//Escribimos cada app por su toString() (1 por línea):
                
                bw.write(app.toString());
                bw.newLine();
                
            }
            
            bw.flush();//Forzamos el guardado de todo lo escrito
            
        } catch (IOException e) {
            
            e.printStackTrace();
            
        }
    }

    public static void escribirFicheroJSON(String nombre, List<App> datos){
        
        ObjectMapper mappeator = new ObjectMapper();

        mappeator.configure(SerializationFeature.INDENT_OUTPUT,true);

        try {
            
            mappeator.writeValue(new File(nombre),datos);
            
        } catch (IOException e) {
            
            e.printStackTrace();
        
        }
    }

    public static void escribirFicheroXML(String nombre, List<App> datos){
        
        Apps listaApps = new Apps();
        listaApps.setAppList(datos);
        
        try {
            
            JAXBContext jaxbContext = JAXBContext.newInstance(Apps.class);
            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

            //Con el Marshaller, lo escrito será puesto en XML directamente:
            jaxbMarshaller.marshal(listaApps, new File(nombre));


        } catch (JAXBException e) {
            
            e.printStackTrace();
            
        }
    }
}
