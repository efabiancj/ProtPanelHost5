/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kapyasoft.prot_panel_host5.controladores;

import acceso.Global;
import clases_utiles.FArchivos;
import clases_utiles.FStrings;
import clases_utiles.Terminal;
import com.kapyasoft.prot_panel_host5.logica.clases.Bases_datos;
import com.kapyasoft.prot_panel_host5.logica.clases.Usuario;
import com.kapyasoft.prot_panel_host5.logica.funciones.FBases_datoss;
import java.io.Serializable;
import java.util.ArrayList;
import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

//import org.primefaces.model.TreeNode;

 
@ManagedBean(name="cVerBase")
@ViewScoped

//@ViewScoped
//@ManagedBean(name = "cVerBase")
//@SessionScoped
//@RequestScoped
public class CVerBase implements Serializable {
     
    private String param_aplic_id;
//    private TreeNode root;
//    private TreeNode selectedNode;
    private String contenido_archivo_select;

    private int id;
    private String nombre;
    private Usuario usuario;
    private String directorio;
    private Bases_datos base;
    private String estado;

    private String archivo_subido;
    private String extension;
    
        
    private String info_conexion;
     
    public CVerBase()
    {
        estado="vacia -no restaurada";
        base = new Bases_datos();
        
        try
        {
            int parametro1 = ControlParametros.recuperar_parametro_entero("id");
            base=FBases_datoss.obtener_Bases_datos_por_pk(parametro1);
            id          = base.getId();
            nombre      = base.getNombre();
            usuario     = base.getUsuario();
            directorio  = base.getDirectorio();
        }
        catch(Exception ex)  {  }
        try
        {
            archivo_subido = FArchivos.buscar_sql(base.getDirectorio());
            extension      = FArchivos.saber_extension(archivo_subido);
            estado         = FBases_datoss.obtenerEstado_bd(base.getNombre(),"public");
            if(archivo_subido.equalsIgnoreCase("ninguno"))
            {
               //deabilitar botones 
            }
        }    catch(Exception ex)   {    }
        
         
        try
        {
            info_conexion =  "\nservidor:   "+FStrings.optener_ip();
            info_conexion += "\nusuario:    "+usuario.getNickname();
            info_conexion += "\nbase datos:  "+base.getNombre();
            info_conexion += "\npassword:   "+usuario.getClave();
            info_conexion += "\npuerto:    "+Global.puerto_pg;
        }   catch(Exception ex)   {     }
    }
   // @PostConstruct
   //  public void init() {
   //        root = service.createDocuments();
   //    }
 
   
//    public TreeNode getRoot() {
//        return root;
//    }
// 
//    public TreeNode getSelectedNode() {
//        return selectedNode;
//    }
// 
//    public void setSelectedNode(TreeNode selectedNode) {
//        this.selectedNode = selectedNode;
//    }

    public String getParam_aplic_id() {
        return param_aplic_id;
    }

    public void setParam_aplic_id(String param_aplic_id) {
        this.param_aplic_id = param_aplic_id;
    }
    
    public String getContenido_archivo_select() {
        return contenido_archivo_select;
    }

    public void setContenido_archivo_select(String contenido_archivo_select) {
        this.contenido_archivo_select = contenido_archivo_select;
    }
   
    
    
    public void guardar()
    {
        
    }
    
    public void construir()
    {
        
    }
        
    public void desplegar()
    {
        String path     = Global.directorio_bin_glassfish; 
        String objetivo = base.getDirectorio()+archivo_subido;
        int  r1 =0;
        try
        {
            if(Global.SO.equalsIgnoreCase("WIN"))
            {
               r1 = Terminal.Comando4(path,"asadmin","deploy",objetivo);
               FacesContext.getCurrentInstance().getExternalContext().redirect("ver_base.xhtml?id="+id);
            }
            else
            {
               if(Global.SO.equalsIgnoreCase("LIN")) 
               {
                  r1 = Terminal.ComandoLinux(path,"asadmin deploy "+objetivo);
                  FacesContext.getCurrentInstance().getExternalContext().redirect("ver_base.xhtml?id="+id);
               }
            }
             if(r1>0)
             {
                 System.out.print("..comando ejecutado en "+path); 
             }
        }
        catch(Exception ex)
        {
            System.out.print(" Error creando dir "+path+""+ex.getMessage());
        }
    }
     
    public void undeploy()
    {
        String path     = Global.directorio_bin_glassfish; 
        String objetivo = base.getDirectorio()+archivo_subido;
        int  r1 =0;
        try
        {
            if(Global.SO.equalsIgnoreCase("WIN"))
            {
               r1 = Terminal.Comando4(path,"asadmin","undeploy",objetivo);
               FacesContext.getCurrentInstance().getExternalContext().redirect("ver_base.xhtml?id="+id);
            }
            else
            {
               if(Global.SO.equalsIgnoreCase("LIN")) 
               {
                  r1 = Terminal.ComandoLinux(path,"asadmin undeploy "+objetivo);
                  FacesContext.getCurrentInstance().getExternalContext().redirect("ver_base.xhtml?id="+id);
               }
            }
             if(r1>0)
             {
                 System.out.print("..comando ejecutado en "+path); 
             }
        }
        catch(Exception ex)
        {
            System.out.print(" Error creando dir "+path+""+ex.getMessage());
        }
    }
    public void subir()
    {
        try
        {
           FacesContext.getCurrentInstance().getExternalContext().redirect("subir_archivos_base.xhtml?id="+id);
        }
        catch(Exception ex)
        {
        }
    }
    
