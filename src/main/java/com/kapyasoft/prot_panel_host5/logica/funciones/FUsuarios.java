package com.kapyasoft.prot_panel_host5.logica.funciones;

import acceso.AccesoDatos;
import acceso.ConjuntoResultado;
import acceso.Parametro;
import com.kapyasoft.prot_panel_host5.logica.clases.Usuario;
import java.sql.SQLException;
import java.util.ArrayList;


public class FUsuarios {

    public static ArrayList<Usuario> obtener_Todos_Usuarios() throws Exception {
        ArrayList<Usuario> lst = new ArrayList<Usuario>();
        Usuario obj = null;
        ConjuntoResultado cres = null;
        String sql = " SELECT   nombres, apellidos, direccion, telefono, email, clave, grupo, id, directorio_ftp, ciudad, estado FROM public.usuario;";
        try {
            cres = AccesoDatos.ejecutaQuery(sql);
            while (cres.next()) {
                obj = new Usuario();
                obj.setNombres(cres.getString("nombres"));
                obj.setApellidos(cres.getString("apellidos"));
                obj.setDireccion(cres.getString("direccion"));
                obj.setTelefono(cres.getString("telefono"));
                obj.setEmail(cres.getString("email"));
                obj.setClave(cres.getString("clave"));
                obj.setGrupo(FGrupos.obtener_Grupo_por_pk(cres.getInt("grupo")));
                obj.setId(cres.getInt("id"));
                obj.setDirectorio_ftp(cres.getString("directorio_ftp"));
                obj.setCiudad(FCiudads.obtener_Ciudad_por_pk(cres.getInt("ciudad")));
                obj.setEstado(cres.getString("estado"));
                obj.setNickname(cres.getString("nickname"));
                lst.add(obj);
            }
        } catch (Exception ex) {
            throw new Exception("Error al ejecutar la sentencia en Obtener todos los Usuario");
        }
        return lst;
    }

        public static Usuario obtener_Usuario_por_email(String email) throws Exception {
        ArrayList<Parametro> lstpar = new ArrayList<Parametro>();
        ConjuntoResultado cres = null;
        Usuario obj = null;
        String sql = " SELECT   nombres, apellidos, direccion, telefono, email, clave, grupo, id, directorio_ftp, ciudad, estado, nickname FROM public.usuario WHERE email=?;";
        lstpar.add(new Parametro(1,email));
        try {
            cres = AccesoDatos.ejecutaQuery(sql, lstpar);
            while (cres.next()) {
                obj = new Usuario();
                obj.setNombres(cres.getString("nombres"));
                obj.setApellidos(cres.getString("apellidos"));
                obj.setDireccion(cres.getString("direccion"));
                obj.setTelefono(cres.getString("telefono"));
                obj.setEmail(cres.getString("email"));
                obj.setClave(cres.getString("clave"));
                obj.setGrupo(FGrupos.obtener_Grupo_por_pk(cres.getInt("grupo")));
                obj.setId(cres.getInt("id"));
                obj.setDirectorio_ftp(cres.getString("directorio_ftp"));
                obj.setCiudad(FCiudads.obtener_Ciudad_por_pk(cres.getInt("ciudad")));
                obj.setEstado(cres.getString("estado"));
                obj.setNickname(cres.getString("nickname"));
            }
        } catch (Exception ex) {
            throw new Exception("Error al ejecutar la sentencia en buscar Usuario por email;"+ex.getMessage());
        }
        return obj;
    }

public static Usuario obtener_Usuario_por_nickname(String nickname) throws Exception {
        ArrayList<Parametro> lstpar = new ArrayList<Parametro>();
        ConjuntoResultado cres = null;
        Usuario obj = null;
        String sql = " SELECT   nombres, apellidos, direccion, telefono, email, clave, grupo, id, directorio_ftp, ciudad, estado, nickname FROM public.usuario WHERE nickname=?;";
        lstpar.add(new Parametro(1,nickname));
        try {
            cres = AccesoDatos.ejecutaQuery(sql, lstpar);
            while (cres.next()) {
                obj = new Usuario();
                obj.setNombres(cres.getString("nombres"));
                obj.setApellidos(cres.getString("apellidos"));
                obj.setDireccion(cres.getString("direccion"));
                obj.setTelefono(cres.getString("telefono"));
                obj.setEmail(cres.getString("email"));
                obj.setClave(cres.getString("clave"));
                obj.setGrupo(FGrupos.obtener_Grupo_por_pk(cres.getInt("grupo")));
                obj.setId(cres.getInt("id"));
                obj.setDirectorio_ftp(cres.getString("directorio_ftp"));
                obj.setCiudad(FCiudads.obtener_Ciudad_por_pk(cres.getInt("ciudad")));
                obj.setEstado(cres.getString("estado"));
                obj.setNickname(cres.getString("nickname"));
            }
        } catch (Exception ex) {
            throw new Exception("Error al ejecutar la sentencia en buscar Usuario por pk;");
        }
        return obj;
    }

