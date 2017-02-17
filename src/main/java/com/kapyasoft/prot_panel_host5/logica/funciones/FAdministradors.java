package com.kapyasoft.prot_panel_host5.logica.funciones;
import acceso.AccesoDatos;
import acceso.ConjuntoResultado;
import acceso.Parametro;
import com.kapyasoft.prot_panel_host5.logica.clases.Administrador;
import java.sql.SQLException;
import java.util.ArrayList;


public class FAdministradors{
public static ArrayList<Administrador> obtener_Todos_Administradors() throws Exception
{
ArrayList<Administrador> lst = new ArrayList<Administrador>();
Administrador obj = null;
ConjuntoResultado cres= null;
String sql =" SELECT   codigo, nombres, apellidos, direccion, telefono, email, clave, grupo FROM public.administrador;";
try {
cres = AccesoDatos.ejecutaQuery(sql);
while(cres.next())
{
obj= new Administrador();
obj.setCodigo(cres.getString("codigo"));
obj.setNombres(cres.getString("nombres"));
obj.setApellidos(cres.getString("apellidos"));
obj.setDireccion(cres.getString("direccion"));
obj.setTelefono(cres.getString("telefono"));
obj.setEmail(cres.getString("email"));
obj.setClave(cres.getString("clave"));
obj.setGrupo(FGrupos.obtener_Grupo_por_pk(cres.getInt("grupo")));
lst.add(obj);
}
} catch (Exception ex) {
throw new Exception("Error al ejecutar la sentencia en Obtener todos los Administrador");
}
return lst;
}
public static Administrador obtener_Administrador_por_pk(String codigo) throws Exception
{
ArrayList<Parametro> lstpar = new ArrayList<Parametro>();
ConjuntoResultado cres= null;
Administrador obj = null;
String sql =" SELECT   codigo, nombres, apellidos, direccion, telefono, email, clave, grupo FROM public.administrador;";
try {
cres = AccesoDatos.ejecutaQuery(sql,lstpar);
while(cres.next())
{
obj = new Administrador();
obj.setCodigo(cres.getString("codigo"));
obj.setNombres(cres.getString("nombres"));
obj.setApellidos(cres.getString("apellidos"));
obj.setDireccion(cres.getString("direccion"));
obj.setTelefono(cres.getString("telefono"));
obj.setEmail(cres.getString("email"));
obj.setClave(cres.getString("clave"));
obj.setGrupo(FGrupos.obtener_Grupo_por_pk(cres.getInt("grupo")));
}
} catch (Exception ex) {
throw new Exception("Error al ejecutar la sentencia en buscar Administrador por pk;");
}
return obj;
}
public static ArrayList<Administrador> obtenerAdministradorpor_campo_codigo(String codigo)  throws Exception
{
ArrayList<Parametro> lstpar = new ArrayList<Parametro>();
ArrayList<Administrador> lst = new ArrayList<Administrador>();
ConjuntoResultado cres= null;
Administrador obj = null;
String sql =" SELECT   codigo, nombres, apellidos, direccion, telefono, email, clave, grupo FROM public.administrador where codigo = ? ;";
lstpar.add(new Parametro(1,codigo));
try {
cres = AccesoDatos.ejecutaQuery(sql,lstpar);
while(cres.next())
{
obj = new Administrador();
obj.setCodigo(cres.getString("codigo"));
obj.setNombres(cres.getString("nombres"));
obj.setApellidos(cres.getString("apellidos"));
obj.setDireccion(cres.getString("direccion"));
obj.setTelefono(cres.getString("telefono"));
obj.setEmail(cres.getString("email"));
obj.setClave(cres.getString("clave"));
obj.setGrupo(FGrupos.obtener_Grupo_por_pk(cres.getInt("grupo")));
lst.add(obj);
}
} catch (Exception ex) {
throw new Exception("Error al ejecutar la sentencia en buscar Administrador por campotabla;");
}
return lst;
}
public static ArrayList<Administrador> obtenerAdministradorpor_campo_nombres(String nombres)  throws Exception
{
ArrayList<Parametro> lstpar = new ArrayList<Parametro>();
ArrayList<Administrador> lst = new ArrayList<Administrador>();
ConjuntoResultado cres= null;
Administrador obj = null;
String sql =" SELECT   codigo, nombres, apellidos, direccion, telefono, email, clave, grupo FROM public.administrador where nombres = ? ;";
lstpar.add(new Parametro(1,nombres));
try {
cres = AccesoDatos.ejecutaQuery(sql,lstpar);
while(cres.next())
{
obj = new Administrador();
obj.setCodigo(cres.getString("codigo"));
obj.setNombres(cres.getString("nombres"));
obj.setApellidos(cres.getString("apellidos"));
obj.setDireccion(cres.getString("direccion"));
obj.setTelefono(cres.getString("telefono"));
obj.setEmail(cres.getString("email"));
obj.setClave(cres.getString("clave"));
obj.setGrupo(FGrupos.obtener_Grupo_por_pk(cres.getInt("grupo")));
lst.add(obj);
}
} catch (Exception ex) {
throw new Exception("Error al ejecutar la sentencia en buscar Administrador por campotabla;");
}
return lst;
}
public static ArrayList<Administrador> obtenerAdministradorpor_campo_apellidos(String apellidos)  throws Exception
{
ArrayList<Parametro> lstpar = new ArrayList<Parametro>();
ArrayList<Administrador> lst = new ArrayList<Administrador>();
ConjuntoResultado cres= null;
Administrador obj = null;
String sql =" SELECT   codigo, nombres, apellidos, direccion, telefono, email, clave, grupo FROM public.administrador where apellidos = ? ;";
lstpar.add(new Parametro(1,apellidos));
try {
cres = AccesoDatos.ejecutaQuery(sql,lstpar);
while(cres.next())
{
obj = new Administrador();
obj.setCodigo(cres.getString("codigo"));
obj.setNombres(cres.getString("nombres"));
obj.setApellidos(cres.getString("apellidos"));
obj.setDireccion(cres.getString("direccion"));
obj.setTelefono(cres.getString("telefono"));
obj.setEmail(cres.getString("email"));
obj.setClave(cres.getString("clave"));
obj.setGrupo(FGrupos.obtener_Grupo_por_pk(cres.getInt("grupo")));
lst.add(obj);
}
} catch (Exception ex) {
throw new Exception("Error al ejecutar la sentencia en buscar Administrador por campotabla;");
}
return lst;
}
public static ArrayList<Administrador> obtenerAdministradorpor_campo_direccion(String direccion)  throws Exception
{
ArrayList<Parametro> lstpar = new ArrayList<Parametro>();
ArrayList<Administrador> lst = new ArrayList<Administrador>();
ConjuntoResultado cres= null;
Administrador obj = null;
String sql =" SELECT   codigo, nombres, apellidos, direccion, telefono, email, clave, grupo FROM public.administrador where direccion = ? ;";
lstpar.add(new Parametro(1,direccion));
try {
cres = AccesoDatos.ejecutaQuery(sql,lstpar);
while(cres.next())
{
obj = new Administrador();
obj.setCodigo(cres.getString("codigo"));
obj.setNombres(cres.getString("nombres"));
obj.setApellidos(cres.getString("apellidos"));
obj.setDireccion(cres.getString("direccion"));
obj.setTelefono(cres.getString("telefono"));
obj.setEmail(cres.getString("email"));
obj.setClave(cres.getString("clave"));
obj.setGrupo(FGrupos.obtener_Grupo_por_pk(cres.getInt("grupo")));
lst.add(obj);
}
} catch (Exception ex) {
throw new Exception("Error al ejecutar la sentencia en buscar Administrador por campotabla;");
}
return lst;
}
public static ArrayList<Administrador> obtenerAdministradorpor_campo_telefono(String telefono)  throws Exception
{
ArrayList<Parametro> lstpar = new ArrayList<Parametro>();
ArrayList<Administrador> lst = new ArrayList<Administrador>();
ConjuntoResultado cres= null;
Administrador obj = null;
String sql =" SELECT   codigo, nombres, apellidos, direccion, telefono, email, clave, grupo FROM public.administrador where telefono = ? ;";
lstpar.add(new Parametro(1,telefono));
try {
cres = AccesoDatos.ejecutaQuery(sql,lstpar);
while(cres.next())
{
obj = new Administrador();
obj.setCodigo(cres.getString("codigo"));
obj.setNombres(cres.getString("nombres"));
obj.setApellidos(cres.getString("apellidos"));
obj.setDireccion(cres.getString("direccion"));
obj.setTelefono(cres.getString("telefono"));
obj.setEmail(cres.getString("email"));
obj.setClave(cres.getString("clave"));
obj.setGrupo(FGrupos.obtener_Grupo_por_pk(cres.getInt("grupo")));
lst.add(obj);
}
} catch (Exception ex) {
throw new Exception("Error al ejecutar la sentencia en buscar Administrador por campotabla;");
}
return lst;
}
public static ArrayList<Administrador> obtenerAdministradorpor_campo_email(String email)  throws Exception
{
ArrayList<Parametro> lstpar = new ArrayList<Parametro>();
ArrayList<Administrador> lst = new ArrayList<Administrador>();
ConjuntoResultado cres= null;
Administrador obj = null;
String sql =" SELECT   codigo, nombres, apellidos, direccion, telefono, email, clave, grupo FROM public.administrador where email = ? ;";
lstpar.add(new Parametro(1,email));
try {
cres = AccesoDatos.ejecutaQuery(sql,lstpar);
while(cres.next())
{
obj = new Administrador();
obj.setCodigo(cres.getString("codigo"));
obj.setNombres(cres.getString("nombres"));
obj.setApellidos(cres.getString("apellidos"));
obj.setDireccion(cres.getString("direccion"));
obj.setTelefono(cres.getString("telefono"));
obj.setEmail(cres.getString("email"));
obj.setClave(cres.getString("clave"));
obj.setGrupo(FGrupos.obtener_Grupo_por_pk(cres.getInt("grupo")));
lst.add(obj);
}
} catch (Exception ex) {
throw new Exception("Error al ejecutar la sentencia en buscar Administrador por campotabla;");
}
return lst;
}
public static ArrayList<Administrador> obtenerAdministradorpor_campo_clave(String clave)  throws Exception
{
ArrayList<Parametro> lstpar = new ArrayList<Parametro>();
ArrayList<Administrador> lst = new ArrayList<Administrador>();
ConjuntoResultado cres= null;
Administrador obj = null;
String sql =" SELECT   codigo, nombres, apellidos, direccion, telefono, email, clave, grupo FROM public.administrador where clave = ? ;";
lstpar.add(new Parametro(1,clave));
try {
cres = AccesoDatos.ejecutaQuery(sql,lstpar);
while(cres.next())
{
obj = new Administrador();
obj.setCodigo(cres.getString("codigo"));
obj.setNombres(cres.getString("nombres"));
obj.setApellidos(cres.getString("apellidos"));
obj.setDireccion(cres.getString("direccion"));
obj.setTelefono(cres.getString("telefono"));
obj.setEmail(cres.getString("email"));
obj.setClave(cres.getString("clave"));
obj.setGrupo(FGrupos.obtener_Grupo_por_pk(cres.getInt("grupo")));
lst.add(obj);
}
} catch (Exception ex) {
throw new Exception("Error al ejecutar la sentencia en buscar Administrador por campotabla;");
}
return lst;
}
public static ArrayList<Administrador> obtenerAdministradorpor_campo_grupo(int grupo)  throws Exception
{
ArrayList<Parametro> lstpar = new ArrayList<Parametro>();
ArrayList<Administrador> lst = new ArrayList<Administrador>();
ConjuntoResultado cres= null;
Administrador obj = null;
String sql =" SELECT   codigo, nombres, apellidos, direccion, telefono, email, clave, grupo FROM public.administrador where grupo = ? ;";
lstpar.add(new Parametro(1,grupo));
try {
cres = AccesoDatos.ejecutaQuery(sql,lstpar);
while(cres.next())
{
obj = new Administrador();
obj.setCodigo(cres.getString("codigo"));
obj.setNombres(cres.getString("nombres"));
obj.setApellidos(cres.getString("apellidos"));
obj.setDireccion(cres.getString("direccion"));
obj.setTelefono(cres.getString("telefono"));
obj.setEmail(cres.getString("email"));
obj.setClave(cres.getString("clave"));
obj.setGrupo(FGrupos.obtener_Grupo_por_pk(cres.getInt("grupo")));
lst.add(obj);
}
} catch (Exception ex) {
throw new Exception("Error al ejecutar la sentencia en buscar Administrador por campotabla;");
}
return lst;
}
public static boolean ingresar(Administrador administrador) throws Exception
{
ArrayList<Parametro> lstpar = new ArrayList<Parametro>();
ConjuntoResultado cres= null;
boolean eje = false;
String sql ="INSERT INTO public.administrador((codigo,nombres,apellidos,direccion,telefono,email,clave,grupo)) VALUES ((????????) ;";
 lstpar.add(new Parametro(1,administrador.getCodigo()));  lstpar.add(new Parametro(1,administrador.getNombres()));  lstpar.add(new Parametro(1,administrador.getApellidos()));  lstpar.add(new Parametro(1,administrador.getDireccion()));  lstpar.add(new Parametro(1,administrador.getTelefono()));  lstpar.add(new Parametro(1,administrador.getEmail()));  lstpar.add(new Parametro(1,administrador.getClave()));  lstpar.add(new Parametro(1,administrador.getGrupo())); 
try {
ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstpar);
while(rs.next())
{
if (rs.getString(0).equals("true"));
eje = true;
}
} catch (Exception ex) {
throw new Exception("Error al ejecutar la sentencia en ingresar Administrador ");
}
return eje;
}
public static boolean actualizar(Administrador administrador) throws Exception
{
ArrayList<Parametro> lstpar = new ArrayList<Parametro>();
ConjuntoResultado cres= null;
boolean eje = false;
//String sql = "UPDATE public.administrador SET (codigo = ?,nombres = ?,apellidos = ?,direccion = ?,telefono = ?,email = ?,clave = ?,grupo = ?) WHERE (String cod ;";
String sql = "SELECT * FROM public.fa_actualizar_administrador(?,?,?,?,?,?,?,?);";
 lstpar.add(new Parametro(1,administrador.getCodigo()));  lstpar.add(new Parametro(1,administrador.getNombres()));  lstpar.add(new Parametro(1,administrador.getApellidos()));  lstpar.add(new Parametro(1,administrador.getDireccion()));  lstpar.add(new Parametro(1,administrador.getTelefono()));  lstpar.add(new Parametro(1,administrador.getEmail()));  lstpar.add(new Parametro(1,administrador.getClave()));  lstpar.add(new Parametro(1,administrador.getGrupo())); 
try {
ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstpar);
while(rs.next())
{
if (rs.getString(0).equals("true"));
eje = true;
}
} catch (Exception ex) {
throw new Exception("Error al ejecutar la sentencia en actualizar Administrador ");
}
return eje;
}
public static boolean eliminar(Administrador administrador) throws Exception
{
ArrayList<Parametro> lstpar = new ArrayList<Parametro>();
boolean eje = false;
//String sql = "DELETE FROM public.administrador  WHERE (String ;";
String sql = "SELECT * FROM public.fa_eliminar_administrador(?);";
 lstpar.add(new Parametro(1,administrador.getCodigo())); 
try {
ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstpar);
while(rs.next())
{
if (rs.getString(0).equals("true"));
eje = true;
}
} catch (Exception ex) {
throw new Exception("Error al ejecutar la sentencia en eliminar Administrador ");
}
return eje;
}
}
