package com.kapyasoft.prot_panel_host5.logica.funciones;

import acceso.AccesoDatos;
import acceso.ConjuntoResultado;
import acceso.Parametro;
import com.kapyasoft.prot_panel_host5.logica.clases.Aplicacion;
import java.sql.SQLException;
import java.util.ArrayList;


public class FAplicacions {

    public static ArrayList<Aplicacion> obtener_Todos_Aplicacions() throws Exception {
        ArrayList<Aplicacion> lst = new ArrayList<Aplicacion>();
        Aplicacion obj = null;
        ConjuntoResultado cres = null;
        String sql = " SELECT   id, nombre, usuario, directorio, archivo_war FROM public.aplicacion;";
        try {
            cres = AccesoDatos.ejecutaQuery(sql);
            while (cres.next()) {
                obj = new Aplicacion();
                obj.setId(cres.getInt("id"));
                obj.setNombre(cres.getString("nombre"));
                obj.setUsuario(FUsuarios.obtener_Usuario_por_pk(cres.getInt("usuario")));
                
                try {
                    obj.setDirectorio(cres.getString("directorio"));

                } catch (Exception ex) {
                    obj.setDirectorio("");
                }
                try {
                    obj.setArchivo_war(cres.getString("archivo_war"));
                } catch (Exception ex) {
                    obj.setArchivo_war("");
                }
                
                
                lst.add(obj);
            }
        } catch (Exception ex) {
            throw new Exception("Error al ejecutar la sentencia en Obtener todos los Aplicacion");
        }
        return lst;
    }

    public static Aplicacion obtener_Aplicacion_por_pk(int id) throws Exception {
        ArrayList<Parametro> lstpar = new ArrayList<Parametro>();
        ConjuntoResultado cres = null;
        Aplicacion obj = new Aplicacion();
        //obj= null;
        String sql = " SELECT   id, nombre, usuario, directorio, archivo_war FROM public.aplicacion where id = ? ;";
        lstpar.add(new Parametro(1, id));
        try {
            cres = AccesoDatos.ejecutaQuery(sql, lstpar);
            while (cres.next()) {
                obj = new Aplicacion();
                obj.setId(cres.getInt("id"));
                obj.setNombre(cres.getString("nombre"));
                obj.setUsuario(FUsuarios.obtener_Usuario_por_pk(cres.getInt("usuario")));
                try {
                    obj.setDirectorio(cres.getString("directorio"));

                } catch (Exception ex) {
                    obj.setDirectorio("");
                }
                try {
                    obj.setArchivo_war(cres.getString("archivo_war"));
                } catch (Exception ex) {
                    obj.setArchivo_war("");
                }
            }
        } catch (Exception ex) {
            throw new Exception("Error al ejecutar la sentencia en buscar Aplicacion por pk;"+ex.getMessage());
        }
        return obj;
    }

    public static ArrayList<Aplicacion> obtenerAplicacionpor_campo_id(int id) throws Exception {
        ArrayList<Parametro> lstpar = new ArrayList<Parametro>();
        ArrayList<Aplicacion> lst = new ArrayList<Aplicacion>();
        ConjuntoResultado cres = null;
        Aplicacion obj = null;
        String sql = " SELECT   id, nombre, usuario,  directorio, archivo_war FROM public.aplicacion where id = ? ;";
        lstpar.add(new Parametro(1, id));
        try {
            cres = AccesoDatos.ejecutaQuery(sql, lstpar);
            while (cres.next()) {
                obj = new Aplicacion();
                obj.setId(cres.getInt("id"));
                obj.setNombre(cres.getString("nombre"));
                obj.setUsuario(FUsuarios.obtener_Usuario_por_pk(cres.getInt("usuario")));
                try {
                    obj.setDirectorio(cres.getString("directorio"));

                } catch (Exception ex) {
                    obj.setDirectorio("");
                }
                try {
                    obj.setArchivo_war(cres.getString("archivo_war"));
                } catch (Exception ex) {
                    obj.setArchivo_war("");
                }
                lst.add(obj);
            }
        } catch (Exception ex) {
            throw new Exception("Error al ejecutar la sentencia en buscar Aplicacion por campotabla;");
        }
        return lst;
    }

//    public static ArrayList<Aplicacion> obtenerAplicacionpor_campo_nombre(String nombre) throws Exception {
//        ArrayList<Parametro> lstpar = new ArrayList<Parametro>();
//        ArrayList<Aplicacion> lst = null;
//        ConjuntoResultado cres = null;
//        Aplicacion obj = null;
//        String sql = " SELECT   id, nombre, usuario, directorio, archivo_war FROM public.aplicacion where nombre = ? ;";
//        lstpar.add(new Parametro(1, nombre));
//        try {
//            cres = AccesoDatos.ejecutaQuery(sql, lstpar);
//            while (cres.next()) {
//                obj = new Aplicacion();
//                obj.setId(cres.getInt("id"));
//                obj.setNombre(cres.getString("nombre"));
//                obj.setUsuario(FUsuarios.obtener_Usuario_por_pk(cres.getInt("usuario")));
//                obj.setDirectorio(cres.getString("directorio"));
//                obj.setArchivo_war(cres.getString("archivo_war"));
//                lst.add(obj);
//            }
//        } catch (Exception ex) {
//            throw new Exception("Error al ejecutar la sentencia en buscar Aplicacion por campotabla;");
//        }
//        return lst;
//    }
    