    public void restaurar()
    {
       String path=base.getDirectorio();
        try
        {
            procesar_archivo(path, "bd_"+base.getNombre(),null,extension);
            FacesContext.getCurrentInstance().getExternalContext().redirect("ver_base.xhtml?id="+id);
        }
        catch(Exception ex)
        {
        }
    }
    
    public void procesar_archivo(String path, String nombre, String destino,String ext)
    {
        System.out.println("\n procesando.."+ext);
        
        if(ext.equalsIgnoreCase(".sql"))
        {
            System.out.println("\n intentando restaurar sql...");
            if(Global.SO.equalsIgnoreCase("WIN"))
            {
                restaurar_archivo_sql_pg_win(base.getDirectorio()+"bd_"+base.getNombre()+extension,
                                                                        //base.getUsuario().getNickname(),
                                                                        "postgres",
                                                                        //base.getUsuario().getClave(),
                                                                        Global.clave,
                                                                        base.getNombre(), 
                                                                        Global.host);
            }
            else if(Global.SO.equalsIgnoreCase("LIN"))
            {
                System.out.println("\n LIN intentando restaurar sql...");
                restaurar_archivo_sql_pg_lin(base.getDirectorio()+"bd_"+base.getNombre()+extension,
                                                                        /*base.getUsuario().getNickname(),*/
                                                                        "postgres",    
                                                                        //base.getUsuario().getClave(),
                                                                        Global.clave,
                                                                        base.getNombre(), 
                                                                        Global.host);
            }
        }
        if(ext.equalsIgnoreCase(".backup"))
        {
              System.out.println("\n archivo restaurar backup..");
              if(Global.SO.equalsIgnoreCase("WIN"))
              {
                  restaurar_archivo_backup_pg_win(base.getDirectorio()+"bd_"+base.getNombre()+extension,
//                                                                        base.getUsuario().getNickname(),
//                                                                        base.getUsuario().getClave(),
                                                                        "postgres",
                                                                        Global.clave,
                                                                        base.getNombre(), 
                                                                        Global.host);
              }
              else if(Global.SO.equalsIgnoreCase("LIN"))
              {
                
                restaurar_archivo_backup_pg_lin(base.getDirectorio()+"bd_"+base.getNombre()+extension,
//                                                                        base.getUsuario().getNickname(),
//                                                                        base.getUsuario().getClave(),
                                                                        "postgres",
                                                                        Global.clave,
                                                                        base.getNombre(), 
                                                                        Global.host);
              }
        }
    }
    
    public static boolean restaurar_archivo_sql_pg_win(String archivo,String usuario,String clave,String db,String host) 
    {
        String objeto = "-U "+usuario+" -d "+db+" -h "+host+" -f "+archivo;
        boolean eje = false;
        int res=0;
        try {
              Terminal.restaurar_sql_pg_win(host, "5432",usuario,clave,  db, archivo);
        } catch (Exception ex) {
            System.out.println("Error " + ex.getMessage());
        }
        return eje;
    }
    
    public static boolean restaurar_archivo_sql_pg_lin(String archivo,String usuario,String clave,String db,String host) 
    {
        System.out.println("intentando restaurar con restaurar_archivo_sql_pg_lin");
        String objeto= "psql -U "+usuario+" -d "+db+" -h "+host+" -f "+archivo;
        boolean eje = false;
        int res=0;
        try {
              Terminal.restaurar_sql_pg_linux(host, Global.puerto_pg,usuario,clave,  db, archivo);
              System.out.println("Crrecto  restaurar_sql_pg_linux");
            
        } catch (Exception ex) {
           System.out.println("Error " + ex.getMessage());
        }
        return eje;
    }
    
    public static boolean restaurar_archivo_backup_pg_win(String archivo,String usuario,String clave,String db,String host) 
    {
       //"pg_restore -i -h localhost -p 5432 -U postgres -d mibase -v " "/home/damian/backups/mibase.backup";
        String objeto = "-i -h "+host+" -p "+Global.puerto_pg+" -U "+usuario+" -d "+db+" -v "+archivo;
        boolean eje = false;
        int res=0;
        try {
              Terminal.restaurar_backup_pg_win(host, "5432",usuario,clave,  db, archivo);
            
        } catch (Exception ex) {
            System.out.println("Error " + ex.getMessage());
        }
        return eje;
    }
    
    public static boolean restaurar_archivo_backup_pg_lin(String archivo,String usuario,String clave,String db,String host) 
    {
        String objeto = "pg_restore -i -h "+host+" -p "+Global.puerto_pg+" -U "+usuario+" -d "+db+" -v "+archivo;
        boolean eje = false;
        int res=0;
        try {
             Terminal.restaurar_backup_pg_win(host, "5432",usuario,clave,  db, archivo);
            
        } catch (Exception ex) {
           System.out.println("Error " + ex.getMessage());
        }
        return eje;
    }
    
    public void copiar_en_portapapeles()
    {
        FStrings.copiar_en_portapapeles(info_conexion);
    }
    
    public void respaldar()
    {
    }
    
    public void eliminar()
    {
        
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public String getDirectorio() {
        return directorio;
    }

    public void setDirectorio(String directorio) {
        this.directorio = directorio;
    }

    public Bases_datos getBase() {
        return base;
    }

    public void setBase(Bases_datos base) {
        this.base = base;
    }

    public String getArchivo_subido() {
        return archivo_subido;
    }

    public void setArchivo_subido(String archivo_subido) {
        this.archivo_subido = archivo_subido;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
      public String getInfo_conexion() {
        return info_conexion;
    }

    public void setInfo_conexion(String info_conexion) {
        this.info_conexion = info_conexion;
    }


}