    public static Usuario obtener_Usuario_por_pk(int id) throws Exception {
        ArrayList<Parametro> lstpar = new ArrayList<Parametro>();
        ConjuntoResultado cres = null;
        Usuario obj = null;
        String sql = " SELECT   nombres, apellidos, direccion, telefono, email, clave, grupo, id, directorio_ftp, ciudad, estado, nickname  FROM public.usuario where id=?;";
        lstpar.add(new Parametro(1,id));
        try {
            cres = AccesoDatos.ejecutaQuery(sql, lstpar);
            while (cres.next()) {
                obj = new Usuario();
                obj.setNombres(cres.getString("nombres"));
                obj.setApellidos(cres.getString("apellidos"));
                obj.setDireccion(cres.getString("direccion"));
                obj.setTelefono(cres.getString("telefono"));
                obj.setEmail(cres.getString("email"));
                obj.setClave(cres.getString("clave"));
                obj.setGrupo(FGrupos.obtener_Grupo_por_pk(cres.getInt("grupo")));
                obj.setId(cres.getInt("id"));
                obj.setDirectorio_ftp(cres.getString("directorio_ftp"));
                obj.setCiudad(FCiudads.obtener_Ciudad_por_pk(cres.getInt("ciudad")));
                obj.setEstado(cres.getString("estado"));
                obj.setNickname(cres.getString("nickname"));
            }
        } catch (Exception ex) {
            throw new Exception("Error al ejecutar la sentencia en buscar Usuario por pk;");
        }
        return obj;
    }

    public static ArrayList<Usuario> obtenerUsuariopor_campo_nombres(String nombres) throws Exception {
        ArrayList<Parametro> lstpar = new ArrayList<Parametro>();
        ArrayList<Usuario> lst = new ArrayList<Usuario>();
        ConjuntoResultado cres = null;
        Usuario obj = null;
        String sql = " SELECT   nombres, apellidos, direccion, telefono, email, clave, grupo, id, directorio_ftp, ciudad, estado, nickname  FROM public.usuario where nombres = ? ;";
        lstpar.add(new Parametro(1, nombres));
        try {
            cres = AccesoDatos.ejecutaQuery(sql, lstpar);
            while (cres.next()) {
                obj = new Usuario();
                obj.setNombres(cres.getString("nombres"));
                obj.setApellidos(cres.getString("apellidos"));
                obj.setDireccion(cres.getString("direccion"));
                obj.setTelefono(cres.getString("telefono"));
                obj.setEmail(cres.getString("email"));
                obj.setClave(cres.getString("clave"));
                obj.setGrupo(FGrupos.obtener_Grupo_por_pk(cres.getInt("grupo")));
                obj.setId(cres.getInt("id"));
                obj.setDirectorio_ftp(cres.getString("directorio_ftp"));
                obj.setCiudad(FCiudads.obtener_Ciudad_por_pk(cres.getInt("ciudad")));
                obj.setEstado(cres.getString("estado"));
                obj.setNickname(cres.getString("nickname"));
                lst.add(obj);
            }
        } catch (Exception ex) {
            throw new Exception("Error al ejecutar la sentencia en buscar Usuario por campotabla;");
        }
        return lst;
    }

