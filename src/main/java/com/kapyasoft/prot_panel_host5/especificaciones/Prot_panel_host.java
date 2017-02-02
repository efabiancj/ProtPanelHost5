package com.kapyasoft.prot_panel_host5.especificaciones;





import java.io.IOException;
import java.util.ArrayList;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Edgar
 */
public class Prot_panel_host 
{
  // --------------------------------------------------------------------------------------------------------
  //  Especificaciones para actor visitante
  //---------------------------------------------------------------------------------------------------------  
    public int registro_cliente() throws Exception
    {
       return 0;  
    }
    
    public int validacion_registro()
    {
       // int res = FUsuarios.repetidos();
        return 0;
    }
    
    public int crear_directorio_virtual_servidor_app()
    {
        crear_script_directorios();
        return 0;
    }
    
    public String crear_script_directorios()
    {
        String nombre ="";
        
        return nombre;
    }
    
    public int crear_cuenta_ftp_o_repositorio()
    {
        crear_script_cuentas_ftp_o_repositorios();
        return 0;
    }
    
    public int crear_script_cuentas_ftp_o_repositorios()
    {   
        
        return 0;
    }
    
    public int ejecutar_script(String nombre_archivo)
    {
        int res=0;
        
        return res;
    }
    public int listar_planes()
    {
         return 0;
    }
   //------------------------------------------------------------------------------------------------------------ 
    
  // --------------------------------------------------------------------------------------------------------
  //  Especificaciones para actor usuario - cliente
  //---------------------------------------------------------------------------------------------------------    
    public boolean autenticar_clientes(String nombre, String clave)
    {
        return false;
    }
    
      
    public int contratar_plan()
    {
        return 0;
    }
    
    public int crear_nueva_aplicacion()
    {
        return 0; 
        
    }
    public int validación_crear_nueva_aplicacion()
    {
        return 0;
    }
    public int crear_nueva_base_datos()
    {
        return 0; 
    }
    
    public Object  listar_aplicaciones()
    {
        return null;
    }
    
    public Object listar_bases_datos()
    {
        return null;
    }
    
    public int compilar_codigo_aplicacion()
    {
        return 0;
    }
    
    public int desplegar_desde_servidor_web()
    {
        return 0;
    }
    
    public int subir_archivos_aplicacion()
    {
       return 0;
    }
    
    public int modificar_aplicacion()
    {
       return 0;
    }
    
    public int eliminar_aplicacion()
    {
        return 0; 
    }
    
    public int  modificar_cliente()
    {
        return 0;
    }
    
    public int restaurar_base_datos()
    {
        return 0;
    }
    
    public String respaldar_base_datos()
    {
        return null;
    }
       
    
    public String  listar_dominios()
    {
        return null;
    }
    
    public String  visualizar_editar_codigo()
    {
        return null;
    }
    
    public String  reporte_consumo_recursos()
    {
        return null;
    }
    
    public int Calcular_espacio_disco_utilizado()
    {
        return 0;
    }
    
    public int Calcular_memoria_por_aplicacion()
    {
        return 0;
    }
    
    public int Calcular_transferencia()
    {
        return 0;
    }
       
    
    public String  reporte_pagos_mensuales()
    {
        return null;
    }
//-------------------------------------------------------------------------------------------------------------     
// --------------------------------------------------------------------------------------------------------
//  Especificaciones para actor administrador
//---------------------------------------------------------------------------------------------------------       
       
    public boolean autenticar_administradores(String nombre, String clave)
    {   
        return false;
    }
    
    public int Gestion_administrador()
    {
        return 0;
    }
    
    public int Crear_nuevo_administrador()
    {
        return 0;
    }
    
    public int Validacion_Crear_nuevo_administrador()
    {
        return 0;
    }
    
    public int Modificacion_administrador()
    {
        return 0;
    }
    
    public int validacion_Modificacion_administrador()
    {
        return 0;
    }
    
    public Object Listar_administradores()
    { 
        return null;
    }
    
    public String  reporte_usuarios()
    {
        return null;
    }
    
    public String  reporte_ventas()
    {
        return null;
    }
    
}
