package com.kapyasoft.prot_panel_host5.logica.funciones;

import acceso.AccesoDatos;
import acceso.ConjuntoResultado;
import acceso.Global;
import acceso.Parametro;
import com.kapyasoft.prot_panel_host5.logica.clases.Bases_datos;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class FBases_datoss {

    public static ArrayList<Bases_datos> obtener_Todos_Bases_datoss() throws Exception {
        ArrayList<Bases_datos> lst = new ArrayList<Bases_datos>();
        Bases_datos obj = null;
        ConjuntoResultado cres = null;
        String sql = " SELECT   id, nombre, usuario,directorio FROM public.bases_datos;";
        try {
            cres = AccesoDatos.ejecutaQuery(sql);
            while (cres.next()) {
                obj = new Bases_datos();
                obj.setId(cres.getInt("id"));
                obj.setNombre(cres.getString("nombre"));
                obj.setUsuario(FUsuarios.obtener_Usuario_por_pk(cres.getInt("usuario")));
                obj.setDirectorio(cres.getString("directorio"));
                lst.add(obj);
            }
        } catch (Exception ex) {
            throw new Exception("Error al ejecutar la sentencia en Obtener todos los Bases_datos");
        }
        return lst;
    }

    public static Bases_datos obtener_Bases_datos_por_pk(int id) throws Exception {
        ArrayList<Parametro> lstpar = new ArrayList<Parametro>();
        ConjuntoResultado cres = null;
        Bases_datos obj = null;
        String sql = " SELECT   id, nombre, usuario,directorio FROM public.bases_datos;";
        try {
            cres = AccesoDatos.ejecutaQuery(sql, lstpar);
            while (cres.next()) {
                obj = new Bases_datos();
                obj.setId(cres.getInt("id"));
                obj.setNombre(cres.getString("nombre"));
                obj.setUsuario(FUsuarios.obtener_Usuario_por_pk(cres.getInt("usuario")));
                obj.setDirectorio(cres.getString("directorio"));
            }
        } catch (Exception ex) {
            throw new Exception("Error al ejecutar la sentencia en buscar Bases_datos por pk;");
        }
        return obj;
    }

    public static ArrayList<Bases_datos> obtenerBases_datospor_campo_id(int id) throws Exception {
        ArrayList<Parametro> lstpar = new ArrayList<Parametro>();
        ArrayList<Bases_datos> lst = new ArrayList<Bases_datos>();
        ConjuntoResultado cres = null;
        Bases_datos obj = null;
        String sql = " SELECT   id, nombre, usuario,directorio FROM public.bases_datos where id = ? ;";
        lstpar.add(new Parametro(1, id));
        try {
            cres = AccesoDatos.ejecutaQuery(sql, lstpar);
            while (cres.next()) {
                obj = new Bases_datos();
                obj.setId(cres.getInt("id"));
                obj.setNombre(cres.getString("nombre"));
                obj.setUsuario(FUsuarios.obtener_Usuario_por_pk(cres.getInt("usuario")));
                obj.setDirectorio(cres.getString("directorio"));
                lst.add(obj);
            }
        } catch (Exception ex) {
            throw new Exception("Error al ejecutar la sentencia en buscar Bases_datos por campotabla;");
        }
        return lst;
    }

    public static Bases_datos obtenerBases_datospor_campo_nombre(String nombre) throws Exception {
        ArrayList<Parametro> lstpar = new ArrayList<Parametro>();
        ConjuntoResultado cres = null;
        Bases_datos obj = null;
        String sql = " SELECT   id, nombre, usuario,directorio FROM public.bases_datos where nombre = ? ;";
        lstpar.add(new Parametro(1, nombre));
        try {
            cres = AccesoDatos.ejecutaQuery(sql, lstpar);
            while (cres.next()) {
                obj = new Bases_datos();
                obj.setId(cres.getInt("id"));
                obj.setNombre(cres.getString("nombre"));
                obj.setUsuario(FUsuarios.obtener_Usuario_por_pk(cres.getInt("usuario")));
                obj.setDirectorio(cres.getString("directorio"));
             }
        } catch (Exception ex) {
            throw new Exception("Error al ejecutar la sentencia en buscar Bases_datos por campo nmbre;");
        }
        return obj;
    }

    public static ArrayList<Bases_datos> obtenerBases_datospor_campo_usuario(int usuario) throws Exception {
        ArrayList<Parametro> lstpar = new ArrayList<Parametro>();
        ArrayList<Bases_datos> lst = new ArrayList<Bases_datos>();
        ConjuntoResultado cres = null;
        Bases_datos obj = null;
        String sql = " SELECT   id, nombre, usuario,directorio FROM public.bases_datos where usuario = ? ;";
        lstpar.add(new Parametro(1, usuario));
        try {
            cres = AccesoDatos.ejecutaQuery(sql, lstpar);
            while (cres.next()) {
                obj = new Bases_datos();
                obj.setId(cres.getInt("id"));
                obj.setNombre(cres.getString("nombre"));
                obj.setUsuario(FUsuarios.obtener_Usuario_por_pk(cres.getInt("usuario")));
                obj.setDirectorio(cres.getString("directorio"));
                lst.add(obj);
            }
        } catch (Exception ex) {
            throw new Exception("Error al ejecutar la sentencia en buscar Bases_datos por campotabla;");
        }
        return lst;
    }

    public static boolean ingresar(Bases_datos bases_datos) throws Exception {
        ArrayList<Parametro> lstpar = new ArrayList<Parametro>();
        ConjuntoResultado cres = null;
        boolean eje = false;
        String sql = "INSERT INTO public.bases_datos(id,nombre,usuario,directorio) VALUES (?,?,?,?) ;";
        lstpar.add(new Parametro(1, bases_datos.getId()));
        lstpar.add(new Parametro(2, bases_datos.getNombre()));
        lstpar.add(new Parametro(3, bases_datos.getUsuario().getId()));
        lstpar.add(new Parametro(4, bases_datos.getDirectorio()));
        try {
             eje = AccesoDatos.ejecutaComando1(sql, lstpar);
            
        } catch (Exception ex) {
            throw new Exception("Error al ejecutar la sentencia en ingresar Bases_datos "+ex.getMessage());
        }
        return eje;
    }
    
    
    
     
    public static boolean crear_usuario_base_datos_pg(String usuario, String clave) throws Exception
    {
        String sql = "CREATE USER "+usuario+" PASSWORD '"+clave+"';";
        boolean eje = false;

        try {
            eje = AccesoDatos.ejecutaComando(sql);
            
        } catch (Exception ex) {
            System.out.println("Error al ejecutar la sentencia en crear usuario bd pg " + ex.getMessage());
        }
        return eje;
    }
      
    public static boolean asignar_permisos_usario_crear_bd_pg(String usuario) throws Exception
    {
        String sql = "ALTER ROLE "+usuario+" CREATEDB";
        boolean eje = false;
        try {
            eje = AccesoDatos.ejecutaComando(sql);
            
        } catch (Exception ex) {
            throw new Exception("Error al ejecutar la sentencia en asignar permisos usr bd pg " + ex.getMessage());
        }
        return eje;
    }
     
     public static boolean crear_base_datos_pg(String nombre, String usuario) throws Exception
    {
        System.out.println("Creando bd pg...crear_base_datos_pg");
        String sql = "CREATE DATABASE "+nombre+" WITH OWNER "+usuario+";";
        boolean eje = false;
        try {
            eje = AccesoDatos.ejecutaComando(sql);
            
        } catch (Exception ex) {
            System.out.println(" Error creando bd pg...crear_base_datos_pg"+ex.getMessage()+" sql: "+sql);
            throw new Exception("Error al ejecutar la sentencia en crear basedatos pg " + ex.getMessage());
        }
        return eje;
    }
     
    public static boolean restaurar_archivo_sql_sql_pg(String archivo,String usuario,String clave,String db,String host) throws Exception
    {
        String sql = "psql -U "+usuario+" -P "+clave+" -d "+db+" -h "+host+" -f "+archivo;
        ArrayList<Parametro> lstpar = new ArrayList<Parametro>();
        boolean eje = false;
        try {
            eje = AccesoDatos.ejecutaComando1(sql, lstpar);
            
        } catch (Exception ex) {
            throw new Exception("Error al ejecutar la sentencia en ingresar basedatos pg " + ex.getMessage());
        }
        return eje;
    }
    

    public static boolean actualizar(Bases_datos bases_datos) throws Exception {
        ArrayList<Parametro> lstpar = new ArrayList<Parametro>();
        ConjuntoResultado cres = null;
        boolean eje = false;
        String sql = "UPDATE public.bases_datos SET (id = ?,nombre = ?,usuario = ?,directorio=?) WHERE (id = ?)";
        //String sql = "SELECT * FROM public.fa_actualizar_bases_datos(?,?,?,?);";
        lstpar.add(new Parametro(1, bases_datos.getId()));
        lstpar.add(new Parametro(2, bases_datos.getNombre()));
        lstpar.add(new Parametro(3, bases_datos.getUsuario().getId()));
        lstpar.add(new Parametro(4, bases_datos.getDirectorio()));
        try {
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstpar);
            while (rs.next()) {
                if (rs.getString(0).equals("true"));
                eje = true;
            }
        } catch (Exception ex) {
            throw new Exception("Error al ejecutar la sentencia en actualizar Bases_datos ");
        }
        return eje;
    }

    public static boolean eliminar(Bases_datos bases_datos) throws Exception {
        ArrayList<Parametro> lstpar = new ArrayList<Parametro>();
        boolean eje = false;
       //String sql = "DELETE FROM public.bases_datos  WHERE  ;";
        String sql = "SELECT * FROM public.fa_eliminar_bases_datos(?);";
        lstpar.add(new Parametro(1, bases_datos.getId()));
        try {
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstpar);
            while (rs.next()) {
                if (rs.getString(0).equals("true"));
                eje = true;
            }
        } catch (Exception ex) {
            throw new Exception("Error al ejecutar la sentencia en eliminar Bases_datos ");
        }
        return eje;
    }
    
    public static int obtenerultimo() throws Exception 
    {
        ConjuntoResultado cres = null;
        String sql = "SELECT MAX(id) FROM bases_datos";
        int res=0;
        try {
            cres = AccesoDatos.ejecutaQuery(sql);
            while (cres.next()) {
                res = cres.getInt(0);
            }
        } catch (Exception ex) {
            throw new Exception("Error al ejecutar la sentencia en buscar ultimo bases_datos;");
        }
        return res;
    }

    public static String obtenerEstado_bd(String nombre, String esquema) {  //mejorar solo funciona con public
        String estado = "";
        int contador = 0;
        Connection c = null;
        Statement stmt = null;

        try {
            Class.forName(Global.driver_pg);
            c = DriverManager.getConnection(Global.url_pg_temp+nombre,Global.usuario, Global.clave);
            stmt = c.createStatement();
            String sql = " ";
            ResultSet rs = stmt.executeQuery("SELECT * FROM information_schema.TABLES WHERE TABLE_SCHEMA = '"+esquema+"';");
            while (rs.next()) {
                String name = rs.getString("table_name");
                System.out.println(name);
                contador++;
            }
            stmt.close();
            c.close();
        } catch (Exception e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
        }
        System.out.println("Opened database successfully");


        if(contador > 0)
        {
            estado="restaurada -> "+contador+" tablas";
        }
        else
        {
            estado="vacia - no restaurada ->"+contador+" tablas";
        }   
        return estado;
    }
    
    
}