    public static ArrayList<Usuario> obtenerUsuariopor_campo_apellidos(String apellidos) throws Exception {
        ArrayList<Parametro> lstpar = new ArrayList<Parametro>();
        ArrayList<Usuario> lst = new ArrayList<Usuario>();
        ConjuntoResultado cres = null;
        Usuario obj = null;
        String sql = " SELECT   nombres, apellidos, direccion, telefono, email, clave, grupo, id, directorio_ftp, ciudad, estado, nickname  FROM public.usuario where apellidos = ? ;";
        lstpar.add(new Parametro(1, apellidos));
        try {
            cres = AccesoDatos.ejecutaQuery(sql, lstpar);
            while (cres.next()) {
                obj = new Usuario();
                obj.setNombres(cres.getString("nombres"));
                obj.setApellidos(cres.getString("apellidos"));
                obj.setDireccion(cres.getString("direccion"));
                obj.setTelefono(cres.getString("telefono"));
                obj.setEmail(cres.getString("email"));
                obj.setClave(cres.getString("clave"));
                obj.setGrupo(FGrupos.obtener_Grupo_por_pk(cres.getInt("grupo")));
                obj.setId(cres.getInt("id"));
                obj.setDirectorio_ftp(cres.getString("directorio_ftp"));
                obj.setCiudad(FCiudads.obtener_Ciudad_por_pk(cres.getInt("ciudad")));
                obj.setEstado(cres.getString("estado"));
                obj.setNickname(cres.getString("nickname"));
                lst.add(obj);
            }
        } catch (Exception ex) {
            throw new Exception("Error al ejecutar la sentencia en buscar Usuario por campotabla;");
        }
        return lst;
    }

    public static ArrayList<Usuario> obtenerUsuariopor_campo_direccion(String direccion) throws Exception {
        ArrayList<Parametro> lstpar = new ArrayList<Parametro>();
        ArrayList<Usuario> lst = new ArrayList<Usuario>();
        ConjuntoResultado cres = null;
        Usuario obj = null;
        String sql = " SELECT   nombres, apellidos, direccion, telefono, email, clave, grupo, id, directorio_ftp, ciudad, estado, nickname  FROM public.usuario where direccion = ? ;";
        lstpar.add(new Parametro(1, direccion));
        try {
            cres = AccesoDatos.ejecutaQuery(sql, lstpar);
            while (cres.next()) {
                obj = new Usuario();
                obj.setNombres(cres.getString("nombres"));
                obj.setApellidos(cres.getString("apellidos"));
                obj.setDireccion(cres.getString("direccion"));
                obj.setTelefono(cres.getString("telefono"));
                obj.setEmail(cres.getString("email"));
                obj.setClave(cres.getString("clave"));
                obj.setGrupo(FGrupos.obtener_Grupo_por_pk(cres.getInt("grupo")));
                obj.setId(cres.getInt("id"));
                obj.setDirectorio_ftp(cres.getString("directorio_ftp"));
                obj.setCiudad(FCiudads.obtener_Ciudad_por_pk(cres.getInt("ciudad")));
                obj.setEstado(cres.getString("estado"));
                obj.setNickname(cres.getString("nickname"));
                lst.add(obj);
            }
        } catch (Exception ex) {
            throw new Exception("Error al ejecutar la sentencia en buscar Usuario por campotabla;");
        }
        return lst;
    }

    public static ArrayList<Usuario> obtenerUsuariopor_campo_telefono(String telefono) throws Exception {
        ArrayList<Parametro> lstpar = new ArrayList<Parametro>();
        ArrayList<Usuario> lst = new ArrayList<Usuario>();
        ConjuntoResultado cres = null;
        Usuario obj = null;
        String sql = " SELECT   nombres, apellidos, direccion, telefono, email, clave, grupo, id, directorio_ftp, ciudad, estado, nickname  FROM public.usuario where telefono = ? ;";
        lstpar.add(new Parametro(1, telefono));
        try {
            cres = AccesoDatos.ejecutaQuery(sql, lstpar);
            while (cres.next()) {
                obj = new Usuario();
                obj.setNombres(cres.getString("nombres"));
                obj.setApellidos(cres.getString("apellidos"));
                obj.setDireccion(cres.getString("direccion"));
                obj.setTelefono(cres.getString("telefono"));
                obj.setEmail(cres.getString("email"));
                obj.setClave(cres.getString("clave"));
                obj.setGrupo(FGrupos.obtener_Grupo_por_pk(cres.getInt("grupo")));
                obj.setId(cres.getInt("id"));
                obj.setDirectorio_ftp(cres.getString("directorio_ftp"));
                obj.setCiudad(FCiudads.obtener_Ciudad_por_pk(cres.getInt("ciudad")));
                obj.setEstado(cres.getString("estado"));
                obj.setNickname(cres.getString("nickname"));
                lst.add(obj);
            }
        } catch (Exception ex) {
            throw new Exception("Error al ejecutar la sentencia en buscar Usuario por campotabla;");
        }
        return lst;
    }

