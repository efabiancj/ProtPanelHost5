package com.kapyasoft.prot_panel_host5.logica.funciones;

import acceso.AccesoDatos;
import acceso.ConjuntoResultado;
import acceso.Parametro;
import com.kapyasoft.prot_panel_host5.logica.clases.Ciudad;
import java.sql.SQLException;
import java.util.ArrayList;

public class FCiudads {

    public static ArrayList<Ciudad> obtener_Todos_Ciudads() throws Exception {
        ArrayList<Ciudad> lst = null;
        
        return lst;
    }

    public static Ciudad obtener_Ciudad_por_pk(int id) throws Exception {

        Ciudad obj = null;
       
        return obj;
    }

    
    public static ArrayList<Ciudad> obtenerCiudadpor_campo_nombre(String nombre) throws Exception {
        ArrayList<Ciudad> lst = null;
        return lst;
    }

    public static boolean ingresar(Ciudad ciudad) throws Exception {
        
        boolean eje = false;
        
        return eje;
    }
}
