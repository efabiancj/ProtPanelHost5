package com.kapyasoft.prot_panel_host5.logica.funciones;

import acceso.AccesoDatos;
import acceso.ConjuntoResultado;
import acceso.Parametro;
import com.kapyasoft.prot_panel_host5.logica.clases.Dominio;
import java.sql.SQLException;
import java.util.ArrayList;


public class FDominios {

    public static ArrayList<Dominio> obtener_Todos_Dominios() throws Exception {
        ArrayList<Dominio> lst = new ArrayList<Dominio>();
        Dominio obj = null;
        ConjuntoResultado cres = null;
        String sql = " SELECT   id, nombre, aplicacion FROM public.dominio;";
        try {
            cres = AccesoDatos.ejecutaQuery(sql);
            while (cres.next()) {
                obj = new Dominio();
                obj.setId(cres.getInt("id"));
                obj.setNombre(cres.getString("nombre"));
                obj.setAplicacion(FAplicacions.obtener_Aplicacion_por_pk(cres.getInt("id")));
                lst.add(obj);
            }
        } catch (Exception ex) {
            throw new Exception("Error al ejecutar la sentencia en Obtener todos los Dominio");
        }
        return lst;
    }

    public static Dominio obtener_Dominio_por_pk(int id) throws Exception {
        ArrayList<Parametro> lstpar = new ArrayList<Parametro>();
        ConjuntoResultado cres = null;
        Dominio obj = null;
        String sql = " SELECT   id, nombre,aplicacion FROM public.dominio WHERE id=?;";
        lstpar.add(new Parametro(1, id));
        try {
            cres = AccesoDatos.ejecutaQuery(sql, lstpar);
            while (cres.next()) {
                obj = new Dominio();
                obj.setId(cres.getInt("id"));
                obj.setNombre(cres.getString("nombre"));
                obj.setAplicacion(FAplicacions.obtener_Aplicacion_por_pk(cres.getInt("id")));
            }
        } catch (Exception ex) {
            throw new Exception("Error al ejecutar la sentencia en buscar Dominio por pk;");
        }
        return obj;
    }

    public static ArrayList<Dominio> obtenerDominiopor_campo_id(int id) throws Exception {
        ArrayList<Parametro> lstpar = new ArrayList<Parametro>();
        ArrayList<Dominio> lst = new ArrayList<Dominio>();
        ConjuntoResultado cres = null;
        Dominio obj = null;
        String sql = " SELECT   id, nombre,aplicacion FROM public.dominio where id = ? ;";
        lstpar.add(new Parametro(1, id));
        try {
            cres = AccesoDatos.ejecutaQuery(sql, lstpar);
            while (cres.next()) {
                obj = new Dominio();
                obj.setId(cres.getInt("id"));
                obj.setNombre(cres.getString("nombre"));
                obj.setAplicacion(FAplicacions.obtener_Aplicacion_por_pk(cres.getInt("id")));
                lst.add(obj);
            }
        } catch (Exception ex) {
            throw new Exception("Error al ejecutar la sentencia en buscar Dominio por campotabla;");
        }
        return lst;
    }

    public static ArrayList<Dominio> obtenerDominiopor_campo_nombre(String nombre) throws Exception {
        ArrayList<Parametro> lstpar = new ArrayList<Parametro>();
        ArrayList<Dominio> lst = new ArrayList<Dominio>();
        ConjuntoResultado cres = null;
        Dominio obj = null;
        String sql = " SELECT   id, nombre,aplicacion FROM public.dominio where nombre = ? ;";
        lstpar.add(new Parametro(1, nombre));
        try {
            cres = AccesoDatos.ejecutaQuery(sql, lstpar);
            while (cres.next()) {
                obj = new Dominio();
                obj.setId(cres.getInt("id"));
                obj.setNombre(cres.getString("nombre"));
                obj.setAplicacion(FAplicacions.obtener_Aplicacion_por_pk(cres.getInt("id")));
                lst.add(obj);
            }
        } catch (Exception ex) {
            throw new Exception("Error al ejecutar la sentencia en buscar Dominio por campotabla;");
        }
        return lst;
    }

    public static boolean ingresar(Dominio dominio) throws Exception {
        ArrayList<Parametro> lstpar = new ArrayList<Parametro>();
        ConjuntoResultado cres = null;
        boolean eje = false;
        String sql = "INSERT INTO public.dominio(id,nombre,aplicacion) VALUES (?,?,?) ;";
        lstpar.add(new Parametro(1, dominio.getId()));
        lstpar.add(new Parametro(2, dominio.getNombre()));
        lstpar.add(new Parametro(3, dominio.getAplicacion().getId()));
        try {
            eje = AccesoDatos.ejecutaComando1(sql, lstpar);
           
        } catch (Exception ex) {
            throw new Exception("Error al ejecutar la sentencia en ingresar Dominio ");
        }
        return eje;
    }

    public static boolean actualizar(Dominio dominio) throws Exception {
        ArrayList<Parametro> lstpar = new ArrayList<Parametro>();
        ConjuntoResultado cres = null;
        boolean eje = false;
//String sql = "UPDATE public.dominio SET (id = ?,nombre = ?) WHERE (int ;";
        String sql = "SELECT * FROM public.fa_actualizar_dominio(?,?,?);";
        lstpar.add(new Parametro(1, dominio.getId()));
        lstpar.add(new Parametro(2, dominio.getNombre()));
        lstpar.add(new Parametro(3, dominio.getAplicacion().getId()));
        try {
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstpar);
            while (rs.next()) {
                if (rs.getString(0).equals("true"));
                eje = true;
            }
        } catch (Exception ex) {
            throw new Exception("Error al ejecutar la sentencia en actualizar Dominio ");
        }
        return eje;
    }

    public static boolean eliminar(Dominio dominio) throws Exception {
        ArrayList<Parametro> lstpar = new ArrayList<Parametro>();
        boolean eje = false;
//String sql = "DELETE FROM public.dominio  WHERE  ;";
        String sql = "SELECT * FROM public.fa_eliminar_dominio(?);";
        lstpar.add(new Parametro(1, dominio.getId()));
        try {
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstpar);
            while (rs.next()) {
                if (rs.getString(0).equals("true"));
                eje = true;
            }
        } catch (Exception ex) {
            throw new Exception("Error al ejecutar la sentencia en eliminar Dominio ");
        }
        return eje;
    }
}
