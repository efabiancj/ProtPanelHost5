// generando base de datos: prot_panel_bd tabla :dominio
// numero de campos : 2
package com.kapyasoft.prot_panel_host5.logica.clases;

public class Dominio {

    private int id;
    private String nombre;
    private Aplicacion aplicacion;

    public Dominio(
        int id, String nombre,Aplicacion aplicacion) {
        this.id = id;
        this.nombre = nombre;
        this.aplicacion= aplicacion;
    }

    public Dominio() {
        this.id = 0;
        this.nombre = "";
        this.aplicacion= null;
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

    public Aplicacion getAplicacion() {
        return aplicacion;
    }

    public void setAplicacion(Aplicacion aplicacion) {
        this.aplicacion = aplicacion;
    }
    
}
