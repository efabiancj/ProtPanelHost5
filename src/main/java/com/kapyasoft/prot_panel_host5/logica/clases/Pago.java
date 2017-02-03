// generando base de datos: prot_panel_bd tabla :pago
// numero de campos : 5
package com.kapyasoft.prot_panel_host5.logica.clases;
public class Pago{
int id;
double valor;
int mes;
Object fecha_pago;
Usuario usuario;

public Pago(
int id,double valor,int mes,Object fecha_pago,Usuario usuario)
{
this.id = id;
this.valor = valor;
this.mes = mes;
this.fecha_pago = fecha_pago;
this.usuario = usuario;
}

public Pago()
{
this.id = 0;
this.valor = 0;
this.mes = 0;
this.fecha_pago = new Object();;
this.usuario = null;
}


public int getId() {
return id;
}
public void setId(int id){
this.id = id;
}

public double getValor() {
return valor;
}
public void setValor(double valor){
this.valor = valor;
}

public int getMes() {
return mes;
}
public void setMes(int mes){
this.mes = mes;
}

public Object getFecha_pago() {
return fecha_pago;
}
public void setFecha_pago(Object fecha_pago){
this.fecha_pago = fecha_pago;
}

public Usuario getUsuario() {
return usuario;
}
public void setUsuario(Usuario usuario){
this.usuario = usuario;
}
}
