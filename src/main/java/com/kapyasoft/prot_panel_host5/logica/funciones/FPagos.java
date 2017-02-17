package com.kapyasoft.prot_panel_host5.logica.funciones;
import acceso.AccesoDatos;
import acceso.ConjuntoResultado;
import acceso.Parametro;
import com.kapyasoft.prot_panel_host5.logica.clases.Pago;
import java.sql.Date;
import java.sql.SQLException;
import java.util.ArrayList;


public class FPagos{
public static ArrayList<Pago> obtener_Todos_Pagos() throws Exception
{
ArrayList<Pago> lst = new ArrayList<Pago>();
Pago obj = null;
ConjuntoResultado cres= null;
String sql =" SELECT   id, valor, mes, fecha_pago, usuario FROM public.pago;";
try {
cres = AccesoDatos.ejecutaQuery(sql);
while(cres.next())
{
obj= new Pago();
obj.setId(cres.getInt("id"));
obj.setValor(cres.getDouble("valor"));
obj.setMes(cres.getInt("mes"));;
obj.setFecha_pago(cres.getDate("fecha_pago"));
obj.setUsuario(FUsuarios.obtener_Usuario_por_pk(cres.getInt("usuario")));
lst.add(obj);
}
} catch (Exception ex) {
throw new Exception("Error al ejecutar la sentencia en Obtener todos los Pago");
}
return lst;
}
public static Pago obtener_Pago_por_pk(int id) throws Exception
{
ArrayList<Parametro> lstpar = new ArrayList<Parametro>();
ConjuntoResultado cres= null;
Pago obj = null;
String sql =" SELECT   id, valor, mes, fecha_pago, usuario FROM public.pago;";
try {
cres = AccesoDatos.ejecutaQuery(sql,lstpar);
while(cres.next())
{
obj = new Pago();
obj.setId(cres.getInt("id"));
obj.setValor(cres.getDouble("valor"));
obj.setMes(cres.getInt("mes"));;
obj.setFecha_pago(cres.getDate("fecha_pago"));
obj.setUsuario(FUsuarios.obtener_Usuario_por_pk(cres.getInt("usuario")));
}
} catch (Exception ex) {
throw new Exception("Error al ejecutar la sentencia en buscar Pago por pk;");
}
return obj;
}
public static ArrayList<Pago> obtenerPagopor_campo_id(int id)  throws Exception
{
ArrayList<Parametro> lstpar = new ArrayList<Parametro>();
ArrayList<Pago> lst = new ArrayList<Pago>();
ConjuntoResultado cres= null;
Pago obj = null;
String sql =" SELECT   id, valor, mes, fecha_pago, usuario FROM public.pago where id = ? ;";
lstpar.add(new Parametro(1,id));
try {
cres = AccesoDatos.ejecutaQuery(sql,lstpar);
while(cres.next())
{
obj = new Pago();
obj.setId(cres.getInt("id"));
obj.setValor(cres.getDouble("valor"));
obj.setMes(cres.getInt("mes"));;
obj.setFecha_pago(cres.getDate("fecha_pago"));
obj.setUsuario(FUsuarios.obtener_Usuario_por_pk(cres.getInt("usuario")));
lst.add(obj);
}
} catch (Exception ex) {
throw new Exception("Error al ejecutar la sentencia en buscar Pago por campotabla;");
}
return lst;
}
public static ArrayList<Pago> obtenerPagopor_campo_valor(double valor)  throws Exception
{
ArrayList<Parametro> lstpar = new ArrayList<Parametro>();
ArrayList<Pago> lst = new ArrayList<Pago>();
ConjuntoResultado cres= null;
Pago obj = null;
String sql =" SELECT   id, valor, mes, fecha_pago, usuario FROM public.pago where valor = ? ;";
lstpar.add(new Parametro(1,valor));
try {
cres = AccesoDatos.ejecutaQuery(sql,lstpar);
while(cres.next())
{
obj = new Pago();
obj.setId(cres.getInt("id"));
obj.setValor(cres.getDouble("valor"));
obj.setMes(cres.getInt("mes"));;
obj.setFecha_pago(cres.getDate("fecha_pago"));
obj.setUsuario(FUsuarios.obtener_Usuario_por_pk(cres.getInt("usuario")));
lst.add(obj);
}
} catch (Exception ex) {
throw new Exception("Error al ejecutar la sentencia en buscar Pago por campotabla;");
}
return lst;
}
public static ArrayList<Pago> obtenerPagopor_campo_mes(Date mes)  throws Exception
{
ArrayList<Parametro> lstpar = new ArrayList<Parametro>();
ArrayList<Pago> lst = new ArrayList<Pago>();
ConjuntoResultado cres= null;
Pago obj = null;
String sql =" SELECT   id, valor, mes, fecha_pago, usuario FROM public.pago where mes = ? ;";
lstpar.add(new Parametro(1,mes));
try {
cres = AccesoDatos.ejecutaQuery(sql,lstpar);
while(cres.next())
{
obj = new Pago();
obj.setId(cres.getInt("id"));
obj.setValor(cres.getDouble("valor"));
obj.setMes(cres.getInt("mes"));;
obj.setFecha_pago(cres.getDate("fecha_pago"));
obj.setUsuario(FUsuarios.obtener_Usuario_por_pk(cres.getInt("usuario")));
lst.add(obj);
}
} catch (Exception ex) {
throw new Exception("Error al ejecutar la sentencia en buscar Pago por campotabla;");
}
return lst;
}
public static ArrayList<Pago> obtenerPagopor_campo_fecha_pago(Date fecha_pago)  throws Exception
{
ArrayList<Parametro> lstpar = new ArrayList<Parametro>();
ArrayList<Pago> lst = new ArrayList<Pago>();
ConjuntoResultado cres= null;
Pago obj = null;
String sql =" SELECT   id, valor, mes, fecha_pago, usuario FROM public.pago where fecha_pago = ? ;";
lstpar.add(new Parametro(1,fecha_pago));
try {
cres = AccesoDatos.ejecutaQuery(sql,lstpar);
while(cres.next())
{
obj = new Pago();
obj.setId(cres.getInt("id"));
obj.setValor(cres.getDouble("valor"));
obj.setMes(cres.getInt("mes"));;
obj.setFecha_pago(cres.getDate("fecha_pago"));
obj.setUsuario(FUsuarios.obtener_Usuario_por_pk(cres.getInt("usuario")));
lst.add(obj);
}
} catch (Exception ex) {
throw new Exception("Error al ejecutar la sentencia en buscar Pago por campotabla;");
}
return lst;
}
public static ArrayList<Pago> obtenerPagopor_campo_usuario(int usuario)  throws Exception
{
ArrayList<Parametro> lstpar = new ArrayList<Parametro>();
ArrayList<Pago> lst = new ArrayList<Pago>();
ConjuntoResultado cres= null;
Pago obj = null;
String sql =" SELECT   id, valor, mes, fecha_pago, usuario FROM public.pago where usuario = ? ;";
lstpar.add(new Parametro(1,usuario));
try {
cres = AccesoDatos.ejecutaQuery(sql,lstpar);
while(cres.next())
{
obj = new Pago();
obj.setId(cres.getInt("id"));
obj.setValor(cres.getDouble("valor"));
obj.setMes(cres.getInt("mes"));;
obj.setFecha_pago(cres.getDate("fecha_pago"));
obj.setUsuario(FUsuarios.obtener_Usuario_por_pk(cres.getInt("usuario")));
lst.add(obj);
}
} catch (Exception ex) {
throw new Exception("Error al ejecutar la sentencia en buscar Pago por campotabla;");
}
return lst;
}
public static boolean ingresar(Pago pago) throws Exception
{
ArrayList<Parametro> lstpar = new ArrayList<Parametro>();
ConjuntoResultado cres= null;
boolean eje = false;
String sql ="INSERT INTO public.pago((id,valor,mes,fecha_pago,usuario)) VALUES ((?????) ;";
 lstpar.add(new Parametro(1,pago.getId()));  lstpar.add(new Parametro(1,pago.getValor()));  lstpar.add(new Parametro(1,pago.getMes()));  lstpar.add(new Parametro(1,pago.getFecha_pago()));  lstpar.add(new Parametro(1,pago.getUsuario())); 
try {
ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstpar);
while(rs.next())
{
if (rs.getString(0).equals("true"));
eje = true;
}
} catch (Exception ex) {
throw new Exception("Error al ejecutar la sentencia en ingresar Pago ");
}
return eje;
}
public static boolean actualizar(Pago pago) throws Exception
{
ArrayList<Parametro> lstpar = new ArrayList<Parametro>();
ConjuntoResultado cres= null;
boolean eje = false;
//String sql = "UPDATE public.pago SET (id = ?,valor = ?,mes = ?,fecha_pago = ?,usuario = ?) WHERE (int ;";
String sql = "SELECT * FROM public.fa_actualizar_pago(?,?,?,?,?);";
 lstpar.add(new Parametro(1,pago.getId()));  lstpar.add(new Parametro(1,pago.getValor()));  lstpar.add(new Parametro(1,pago.getMes()));  lstpar.add(new Parametro(1,pago.getFecha_pago()));  lstpar.add(new Parametro(1,pago.getUsuario())); 
try {
ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstpar);
while(rs.next())
{
if (rs.getString(0).equals("true"));
eje = true;
}
} catch (Exception ex) {
throw new Exception("Error al ejecutar la sentencia en actualizar Pago ");
}
return eje;
}
public static boolean eliminar(Pago pago) throws Exception
{
ArrayList<Parametro> lstpar = new ArrayList<Parametro>();
boolean eje = false;
//String sql = "DELETE FROM public.pago  WHERE  ;";
String sql = "SELECT * FROM public.fa_eliminar_pago(?);";
 lstpar.add(new Parametro(1,pago.getId())); 
try {
ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstpar);
while(rs.next())
{
if (rs.getString(0).equals("true"));
eje = true;
}
} catch (Exception ex) {
throw new Exception("Error al ejecutar la sentencia en eliminar Pago ");
}
return eje;
}
}
