package com.kapyasoft.prot_panel_host5.logica.funciones;
import acceso.AccesoDatos;
import acceso.ConjuntoResultado;
import acceso.Parametro;
import com.kapyasoft.prot_panel_host5.logica.clases.Contrato;
import java.sql.Date;
import java.sql.SQLException;
import java.util.ArrayList;


public class FContratos{
public static ArrayList<Contrato> obtener_Todos_Contratos() throws Exception
{
ArrayList<Contrato> lst = new ArrayList<Contrato>();
Contrato obj = null;
ConjuntoResultado cres= null;
String sql =" SELECT   id, fecha, servicio, usuario FROM public.contrato;";
try {
cres = AccesoDatos.ejecutaQuery(sql);
while(cres.next())
{
obj= new Contrato();
obj.setId(cres.getInt("id"));
obj.setFecha(cres.getDate("fecha"));
obj.setServicio(FServicios.obtener_Servicio_por_pk(cres.getInt("servicio")));
obj.setUsuario(FUsuarios.obtener_Usuario_por_pk(cres.getInt("usuario")));
lst.add(obj);
}
} catch (Exception ex) {
throw new Exception("Error al ejecutar la sentencia en Obtener todos los Contrato");
}
return lst;
}
public static Contrato obtener_Contrato_por_pk(int id) throws Exception
{
ArrayList<Parametro> lstpar = new ArrayList<Parametro>();
ConjuntoResultado cres= null;
Contrato obj = null;
String sql =" SELECT   id, fecha, servicio, usuario FROM public.contrato;";
try {
cres = AccesoDatos.ejecutaQuery(sql,lstpar);
while(cres.next())
{
obj = new Contrato();
obj.setId(cres.getInt("id"));
obj.setFecha(cres.getDate("fecha"));
obj.setServicio(FServicios.obtener_Servicio_por_pk(cres.getInt("servicio")));
obj.setUsuario(FUsuarios.obtener_Usuario_por_pk(cres.getInt("usuario")));
}
} catch (Exception ex) {
throw new Exception("Error al ejecutar la sentencia en buscar Contrato por pk;");
}
return obj;
}
public static ArrayList<Contrato> obtenerContratopor_campo_id(int id)  throws Exception
{
ArrayList<Parametro> lstpar = new ArrayList<Parametro>();
ArrayList<Contrato> lst = new ArrayList<Contrato>();
ConjuntoResultado cres= null;
Contrato obj = null;
String sql =" SELECT   id, fecha, servicio, usuario FROM public.contrato where id = ? ;";
lstpar.add(new Parametro(1,id));
try {
cres = AccesoDatos.ejecutaQuery(sql,lstpar);
while(cres.next())
{
obj = new Contrato();
obj.setId(cres.getInt("id"));
obj.setFecha(cres.getDate("fecha"));
obj.setServicio(FServicios.obtener_Servicio_por_pk(cres.getInt("servicio")));
obj.setUsuario(FUsuarios.obtener_Usuario_por_pk(cres.getInt("usuario")));
lst.add(obj);
}
} catch (Exception ex) {
throw new Exception("Error al ejecutar la sentencia en buscar Contrato por campotabla;");
}
return lst;
}
public static ArrayList<Contrato> obtenerContratopor_campo_fecha(Date fecha)  throws Exception
{
ArrayList<Parametro> lstpar = new ArrayList<Parametro>();
ArrayList<Contrato> lst = new ArrayList<Contrato>();
ConjuntoResultado cres= null;
Contrato obj = null;
String sql =" SELECT   id, fecha, servicio, usuario FROM public.contrato where fecha = ? ;";
lstpar.add(new Parametro(1,fecha));
try {
cres = AccesoDatos.ejecutaQuery(sql,lstpar);
while(cres.next())
{
obj = new Contrato();
obj.setId(cres.getInt("id"));
obj.setFecha(cres.getDate("fecha"));
obj.setServicio(FServicios.obtener_Servicio_por_pk(cres.getInt("servicio")));
obj.setUsuario(FUsuarios.obtener_Usuario_por_pk(cres.getInt("usuario")));
lst.add(obj);
}
} catch (Exception ex) {
throw new Exception("Error al ejecutar la sentencia en buscar Contrato por campotabla;");
}
return lst;
}
public static ArrayList<Contrato> obtenerContratopor_campo_servicio(int servicio)  throws Exception
{
ArrayList<Parametro> lstpar = new ArrayList<Parametro>();
ArrayList<Contrato> lst = new ArrayList<Contrato>();
ConjuntoResultado cres= null;
Contrato obj = null;
String sql =" SELECT   id, fecha, servicio, usuario FROM public.contrato where servicio = ? ;";
lstpar.add(new Parametro(1,servicio));
try {
cres = AccesoDatos.ejecutaQuery(sql,lstpar);
while(cres.next())
{
obj = new Contrato();
obj.setId(cres.getInt("id"));
obj.setFecha(cres.getDate("fecha"));
obj.setServicio(FServicios.obtener_Servicio_por_pk(cres.getInt("servicio")));
obj.setUsuario(FUsuarios.obtener_Usuario_por_pk(cres.getInt("usuario")));
lst.add(obj);
}
} catch (Exception ex) {
throw new Exception("Error al ejecutar la sentencia en buscar Contrato por campotabla;");
}
return lst;
}
public static ArrayList<Contrato> obtenerContratopor_campo_usuario(int usuario)  throws Exception
{
ArrayList<Parametro> lstpar = new ArrayList<Parametro>();
ArrayList<Contrato> lst = new ArrayList<Contrato>();
ConjuntoResultado cres= null;
Contrato obj = null;
String sql =" SELECT   id, fecha, servicio, usuario FROM public.contrato where usuario = ? ;";
lstpar.add(new Parametro(1,usuario));
try {
cres = AccesoDatos.ejecutaQuery(sql,lstpar);
while(cres.next())
{
obj = new Contrato();
obj.setId(cres.getInt("id"));
obj.setFecha(cres.getDate("fecha"));
obj.setServicio(FServicios.obtener_Servicio_por_pk(cres.getInt("servicio")));
obj.setUsuario(FUsuarios.obtener_Usuario_por_pk(cres.getInt("usuario")));
lst.add(obj);
}
} catch (Exception ex) {
throw new Exception("Error al ejecutar la sentencia en buscar Contrato por campotabla;");
}
return lst;
}
public static boolean ingresar(Contrato contrato) throws Exception
{
ArrayList<Parametro> lstpar = new ArrayList<Parametro>();
ConjuntoResultado cres= null;
boolean eje = false;
String sql ="INSERT INTO public.contrato((id,fecha,servicio,usuario)) VALUES ((????) ;";
 lstpar.add(new Parametro(1,contrato.getId()));  lstpar.add(new Parametro(1,contrato.getFecha()));  lstpar.add(new Parametro(1,contrato.getServicio()));  lstpar.add(new Parametro(1,contrato.getUsuario())); 
try {
ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstpar);
while(rs.next())
{
if (rs.getString(0).equals("true"));
eje = true;
}
} catch (Exception ex) {
throw new Exception("Error al ejecutar la sentencia en ingresar Contrato ");
}
return eje;
}
public static boolean actualizar(Contrato contrato) throws Exception
{
ArrayList<Parametro> lstpar = new ArrayList<Parametro>();
ConjuntoResultado cres= null;
boolean eje = false;
//String sql = "UPDATE public.contrato SET (id = ?,fecha = ?,servicio = ?,usuario = ?) WHERE (int ;";
String sql = "SELECT * FROM public.fa_actualizar_contrato(?,?,?,?);";
 lstpar.add(new Parametro(1,contrato.getId()));  lstpar.add(new Parametro(1,contrato.getFecha()));  lstpar.add(new Parametro(1,contrato.getServicio()));  lstpar.add(new Parametro(1,contrato.getUsuario())); 
try {
ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstpar);
while(rs.next())
{
if (rs.getString(0).equals("true"));
eje = true;
}
} catch (Exception ex) {
throw new Exception("Error al ejecutar la sentencia en actualizar Contrato ");
}
return eje;
}
public static boolean eliminar(Contrato contrato) throws Exception
{
ArrayList<Parametro> lstpar = new ArrayList<Parametro>();
boolean eje = false;
//String sql = "DELETE FROM public.contrato  WHERE  ;";
String sql = "SELECT * FROM public.fa_eliminar_contrato(?);";
 lstpar.add(new Parametro(1,contrato.getId())); 
try {
ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstpar);
while(rs.next())
{
if (rs.getString(0).equals("true"));
eje = true;
}
} catch (Exception ex) {
throw new Exception("Error al ejecutar la sentencia en eliminar Contrato ");
}
return eje;
}
}