    public static ArrayList<Usuario> obtenerUsuariopor_campo_email(String email) throws Exception {
        ArrayList<Parametro> lstpar = new ArrayList<Parametro>();
        ArrayList<Usuario> lst = new ArrayList<Usuario>();
        ConjuntoResultado cres = null;
        Usuario obj = null;
        String sql = " SELECT   nombres, apellidos, direccion, telefono, email, clave, grupo, id, directorio_ftp, ciudad, estado, nickname  FROM public.usuario where email = ? ;";
        lstpar.add(new Parametro(1, email));
        try {
            cres = AccesoDatos.ejecutaQuery(sql, lstpar);
            while (cres.next()) {
                obj = new Usuario();
                obj.setNombres(cres.getString("nombres"));
                obj.setApellidos(cres.getString("apellidos"));
                obj.setDireccion(cres.getString("direccion"));
                obj.setTelefono(cres.getString("telefono"));
                obj.setEmail(cres.getString("email"));
                obj.setClave(cres.getString("clave"));
                obj.setGrupo(FGrupos.obtener_Grupo_por_pk(cres.getInt("grupo")));
                obj.setId(cres.getInt("id"));
                obj.setDirectorio_ftp(cres.getString("directorio_ftp"));
                obj.setCiudad(FCiudads.obtener_Ciudad_por_pk(cres.getInt("ciudad")));
                obj.setEstado(cres.getString("estado"));
                obj.setNickname(cres.getString("nickname"));
                lst.add(obj);
            }
        } catch (Exception ex) {
            throw new Exception("Error al ejecutar la sentencia en buscar Usuario por campotabla;");
        }
        return lst;
    }

    public static ArrayList<Usuario> obtenerUsuariopor_campo_clave(String clave) throws Exception {
        ArrayList<Parametro> lstpar = new ArrayList<Parametro>();
        ArrayList<Usuario> lst = new ArrayList<Usuario>();
        ConjuntoResultado cres = null;
        Usuario obj = null;
        String sql = " SELECT   nombres, apellidos, direccion, telefono, email, clave, grupo, id, directorio_ftp, ciudad, estado, nickname  FROM public.usuario where clave = ? ;";
        lstpar.add(new Parametro(1, clave));
        try {
            cres = AccesoDatos.ejecutaQuery(sql, lstpar);
            while (cres.next()) {
                obj = new Usuario();
                obj.setNombres(cres.getString("nombres"));
                obj.setApellidos(cres.getString("apellidos"));
                obj.setDireccion(cres.getString("direccion"));
                obj.setTelefono(cres.getString("telefono"));
                obj.setEmail(cres.getString("email"));
                obj.setClave(cres.getString("clave"));
                obj.setGrupo(FGrupos.obtener_Grupo_por_pk(cres.getInt("grupo")));
                obj.setId(cres.getInt("id"));
                obj.setDirectorio_ftp(cres.getString("directorio_ftp"));
                obj.setCiudad(FCiudads.obtener_Ciudad_por_pk(cres.getInt("ciudad")));
                obj.setEstado(cres.getString("estado"));
                obj.setNickname(cres.getString("nickname"));
                lst.add(obj);
            }
        } catch (Exception ex) {
            throw new Exception("Error al ejecutar la sentencia en buscar Usuario por campotabla;");
        }
        return lst;
    }

