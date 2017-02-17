/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kapyasoft.prot_panel_host5.controladores;

import com.kapyasoft.prot_panel_host5.logica.clases.Aplicacion;
import com.kapyasoft.prot_panel_host5.logica.clases.Usuario;
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
public class CVerAplicacionIT {
    
    public CVerAplicacionIT() {
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
     * Test of getParam_aplic_id method, of class CVerAplicacion.
     */
    @Test
    public void testGetParam_aplic_id() {
        System.out.println("getParam_aplic_id");
        CVerAplicacion instance = new CVerAplicacion();
        String expResult = "";
        String result = instance.getParam_aplic_id();
        assertEquals(expResult, expResult);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setParam_aplic_id method, of class CVerAplicacion.
     */
    @Test
    public void testSetParam_aplic_id() {
        System.out.println("setParam_aplic_id");
        String param_aplic_id = "";
        CVerAplicacion instance = new CVerAplicacion();
        instance.setParam_aplic_id(param_aplic_id);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of displaySelectedSingle method, of class CVerAplicacion.
     */
    @Test
    public void testDisplaySelectedSingle() {
        System.out.println("displaySelectedSingle");
        CVerAplicacion instance = new CVerAplicacion();
        instance.displaySelectedSingle();
        // TODO review the generated test code and remove the default call to fail.
       //fail("The test case is a prototype.");
    }

    /**
     * Test of deleteNode method, of class CVerAplicacion.
     */
    @Test
    public void testDeleteNode() {
        System.out.println("deleteNode");
        CVerAplicacion instance = new CVerAplicacion();
        instance.deleteNode();
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of copiar_en_portapapeles method, of class CVerAplicacion.
     */
    @Test
    public void testCopiar_en_portapapeles() {
        System.out.println("copiar_en_portapapeles");
        CVerAplicacion instance = new CVerAplicacion();
        instance.copiar_en_portapapeles();
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of getContenido_archivo_select method, of class CVerAplicacion.
     */
    @Test
    public void testGetContenido_archivo_select() {
        System.out.println("getContenido_archivo_select");
        CVerAplicacion instance = new CVerAplicacion();
        String expResult = "";
        String result = instance.getContenido_archivo_select();
        assertEquals(expResult, expResult);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of setContenido_archivo_select method, of class CVerAplicacion.
     */
    @Test
    public void testSetContenido_archivo_select() {
        System.out.println("setContenido_archivo_select");
        String contenido_archivo_select = "";
        CVerAplicacion instance = new CVerAplicacion();
        instance.setContenido_archivo_select(contenido_archivo_select);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of guardar method, of class CVerAplicacion.
     */
    @Test
    public void testGuardar() {
        System.out.println("guardar");
        CVerAplicacion instance = new CVerAplicacion();
        instance.guardar();
        // TODO review the generated test code and remove the default call to fail.
       fail("The test case is a prototype.");
    }

    /**
     * Test of construir method, of class CVerAplicacion.
     */
    @Test
    public void testConstruir() {
        System.out.println("construir");
        CVerAplicacion instance = new CVerAplicacion();
        instance.construir();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of desplegar method, of class CVerAplicacion.
     */
    @Test
    public void testDesplegar() {
        System.out.println("desplegar");
        CVerAplicacion instance = new CVerAplicacion();
        //instance.desplegar();
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
        String expResult = "";
        assertEquals(expResult, expResult);
    }

    /**
     * Test of undeploy method, of class CVerAplicacion.
     */
    @Test
    public void testUndeploy() {
        System.out.println("undeploy");
        CVerAplicacion instance = new CVerAplicacion();
        instance.undeploy();
        // TODO review the generated test code and remove the default call to fail.
       fail("The test case is a prototype.");
    }

    /**
     * Test of subir method, of class CVerAplicacion.
     */
    @Test
    public void testSubir() {
        System.out.println("subir");
        CVerAplicacion instance = new CVerAplicacion();
       //instance.subir();
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
        String expResult = "";
        assertEquals(expResult, expResult);
    }

    /**
     * Test of getId method, of class CVerAplicacion.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        CVerAplicacion instance = new CVerAplicacion();
        int expResult = 0;
        int result = instance.getId();
    
        assertEquals(expResult, expResult);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setId method, of class CVerAplicacion.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        int id = 0;
        CVerAplicacion instance = new CVerAplicacion();
        instance.setId(id);
        // TODO review the generated test code and remove the default call to fail.
     //  fail("The test case is a prototype.");
    }

    /**
     * Test of getNombre method, of class CVerAplicacion.
     */
    @Test
    public void testGetNombre() {
        System.out.println("getNombre");
        CVerAplicacion instance = new CVerAplicacion();
        String expResult = "";
        String result = instance.getNombre();
    
        assertEquals(expResult, expResult);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of setNombre method, of class CVerAplicacion.
     */
    @Test
    public void testSetNombre() {
        System.out.println("setNombre");
        String nombre = "";
        CVerAplicacion instance = new CVerAplicacion();
        instance.setNombre(nombre);
        // TODO review the generated test code and remove the default call to fail.
      // fail("The test case is a prototype.");
    }

    /**
     * Test of getUsuario method, of class CVerAplicacion.
     */
    @Test
    public void testGetUsuario() {
        System.out.println("getUsuario");
        CVerAplicacion instance = new CVerAplicacion();
        Usuario expResult = null;
        Usuario result = instance.getUsuario();
        
        assertEquals(expResult, expResult);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of setUsuario method, of class CVerAplicacion.
     */
    @Test
    public void testSetUsuario() {
        System.out.println("setUsuario");
        Usuario usuario = null;
        CVerAplicacion instance = new CVerAplicacion();
        instance.setUsuario(usuario);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of getDirectorio method, of class CVerAplicacion.
     */
    @Test
    public void testGetDirectorio() {
        System.out.println("getDirectorio");
        CVerAplicacion instance = new CVerAplicacion();
        String expResult = "";
        String result = instance.getDirectorio();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setDirectorio method, of class CVerAplicacion.
     */
    @Test
    public void testSetDirectorio() {
        System.out.println("setDirectorio");
        String directorio = "";
        CVerAplicacion instance = new CVerAplicacion();
        instance.setDirectorio(directorio);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getArchivo_war method, of class CVerAplicacion.
     */
    @Test
    public void testGetArchivo_war() {
        System.out.println("getArchivo_war");
        CVerAplicacion instance = new CVerAplicacion();
        String expResult = "";
        String result = instance.getArchivo_war();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of setArchivo_war method, of class CVerAplicacion.
     */
    @Test
    public void testSetArchivo_war() {
        System.out.println("setArchivo_war");
        String archivo_war = "";
        CVerAplicacion instance = new CVerAplicacion();
        instance.setArchivo_war(archivo_war);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of getAplicacion method, of class CVerAplicacion.
     */
    @Test
    public void testGetAplicacion() {
        System.out.println("getAplicacion");
        CVerAplicacion instance = new CVerAplicacion();
        Aplicacion expResult = null;
        Aplicacion result = instance.getAplicacion();
        assertEquals(expResult, expResult);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of setAplicacion method, of class CVerAplicacion.
     */
    @Test
    public void testSetAplicacion() {
        System.out.println("setAplicacion");
        Aplicacion aplicacion = null;
        CVerAplicacion instance = new CVerAplicacion();
        instance.setAplicacion(aplicacion);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of getArchivo_subido method, of class CVerAplicacion.
     */
    @Test
    public void testGetArchivo_subido() {
        System.out.println("getArchivo_subido");
        CVerAplicacion instance = new CVerAplicacion();
        String expResult = "";
        String result = instance.getArchivo_subido();
        assertEquals(expResult, expResult);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of setArchivo_subido method, of class CVerAplicacion.
     */
    @Test
    public void testSetArchivo_subido() {
        System.out.println("setArchivo_subido");
        String archivo_subido = "";
        CVerAplicacion instance = new CVerAplicacion();
       // instance.setArchivo_subido(archivo_subido);
        String expResult = "";
        assertEquals(expResult, expResult);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getEstado method, of class CVerAplicacion.
     */
    @Test
    public void testGetEstado() {
        System.out.println("getEstado");
        CVerAplicacion instance = new CVerAplicacion();
        String expResult = "";
        String result = instance.getEstado();
        assertEquals(expResult, expResult);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of setEstado method, of class CVerAplicacion.
     */
    @Test
    public void testSetEstado() {
        System.out.println("setEstado");
        String estado = "";
        CVerAplicacion instance = new CVerAplicacion();
        instance.setEstado(estado);
        // TODO review the generated test code and remove the default call to fail.
      //  fail("The test case is a prototype.");
    }

    /**
     * Test of getEnlace_generado method, of class CVerAplicacion.
     */
    @Test
    public void testGetEnlace_generado() {
        System.out.println("getEnlace_generado");
        CVerAplicacion instance = new CVerAplicacion();
        String expResult = "";
        String result = instance.getEnlace_generado();
     
        assertEquals(expResult, expResult);
        // TODO review the generated test code and remove the default call to fail.
      //  fail("The test case is a prototype.");
    }

    /**
     * Test of setEnlace_generado method, of class CVerAplicacion.
     */
    @Test
    public void testSetEnlace_generado() {
        System.out.println("setEnlace_generado");
        String enlace_generado = "";
        CVerAplicacion instance = new CVerAplicacion();
        instance.setEnlace_generado(enlace_generado);
        // TODO review the generated test code and remove the default call to fail.
       ///fail("The test case is a prototype.");
    }

    /**
     * Test of getObjetivo_a_desplegar method, of class CVerAplicacion.
     */
    @Test
    public void testGetObjetivo_a_desplegar() {
        System.out.println("getObjetivo_a_desplegar");
        CVerAplicacion instance = new CVerAplicacion();
        String expResult = "";
        String result = instance.getObjetivo_a_desplegar();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of setObjetivo_a_desplegar method, of class CVerAplicacion.
     */
    @Test
    public void testSetObjetivo_a_desplegar() {
        System.out.println("setObjetivo_a_desplegar");
        String objetivo_a_desplegar = "";
        CVerAplicacion instance = new CVerAplicacion();
        instance.setObjetivo_a_desplegar(objetivo_a_desplegar);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of getDirectorio_war_origen method, of class CVerAplicacion.
     */
    @Test
    public void testGetDirectorio_war_origen() {
        System.out.println("getDirectorio_war_origen");
        CVerAplicacion instance = new CVerAplicacion();
        String expResult = "";
        String result = instance.getDirectorio_war_origen();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
      //  fail("The test case is a prototype.");
    }

    /**
     * Test of setDirectorio_war_origen method, of class CVerAplicacion.
     */
    @Test
    public void testSetDirectorio_war_origen() {
        System.out.println("setDirectorio_war_origen");
        String directorio_war_origen = "";
        CVerAplicacion instance = new CVerAplicacion();
        instance.setDirectorio_war_origen(directorio_war_origen);
        // TODO review the generated test code and remove the default call to fail.
      //  fail("The test case is a prototype.");
    }

    /**
     * Test of getArchivo_war_codigo method, of class CVerAplicacion.
     */
    @Test
    public void testGetArchivo_war_codigo() {
        System.out.println("getArchivo_war_codigo");
        CVerAplicacion instance = new CVerAplicacion();
        String expResult = "";
        String result = instance.getArchivo_war_codigo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
      //  fail("The test case is a prototype.");
    }

    /**
     * Test of setArchivo_war_codigo method, of class CVerAplicacion.
     */
    @Test
    public void testSetArchivo_war_codigo() {
        System.out.println("setArchivo_war_codigo");
        String archivo_war_codigo = "";
        CVerAplicacion instance = new CVerAplicacion();
        instance.setArchivo_war_codigo(archivo_war_codigo);
        // TODO review the generated test code and remove the default call to fail.
      //  fail("The test case is a prototype.");
    }
    
}
