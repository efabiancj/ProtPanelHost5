// generando base de datos: prot_panel_bd tabla :bases_datos
// numero de campos : 3
package com.kapyasoft.prot_panel_host5.logica.clases;

public class Bases_datos {

    private int id;
    private String nombre;
    private Usuario usuario;
    private String directorio;

    public Bases_datos(
            int id, String nombre, Usuario usuario,String directorio) {
        this.id = id;
        this.nombre = nombre;
        this.usuario = usuario;
        this.directorio=directorio;
    }

    public Bases_datos() {
        this.id = 0;
        this.nombre = "";
        this.usuario = null;
        this.directorio="";
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
    
    
}
