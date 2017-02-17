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
import clases_utiles.Terminal;
import com.kapyasoft.prot_panel_host5.logica.clases.Bases_datos;
import com.kapyasoft.prot_panel_host5.logica.clases.Usuario;
import com.kapyasoft.prot_panel_host5.logica.funciones.FBases_datoss;
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
@ManagedBean(name = "cBases")
@SessionScoped
@RequestScoped
public class CBases implements Serializable {

    private List<Bases_datos> bases;
    private Bases_datos selectedBase;
    private Bases_datos base;
    private String baseset;
    private int codigo;
    private String nombre_auth;
    

    private int id;
    private String nombre;
    private Usuario usuario;
    private String directorio;
    
    private String mensaje;
    
    private int ultima;
    private int param_aplic_id;

    public CBases() {
        
        nombre_auth = ControladorAcceso.Sesion();
        System.out.print("\nCargaando..bases de "+nombre_auth );
        ultima = 0;
        try {
            usuario = FUsuarios.obtener_Usuario_por_email(nombre_auth);
            System.out.print("usuario id "+usuario.getId());
        } catch (Exception ex) {
            System.out.print("Error "+nombre_auth +" "+ex.getMessage());
        }
        
        ultima =0;
        try {
            ultima = FBases_datoss.obtenerultimo();
            System.out.print("ultima bd "+ultima);
        } catch (Exception ex) {
            System.out.print("Error "+nombre_auth +" "+ex.getMessage());
        }
        
        bases          = new ArrayList<Bases_datos>();
        selectedBase   = new Bases_datos();
        base           = new Bases_datos();
        
        id      =       ultima+1;
        //nombre  =       generar_nombre_aplicacion();
        //directorio  =   generar_nombre_directorio();
        //nombre_auth = "nombr1@gmail.com";
        try {
            this.bases = FBases_datoss.obtenerBases_datospor_campo_usuario(usuario.getId());
            for(Bases_datos b: bases)
            {
                System.out.print("\nid "+b.getId());
                System.out.print("\nnombre "+b.getNombre());
            }

        } catch (Exception ex) {
            System.out.print("Error "+nombre_auth +" "+ex.getMessage());
        }
    }

    public Bases_datos getSelectedBases() {
        return selectedBase;
    }

    public void setSelectedBases(Bases_datos selectedBase) {
        this.selectedBase = selectedBase;
    }

    public List<Bases_datos> getBases() {
        return bases;
    }

    public Bases_datos getBase() {

        return base;
    }

    public void setBases(Bases_datos base) {
        this.base = base;
    }

    public String getBaseset() {
        return baseset;
    }

    public void setBaseset(String baseset) {
        this.baseset = baseset;
    }

    public int getCodigo() {
        try {
            codigo = FBases_datoss.obtenerultimo() + 1;
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

    public List<Bases_datos> getBaseses() {
        return bases;
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


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public void ingresar() throws Exception {

        Bases_datos repetido = null;
        base = new Bases_datos();
        base.setId(this.id);
        base.setNombre(this.nombre);
        base.setDirectorio(generar_nombre_directorio());
        base.setUsuario(usuario);

        try {
            repetido = FBases_datoss.obtenerBases_datospor_campo_nombre(nombre);
            if (repetido != null) {
                mensaje = mensaje + "Ya existe ese nombre ";
            } else {
                if (FBases_datoss.ingresar(base)) 
                {
                    mensaje = mensaje + "Ingresado con exito :";
                    FacesContext.getCurrentInstance().addMessage("lblmensaje", new FacesMessage(mensaje));
                    generar_directorios();
                    crear_bd_pg();
                    FacesContext.getCurrentInstance().getExternalContext().redirect("subir_archivos_base.xhtml?id="+base.getId());
  
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
    public String generar_nombre_directorio()
    {
        String res="";
        String dir_base = usuario.getDirectorio_ftp()+"bd_"+nombre+Global.separador_dir;  // separador = / o \\
        res = dir_base; 
        return res;
    }
    
    public String generar_directorios()
    {
        String res="";
        int r1=0;
        try
        {
            if(Global.SO.equalsIgnoreCase("WIN"))
            {
              r1 = Terminal.Comando3(usuario.getDirectorio_ftp(),"md","bd_"+nombre);
            }
            else if(Global.SO.equalsIgnoreCase("LIN"))
            {
                r1 =Terminal.ComandoLinux(usuario.getDirectorio_ftp(),"mkdir "+"bd_"+nombre);
            }
        }
        catch(Exception ex)
        {
            mensaje = "Error - "+ex.getMessage();
            FacesContext.getCurrentInstance().addMessage("lblmensaje", new FacesMessage(mensaje));
        }
        return res;
    }
    
    public int crear_bd_pg()
    {
        System.out.println("Creando bd pg en CBases...crear_bd_pg");
        int res=0;
        try
        {
            FBases_datoss.crear_base_datos_pg(nombre, usuario.getNickname());
            System.out.println("todo ok en crear_bd_pg");
            // FBases_datoss.crear_base_datos_pg(nombre, "postgres");
        }
        catch(Exception ex)
        {
            System.out.println("Error Creando bd pg en CBases...crear_bd_pg"+ex.getMessage());
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
    
    public void ver_base() 
    {
        try
        {
          FacesContext.getCurrentInstance().getExternalContext().redirect("ver_base.xhtml?id="+selectedBase.getId());
          
        }
        catch(Exception ex)
        {
            System.out.print("Error en CBases.ver_base() "+ex.getMessage());
        }
    }

 
    public void setBases(List<Bases_datos> bases) {
        this.bases = bases;
    }

    public Bases_datos getSelectedBase() {
        return selectedBase;
    }

    public void setSelectedBase(Bases_datos selectedBase) {
        this.selectedBase = selectedBase;
    }

 
    public void setBase(Bases_datos base) {
        this.base = base;
    }

    public String getDirectorio() {
        return directorio;
    }

    public void setDirectorio(String directorio) {
        this.directorio = directorio;
    }
    
}
