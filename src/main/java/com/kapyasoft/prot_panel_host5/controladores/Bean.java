/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kapyasoft.prot_panel_host5.controladores;

import acceso.Global;
import clases_utiles.FArchivos;
import clases_utiles.Zip;
import com.kapyasoft.prot_panel_host5.logica.clases.Aplicacion;
import com.kapyasoft.prot_panel_host5.logica.funciones.FAplicacions;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.util.Scanner;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.servlet.http.Part;


/**
 *
 * @author Edgar
 */
@ManagedBean(name = "bean")
@ViewScoped

public class Bean {

    private Part file;
    private String param_aplic_id;
    private Aplicacion aplicacion;
    private String tipo_archivo;
    private String extension;
    private String mensaje;
    
    public Bean() {
        aplicacion = new Aplicacion();
        try
        {
              int parametro1  = ControlParametros.recuperar_parametro_entero("id");
              aplicacion = FAplicacions.obtener_Aplicacion_por_pk(parametro1);      
        }
        catch(Exception ex)
        {
            mensaje="Error "+ex.getMessage();
         }
       
    }

    public String upload() {

        if (tipo_archivo.equalsIgnoreCase("Z")) {
            extension = ".zip";
            System.out.println("\n Subiendo  zip..");
        }
        if (tipo_archivo.equalsIgnoreCase("W")) {
            extension = ".war";
            System.out.println("\n Subiendo  war.");
        }
        //String path  = "H:\\tesis 3\\prueba_archivos\\usuarios\\usuario1\\";
        
        String path = "";
        if (aplicacion != null) {
            path = aplicacion.getDirectorio();

            try {
                InputStream in = file.getInputStream();
                byte[] data = new byte[in.available()];
                in.read(data);
                FileOutputStream out = new FileOutputStream(new File(path + aplicacion.getNombre() + extension));
                out.write(data);
                in.close();
                out.close();
                procesar_archivo(path, aplicacion.getNombre(),null,extension);
                FacesContext.getCurrentInstance().getExternalContext().redirect("ver_aplicacion.xhtml?id=" + aplicacion.getId());

            } catch (IOException e) {
                e.printStackTrace();
                // Error handling
            }
        }
        else
        {
            mensaje = "Error - no se ha subido el archivo";
            FacesContext.getCurrentInstance().addMessage("lblmensaje", new FacesMessage(mensaje));
        }
        return "success";
    }

    public void procesar_archivo(String path, String nombre, String destino,String ext)
    {
        System.out.println("\n procesando..");
        
        if(ext.equalsIgnoreCase(".war"))
        {
            System.out.println("\n intentando desplegar war");
            //FArchivos.desplegar(path, nombre, path);
        }
        if(ext.equalsIgnoreCase(".zip"))
        {
                System.out.println("\n archivo zip..");
                if(Global.SO.equalsIgnoreCase("WIN"))
                {
                   Zip.unzip(path+ nombre+".zip",nombre+".zip" );    
                }   
                else if(Global.SO.equalsIgnoreCase("LIN"))
                {
                   Zip.unzipLinux(path+ nombre+".zip",nombre+".zip" );    
                }  
        }
    }
    

    public Part getFile() {
        return file;
    }

    public void setFile(Part file) {
        this.file = file;
    }

    public String getParam_aplic_id() {
        return param_aplic_id;
    }

    public void setParam_aplic_id(String param_aplic_id) {
        this.param_aplic_id = param_aplic_id;
    }

    public Aplicacion getAplicacion() {
        return aplicacion;
    }

    public void setAplicacion(Aplicacion aplicacion) {
        this.aplicacion = aplicacion;
    }

    public String getTipo_archivo() {
        return tipo_archivo;
    }

    public void setTipo_archivo(String tipo_archivo) {
        this.tipo_archivo = tipo_archivo;
    }

    public String getExtension() {
        return extension;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

}
