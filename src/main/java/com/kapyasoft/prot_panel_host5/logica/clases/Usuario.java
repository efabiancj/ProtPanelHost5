// generando base de datos: prot_panel_bd tabla :usuario
// numero de campos : 11
package com.kapyasoft.prot_panel_host5.logica.clases;
public class Usuario{
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

public Usuario(
String nombres,String apellidos,String direccion,String telefono,String email,String clave,Grupo grupo,int id,String directorio_virtual,Ciudad ciudad,String estado)
{
this.nombres = nombres;
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
}

public Usuario()
{
this.nombres = "";
this.apellidos = "";
this.direccion = "";
this.telefono = "";
this.email = "";
this.clave = "";
this.grupo = null;
this.id = 0;
this.directorio_virtual = "";
this.ciudad = null;
this.estado = "";
}


public String getNombres() {
return nombres;
}
public void setNombres(String nombres){
this.nombres = nombres;
}

public String getApellidos() {
return apellidos;
}
public void setApellidos(String apellidos){
this.apellidos = apellidos;
}

public String getDireccion() {
return direccion;
}
public void setDireccion(String direccion){
this.direccion = direccion;
}

public String getTelefono() {
return telefono;
}
public void setTelefono(String telefono){
this.telefono = telefono;
}

public String getEmail() {
return email;
}
public void setEmail(String email){
this.email = email;
}

public String getClave() {
return clave;
}
public void setClave(String clave){
this.clave = clave;
}

public Grupo getGrupo() {
return grupo;
}
public void setGrupo(Grupo grupo){
this.grupo = grupo;
}

public int getId() {
return id;
}
public void setId(int id){
this.id = id;
}

public String getDirectorio_virtual() {
return directorio_virtual;
}
public void setDirectorio_virtual(String directorio_virtual){
this.directorio_virtual = directorio_virtual;
}

public Ciudad getCiudad() {
return ciudad;
}
public void setCiudad(Ciudad ciudad){
this.ciudad = ciudad;
}

public String getEstado() {
return estado;
}
public void setEstado(String estado){
this.estado = estado;
}
}
