// generando base de datos: prot_panel_bd tabla :ciudad
// numero de campos : 2
package com.kapyasoft.prot_panel_host5.logica.clases;
public class Ciudad{
int id;
String nombre;

public Ciudad(
int id,String nombre)
{
this.id = id;
this.nombre = nombre;
}

public Ciudad()
{
this.id = 0;
this.nombre = "";
}


public int getId() {
return id;
}
public void setId(int id){
this.id = id;
}

public String getNombre() {
return nombre;
}
public void setNombre(String nombre){
this.nombre = nombre;
}
}
