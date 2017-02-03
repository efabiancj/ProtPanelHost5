// generando base de datos: prot_panel_bd tabla :contrato
// numero de campos : 4
package com.kapyasoft.prot_panel_host5.logica.clases;
public class Contrato{
int id;
Object fecha;
Servicio servicio;
Usuario usuario;

public Contrato(
int id,Object fecha,Servicio servicio,Usuario usuario)
{
this.id = id;
this.fecha = fecha;
this.servicio = servicio;
this.usuario = usuario;
}

public Contrato()
{
this.id = 0;
this.fecha = new Object();;
this.servicio = null;
this.usuario = null;
}


public int getId() {
return id;
}
public void setId(int id){
this.id = id;
}

public Object getFecha() {
return fecha;
}
public void setFecha(Object fecha){
this.fecha = fecha;
}

public Servicio getServicio() {
return servicio;
}
public void setServicio(Servicio servicio){
this.servicio = servicio;
}

public Usuario getUsuario() {
return usuario;
}
public void setUsuario(Usuario usuario){
this.usuario = usuario;
}
}
