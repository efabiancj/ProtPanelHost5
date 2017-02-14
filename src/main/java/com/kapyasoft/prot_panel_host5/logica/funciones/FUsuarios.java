package com.kapyasoft.prot_panel_host5.logica.funciones;

import acceso.AccesoDatos;
import acceso.ConjuntoResultado;
import acceso.Parametro;
import com.kapyasoft.prot_panel_host5.logica.clases.Usuario;

import java.util.ArrayList;


public class FUsuarios {

    public static ArrayList<Usuario> obtener_Todos_Usuarios() throws Exception {
        ArrayList<Usuario> lst = null;
        return lst;
    }

    public static Usuario obtener_Usuario_por_email(String email) throws Exception {
        Usuario obj = null;
        return obj;
    }

    public static Usuario obtener_Usuario_por_pk(int id) throws Exception {
         Usuario obj = null;
        return obj;
    }

    public static ArrayList<Usuario> obtenerUsuariopor_campo_nombres(String nombres) throws Exception {
      
        ArrayList<Usuario> lst = null;
        
        return lst;
    }

    public static ArrayList<Usuario> obtenerUsuariopor_campo_apellidos(String apellidos) throws Exception {

        ArrayList<Usuario> lst = new ArrayList<Usuario>();
        return lst;
    }

    public static ArrayList<Usuario> obtenerUsuariopor_campo_direccion(String direccion) throws Exception {
        ArrayList<Usuario> lst =null;
        return lst;
    }

    public static ArrayList<Usuario> obtenerUsuariopor_campo_telefono(String telefono) throws Exception {
  
        ArrayList<Usuario> lst = null;
        
        return lst;
    }

    public static ArrayList<Usuario> obtenerUsuariopor_campo_email(String email) throws Exception {
        
        ArrayList<Usuario> lst = null;
        
        return lst;
    }

    public static ArrayList<Usuario> obtenerUsuariopor_campo_clave(String clave) throws Exception {
    
        ArrayList<Usuario> lst = null;
       
        return lst;
    }

    public static ArrayList<Usuario> obtenerUsuariopor_campo_grupo(int grupo) throws Exception {
       
        ArrayList<Usuario> lst = new ArrayList<Usuario>();
 
        return lst;
    }

    public static ArrayList<Usuario> obtenerUsuariopor_campo_id(int id) throws Exception {

        ArrayList<Usuario> lst = null;
        
        return lst;
    }

    public static ArrayList<Usuario> obtenerUsuariopor_campo_directorio_virtual(String directorio_virtual) throws Exception {
        
        ArrayList<Usuario> lst = null;
       
        return lst;
    }

    public static ArrayList<Usuario> obtenerUsuariopor_campo_ciudad(int ciudad) throws Exception {
   
        ArrayList<Usuario> lst = null;
         
        return lst;
    }

    public static ArrayList<Usuario> obtenerUsuariopor_campo_estado(char estado) throws Exception {

        ArrayList<Usuario> lst = new ArrayList<Usuario>();

        return lst;
    }

    public static boolean ingresar(Usuario usuario) throws Exception {

        boolean eje = false;
        
        return eje;
    }

    public static boolean actualizar(Usuario usuario) throws Exception {
        
        boolean eje = false;
        return eje;
    }

     public static int obtenerultimo() throws Exception 
    {
        
        int res=0;
        
        return res;
    }
}
