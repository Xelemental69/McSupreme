/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej12;

/**
 *
 * @author pikac
 */
import ej11.*;
import javax.xml.bind.*;
import java.io.File;
import java.util.*;

public class LeerFichero {

    public static List<App> lecturaFicheroXML(String nombreFichero) {
        
        List<App> appList = new ArrayList<>();
        
        try {
            
            // Crea el contexto JAXB
            JAXBContext contexto = JAXBContext.newInstance(Apps.class);

            // Crea el objeto Unmarshaller
            Unmarshaller um = contexto.createUnmarshaller();

            // Llama al método de unmarshalling, extrayendo los datos de la clase
            Apps apps = (Apps) um.unmarshal(new File(nombreFichero));
            appList.addAll(apps.getAppList());
            
        } catch (JAXBException e) {
            
            e.printStackTrace();
            
        }

        return appList;
        
    }

}
