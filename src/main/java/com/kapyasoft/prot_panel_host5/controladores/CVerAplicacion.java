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
import com.kapyasoft.prot_panel_host5.logica.clases.Aplicacion;
import com.kapyasoft.prot_panel_host5.logica.clases.Usuario;
import com.kapyasoft.prot_panel_host5.logica.funciones.FAplicacions;
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

 
@ManagedBean(name="cVerAplicacion")
@ViewScoped

//@ViewScoped
//@ManagedBean(name = "cVerAplicacion")
//@SessionScoped
//@RequestScoped
public class CVerAplicacion implements Serializable {
     
    private String param_aplic_id;
//    private TreeNode root;
//    private TreeNode selectedNode;
    private String contenido_archivo_select;

    private int id;
    private String nombre;
    private Usuario usuario;
    private String directorio;
    private String archivo_war;
    private Aplicacion aplicacion;
    private String estado;

    private String archivo_subido;
    @ManagedProperty("#{cDocumentService}")
  //  private CDocumentService service;
    private String enlace_generado;
    private String objetivo_a_desplegar;
    private String directorio_war_origen;
    private String archivo_war_codigo; 
    

     
    public CVerAplicacion()
    {
     //   service=new CDocumentService();
//        root = service.createDocuments();
        aplicacion = new Aplicacion();
        
        try
        {
            int parametro1 = ControlParametros.recuperar_parametro_entero("id");
            aplicacion=FAplicacions.obtener_Aplicacion_por_pk(parametro1);
            id          = aplicacion.getId();
            nombre      = aplicacion.getNombre();
            usuario     = aplicacion.getUsuario();
            directorio  = aplicacion.getDirectorio();
            archivo_war = aplicacion.getArchivo_war();
        }
        catch(Exception ex)  {  }
        
        try
        {
            archivo_subido = FArchivos.buscar_war(aplicacion.getDirectorio());
            if(archivo_subido.equalsIgnoreCase("ninguno"))
            {
               //deabilitar botones 
            }
        }    catch(Exception ex)   {    }
        
        try
        {
            archivo_war = FArchivos.buscar_war(Global.dir_autodeploy,archivo_subido);
            if(!archivo_war.equalsIgnoreCase("ninguno"))
            {
               enlace_generado = "http://"+FStrings.optener_ip()+":8080/"+aplicacion.getNombre(); 
            }
        }   catch(Exception ex)   {     }
        
        try
        {
            archivo_war_codigo = FArchivos.buscar_ext_en_subcarpetas(aplicacion.getDirectorio(),".war");
            
        }   catch(Exception ex)   {     }
        
       
        
    }
//   // @PostConstruct
//   //  public void init() {
//   //        root = service.createDocuments();
//   //    }
 
//   
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
 
//    public void setService(CDocumentService service) {
//     //   this.service = service;
//    }

    public String getParam_aplic_id() {
        return param_aplic_id;
    }

    public void setParam_aplic_id(String param_aplic_id) {
        this.param_aplic_id = param_aplic_id;
    }
    
     public void displaySelectedSingle() {
//        if(selectedNode != null) {
//            FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, "Selected", selectedNode.getData().toString());
//            FacesContext.getCurrentInstance().addMessage(null, message);
//        }
    }
      
    public void deleteNode() { 
//        selectedNode.getChildren().clear();
//        selectedNode.getParent().getChildren().remove(selectedNode);
//        selectedNode.setParent(null);
//         
//        selectedNode = null;
    }  
    public void copiar_en_portapapeles()
    {
        
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
        String objetivo="";
        if(objetivo_a_desplegar.equals("W"))
        {
            objetivo = aplicacion.getDirectorio()+archivo_subido;
        }
        else if(objetivo_a_desplegar.equals("W"))
        {
            objetivo = directorio_war_origen+archivo_subido;
        }
        
        int  r1 =0;
        try
        {
            if(Global.SO.equalsIgnoreCase("WIN"))
            {
               r1 = Terminal.Comando4(path,"asadmin","deploy",objetivo);
               FacesContext.getCurrentInstance().getExternalContext().redirect("ver_aplicacion.xhtml?id="+id);
            }
            else
            {
               if(Global.SO.equalsIgnoreCase("LIN")) 
               {
                  Terminal.desplegar_war_linux(objetivo,Global.dir_autodeploy);
                  FacesContext.getCurrentInstance().getExternalContext().redirect("ver_aplicacion.xhtml?id="+id);
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
        String objetivo = aplicacion.getDirectorio()+archivo_subido;
        int  r1 =0;
        try
        {
            if(Global.SO.equalsIgnoreCase("WIN"))
            {
               r1 = Terminal.Comando4(path,"asadmin","undeploy",objetivo);
               FacesContext.getCurrentInstance().getExternalContext().redirect("ver_aplicacion.xhtml?id="+id);
            }
            else
            {
               if(Global.SO.equalsIgnoreCase("LIN")) 
               {
                  r1 = Terminal.ComandoLinux(path,"asadmin undeploy "+objetivo);
                  FacesContext.getCurrentInstance().getExternalContext().redirect("ver_aplicacion.xhtml?id="+id);
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
           FacesContext.getCurrentInstance().getExternalContext().redirect("subir_archivos_app.xhtml?id="+id);
        }
        catch(Exception ex)
        {
        }
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

    public String getArchivo_war() {
        return archivo_war;
    }

    public void setArchivo_war(String archivo_war) {
        this.archivo_war = archivo_war;
    }

    public Aplicacion getAplicacion() {
        return aplicacion;
    }

    public void setAplicacion(Aplicacion aplicacion) {
        this.aplicacion = aplicacion;
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

    public String getEnlace_generado() {
        return enlace_generado;
    }

    public void setEnlace_generado(String enlace_generado) {
        this.enlace_generado = enlace_generado;
    }

    public String getObjetivo_a_desplegar() {
        return objetivo_a_desplegar;
    }

    public void setObjetivo_a_desplegar(String objetivo_a_desplegar) {
        this.objetivo_a_desplegar = objetivo_a_desplegar;
    }

    public String getDirectorio_war_origen() {
        return directorio_war_origen;
    }

    public void setDirectorio_war_origen(String directorio_war_origen) {
        this.directorio_war_origen = directorio_war_origen;
    }

    public String getArchivo_war_codigo() {
        return archivo_war_codigo;
    }

    public void setArchivo_war_codigo(String archivo_war_codigo) {
        this.archivo_war_codigo = archivo_war_codigo;
    }

  
   
    
}