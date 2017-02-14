/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kapyasoft.prot_panel_host5.logica.funciones;

/**
 *
 * @author Edgar
 */
import acceso.AccesoDatos;
import acceso.ConjuntoResultado;
import acceso.Parametro;
import com.kapyasoft.prot_panel_host5.logica.clases.Usuario;
import java.util.ArrayList;


/**
 *
 * @author efabiancj
 */
public class FAutenticacion {
    public static Usuario Autenticar(String item,String pass) throws Exception {
        ArrayList<Parametro> lstpar = new ArrayList<Parametro>();
        ConjuntoResultado cres = null;
        Usuario obj = null; 

        String sql = "SELECT * FROM public.usuario WHERE email = ? AND clave = ?";
        lstpar.add(new Parametro(1, item));
        lstpar.add(new Parametro(2, pass));
        try {
            cres = AccesoDatos.ejecutaQuery(sql, lstpar);
            while (cres.next()) {
      
                obj = new Usuario();
                obj.setId(cres.getInt("id"));
                obj.setEmail(cres.getString("email"));
                obj.setClave(cres.getString("clave"));
                obj.setEmail(cres.getString("email"));
                obj.setNombres(cres.getString("nombres"));
                obj.setApellidos(cres.getString("apellidos"));
                obj.setDireccion(cres.getString("direccion"));
                obj.setTelefono(cres.getString("telefono"));
                obj.setEstado(cres.getString("estado"));
                obj.setDirectorio_ftp(cres.getString("directorio_ftp"));
                obj.setNickname("nickname");
                int gru = cres.getInt("grupo");
                try {
                    obj.setGrupo(FGrupos.obtener_Grupo_por_pk(gru));
                } catch (Exception ex) {
                    System.out.println(ex.getMessage());
                }
                int ciu = cres.getInt("ciudad");
                try {
                    obj.setCiudad(FCiudads.obtener_Ciudad_por_pk(ciu));
                } catch (Exception ex) {
                    System.out.println(ex.getMessage());
                } 
                System.out.println("Datos recuperados correctamente en autenticar usuario;"+obj.getApellidos());
            }
            
        } catch (Exception ex) {
            throw new Exception("Error al ejecutar la sentencia autenticar usuario;"+ex.getMessage());
        }
        return obj;
    }
    
   /* public static Usuario AutenticarAdmin(String item,String pass) throws Exception {
        ArrayList<Parametro> lstpar = new ArrayList<Parametro>();
        ConjuntoResultado cres = null;
        Usuario obj = null; 
        //String sql = "SELECT * FROM public.usuario(?) ;";
        String sql = "SELECT * FROM public.fa_buscar_socio_por_pk_o_email_y_password(?,?);";
        lstpar.add(new Parametro(1, item));
        lstpar.add(new Parametro(2, pass));
        try {
            cres = AccesoDatos.ejecutaQuery(sql, lstpar);
            while (cres.next()) {
                obj = new Usuario();
                obj.setId(cres.getInt("id"));
                obj.setEmail(cres.getString("email"));
                obj.setClave(cres.getString("clave"));
                obj.setEmail(cres.getString("psemail"));
                obj.setNombres(cres.getString("nombres"));
                obj.setApellidos(cres.getString("apellidos"));
                obj.setDireccion(cres.getString("direccion"));
                obj.setTelefono(cres.getString("telefono"));
                obj.setEstado(cres.getString("estado"));
                obj.setDirectorio_virtual("directorio_virtual");
                

            }
            System.out.println("Datos recuperados correctamente en autenticar socio;");
        } catch (Exception ex) {
            System.out.println("Error al ejecutar la sentencia en buscar Usuario por pk;"+ex.toString());
            
        }
        return obj;
    }*/

}