    public static ArrayList<Usuario> obtenerUsuariopor_campo_grupo(int grupo) throws Exception {
        ArrayList<Parametro> lstpar = new ArrayList<Parametro>();
        ArrayList<Usuario> lst = new ArrayList<Usuario>();
        ConjuntoResultado cres = null;
        Usuario obj = null;
        String sql = " SELECT   nombres, apellidos, direccion, telefono, email, clave, grupo, id, directorio_ftp, ciudad, estado, nickname  FROM public.usuario where grupo = ? ;";
        lstpar.add(new Parametro(1, grupo));
        try {
            cres = AccesoDatos.ejecutaQuery(sql, lstpar);
            while (cres.next()) {
                obj = new Usuario();
                obj.setNombres(cres.getString("nombres"));
                obj.setApellidos(cres.getString("apellidos"));
                obj.setDireccion(cres.getString("direccion"));
                obj.setTelefono(cres.getString("telefono"));
                obj.setEmail(cres.getString("email"));
                obj.setClave(cres.getString("clave"));
                obj.setGrupo(FGrupos.obtener_Grupo_por_pk(cres.getInt("grupo")));
                obj.setId(cres.getInt("id"));
                obj.setDirectorio_ftp(cres.getString("directorio_ftp"));
                obj.setCiudad(FCiudads.obtener_Ciudad_por_pk(cres.getInt("ciudad")));
                obj.setEstado(cres.getString("estado"));
                obj.setNickname(cres.getString("nickname"));
                lst.add(obj);
            }
        } catch (Exception ex) {
            throw new Exception("Error al ejecutar la sentencia en buscar Usuario por campotabla;");
        }
        return lst;
    }

    public static ArrayList<Usuario> obtenerUsuariopor_campo_id(int id) throws Exception {
        ArrayList<Parametro> lstpar = new ArrayList<Parametro>();
        ArrayList<Usuario> lst = new ArrayList<Usuario>();
        ConjuntoResultado cres = null;
        Usuario obj = null;
        String sql = " SELECT   nombres, apellidos, direccion, telefono, email, clave, grupo, id, directorio_ftp, ciudad, estado, nickname  FROM public.usuario where id = ? ;";
        lstpar.add(new Parametro(1, id));
        try {
            cres = AccesoDatos.ejecutaQuery(sql, lstpar);
            while (cres.next()) {
                obj = new Usuario();
                obj.setNombres(cres.getString("nombres"));
                obj.setApellidos(cres.getString("apellidos"));
                obj.setDireccion(cres.getString("direccion"));
                obj.setTelefono(cres.getString("telefono"));
                obj.setEmail(cres.getString("email"));
                obj.setClave(cres.getString("clave"));
                obj.setGrupo(FGrupos.obtener_Grupo_por_pk(cres.getInt("grupo")));
                obj.setId(cres.getInt("id"));
                obj.setDirectorio_ftp(cres.getString("directorio_ftp"));
                obj.setCiudad(FCiudads.obtener_Ciudad_por_pk(cres.getInt("ciudad")));
                obj.setEstado(cres.getString("estado"));
                obj.setNickname(cres.getString("nickname"));
                lst.add(obj);
            }
        } catch (Exception ex) {
            throw new Exception("Error al ejecutar la sentencia en buscar Usuario por campotabla;");
        }
        return lst;
    }

    public static ArrayList<Usuario> obtenerUsuariopor_campo_directorio_ftp(String directorio_ftp) throws Exception {
        ArrayList<Parametro> lstpar = new ArrayList<Parametro>();
        ArrayList<Usuario> lst = new ArrayList<Usuario>();
        ConjuntoResultado cres = null;
        Usuario obj = null;
        String sql = " SELECT   nombres, apellidos, direccion, telefono, email, clave, grupo, id, directorio_ftp, ciudad, estado, nickname  FROM public.usuario where directorio_ftp = ? ;";
        lstpar.add(new Parametro(1, directorio_ftp));
        try {
            cres = AccesoDatos.ejecutaQuery(sql, lstpar);
            while (cres.next()) {
                obj = new Usuario();
                obj.setNombres(cres.getString("nombres"));
                obj.setApellidos(cres.getString("apellidos"));
                obj.setDireccion(cres.getString("direccion"));
                obj.setTelefono(cres.getString("telefono"));
                obj.setEmail(cres.getString("email"));
                obj.setClave(cres.getString("clave"));
                obj.setGrupo(FGrupos.obtener_Grupo_por_pk(cres.getInt("grupo")));
                obj.setId(cres.getInt("id"));
                obj.setDirectorio_ftp(cres.getString("directorio_ftp"));
                obj.setCiudad(FCiudads.obtener_Ciudad_por_pk(cres.getInt("ciudad")));
                obj.setEstado(cres.getString("estado"));
                obj.setNickname(cres.getString("nickname"));
                lst.add(obj);
            }
        } catch (Exception ex) {
            throw new Exception("Error al ejecutar la sentencia en buscar Usuario por campotabla;");
        }
        return lst;
    }

