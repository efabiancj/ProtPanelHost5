// generando base de datos: prot_panel_bd tabla :servicio
// numero de campos : 3
package com.kapyasoft.prot_panel_host5.logica.clases;
public class Servicio{
int id;
String descripcion;
double costo;

public Servicio(
int id,String descripcion,double costo)
{
this.id = id;
this.descripcion = descripcion;
this.costo = costo;
}

public Servicio()
{
this.id = 0;
this.descripcion = "";
this.costo = 0;
}


public int getId() {
return id;
}
public void setId(int id){
this.id = id;
}

public String getDescripcion() {
return descripcion;
}
public void setDescripcion(String descripcion){
this.descripcion = descripcion;
}

public double getCosto() {
return costo;
}
public void setCosto(double costo){
this.costo = costo;
}
}
