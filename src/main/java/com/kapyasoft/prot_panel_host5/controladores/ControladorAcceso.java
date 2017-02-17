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

import java.io.IOException;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;

import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.ComponentSystemEvent;
import javax.servlet.http.HttpSession;

import clases_utiles.FStrings;
import com.kapyasoft.prot_panel_host5.logica.clases.Grupo;
import com.kapyasoft.prot_panel_host5.logica.clases.Usuario;
import com.kapyasoft.prot_panel_host5.logica.funciones.FAutenticacion;
import com.kapyasoft.prot_panel_host5.logica.funciones.FUsuarios;




/**
 *
 * @author efabiancj
 */
@ManagedBean
@SessionScoped
public class ControladorAcceso {

   // private static final long serialVersionUID = 1L; 
    static private String login;
    
    private String password;
    
    private boolean isLoggedIn;
    static public Usuario usuario;
    static private Grupo grupo;
       

    public boolean isIsLoggedIn() {
        return isLoggedIn;
    }

    public void setIsLoggedIn(boolean isLoggedIn) {
        this.isLoggedIn = isLoggedIn;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    

    
    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public ControladorAcceso(String login, String password, boolean isLoggedIn, Usuario usuario) {
        this.login = login;
        this.password = password;
        this.isLoggedIn = isLoggedIn;
        this.usuario = usuario;
    }
    public ControladorAcceso() {
        this.login = "";
        this.password ="";
        this.usuario = new Usuario();
    }

    
    public void autenticar() {
       FacesContext.getCurrentInstance().addMessage("intentando autenticar.."+getLogin()+" "+getPassword(),new FacesMessage("intentando autenticar con datos:"+getLogin()+" "+getPassword()));
       String pass= "";
       Usuario usuario_buscado = null;
       try
       {
           usuario_buscado = FUsuarios.obtener_Usuario_por_email(this.login);
           if(usuario_buscado != null)
           {    
           //String  pass_no_encrip = this.password;
           //pass = FStrings.encriptar_cod3(pass_no_encrip,usuario_buscado.getId()+""); 
           pass = this.password;
      
           this.usuario = FAutenticacion.Autenticar(this.login, pass);
           if((usuario != null))
             {
                this.grupo = usuario.getGrupo();
                if(usuario.getEstado().equalsIgnoreCase("A"))
                {
                    
                    FacesContext.getCurrentInstance().getExternalContext().getSessionMap().put("USUARIO",this.usuario);
                    HttpSession session = (HttpSession) FacesContext.getCurrentInstance().getExternalContext().getSession(true);
                    System.out.println("usuario encontrado "+this.password+" "+ this.login);
                    isLoggedIn=true;
                    FacesContext.getCurrentInstance().getExternalContext().redirect("panel_cliente.xhtml");
                 }
              }
              else
              {
                    FacesContext.getCurrentInstance().addMessage("clave incorrecta..",new FacesMessage("clave incorrecta"));
                    System.out.println("clave incorrecta "+this.password+" "+ this.login);
                    isLoggedIn=false;
              }
           }
           else //si no encuentra correo
           {
                        FacesContext.getCurrentInstance().addMessage("no se encuentra e usuario..",new FacesMessage("no se encuentra e usuario"));
                        System.out.println("no se encuentra e usuario"+this.password+" "+ this.login);
                        isLoggedIn=false;
           }
       }
       catch(Exception ex)
       {
          FacesContext.getCurrentInstance().addMessage("Error: "+ex.getMessage(),new FacesMessage("Error: "+ex.getMessage()));
          System.out.println("Error al loguearse usuario: "+this.login+" pass:"+this.password+ex.getMessage());
       }
    }

    public void logout()
    {
        System.out.println("Intentando cerrar sesion");
        HttpSession session = (HttpSession) FacesContext.getCurrentInstance().getExternalContext().getSession(false);
        session.invalidate();
        isLoggedIn=false;
        doRedirect("index.xhtml");
    }
    /**
     * An event listener for redirecting the user to login page if he/she is not
     * currently logged in
     *
     * @param event
     */
   public void verifyUseLogin(ComponentSystemEvent event) {
        if (!isLoggedIn)
        {
            doRedirect("login.xhtml");
        }
    }
    
    public void registrar()
    {
        try
        {
           FacesContext context = FacesContext.getCurrentInstance();
            context.getExternalContext().redirect("registro.xhtml");
        }
        catch(Exception er)
        {
            
        }
        
    }

    /**
     * Method for redirecting a request
     *
     * @param url
     */
    private void doRedirect(String url) {
        try {
            FacesContext context = FacesContext.getCurrentInstance();
            context.getExternalContext().redirect(url);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    static public String Sesion()
    {
        return login;
    }

    static public Grupo getGrupo() {
        return grupo;
    }

    public void setGrupo(Grupo grupo) {
        this.grupo = grupo;
    }
    
      
}
