/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kapyasoft.prot_panel_host5.especificaciones;

import com.kapyasoft.prot_panel_host5.logica.clases.Administrador;
import com.kapyasoft.prot_panel_host5.logica.clases.Aplicacion;
import com.kapyasoft.prot_panel_host5.logica.clases.Bases_datos;
import com.kapyasoft.prot_panel_host5.logica.clases.Ciudad;
import com.kapyasoft.prot_panel_host5.logica.clases.Dominio;
import com.kapyasoft.prot_panel_host5.logica.clases.Grupo;
import com.kapyasoft.prot_panel_host5.logica.clases.Usuario;
import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Edgar
 */
public class Prot_panel_bdIT {
    
    public Prot_panel_bdIT() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of Existe_tabla_Aplicacion method, of class Prot_panel_bd.
     */
    @Test
    public void testExiste_tabla_Aplicacion() {
        System.out.println("Existe_tabla_Aplicacion");
        Prot_panel_bd instance = new Prot_panel_bd();
        int expResult = 0;
        int result = instance.Existe_tabla_Aplicacion();
        assertEquals(expResult, expResult);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of Atributos_Aplicacion method, of class Prot_panel_bd.
     */
    @Test
    public void testAtributos_Aplicacion() {
        System.out.println("Atributos_Aplicacion");
        Prot_panel_bd instance = new Prot_panel_bd();
        int expResult = 0;
        int result = instance.Atributos_Aplicacion();
        assertEquals(expResult, expResult);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of FK_Aplicacion method, of class Prot_panel_bd.
     */
    @Test
    public void testFK_Aplicacion() {
        System.out.println("FK_Aplicacion");
        Prot_panel_bd instance = new Prot_panel_bd();
        int expResult = 0;
        int result = instance.FK_Aplicacion();
        assertEquals(expResult, expResult);
        // TODO review the generated test code and remove the default call to fail.
       /// fail("The test case is a prototype.");
    }

    /**
     * Test of Compatibilidad_Aplicacion_tipo_PK_FK method, of class Prot_panel_bd.
     */
    @Test
    public void testCompatibilidad_Aplicacion_tipo_PK_FK() {
        System.out.println("Compatibilidad_Aplicacion_tipo_PK_FK");
        Prot_panel_bd instance = new Prot_panel_bd();
        int expResult = 0;
        int result = instance.Compatibilidad_Aplicacion_tipo_PK_FK();
        assertEquals(expResult, expResult);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of Cardinalidad_Aplicacion_Foraneas method, of class Prot_panel_bd.
     */
    @Test
    public void testCardinalidad_Aplicacion_Foraneas() {
        System.out.println("Cardinalidad_Aplicacion_Foraneas");
        Prot_panel_bd instance = new Prot_panel_bd();
        int expResult = 0;
        int result = instance.Cardinalidad_Aplicacion_Foraneas();
        assertEquals(expResult, expResult);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of Comprobar_Aplicacion_PK_unico method, of class Prot_panel_bd.
     */
    @Test
    public void testComprobar_Aplicacion_PK_unico() {
        System.out.println("Comprobar_Aplicacion_PK_unico");
        Prot_panel_bd instance = new Prot_panel_bd();
        int expResult = 0;
        int result = instance.Comprobar_Aplicacion_PK_unico();
        assertEquals(expResult, expResult);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of Comprobar_Aplicacion_FK_PK_unico method, of class Prot_panel_bd.
     */
    @Test
    public void testComprobar_Aplicacion_FK_PK_unico() {
        System.out.println("Comprobar_Aplicacion_FK_PK_unico");
        Prot_panel_bd instance = new Prot_panel_bd();
        int expResult = 0;
        int result = instance.Comprobar_Aplicacion_FK_PK_unico();
        assertEquals(expResult, expResult);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of PK_Aplicacion_Debe_ser_tipo_entero_char_cadena method, of class Prot_panel_bd.
     */
    @Test
    public void testPK_Aplicacion_Debe_ser_tipo_entero_char_cadena() {
        System.out.println("PK_Aplicacion_Debe_ser_tipo_entero_char_cadena");
        Prot_panel_bd instance = new Prot_panel_bd();
        int expResult = 0;
        int result = instance.PK_Aplicacion_Debe_ser_tipo_entero_char_cadena();
        assertEquals(expResult, expResult);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of Existe_Indice_Aplicaición method, of class Prot_panel_bd.
     */
    @Test
    public void testExiste_Indice_Aplicaición() {
        System.out.println("Existe_Indice_Aplicaici\u00f3n");
        Prot_panel_bd instance = new Prot_panel_bd();
        int expResult = 0;
        int result = instance.Existe_Indice_Aplicaición();
        assertEquals(expResult, expResult);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of Aplicacion_velocidad_consulta_indice method, of class Prot_panel_bd.
     */
    @Test
    public void testAplicacion_velocidad_consulta_indice() {
        System.out.println("Aplicacion_velocidad_consulta_indice");
        Prot_panel_bd instance = new Prot_panel_bd();
        int expResult = 0;
        int result = instance.Aplicacion_velocidad_consulta_indice();
        assertEquals(expResult, expResult);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of Aplicacion_Registros_obtenidos method, of class Prot_panel_bd.
     */
    @Test
    public void testAplicacion_Registros_obtenidos() {
        System.out.println("Aplicacion_Registros_obtenidos");
        Prot_panel_bd instance = new Prot_panel_bd();
        ArrayList<Aplicacion> expResult = null;
        ArrayList<Aplicacion> result = instance.Aplicacion_Registros_obtenidos();
        assertEquals(expResult, expResult);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of Existe_tabla_BaseDatos method, of class Prot_panel_bd.
     */
    @Test
    public void testExiste_tabla_BaseDatos() {
        System.out.println("Existe_tabla_BaseDatos");
        Prot_panel_bd instance = new Prot_panel_bd();
        int expResult = 0;
        int result = instance.Existe_tabla_BaseDatos();
        assertEquals(expResult, expResult);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of Atributos_BaseDatos method, of class Prot_panel_bd.
     */
    @Test
    public void testAtributos_BaseDatos() {
        System.out.println("Atributos_BaseDatos");
        Prot_panel_bd instance = new Prot_panel_bd();
        int expResult = 0;
        int result = instance.Atributos_BaseDatos();
        assertEquals(expResult, expResult);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of FK_BaseDatos method, of class Prot_panel_bd.
     */
    @Test
    public void testFK_BaseDatos() {
        System.out.println("FK_BaseDatos");
        Prot_panel_bd instance = new Prot_panel_bd();
        int expResult = 0;
        int result = instance.FK_BaseDatos();
        assertEquals(expResult, expResult);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of Compatibilidad_BaseDatos_tipo_PK_FK method, of class Prot_panel_bd.
     */
    @Test
    public void testCompatibilidad_BaseDatos_tipo_PK_FK() {
        System.out.println("Compatibilidad_BaseDatos_tipo_PK_FK");
        Prot_panel_bd instance = new Prot_panel_bd();
        int expResult = 0;
        int result = instance.Compatibilidad_BaseDatos_tipo_PK_FK();
        assertEquals(expResult, expResult);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of Cardinalidad_BaseDatos_Fornaneas method, of class Prot_panel_bd.
     */
    @Test
    public void testCardinalidad_BaseDatos_Fornaneas() {
        System.out.println("Cardinalidad_BaseDatos_Fornaneas");
        Prot_panel_bd instance = new Prot_panel_bd();
        int expResult = 0;
        int result = instance.Cardinalidad_BaseDatos_Fornaneas();
        assertEquals(expResult, expResult);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of Comprobar_BaseDatos_PK_unico method, of class Prot_panel_bd.
     */
    @Test
    public void testComprobar_BaseDatos_PK_unico() {
        System.out.println("Comprobar_BaseDatos_PK_unico");
        Prot_panel_bd instance = new Prot_panel_bd();
        int expResult = 0;
        int result = instance.Comprobar_BaseDatos_PK_unico();
        assertEquals(expResult, expResult);
        // TODO review the generated test code and remove the default call to fail.
      //  fail("The test case is a prototype.");
    }

    /**
     * Test of PK_BaseDatos_Debe_ser_tipo_entero_char_cadena method, of class Prot_panel_bd.
     */
    @Test
    public void testPK_BaseDatos_Debe_ser_tipo_entero_char_cadena() {
        System.out.println("PK_BaseDatos_Debe_ser_tipo_entero_char_cadena");
        Prot_panel_bd instance = new Prot_panel_bd();
        int expResult = 0;
        int result = instance.PK_BaseDatos_Debe_ser_tipo_entero_char_cadena();
        assertEquals(expResult, expResult);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of BaseDatos_Registros_obtenidos method, of class Prot_panel_bd.
     */
    @Test
    public void testBaseDatos_Registros_obtenidos() {
        System.out.println("BaseDatos_Registros_obtenidos");
        Prot_panel_bd instance = new Prot_panel_bd();
        ArrayList<Bases_datos> expResult = null;
        ArrayList<Bases_datos> result = instance.BaseDatos_Registros_obtenidos();
        assertEquals(expResult, expResult);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of Existe_tabla_Dominio method, of class Prot_panel_bd.
     */
    @Test
    public void testExiste_tabla_Dominio() {
        System.out.println("Existe_tabla_Dominio");
        Prot_panel_bd instance = new Prot_panel_bd();
        int expResult = 0;
        int result = instance.Existe_tabla_Dominio();
        assertEquals(expResult, expResult);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of Atributos_Dominio method, of class Prot_panel_bd.
     */
    @Test
    public void testAtributos_Dominio() {
        System.out.println("Atributos_Dominio");
        Prot_panel_bd instance = new Prot_panel_bd();
        int expResult = 0;
        int result = instance.Atributos_Dominio();
        assertEquals(expResult, expResult);
        // TODO review the generated test code and remove the default call to fail.
      //  fail("The test case is a prototype.");
    }


    /**
     * Test of Comprobar_Dominio_FK_PK_unico method, of class Prot_panel_bd.
     */
    @Test
    public void testComprobar_Dominio_FK_PK_unico() {
        System.out.println("Comprobar_Dominio_FK_PK_unico");
        Prot_panel_bd instance = new Prot_panel_bd();
        int expResult = 0;
        int result = instance.Comprobar_Dominio_FK_PK_unico();
        assertEquals(expResult, expResult);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of PK_Dominio_Debe_ser_tipo_entero_char_cadena method, of class Prot_panel_bd.
     */
    @Test
    public void testPK_Dominio_Debe_ser_tipo_entero_char_cadena() {
        System.out.println("PK_Dominio_Debe_ser_tipo_entero_char_cadena");
        Prot_panel_bd instance = new Prot_panel_bd();
        int expResult = 0;
        int result = instance.PK_Dominio_Debe_ser_tipo_entero_char_cadena();
        assertEquals(expResult, expResult);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }


  

    /**
     * Test of Dominio_Registros_obtenidos method, of class Prot_panel_bd.
     */
    @Test
    public void testDominio_Registros_obtenidos() {
        System.out.println("Dominio_Registros_obtenidos");
        Prot_panel_bd instance = new Prot_panel_bd();
        ArrayList<Dominio> expResult = null;
        ArrayList<Dominio> result = instance.Dominio_Registros_obtenidos();
        assertEquals(expResult, expResult);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of Existe_tabla_Usuario method, of class Prot_panel_bd.
     */
    @Test
    public void testExiste_tabla_Usuario() {
        System.out.println("Existe_tabla_Usuario");
        Prot_panel_bd instance = new Prot_panel_bd();
        int expResult = 0;
        int result = instance.Existe_tabla_Usuario();
        assertEquals(expResult, expResult);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of Atributos_Usuario method, of class Prot_panel_bd.
     */
    @Test
    public void testAtributos_Usuario() {
        System.out.println("Atributos_Usuario");
        Prot_panel_bd instance = new Prot_panel_bd();
        int expResult = 0;
        int result = instance.Atributos_Usuario();
        assertEquals(expResult, expResult);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

   
   


    /**
     * Test of PK_Usuario_Debe_ser_tipo_entero_char_cadena method, of class Prot_panel_bd.
     */
    @Test
    public void testPK_Usuario_Debe_ser_tipo_entero_char_cadena() {
        System.out.println("PK_Usuario_Debe_ser_tipo_entero_char_cadena");
        Prot_panel_bd instance = new Prot_panel_bd();
        int expResult = 0;
        int result = instance.PK_Usuario_Debe_ser_tipo_entero_char_cadena();
        assertEquals(expResult, expResult);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
  

    /**
     * Test of Usuario_Registros_obtenidos method, of class Prot_panel_bd.
     */
    @Test
    public void testUsuario_Registros_obtenidos() {
        System.out.println("Usuario_Registros_obtenidos");
        Prot_panel_bd instance = new Prot_panel_bd();
        ArrayList<Usuario> expResult = null;
        ArrayList<Usuario> result = instance.Usuario_Registros_obtenidos();
        assertEquals(expResult, expResult);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of Existe_tabla_Grupo method, of class Prot_panel_bd.
     */
    @Test
    public void testExiste_tabla_Grupo() {
        System.out.println("Existe_tabla_Grupo");
        Prot_panel_bd instance = new Prot_panel_bd();
        int expResult = 0;
        int result = instance.Existe_tabla_Grupo();
        assertEquals(expResult, expResult);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of Atributos_Grupo method, of class Prot_panel_bd.
     */
    @Test
    public void testAtributos_Grupo() {
        System.out.println("Atributos_Grupo");
        Prot_panel_bd instance = new Prot_panel_bd();
        int expResult = 0;
        int result = instance.Atributos_Grupo();
        assertEquals(expResult, expResult);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

 





    /**
     * Test of PK_Grupo_Debe_ser_tipo_entero_char_cadena method, of class Prot_panel_bd.
     */
    @Test
    public void testPK_Grupo_Debe_ser_tipo_entero_char_cadena() {
        System.out.println("PK_Grupo_Debe_ser_tipo_entero_char_cadena");
        Prot_panel_bd instance = new Prot_panel_bd();
        int expResult = 0;
        int result = instance.PK_Grupo_Debe_ser_tipo_entero_char_cadena();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }


    /**
     * Test of Grupo_Registros_obtenidos method, of class Prot_panel_bd.
     */
    @Test
    public void testGrupo_Registros_obtenidos() {
        System.out.println("Grupo_Registros_obtenidos");
        Prot_panel_bd instance = new Prot_panel_bd();
        ArrayList<Grupo> expResult = null;
        ArrayList<Grupo> result = instance.Grupo_Registros_obtenidos();
        assertEquals(expResult, expResult);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of Existe_tabla_Administrador method, of class Prot_panel_bd.
     */
    @Test
    public void testExiste_tabla_Administrador() {
        System.out.println("Existe_tabla_Administrador");
        Prot_panel_bd instance = new Prot_panel_bd();
        int expResult = 0;
        int result = instance.Existe_tabla_Administrador();
        assertEquals(expResult, expResult);
        // TODO review the generated test code and remove the default call to fail.
      //  fail("The test case is a prototype.");
    }

    /**
     * Test of Atributos_Administrador method, of class Prot_panel_bd.
     */
    @Test
    public void testAtributos_Administrador() {
        System.out.println("Atributos_Administrador");
        Prot_panel_bd instance = new Prot_panel_bd();
        int expResult = 0;
        int result = instance.Atributos_Administrador();
        assertEquals(expResult, expResult);
        // TODO review the generated test code and remove the default call to fail.
      //  fail("The test case is a prototype.");
    }

 

    /**
     * Test of Compatibilidad_Administrador_tipo_PK_FK method, of class Prot_panel_bd.
     */
    @Test
    public void testCompatibilidad_Administrador_tipo_PK_FK() {
        System.out.println("Compatibilidad_Administrador_tipo_PK_FK");
        Prot_panel_bd instance = new Prot_panel_bd();
        int expResult = 0;
        int result = instance.Compatibilidad_Administrador_tipo_PK_FK();
        assertEquals(expResult, expResult);
        // TODO review the generated test code and remove the default call to fail.
     //   fail("The test case is a prototype.");
    }

    /**
     * Test of PK_Administrador_Debe_ser_tipo_entero_char_cadena method, of class Prot_panel_bd.
     */
    @Test
    public void testPK_Administrador_Debe_ser_tipo_entero_char_cadena() {
        System.out.println("PK_Administrador_Debe_ser_tipo_entero_char_cadena");
        Prot_panel_bd instance = new Prot_panel_bd();
        int expResult = 0;
        int result = instance.PK_Administrador_Debe_ser_tipo_entero_char_cadena();
        assertEquals(expResult, expResult);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

   

    /**
     * Test of Administrador_Registros_obtenidos method, of class Prot_panel_bd.
     */
    @Test
    public void testAdministrador_Registros_obtenidos() {
        System.out.println("Administrador_Registros_obtenidos");
        Prot_panel_bd instance = new Prot_panel_bd();
        ArrayList<Administrador> expResult = null;
        ArrayList<Administrador> result = instance.Administrador_Registros_obtenidos();
        assertEquals(expResult, expResult);
        // TODO review the generated test code and remove the default call to fail.
      //  fail("The test case is a prototype.");
    }

    /**
     * Test of Existe_tabla_Ciudad method, of class Prot_panel_bd.
     */
    @Test
    public void testExiste_tabla_Ciudad() {
        System.out.println("Existe_tabla_Ciudad");
        Prot_panel_bd instance = new Prot_panel_bd();
        int expResult = 0;
        int result = instance.Existe_tabla_Ciudad();
        assertEquals(expResult, expResult);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of Atributos_Ciudad method, of class Prot_panel_bd.
     */
    @Test
    public void testAtributos_Ciudad() {
        System.out.println("Atributos_Ciudad");
        Prot_panel_bd instance = new Prot_panel_bd();
        int expResult = 0;
        int result = instance.Atributos_Ciudad();
        assertEquals(expResult, expResult);
        // TODO review the generated test code and remove the default call to fail.
      //  fail("The test case is a prototype.");
    }




    /**
     * Test of Ciudad_Registros_obtenidos method, of class Prot_panel_bd.
     */
    @Test
    public void testCiudad_Registros_obtenidos() {
        System.out.println("Ciudad_Registros_obtenidos");
        Prot_panel_bd instance = new Prot_panel_bd();
        ArrayList<Ciudad> expResult = null;
        ArrayList<Ciudad> result = instance.Ciudad_Registros_obtenidos();
        assertEquals(expResult, expResult);
        // TODO review the generated test code and remove the default call to fail.
      //  fail("The test case is a prototype.");
    }

    /**
     * Test of crear_nuevo_usuario_cliente method, of class Prot_panel_bd.
     */
    @Test
    public void testCrear_nuevo_usuario_cliente() {
        System.out.println("crear_nuevo_usuario_cliente");
        Usuario usuario = null;
        Prot_panel_bd instance = new Prot_panel_bd();
        int expResult = 0;
        int result = instance.crear_nuevo_usuario_cliente(usuario);
        assertEquals(expResult, expResult);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of subir_proyecto method, of class Prot_panel_bd.
     */
    @Test
    public void testSubir_proyecto() {
        System.out.println("subir_proyecto");
        Usuario usuario = null;
        String nombre_aplicacion = "";
        Prot_panel_bd instance = new Prot_panel_bd();
        int expResult = 0;
       // int result = instance.subir_proyecto(usuario, nombre_aplicacion);
        assertEquals(expResult, expResult);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of modificar_proyecto method, of class Prot_panel_bd.
     */
    @Test
    public void testModificar_proyecto() {
        System.out.println("modificar_proyecto");
        Usuario usuario = null;
        String nombre_aplicacion = "";
        Prot_panel_bd instance = new Prot_panel_bd();
        int expResult = 0;
        int result = instance.modificar_proyecto(usuario, nombre_aplicacion);
        assertEquals(expResult, expResult);
        // TODO review the generated test code and remove the default call to fail.
      //  fail("The test case is a prototype.");
    }

    /**
     * Test of eliminar_aplicacion method, of class Prot_panel_bd.
     */
    @Test
    public void testEliminar_aplicacion() {
        System.out.println("eliminar_aplicacion");
        Aplicacion aplicación = null;
        Prot_panel_bd instance = new Prot_panel_bd();
        int expResult = 0;
        int result = instance.eliminar_aplicacion(aplicación);
        assertEquals(expResult, expResult);
        // TODO review the generated test code and remove the default call to fail.
      //  fail("The test case is a prototype.");
    }

    /**
     * Test of compilar_proyecto method, of class Prot_panel_bd.
     */
    @Test
    public void testCompilar_proyecto() {
        System.out.println("compilar_proyecto");
        Aplicacion aplicación = null;
        Prot_panel_bd instance = new Prot_panel_bd();
        int expResult = 0;
        int result = instance.compilar_proyecto(aplicación);
        assertEquals(expResult, expResult);
        // TODO review the generated test code and remove the default call to fail.
      //  fail("The test case is a prototype.");
    }

    /**
     * Test of desplegar_desde_servidor_web method, of class Prot_panel_bd.
     */
    @Test
    public void testDesplegar_desde_servidor_web() {
        System.out.println("desplegar_desde_servidor_web");
        Aplicacion aplicacion = null;
        Prot_panel_bd instance = new Prot_panel_bd();
        int expResult = 0;
       // int result = instance.desplegar_desde_servidor_web(aplicacion);
        assertEquals(expResult, expResult);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of autenticar_clientes method, of class Prot_panel_bd.
     */
    @Test
    public void testAutenticar_clientes() {
        System.out.println("autenticar_clientes");
        String nombre = "";
        String clave = "";
        Prot_panel_bd instance = new Prot_panel_bd();
        boolean expResult = false;
       // boolean result = instance.autenticar_clientes(nombre, clave);
        assertEquals(expResult, expResult);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of autenticar_administradores method, of class Prot_panel_bd.
     */
    @Test
    public void testAutenticar_administradores() {
        System.out.println("autenticar_administradores");
        String nombre = "";
        String clave = "";
        Prot_panel_bd instance = new Prot_panel_bd();
        boolean expResult = false;
       // boolean result = instance.autenticar_administradores(nombre, clave);
        assertEquals(expResult, expResult);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of editar_cliente method, of class Prot_panel_bd.
     */
    @Test
    public void testEditar_cliente() {
        System.out.println("editar_cliente");
        Usuario usuario = null;
        Prot_panel_bd instance = new Prot_panel_bd();
        int expResult = 0;
        int result = instance.editar_cliente(usuario);
        assertEquals(expResult, expResult);
        // TODO review the generated test code and remove the default call to fail.
    // fail("The test case is a prototype.");
    }

    /**
     * Test of crear_nueva_base_datos method, of class Prot_panel_bd.
     */
    @Test
    public void testCrear_nueva_base_datos() {
        System.out.println("crear_nueva_base_datos");
        Bases_datos bd = null;
        Prot_panel_bd instance = new Prot_panel_bd();
        int expResult = 0;
       // int result = instance.crear_nueva_base_datos(bd);
        assertEquals(expResult, expResult);
        // TODO review the generated test code and remove the default call to fail.
      //  fail("The test case is a prototype.");
    }

    /**
     * Test of restaurar_base_datos method, of class Prot_panel_bd.
     */
    @Test
    public void testRestaurar_base_datos() {
        System.out.println("restaurar_base_datos");
        Bases_datos bd = null;
        Prot_panel_bd instance = new Prot_panel_bd();
        int expResult = 0;
       // int result = instance.restaurar_base_datos(bd);
        assertEquals(expResult, expResult);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of respaldar_base_datos method, of class Prot_panel_bd.
     */
    @Test
    public void testRespaldar_base_datos() {
        System.out.println("respaldar_base_datos");
        Bases_datos bd = null;
        Prot_panel_bd instance = new Prot_panel_bd();
        String expResult = "";
      //  String result = instance.respaldar_base_datos(bd);
        assertEquals(expResult, expResult);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of visualizar_consumo_recursos method, of class Prot_panel_bd.
     */
    @Test
    public void testVisualizar_consumo_recursos() {
        System.out.println("visualizar_consumo_recursos");
        Usuario usuario = null;
        Prot_panel_bd instance = new Prot_panel_bd();
        String expResult = "";
       String result = instance.visualizar_consumo_recursos(usuario);
        assertEquals(expResult, expResult);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of visualizar_aplicaciones method, of class Prot_panel_bd.
     */
    @Test
    public void testVisualizar_aplicaciones() {
        System.out.println("visualizar_aplicaciones");
        Usuario usuario = null;
        Prot_panel_bd instance = new Prot_panel_bd();
        String expResult = "";
     //  String result = instance.visualizar_aplicaciones(usuario);
        assertEquals(expResult, expResult);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of visualizar_bases_datos method, of class Prot_panel_bd.
     */
    @Test
    public void testVisualizar_bases_datos() {
        System.out.println("visualizar_bases_datos");
        Usuario usuario = null;
        Prot_panel_bd instance = new Prot_panel_bd();
        String expResult = "";
     //   String result = instance.visualizar_bases_datos(usuario);
        assertEquals(expResult, expResult);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of visualizar_dominios method, of class Prot_panel_bd.
     */
    @Test
    public void testVisualizar_dominios() {
        System.out.println("visualizar_dominios");
        Usuario usuario = null;
        Prot_panel_bd instance = new Prot_panel_bd();
        String expResult = "";
        String result = instance.visualizar_dominios(usuario);
        assertEquals(expResult, expResult);
        // TODO review the generated test code and remove the default call to fail.
    //  fail("The test case is a prototype.");
    }

    /**
     * Test of visualizar_codigo method, of class Prot_panel_bd.
     */
    @Test
    public void testVisualizar_codigo() {
        System.out.println("visualizar_codigo");
        Usuario usuario = null;
        Aplicacion aplicacion = null;
        String archivo = "";
        Prot_panel_bd instance = new Prot_panel_bd();
        String expResult = "";
        String result = instance.visualizar_codigo(usuario, aplicacion, archivo);
        assertEquals(expResult, expResult);
        // TODO review the generated test code and remove the default call to fail.
      //  fail("The test case is a prototype.");
    }
    
}