    public static Aplicacion obtenerAplicacionpor_campo_nombre(String nombre) throws Exception {
        ArrayList<Parametro> lstpar = new ArrayList<Parametro>();
        ConjuntoResultado cres = null;
        Aplicacion obj = null;
        String sql = " SELECT   id, nombre, usuario, directorio, archivo_war FROM public.aplicacion where nombre = ? ;";
        lstpar.add(new Parametro(1, nombre));
        try {
            cres = AccesoDatos.ejecutaQuery(sql, lstpar);
            while (cres.next()) {
                obj = new Aplicacion();
                obj.setId(cres.getInt("id"));
                obj.setNombre(cres.getString("nombre"));
                obj.setUsuario(FUsuarios.obtener_Usuario_por_pk(cres.getInt("usuario")));
                try {
                    obj.setDirectorio(cres.getString("directorio"));

                } catch (Exception ex) {
                    obj.setDirectorio("");
                }
                try {
                    obj.setArchivo_war(cres.getString("archivo_war"));
                } catch (Exception ex) {
                    obj.setArchivo_war("");
                }
                }
        } catch (Exception ex) {
            throw new Exception("Error al ejecutar la sentencia en buscar Aplicacion por campotabla;");
        }
        return obj;
    }

    public static ArrayList<Aplicacion> obtenerAplicacionpor_campo_usuario(int usuario) throws Exception {
        ArrayList<Parametro> lstpar = new ArrayList<Parametro>();
        ArrayList<Aplicacion> lst = new ArrayList<Aplicacion>();
        ConjuntoResultado cres = null;
        Aplicacion obj = null;
        String sql = " SELECT   id, nombre, usuario,  directorio, archivo_war FROM public.aplicacion where usuario = ? ;";
        lstpar.add(new Parametro(1, usuario));
        try {
            cres = AccesoDatos.ejecutaQuery(sql, lstpar);
            while (cres.next()) {
                obj = new Aplicacion();
                obj.setId(cres.getInt("id"));
                obj.setNombre(cres.getString("nombre"));
                obj.setUsuario(FUsuarios.obtener_Usuario_por_pk(cres.getInt("usuario")));
                try {
                    obj.setDirectorio(cres.getString("directorio"));

                } catch (Exception ex) {
                    obj.setDirectorio("");
                }
                try {
                    obj.setArchivo_war(cres.getString("archivo_war"));
                } catch (Exception ex) {
                    obj.setArchivo_war("");
                }
                lst.add(obj);
            }
        } catch (Exception ex) {
            throw new Exception("Error al ejecutar la sentencia en buscar Aplicacion por campo usuario;");
        }
        return lst;
    }

    public static ArrayList<Aplicacion> obtenerAplicacionpor_campo_directorio(String directorio) throws Exception {
        ArrayList<Parametro> lstpar = new ArrayList<Parametro>();
        ArrayList<Aplicacion> lst = new ArrayList<Aplicacion>();
        ConjuntoResultado cres = null;
        Aplicacion obj = null;
        String sql = " SELECT   id, nombre, usuario,  directorio, archivo_war FROM public.aplicacion where directorio = ? ;";
        lstpar.add(new Parametro(1, directorio));
        try {
            cres = AccesoDatos.ejecutaQuery(sql, lstpar);
            while (cres.next()) {
                obj = new Aplicacion();
                obj.setId(cres.getInt("id"));
                obj.setNombre(cres.getString("nombre"));
                obj.setUsuario(FUsuarios.obtener_Usuario_por_pk(cres.getInt("usuario")));
                try {
                    obj.setDirectorio(cres.getString("directorio"));

                } catch (Exception ex) {
                    obj.setDirectorio("");
                }
                try {
                    obj.setArchivo_war(cres.getString("archivo_war"));
                } catch (Exception ex) {
                    obj.setArchivo_war("");
                }
                lst.add(obj);
            }
        } catch (Exception ex) {
            throw new Exception("Error al ejecutar la sentencia en buscar Aplicacion por campotabla;");
        }
        return lst;
    }

