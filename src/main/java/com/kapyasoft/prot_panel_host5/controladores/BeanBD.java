/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kapyasoft.prot_panel_host5.controladores;

import acceso.Global;
import clases_utiles.FArchivos;
import clases_utiles.Terminal;
import clases_utiles.Zip;
import com.kapyasoft.prot_panel_host5.logica.clases.Bases_datos;
import com.kapyasoft.prot_panel_host5.logica.funciones.FBases_datoss;
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
@ManagedBean(name = "beanBD")
@ViewScoped

public class BeanBD {

    private Part file;
    private String param_aplic_id;
    private Bases_datos base;
    private String tipo_archivo;
    private String extension;
    private String mensaje;
    
    public BeanBD() {
        base = new Bases_datos();
        try
        {
              int parametro1  = ControlParametros.recuperar_parametro_entero("id");
              base = FBases_datoss.obtener_Bases_datos_por_pk(parametro1);      
        }
        catch(Exception ex)
        {
            mensaje="Error "+ex.getMessage();
         }
       
    }

    public String upload() {

        if (tipo_archivo.equalsIgnoreCase("P")) {
            extension = ".sql";
            System.out.println("\n Subiendo  sql..");
        }
        if (tipo_archivo.equalsIgnoreCase("B")) {
            extension = ".backup";
            System.out.println("\n Subiendo  backup.");
        }
        //String path  = "H:\\tesis 3\\prueba_archivos\\usuarios\\usuario1\\";
        
        String path = "";
        if (base != null) {
            path = base.getDirectorio();

            try {
                InputStream in = file.getInputStream();
                byte[] data = new byte[in.available()];
                in.read(data);
                FileOutputStream out = new FileOutputStream(new File(path + "bd_"+base.getNombre() + extension));
                out.write(data);
                in.close();
                out.close();
                //procesar_archivo(path, "bd_"+base.getNombre(),null,extension);
                FacesContext.getCurrentInstance().getExternalContext().redirect("ver_base.xhtml?id=" + base.getId());

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

    public Bases_datos getBase() {
        return base;
    }

    public void setBase(Bases_datos base) {
        this.base = base;
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