    public static ArrayList<Usuario> obtenerUsuariopor_campo_ciudad(int ciudad) throws Exception {
        ArrayList<Parametro> lstpar = new ArrayList<Parametro>();
        ArrayList<Usuario> lst = new ArrayList<Usuario>();
        ConjuntoResultado cres = null;
        Usuario obj = null;
        String sql = " SELECT   nombres, apellidos, direccion, telefono, email, clave, grupo, id, directorio_ftp, ciudad, estado, nickname  FROM public.usuario where ciudad = ? ;";
        lstpar.add(new Parametro(1, ciudad));
        try {
            cres = AccesoDatos.ejecutaQuery(sql, lstpar);
            while (cres.next()) {
                obj = new Usuario();
                obj.setNombres(cres.getString("nombres"));
                obj.setApellidos(cres.getString("apellidos"));
                obj.setDireccion(cres.getString("direccion"));
                obj.setTelefono(cres.getString("telefono"));
                obj.setEmail(cres.getString("email"));
                obj.setClave(cres.getString("clave"));
                obj.setGrupo(FGrupos.obtener_Grupo_por_pk(cres.getInt("grupo")));
                obj.setId(cres.getInt("id"));
                obj.setDirectorio_ftp(cres.getString("directorio_ftp"));
                obj.setCiudad(FCiudads.obtener_Ciudad_por_pk(cres.getInt("ciudad")));
                obj.setEstado(cres.getString("estado"));
                obj.setNickname(cres.getString("nickname"));
                lst.add(obj);
            }
        } catch (Exception ex) {
            throw new Exception("Error al ejecutar la sentencia en buscar Usuario por campotabla;");
        }
        return lst;
    }

    public static ArrayList<Usuario> obtenerUsuariopor_campo_estado(char estado) throws Exception {
        ArrayList<Parametro> lstpar = new ArrayList<Parametro>();
        ArrayList<Usuario> lst = new ArrayList<Usuario>();
        ConjuntoResultado cres = null;
        Usuario obj = null;
        String sql = " SELECT   nombres, apellidos, direccion, telefono, email, clave, grupo, id, directorio_ftp, ciudad, estado, nickname  FROM public.usuario where estado = ? ;";
        lstpar.add(new Parametro(1, estado));
        try {
            cres = AccesoDatos.ejecutaQuery(sql, lstpar);
            while (cres.next()) {
                obj = new Usuario();
                obj.setNombres(cres.getString("nombres"));
                obj.setApellidos(cres.getString("apellidos"));
                obj.setDireccion(cres.getString("direccion"));
                obj.setTelefono(cres.getString("telefono"));
                obj.setEmail(cres.getString("email"));
                obj.setClave(cres.getString("clave"));
                obj.setGrupo(FGrupos.obtener_Grupo_por_pk(cres.getInt("grupo")));
                obj.setId(cres.getInt("id"));
                obj.setDirectorio_ftp(cres.getString("directorio_ftp"));
                obj.setCiudad(FCiudads.obtener_Ciudad_por_pk(cres.getInt("ciudad")));
                obj.setEstado(cres.getString("estado"));
                obj.setNickname(cres.getString("nickname"));
                lst.add(obj);
            }
        } catch (Exception ex) {
            throw new Exception("Error al ejecutar la sentencia en buscar Usuario por campotabla;");
        }
        return lst;
    }