    public static ArrayList<Aplicacion> obtenerAplicacionpor_campo_archivo_war(String archivo_war) throws Exception {
        ArrayList<Parametro> lstpar = new ArrayList<Parametro>();
        ArrayList<Aplicacion> lst = new ArrayList<Aplicacion>();
        ConjuntoResultado cres = null;
        Aplicacion obj = null;
        String sql = " SELECT   id, nombre, usuario, directorio, archivo_war FROM public.aplicacion where archivo_war = ? ;";
        lstpar.add(new Parametro(1, archivo_war));
        try {
            cres = AccesoDatos.ejecutaQuery(sql, lstpar);
            while (cres.next()) {
                obj = new Aplicacion();
                obj.setId(cres.getInt("id"));
                obj.setNombre(cres.getString("nombre"));
                obj.setUsuario(FUsuarios.obtener_Usuario_por_pk(cres.getInt("usuario")));
                try {
                    obj.setDirectorio(cres.getString("directorio"));

                } catch (Exception ex) {
                    obj.setDirectorio("");
                }
                try {
                    obj.setArchivo_war(cres.getString("archivo_war"));
                } catch (Exception ex) {
                    obj.setArchivo_war("");
                }
                lst.add(obj);
            }
        } catch (Exception ex) {
            throw new Exception("Error al ejecutar la sentencia en buscar Aplicacion por campotabla;");
        }
        return lst;
    }

    public static boolean ingresar(Aplicacion aplicacion) throws Exception {
        ArrayList<Parametro> lstpar = new ArrayList<Parametro>();
        ConjuntoResultado cres = null;
        boolean eje = false;
        String sql = "INSERT INTO public.aplicacion(id,nombre,usuario,directorio,archivo_war) VALUES (?,?,?,?,?) ;";
        lstpar.add(new Parametro(1, aplicacion.getId()));
        lstpar.add(new Parametro(2, aplicacion.getNombre()));
        lstpar.add(new Parametro(3, aplicacion.getUsuario().getId()));
        lstpar.add(new Parametro(4, aplicacion.getDirectorio()));
        lstpar.add(new Parametro(5, aplicacion.getArchivo_war()));
        try {
            eje= AccesoDatos.ejecutaComando1(sql, lstpar);
            
        } catch (Exception ex) {
            throw new Exception("Error al ejecutar la sentencia en ingresar Aplicacion "+ex.getMessage());
        }
        return eje;
    }

    public static boolean actualizar(Aplicacion aplicacion) throws Exception {
        ArrayList<Parametro> lstpar = new ArrayList<Parametro>();
        ConjuntoResultado cres = null;
        boolean eje = false;
//String sql = "UPDATE public.aplicacion SET (id = ?,nombre = ?,usuario = ?,directorio = ?,archivo_war = ?) WHERE (int ;";
        String sql = "SELECT * FROM public.fa_actualizar_aplicacion(?,?,?,?,?);";
        lstpar.add(new Parametro(1, aplicacion.getId()));
        lstpar.add(new Parametro(2, aplicacion.getNombre()));
        lstpar.add(new Parametro(3, aplicacion.getUsuario()));
        lstpar.add(new Parametro(4, aplicacion.getDirectorio()));
        lstpar.add(new Parametro(5, aplicacion.getArchivo_war()));
        try {
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstpar);
            while (rs.next()) {
                if (rs.getString(0).equals("true"));
                eje = true;
            }
        } catch (Exception ex) {
            throw new Exception("Error al ejecutar la sentencia en actualizar Aplicacion ");
        }
        return eje;
    }

    public static boolean eliminar(Aplicacion aplicacion) throws Exception {
        ArrayList<Parametro> lstpar = new ArrayList<Parametro>();
        boolean eje = false;
//String sql = "DELETE FROM public.aplicacion  WHERE  ;";
        String sql = "SELECT * FROM public.fa_eliminar_aplicacion(?);";
        lstpar.add(new Parametro(1, aplicacion.getId()));
        try {
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstpar);
            while (rs.next()) {
                if (rs.getString(0).equals("true"));
                eje = true;
            }
        } catch (Exception ex) {
            throw new Exception("Error al ejecutar la sentencia en eliminar Aplicacion ");
        }
        return eje;
    }
    public static int obtenerultimo() throws Exception 
    {
        ConjuntoResultado cres = null;
        String sql = "SELECT MAX(id) FROM aplicacion";
        int res=0;
        try {
            cres = AccesoDatos.ejecutaQuery(sql);
            while (cres.next()) {
                res = cres.getInt(0);
            }
        } catch (Exception ex) {
            throw new Exception("Error al ejecutar la sentencia en buscar ultimo aplicacion;");
        }
        return res;
    }
}
