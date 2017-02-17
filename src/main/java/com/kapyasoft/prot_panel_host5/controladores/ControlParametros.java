/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kapyasoft.prot_panel_host5.controladores;

import java.util.Map;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;

/**
 *
 * @author Edgar
 */
public class ControlParametros {
    
    String param;
    
    static public int recuperar_parametro_entero(String par)
    {
       FacesContext facesContext = FacesContext. getCurrentInstance();
       ExternalContext externalContext = facesContext.getExternalContext();
       Map params = externalContext.getRequestParameterMap();
       Integer categorySelected = new Integer((String) params.get(par));
       return categorySelected;
    }
    
    static public String recuperar_parametro_string(String par)
    {
       FacesContext facesContext = FacesContext. getCurrentInstance();
       ExternalContext externalContext = facesContext.getExternalContext();
       Map params = externalContext.getRequestParameterMap();
       String categorySelected = params.get(par).toString();
       return categorySelected;
    }
}