    public static boolean ingresar(Usuario usuario) throws Exception {
        ArrayList<Parametro> lstpar = new ArrayList<Parametro>();
        boolean eje = false;
        String sql = "INSERT INTO public.usuario(nombres,apellidos,direccion,telefono,email,clave,grupo,id,directorio_ftp,ciudad,estado, nickname ) VALUES (?,?,?,?,?,?,?,?,?,?,?,?) ;";
        lstpar.add(new Parametro(1, usuario.getNombres()));
        lstpar.add(new Parametro(2, usuario.getApellidos()));
        lstpar.add(new Parametro(3, usuario.getDireccion()));
        lstpar.add(new Parametro(4, usuario.getTelefono()));
        lstpar.add(new Parametro(5, usuario.getEmail()));
        lstpar.add(new Parametro(6, usuario.getClave()));
        lstpar.add(new Parametro(7, usuario.getGrupo().getId()));
        lstpar.add(new Parametro(8, usuario.getId()));
        lstpar.add(new Parametro(9, usuario.getDirectorio_ftp()));
        lstpar.add(new Parametro(10, usuario.getCiudad().getId()));
        lstpar.add(new Parametro(11, usuario.getEstado()));
        lstpar.add(new Parametro(12, usuario.getNickname()));
        try {
            eje = AccesoDatos.ejecutaComando1(sql, lstpar);
            
        } catch (Exception ex) {
            throw new Exception("Error al ejecutar la sentencia en ingresar Usuario " + ex.getMessage());
        }
        return eje;
    }
    
    public static boolean crear_usuario_pg(String nombre, String clave) throws Exception
    {
        String sql = "CREATE USER ? WITH password ?";
        ArrayList<Parametro> lstpar = new ArrayList<Parametro>();
        boolean eje = false;
       
        lstpar.add(new Parametro(1, nombre));
        lstpar.add(new Parametro(2, clave));
        
        try {
            eje = AccesoDatos.ejecutaComando1(sql, lstpar);
            
        } catch (Exception ex) {
            throw new Exception("Error al ejecutar la sentencia en ingresar Usuario pg " + ex.getMessage());
        }
        return eje;
    }
    

    public static boolean actualizar(Usuario usuario) throws Exception {
        ArrayList<Parametro> lstpar = new ArrayList<Parametro>();
        ConjuntoResultado cres = null;
        boolean eje = false;
//String sql = "UPDATE public.usuario SET (nombres = ?,apellidos = ?,direccion = ?,telefono = ?,email = ?,clave = ?,grupo = ?,id = ?,directorio_ftp = ?,ciudad = ?,estado = ?) WHERE (int ;";
        String sql = "SELECT * FROM public.fa_actualizar_usuario(?,?,?,?,?,?,?,?,?,?,?,?);";
        lstpar.add(new Parametro(1, usuario.getNombres()));
        lstpar.add(new Parametro(2, usuario.getApellidos()));
        lstpar.add(new Parametro(3, usuario.getDireccion()));
        lstpar.add(new Parametro(4, usuario.getTelefono()));
        lstpar.add(new Parametro(5, usuario.getEmail()));
        lstpar.add(new Parametro(6, usuario.getClave()));
        lstpar.add(new Parametro(7, usuario.getGrupo()));
        lstpar.add(new Parametro(8, usuario.getId()));
        lstpar.add(new Parametro(9, usuario.getDirectorio_ftp()));
        lstpar.add(new Parametro(10, usuario.getCiudad()));
        lstpar.add(new Parametro(11, usuario.getEstado()));
        lstpar.add(new Parametro(12, usuario.getNickname()));
        try {
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstpar);
            while (rs.next()) {
                if (rs.getString(0).equals("true"));
                eje = true;
            }
        } catch (Exception ex) {
            throw new Exception("Error al ejecutar la sentencia en actualizar Usuario ");
        }
        return eje;
    }

    public static boolean eliminar(Usuario usuario) throws Exception {
        ArrayList<Parametro> lstpar = new ArrayList<Parametro>();
        boolean eje = false;
//String sql = "DELETE FROM public.usuario  WHERE  ;";
        String sql = "SELECT * FROM public.fa_eliminar_usuario(?);";
        lstpar.add(new Parametro(1, usuario.getId()));
        try {
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstpar);
            while (rs.next()) {
                if (rs.getString(0).equals("true"));
                eje = true;
            }
        } catch (Exception ex) {
            throw new Exception("Error al ejecutar la sentencia en eliminar Usuario ");
        }
        return eje;
    }
    
     public static int obtenerultimo() throws Exception 
    {
        ConjuntoResultado cres = null;
        String sql = "SELECT MAX(id) FROM usuario";
        int res=0;
        try {
            cres = AccesoDatos.ejecutaQuery(sql);
            while (cres.next()) {
                res = cres.getInt(0);
            }
        } catch (Exception ex) {
            throw new Exception("Error al ejecutar la sentencia en buscar ultimo usuario;");
        }
        return res;
    }
}
