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
import javax.xml.bind.annotation.*;
import java.util.*;

//Ajustamos las anotaciones que tendrá la lista en XML:
@XmlRootElement(name = "apps")
@XmlAccessorType(XmlAccessType.FIELD)
public class Apps {//Lista de aplicaciones
    
    //Ajustamos las anotaciones que tendrá cada app en XML:
    @XmlElement(name = "app",type = App.class)
    private List<App> appList = new ArrayList<>();

    public Apps(List<App> appList) {//Constructor parametrizado
        
        this.appList = appList;
        
    }

    public Apps() {//Constructor por defecto
    }

    public List<App> getAppList() {
        
        return appList;
    
    }

    public void setAppList(List<App> appList) {
    
        this.appList = appList;
    
    }
}
