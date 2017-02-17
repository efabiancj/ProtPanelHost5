// generando base de datos: prot_panel_bd tabla :aplicacion
// numero de campos : 6
package com.kapyasoft.prot_panel_host5.logica.clases;

public class Aplicacion {

    int id;
    String nombre;
    Usuario usuario;
    String directorio;
    String archivo_war;

    public Aplicacion(     int id, String nombre, Usuario usuario, String directorio, String archivo_war) {
        this.id = id;
        this.nombre = nombre;
        this.usuario = usuario;

        this.directorio = directorio;
        this.archivo_war = archivo_war;
    }

    public Aplicacion() {
        this.id = 0;
        this.nombre = "";
        this.usuario = null;

        this.directorio = "";
        this.archivo_war = "";
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public String getDirectorio() {
        return directorio;
    }

    public void setDirectorio(String directorio) {
        this.directorio = directorio;
    }

    public String getArchivo_war() {
        return archivo_war;
    }

    public void setArchivo_war(String archivo_war) {
        this.archivo_war = archivo_war;
    }
}
