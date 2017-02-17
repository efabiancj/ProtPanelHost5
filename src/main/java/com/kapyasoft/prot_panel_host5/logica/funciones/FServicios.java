package com.kapyasoft.prot_panel_host5.logica.funciones;
import acceso.AccesoDatos;
import acceso.ConjuntoResultado;
import acceso.Parametro;
import com.kapyasoft.prot_panel_host5.logica.clases.Servicio;
import java.sql.SQLException;
import java.util.ArrayList;


public class FServicios{
public static ArrayList<Servicio> obtener_Todos_Servicios() throws Exception
{
ArrayList<Servicio> lst = new ArrayList<Servicio>();
Servicio obj = null;
ConjuntoResultado cres= null;
String sql =" SELECT   id, descripcion, costo FROM public.servicio;";
try {
cres = AccesoDatos.ejecutaQuery(sql);
while(cres.next())
{
obj= new Servicio();
obj.setId(cres.getInt("id"));
obj.setDescripcion(cres.getString("descripcion"));
obj.setCosto(cres.getDouble("costo"));
lst.add(obj);
}
} catch (Exception ex) {
throw new Exception("Error al ejecutar la sentencia en Obtener todos los Servicio");
}
return lst;
}
public static Servicio obtener_Servicio_por_pk(int id) throws Exception
{
ArrayList<Parametro> lstpar = new ArrayList<Parametro>();
ConjuntoResultado cres= null;
Servicio obj = null;
String sql =" SELECT   id, descripcion, costo FROM public.servicio;";
try {
cres = AccesoDatos.ejecutaQuery(sql,lstpar);
while(cres.next())
{
obj = new Servicio();
obj.setId(cres.getInt("id"));
obj.setDescripcion(cres.getString("descripcion"));
obj.setCosto(cres.getDouble("costo"));
}
} catch (Exception ex) {
throw new Exception("Error al ejecutar la sentencia en buscar Servicio por pk;");
}
return obj;
}
public static ArrayList<Servicio> obtenerServiciopor_campo_id(int id)  throws Exception
{
ArrayList<Parametro> lstpar = new ArrayList<Parametro>();
ArrayList<Servicio> lst = new ArrayList<Servicio>();
ConjuntoResultado cres= null;
Servicio obj = null;
String sql =" SELECT   id, descripcion, costo FROM public.servicio where id = ? ;";
lstpar.add(new Parametro(1,id));
try {
cres = AccesoDatos.ejecutaQuery(sql,lstpar);
while(cres.next())
{
obj = new Servicio();
obj.setId(cres.getInt("id"));
obj.setDescripcion(cres.getString("descripcion"));
obj.setCosto(cres.getDouble("costo"));
lst.add(obj);
}
} catch (Exception ex) {
throw new Exception("Error al ejecutar la sentencia en buscar Servicio por campotabla;");
}
return lst;
}
public static ArrayList<Servicio> obtenerServiciopor_campo_descripcion(String descripcion)  throws Exception
{
ArrayList<Parametro> lstpar = new ArrayList<Parametro>();
ArrayList<Servicio> lst = new ArrayList<Servicio>();
ConjuntoResultado cres= null;
Servicio obj = null;
String sql =" SELECT   id, descripcion, costo FROM public.servicio where descripcion = ? ;";
lstpar.add(new Parametro(1,descripcion));
try {
cres = AccesoDatos.ejecutaQuery(sql,lstpar);
while(cres.next())
{
obj = new Servicio();
obj.setId(cres.getInt("id"));
obj.setDescripcion(cres.getString("descripcion"));
obj.setCosto(cres.getDouble("costo"));
lst.add(obj);
}
} catch (Exception ex) {
throw new Exception("Error al ejecutar la sentencia en buscar Servicio por campotabla;");
}
return lst;
}
public static ArrayList<Servicio> obtenerServiciopor_campo_costo(double costo)  throws Exception
{
ArrayList<Parametro> lstpar = new ArrayList<Parametro>();
ArrayList<Servicio> lst = new ArrayList<Servicio>();
ConjuntoResultado cres= null;
Servicio obj = null;
String sql =" SELECT   id, descripcion, costo FROM public.servicio where costo = ? ;";
lstpar.add(new Parametro(1,costo));
try {
cres = AccesoDatos.ejecutaQuery(sql,lstpar);
while(cres.next())
{
obj = new Servicio();
obj.setId(cres.getInt("id"));
obj.setDescripcion(cres.getString("descripcion"));
obj.setCosto(cres.getDouble("costo"));
lst.add(obj);
}
} catch (Exception ex) {
throw new Exception("Error al ejecutar la sentencia en buscar Servicio por campotabla;");
}
return lst;
}
public static boolean ingresar(Servicio servicio) throws Exception
{
ArrayList<Parametro> lstpar = new ArrayList<Parametro>();
ConjuntoResultado cres= null;
boolean eje = false;
String sql ="INSERT INTO public.servicio((id,descripcion,costo)) VALUES ((???) ;";
 lstpar.add(new Parametro(1,servicio.getId()));  lstpar.add(new Parametro(1,servicio.getDescripcion()));  lstpar.add(new Parametro(1,servicio.getCosto())); 
try {
ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstpar);
while(rs.next())
{
if (rs.getString(0).equals("true"));
eje = true;
}
} catch (Exception ex) {
throw new Exception("Error al ejecutar la sentencia en ingresar Servicio ");
}
return eje;
}
public static boolean actualizar(Servicio servicio) throws Exception
{
ArrayList<Parametro> lstpar = new ArrayList<Parametro>();
ConjuntoResultado cres= null;
boolean eje = false;
//String sql = "UPDATE public.servicio SET (id = ?,descripcion = ?,costo = ?) WHERE (int ;";
String sql = "SELECT * FROM public.fa_actualizar_servicio(?,?,?);";
 lstpar.add(new Parametro(1,servicio.getId()));  lstpar.add(new Parametro(1,servicio.getDescripcion()));  lstpar.add(new Parametro(1,servicio.getCosto())); 
try {
ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstpar);
while(rs.next())
{
if (rs.getString(0).equals("true"));
eje = true;
}
} catch (Exception ex) {
throw new Exception("Error al ejecutar la sentencia en actualizar Servicio ");
}
return eje;
}
public static boolean eliminar(Servicio servicio) throws Exception
{
ArrayList<Parametro> lstpar = new ArrayList<Parametro>();
boolean eje = false;
//String sql = "DELETE FROM public.servicio  WHERE  ;";
String sql = "SELECT * FROM public.fa_eliminar_servicio(?);";
 lstpar.add(new Parametro(1,servicio.getId())); 
try {
ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstpar);
while(rs.next())
{
if (rs.getString(0).equals("true"));
eje = true;
}
} catch (Exception ex) {
throw new Exception("Error al ejecutar la sentencia en eliminar Servicio ");
}
return eje;
}
}
