/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backend_java_json;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.ArrayList;
import clases.*;

public class Json {

    public ArrayList<User> stringToList(String json) throws JsonProcessingException {
        ObjectMapper mapeador = new ObjectMapper();

        ArrayList<User> catalogo = mapeador.readValue(json,
                mapeador.getTypeFactory().constructCollectionType(ArrayList.class, User.class));
        
        return catalogo;
    }
    
    public User stringToPojo(String json) throws JsonProcessingException {
        ObjectMapper mapeador = new ObjectMapper();

        User user = mapeador.readValue(json,User.class);
        
        return user;
    }
}
