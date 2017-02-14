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
import com.kapyasoft.prot_panel_host5.logica.clases.Ciudad;
import com.kapyasoft.prot_panel_host5.logica.clases.Grupo;
import com.kapyasoft.prot_panel_host5.logica.clases.Usuario;
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

    Usuario usuario;
    ArrayList<Usuario> usuarios;
    ArrayList<Ciudad> lstciud;
    
    String nombres;
    String apellidos;
    String direccion;
    String telefono;
    String email;
    String clave;
    Grupo grupo;
    int id;
    String directorio_virtual;
    Ciudad ciudad;
    String estado;
   
    String ciudset;
    String mensaje;
    int ultimo;
   
    public CUsuario() {
      // mensaje = "";
        this.lstciud = new ArrayList<>();
        this.usuarios = new ArrayList<Usuario>();
        this.usuario = new Usuario();
        this.apellidos = "";
        this.direccion = "";
        this.telefono = "";
        this.email = "";
        this.clave = "";
        this.grupo = new Grupo();
        this.id = 0;
        this.directorio_virtual = "";
        this.ciudad = new Ciudad();
        this.estado = "";
        this.ciudset = "Escoja";
        this.ultimo = 0;
    }

    public CUsuario(Usuario usuario, ArrayList<Usuario> usuarios, String apellidos, String direccion, String telefono, String email, String clave, Grupo grupo, int id, String directorio_virtual, Ciudad ciudad, String estado, String ciudset, String mensaje, int ultimo) {
        this.usuario = usuario;
        this.usuarios = usuarios;
        this.apellidos = apellidos;
        this.direccion = direccion;
        this.telefono = telefono;
        this.email = email;
        this.clave = clave;
        this.grupo = grupo;
        this.id = id;
        this.directorio_virtual = directorio_virtual;
        this.ciudad = ciudad;
        this.estado = estado;
        this.ciudset = ciudset;
        this.mensaje = mensaje;
        this.ultimo = ultimo;
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
 
    public void ingresar_usuario(){
        
        //mensaje = "Se ha ingresado un nuevo usuario.";
        mensaje = "Error - No se ha ingresado el usuario.";
        FacesContext.getCurrentInstance().addMessage("lblmensaje", new FacesMessage(mensaje));
    }
    
    public String generar_nombre_directorio()
    {
        String res="";

        return res;
    }
    
    public String generar_directorios()
    {
        String res="";

        return res;
    }
}
