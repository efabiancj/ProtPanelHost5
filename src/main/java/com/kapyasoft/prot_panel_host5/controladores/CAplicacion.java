/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kapyasoft.prot_panel_host5.controladores;

/**
 *
 * @author Edgar
 */
import acceso.Global;
import clases_utiles.FStrings;
import clases_utiles.Terminal;
import com.kapyasoft.prot_panel_host5.especificaciones.Prot_panel_host;
import com.kapyasoft.prot_panel_host5.logica.clases.Aplicacion;
import com.kapyasoft.prot_panel_host5.logica.clases.Usuario;
import com.kapyasoft.prot_panel_host5.logica.funciones.FAplicacions;
import com.kapyasoft.prot_panel_host5.logica.funciones.FUsuarios;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.faces.application.FacesMessage;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;


//<f:metadata> <f:viewParam name="nickname" value="#{cUsuario_cuenta.nickname}"/></f:metadata>      //parametros url
//<f:event listener="#{controladorAcceso.verifyUseLogin(event)}" type="preRenderView"></f:event>     //verificar
@ViewScoped
@ManagedBean(name = "cAplicacion")
@SessionScoped
@RequestScoped
public class CAplicacion implements Serializable {

    private List<Aplicacion> aplicaciones;
    private Aplicacion selectedAplicacion;
    private Aplicacion aplicacion;
    private String aplicset;
    private int codigo;

    private int id_usuario;
    private String nombre_auth;
    private Usuario usuario;

    private int id;
    private String nombre;
    private String directorio;
    private String archivo_war;
    private String mensaje;
    
    private int ultima;
    private int param_aplic_id;

    public CAplicacion() {
        
        nombre_auth = ControladorAcceso.Sesion();
        System.out.print("\nCargaando..aplicaciones de "+nombre_auth );
        ultima = 0;
        try {
            usuario = FUsuarios.obtener_Usuario_por_email(nombre_auth);
            System.out.print("usuario id "+usuario.getId());
        } catch (Exception ex) {
            System.out.print("Error "+nombre_auth +" "+ex.getMessage());
        }
        
        ultima =0;
        try {
            ultima = FAplicacions.obtenerultimo();
            System.out.print("ultima aplicacion "+ultima);
        } catch (Exception ex) {
            System.out.print("Error "+nombre_auth +" "+ex.getMessage());
        }
        
        aplicaciones        = new ArrayList<Aplicacion>();
        selectedAplicacion  = new Aplicacion();
        aplicacion          = new Aplicacion();
        
        id      =       ultima+1;
        //nombre  =       generar_nombre_aplicacion();
        //directorio  =   generar_nombre_directorio();
        archivo_war =   "ninguno";
  
        //nombre_auth = "nombr1@gmail.com";
        try {
            this.aplicaciones = FAplicacions.obtenerAplicacionpor_campo_usuario(usuario.getId());
            for(Aplicacion a: aplicaciones)
            {
                System.out.print("\nid "+a.getId());
                System.out.print("\nnombre "+a.getNombre());
            }

        } catch (Exception ex) {
            System.out.print("Error "+nombre_auth +" "+ex.getMessage());
        }
    }

    public Aplicacion getSelectedAplicacion() {
        return selectedAplicacion;
    }

    public void setSelectedAplicacion(Aplicacion selectedAplicacion) {
        this.selectedAplicacion = selectedAplicacion;
    }

    public List<Aplicacion> getAplicacions() {
        return aplicaciones;
    }

    public Aplicacion getAplicacion() {

        return aplicacion;
    }

    public void setAplicacion(Aplicacion aplicacion) {
        this.aplicacion = aplicacion;
    }

    public String getAplicset() {
        return aplicset;
    }

    public void setAplicset(String aplicset) {
        this.aplicset = aplicset;
    }

