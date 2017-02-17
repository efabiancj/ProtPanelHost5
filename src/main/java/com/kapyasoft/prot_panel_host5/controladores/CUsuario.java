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
import com.kapyasoft.prot_panel_host5.logica.clases.Ciudad;
import com.kapyasoft.prot_panel_host5.logica.clases.Grupo;
import com.kapyasoft.prot_panel_host5.logica.clases.Usuario;
import com.kapyasoft.prot_panel_host5.logica.funciones.FBases_datoss;
import com.kapyasoft.prot_panel_host5.logica.funciones.FCiudads;
import com.kapyasoft.prot_panel_host5.logica.funciones.FUsuarios;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.faces.bean.SessionScoped;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.ViewScoped;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;

/**
 *
 * @author efabiancj
 */

@ViewScoped
@ManagedBean(name = "cUsuario")
@SessionScoped
@RequestScoped
public  class CUsuario implements Serializable{

    private Usuario usuario;
    private ArrayList<Usuario> usuarios;
    private ArrayList<Ciudad> lstciud;
    
    private String nombres;
    private String apellidos;
    private String direccion;
    private String telefono;
    private String email;
    private String clave;

    private Grupo grupo;
    private int id;
    private String directorio_virtual;
    private Ciudad ciudad;
    private String estado;
   
    private String ciudset;
    private String mensaje;
    private String nickname;
    private int ultimo;
    private String sugerencia;
    private String claveRep;
    public CUsuario() {
        mensaje = "";
        grupo= new Grupo();
        grupo.setId(2);
        try
        {
           lstciud=FCiudads.obtener_Todos_Ciudads();
        } 
        catch(Exception ex)
        {
            mensaje = ex.getMessage();
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, mensaje, "My bad!"));
        }
        
        try
        {
           ultimo = FUsuarios.obtenerultimo();
        } 
        catch(Exception ex)
        {
            mensaje += ex.getMessage();
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, mensaje, "My bad!"));
        }

        directorio_virtual = "generando"  ;
        estado = "A" ;
        id = ultimo+1 ;
    }

  

    public String getCiudset() {
        return ciudset;
    }

    public void setCiudset(String ciudset) {
        this.ciudset = ciudset;
    }


   
    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public ArrayList<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(ArrayList<Usuario> usuarios) {
        this.usuarios = usuarios;
    }



    public boolean validar_usuario_repetido(FacesContext fc, UIComponent uic, Object o) {
        boolean res = false;
     
        return res;
    }

    public void reset() {

    }

    public void listar_usuarios()
    {
        try {
            usuarios=FUsuarios.obtener_Todos_Usuarios();
            mensaje = "Usuarios cargados correctamente";
        } catch (Exception ex) {
            Logger.getLogger(CUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public ArrayList<Ciudad> getLstciud() {
        return lstciud;
    }

    public void setLstciud(ArrayList<Ciudad> lstciud) {
        this.lstciud = lstciud;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public Grupo getGrupo() {
        return grupo;
    }

    public void setGrupo(Grupo grupo) {
        this.grupo = grupo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDirectorio_virtual() {
        return directorio_virtual;
    }

    public void setDirectorio_virtual(String directorio_virtual) {
        this.directorio_virtual = directorio_virtual;
    }

    public Ciudad getCiudad() {
        return ciudad;
    }

    public void setCiudad(Ciudad ciudad) {
        this.ciudad = ciudad;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    
    
    public void ingresar_usuario() throws Exception {
        
        Usuario repetido = null;
        usuario = new Usuario();
        usuario.setEmail(email);
        usuario.setGrupo(grupo);
        int id_ciud= Integer.parseInt(ciudset);
        try
        {
           ciudad = FCiudads.obtener_Ciudad_por_pk(id_ciud);
        }
        catch(Exception ex)
        {
        }
        usuario.setCiudad(ciudad);
        usuario.setApellidos(apellidos);
        usuario.setNombres(nombres);
       // String pass = FStrings.encriptar_cod3(clave,""+id);
        usuario.setClave(clave);
        usuario.setDireccion(direccion);
        usuario.setTelefono(telefono);
        usuario.setEstado(estado);
        usuario.setId(id);
        usuario.setDirectorio_ftp(generar_nombre_directorio());
        usuario.setNickname(nickname);        
        
        
        mensaje = mensaje+ "ingresando user: "+
                usuario.getId()+" "+
                usuario.getApellidos() +
                usuario.getNombres() +
                usuario.getTelefono()+
                " estado "+ usuario.getEstado()  +
                
                usuario.getClave() +
                usuario.getCiudad().getNombre()+
                usuario.getGrupo().getDescripcion()+
                usuario.getNickname();
        try {
            repetido = FUsuarios.obtener_Usuario_por_email(usuario.getEmail()); //validacion del lado del servidor
            System.out.println("repetido "+repetido);
            if (!(repetido == null)) {

                mensaje = mensaje+ "Ya existe ese email ";
                System.out.println(mensaje);
            }
            else 
            {
                repetido = FUsuarios.obtener_Usuario_por_nickname(usuario.getNickname());//validacion del lado del servidor
                System.out.println("repetido nickname "+repetido);
                if (!(repetido == null)) 
                {
                }
                else
                {
                    System.out.println("no repetido nickname"+repetido);
                   if (FUsuarios.ingresar(usuario)) {
                            String directorio_a_crear = FStrings.borrar_ultimos_caracteres(usuario.getDirectorio_ftp(),1);
                            generar_directorio_ftp_real(directorio_a_crear);
                            crear_usuario_bd();
                            mensaje = mensaje+ "Ingresado con exito :";

                          // FacesContext.getCurrentInstance().addMessage("lblmensaje", new FacesMessage(mensaje));
                            System.out.println(mensaje);
                            FacesContext.getCurrentInstance().getExternalContext().redirect("login.xhtml");
                        } else {
                            mensaje = mensaje+  "A ocurrido un error el usuario no se ha ingresado:";
                            System.out.println(mensaje);
                    }
                }
                
            }
        } catch (Exception ex) {
            mensaje = mensaje+ "Este es el error: " + ex.getMessage();
            System.out.println(mensaje+ex.getMessage());

        }
        System.out.println(mensaje);
    }
    
    public boolean controlar_nickname()
    {
        boolean res=false;
        
        return res;
    }
    
    public String generar_nombre_directorio()
    {
        String res="";
        res = Global.dir_base_usuarios+nickname+Global.separador_dir;  //separador==/ o \\
        return res;
    }
    
    public String generar_sugerencia_nickname()
    {
        String res="";
        res = FStrings.separarCorreo(usuario.getEmail()+"_"+usuario.getId());
        return res;
    }
    
    public String generar_directorio_ftp_real(String path)
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
    
    public int crear_usuario_bd()
    {
        int res=0;
        try
        {
            FBases_datoss.crear_usuario_base_datos_pg(usuario.getNickname(),usuario.getClave());
            FBases_datoss.asignar_permisos_usario_crear_bd_pg(usuario.getNickname());
        }
        catch(Exception ex)
        {
        }
        return res;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public int getUltimo() {
        return ultimo;
    }

    public void setUltimo(int ultimo) {
        this.ultimo = ultimo;
    }

    public String getSugerencia() {
        return sugerencia;
    }

    public void setSugerencia(String sugerencia) {
        this.sugerencia = sugerencia;
    }

    public String getClaveRep() {
        return claveRep;
    }

    public void setClaveRep(String claveRep) {
        this.claveRep = claveRep;
    }
    
}
