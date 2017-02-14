package com.kapyasoft.prot_panel_host5.logica.funciones;

import acceso.AccesoDatos;
import acceso.ConjuntoResultado;
import acceso.Parametro;
import com.kapyasoft.prot_panel_host5.logica.clases.Ciudad;
import java.sql.SQLException;
import java.util.ArrayList;


public class FCiudads {

    public static ArrayList<Ciudad> obtener_Todos_Ciudads() throws Exception {
        ArrayList<Ciudad> lst = new ArrayList<Ciudad>();
        Ciudad obj = null;
        ConjuntoResultado cres = null;
        String sql = " SELECT   id, nombre FROM public.ciudad;";
        try {
            cres = AccesoDatos.ejecutaQuery(sql);
            while (cres.next()) {
                obj = new Ciudad();
                obj.setId(cres.getInt("id"));
                obj.setNombre(cres.getString("nombre"));
                lst.add(obj);
            }
        } catch (Exception ex) {
            throw new Exception("Error al ejecutar la sentencia en Obtener todos los Ciudad");
        }
        return lst;
    }

    public static Ciudad obtener_Ciudad_por_pk(int id) throws Exception {
        ArrayList<Parametro> lstpar = new ArrayList<Parametro>();
        ConjuntoResultado cres = null;
        Ciudad obj = null;
        String sql = " SELECT   id, nombre FROM public.ciudad where id=?;";
        try {
            lstpar.add(new Parametro(1,id));
            cres = AccesoDatos.ejecutaQuery(sql, lstpar);
            while (cres.next()) {
                obj = new Ciudad();
                obj.setId(cres.getInt("id"));
                obj.setNombre(cres.getString("nombre"));
            }
        } catch (Exception ex) {
            throw new Exception("Error al ejecutar la sentencia en buscar Ciudad por pk;");
        }
        return obj;
    }

    public static ArrayList<Ciudad> obtenerCiudadpor_campo_id(int id) throws Exception {
        ArrayList<Parametro> lstpar = new ArrayList<Parametro>();
        ArrayList<Ciudad> lst = new ArrayList<Ciudad>();
        ConjuntoResultado cres = null;
        Ciudad obj = null;
        String sql = " SELECT   id, nombre FROM public.ciudad where id = ? ;";
        lstpar.add(new Parametro(1, id));
        try {
            cres = AccesoDatos.ejecutaQuery(sql, lstpar);
            while (cres.next()) {
                obj = new Ciudad();
                obj.setId(cres.getInt("id"));
                obj.setNombre(cres.getString("nombre"));
                lst.add(obj);
            }
        } catch (Exception ex) {
            throw new Exception("Error al ejecutar la sentencia en buscar Ciudad por campotabla;");
        }
        return lst;
    }

    public static ArrayList<Ciudad> obtenerCiudadpor_campo_nombre(String nombre) throws Exception {
        ArrayList<Parametro> lstpar = new ArrayList<Parametro>();
        ArrayList<Ciudad> lst = new ArrayList<Ciudad>();
        ConjuntoResultado cres = null;
        Ciudad obj = null;
        String sql = " SELECT   id, nombre FROM public.ciudad where nombre = ? ;";
        lstpar.add(new Parametro(1, nombre));
        try {
            cres = AccesoDatos.ejecutaQuery(sql, lstpar);
            while (cres.next()) {
                obj = new Ciudad();
                obj.setId(cres.getInt("id"));
                obj.setNombre(cres.getString("nombre"));
                lst.add(obj);
            }
        } catch (Exception ex) {
            throw new Exception("Error al ejecutar la sentencia en buscar Ciudad por campotabla;");
        }
        return lst;
    }

    public static boolean ingresar(Ciudad ciudad) throws Exception {
        ArrayList<Parametro> lstpar = new ArrayList<Parametro>();
        ConjuntoResultado cres = null;
        boolean eje = false;
        String sql = "INSERT INTO public.ciudad((id,nombre)) VALUES ((??) ;";
        lstpar.add(new Parametro(1, ciudad.getId()));
        lstpar.add(new Parametro(1, ciudad.getNombre()));
        try {
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstpar);
            while (rs.next()) {
                if (rs.getString(0).equals("true"));
                eje = true;
            }
        } catch (Exception ex) {
            throw new Exception("Error al ejecutar la sentencia en ingresar Ciudad ");
        }
        return eje;
    }

    public static boolean actualizar(Ciudad ciudad) throws Exception {
        ArrayList<Parametro> lstpar = new ArrayList<Parametro>();
        ConjuntoResultado cres = null;
        boolean eje = false;
//String sql = "UPDATE public.ciudad SET (id = ?,nombre = ?) WHERE (int ;";
        String sql = "SELECT * FROM public.fa_actualizar_ciudad(?,?);";
        lstpar.add(new Parametro(1, ciudad.getId()));
        lstpar.add(new Parametro(1, ciudad.getNombre()));
        try {
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstpar);
            while (rs.next()) {
                if (rs.getString(0).equals("true"));
                eje = true;
            }
        } catch (Exception ex) {
            throw new Exception("Error al ejecutar la sentencia en actualizar Ciudad ");
        }
        return eje;
    }

    public static boolean eliminar(Ciudad ciudad) throws Exception {
        ArrayList<Parametro> lstpar = new ArrayList<Parametro>();
        boolean eje = false;
//String sql = "DELETE FROM public.ciudad  WHERE  ;";
        String sql = "SELECT * FROM public.fa_eliminar_ciudad(?);";
        lstpar.add(new Parametro(1, ciudad.getId()));
        try {
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstpar);
            while (rs.next()) {
                if (rs.getString(0).equals("true"));
                eje = true;
            }
        } catch (Exception ex) {
            throw new Exception("Error al ejecutar la sentencia en eliminar Ciudad ");
        }
        return eje;
    }
}
