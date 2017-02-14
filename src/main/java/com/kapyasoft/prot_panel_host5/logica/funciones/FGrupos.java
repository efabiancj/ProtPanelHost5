package com.kapyasoft.prot_panel_host5.logica.funciones;
import acceso.AccesoDatos;
import acceso.ConjuntoResultado;
import acceso.Parametro;
import com.kapyasoft.prot_panel_host5.logica.clases.Grupo;
import java.sql.SQLException;
import java.util.ArrayList;


public class FGrupos{
public static ArrayList<Grupo> obtener_Todos_Grupos() throws Exception
{
ArrayList<Grupo> lst = new ArrayList<Grupo>();
Grupo obj = null;
ConjuntoResultado cres= null;
String sql =" SELECT   id, descripcion FROM public.grupo;";
try {
cres = AccesoDatos.ejecutaQuery(sql);
while(cres.next())
{
obj= new Grupo();
obj.setId(cres.getInt("id"));
obj.setDescripcion(cres.getString("descripcion"));
lst.add(obj);
}
} catch (Exception ex) {
throw new Exception("Error al ejecutar la sentencia en Obtener todos los Grupo");
}
return lst;
}
public static Grupo obtener_Grupo_por_pk(int id) throws Exception
{
ArrayList<Parametro> lstpar = new ArrayList<Parametro>();
ConjuntoResultado cres= null;
Grupo obj = null;
String sql =" SELECT   id, descripcion FROM public.grupo where id=?;";
try {
    Parametro parm = new Parametro(1,id);
    lstpar.add(parm);
cres = AccesoDatos.ejecutaQuery(sql,lstpar);
while(cres.next())
{
obj = new Grupo();
obj.setId(cres.getInt("id"));
obj.setDescripcion(cres.getString("descripcion"));
}
} catch (Exception ex) {
throw new Exception("Error al ejecutar la sentencia en buscar Grupo por pk;");
}
return obj;
}
public static ArrayList<Grupo> obtenerGrupopor_campo_id(int id)  throws Exception
{
ArrayList<Parametro> lstpar = new ArrayList<Parametro>();
ArrayList<Grupo> lst = new ArrayList<Grupo>();
ConjuntoResultado cres= null;
Grupo obj = null;
String sql =" SELECT   id, descripcion FROM public.grupo where id = ? ;";
lstpar.add(new Parametro(1,id));
try {
cres = AccesoDatos.ejecutaQuery(sql,lstpar);
while(cres.next())
{
obj = new Grupo();
obj.setId(cres.getInt("id"));
obj.setDescripcion(cres.getString("descripcion"));
lst.add(obj);
}
} catch (Exception ex) {
throw new Exception("Error al ejecutar la sentencia en buscar Grupo por campotabla;");
}
return lst;
}
public static ArrayList<Grupo> obtenerGrupopor_campo_descripcion(String descripcion)  throws Exception
{
ArrayList<Parametro> lstpar = new ArrayList<Parametro>();
ArrayList<Grupo> lst = new ArrayList<Grupo>();
ConjuntoResultado cres= null;
Grupo obj = null;
String sql =" SELECT   id, descripcion FROM public.grupo where descripcion = ? ;";
lstpar.add(new Parametro(1,descripcion));
try {
cres = AccesoDatos.ejecutaQuery(sql,lstpar);
while(cres.next())
{
obj = new Grupo();
obj.setId(cres.getInt("id"));
obj.setDescripcion(cres.getString("descripcion"));
lst.add(obj);
}
} catch (Exception ex) {
throw new Exception("Error al ejecutar la sentencia en buscar Grupo por campotabla;");
}
return lst;
}
public static boolean ingresar(Grupo grupo) throws Exception
{
ArrayList<Parametro> lstpar = new ArrayList<Parametro>();
ConjuntoResultado cres= null;
boolean eje = false;
String sql ="INSERT INTO public.grupo((id,descripcion)) VALUES ((??) ;";
 lstpar.add(new Parametro(1,grupo.getId()));  lstpar.add(new Parametro(1,grupo.getDescripcion())); 
try {
ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstpar);
while(rs.next())
{
if (rs.getString(0).equals("true"));
eje = true;
}
} catch (Exception ex) {
throw new Exception("Error al ejecutar la sentencia en ingresar Grupo ");
}
return eje;
}
public static boolean actualizar(Grupo grupo) throws Exception
{
ArrayList<Parametro> lstpar = new ArrayList<Parametro>();
ConjuntoResultado cres= null;
boolean eje = false;
//String sql = "UPDATE public.grupo SET (id = ?,descripcion = ?) WHERE (int ;";
String sql = "SELECT * FROM public.fa_actualizar_grupo(?,?);";
 lstpar.add(new Parametro(1,grupo.getId()));  lstpar.add(new Parametro(1,grupo.getDescripcion())); 
try {
ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstpar);
while(rs.next())
{
if (rs.getString(0).equals("true"));
eje = true;
}
} catch (Exception ex) {
throw new Exception("Error al ejecutar la sentencia en actualizar Grupo ");
}
return eje;
}
public static boolean eliminar(Grupo grupo) throws Exception
{
ArrayList<Parametro> lstpar = new ArrayList<Parametro>();
boolean eje = false;
//String sql = "DELETE FROM public.grupo  WHERE  ;";
String sql = "SELECT * FROM public.fa_eliminar_grupo(?);";
 lstpar.add(new Parametro(1,grupo.getId())); 
try {
ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstpar);
while(rs.next())
{
if (rs.getString(0).equals("true"));
eje = true;
}
} catch (Exception ex) {
throw new Exception("Error al ejecutar la sentencia en eliminar Grupo ");
}
return eje;
}
}