    public int getCodigo() {
        try {
            codigo = FAplicacions.obtenerultimo() + 1;
        } catch (Exception ex) {
            codigo = 0;
        }
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre_auth() {
        return nombre_auth;
    }

    public void setNombre_auth(String nombre_auth) {
        this.nombre_auth = nombre_auth;
    }

    public List<Aplicacion> getAplicaciones() {
        return aplicaciones;
    }

    public void setAplicaciones(List<Aplicacion> aplicaciones) {
        this.aplicaciones = aplicaciones;
    }

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getArchivo_war() {
        return archivo_war;
    }

    public void setArchivo_war(String archivo_war) {
        this.archivo_war = archivo_war;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDirectorio() {
        return directorio;
    }

    public void setDirectorio(String directorio) {
        this.directorio = directorio;
    }

    public void ingresar() throws Exception {

        Aplicacion repetido = null;
        aplicacion = new Aplicacion();
        aplicacion.setId(this.id);
        aplicacion.setNombre(this.nombre);
        aplicacion.setDirectorio(generar_nombre_directorio());
        aplicacion.setArchivo_war("ninguno");

        aplicacion.setUsuario(usuario);

        try {
            repetido = FAplicacions.obtenerAplicacionpor_campo_nombre(nombre);
            if (repetido != null) {
                mensaje = mensaje + "Ya existe ese nombre ";
            } else {
                if (FAplicacions.ingresar(aplicacion)) 
                {
                    mensaje = mensaje + "Ingresado con exito :";
                    FacesContext.getCurrentInstance().addMessage("lblmensaje", new FacesMessage(mensaje));
                    String directorio_a_crear = FStrings.borrar_ultimos_caracteres(aplicacion.getDirectorio(),1);
                    generar_directorio_real(directorio_a_crear);
                    FacesContext.getCurrentInstance().getExternalContext().redirect("subir_archivos_app.xhtml?id="+aplicacion.getId());
  
                } else {
                    mensaje = mensaje + "A ocurrido un error el usuario no se ha ingresado:";
                }
            }
        } catch (Exception ex) {
            mensaje = mensaje + "Este es el error: " + ex.getMessage();
            System.out.println(mensaje + ex.getMessage());
        }
        System.out.println(mensaje);
    }
    
    public String generar_directorio_real(String path)
    {
        String res="";
        Prot_panel_host p = new Prot_panel_host();
        try
        {
        if(Terminal.crear_directorio_linux(path))
        {
            mensaje = "Directorios de usuario generados";
            FacesContext.getCurrentInstance().addMessage("lblmensaje", new FacesMessage(mensaje));
            System.out.println(mensaje);
        }
        }
        catch(Exception ex)
        {
        System.out.println(ex.getMessage());}
        return res;
    }
    public String generar_nombre_directorio()
    {
        String res="";
        String dir_aplicacion = usuario.getDirectorio_ftp()+nombre+Global.separador_dir;  // separador = / o \\
        res = dir_aplicacion; 
        return res;
    }
    
    public String generar_directorios()
    {
        String res="";
        Prot_panel_host p = new Prot_panel_host();
        int r1=0;
        try
        {
            if(Global.SO.equalsIgnoreCase("WIN"))
            {
              r1 = Terminal.Comando3(usuario.getDirectorio_ftp(),"md","bd_"+nombre);
            }
            else if(Global.SO.equalsIgnoreCase("LIN"))
            {
                r1 =Terminal.ComandoLinux(usuario.getDirectorio_ftp(),"mkdir "+nombre);
            }
        }
        catch(Exception ex)
        {
            mensaje = "Error - "+ex.getMessage();
            FacesContext.getCurrentInstance().addMessage("lblmensaje", new FacesMessage(mensaje));
        }

       
        return res;
    }
    
  

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public int getUltima() {
        return ultima;
    }

    public void setUltima(int ultima) {
        this.ultima = ultima;
    }

    public int getParam_aplic_id() {
        return param_aplic_id;
    }

    public void setParam_aplic_id(int param_aplic_id) {
        this.param_aplic_id = param_aplic_id;
    }
    
    public void ver_aplicacion() 
    {
        try
        {
          FacesContext.getCurrentInstance().getExternalContext().redirect("ver_aplicacion.xhtml?id="+selectedAplicacion.getId());
          
        }
        catch(Exception ex)
        {
            System.out.print("Error en CAplicacion.ver_aplicacion() "+ex.getMessage());
        }
    }
}
