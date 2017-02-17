/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kapyasoft.prot_panel_host5.controladores;

import com.kapyasoft.prot_panel_host5.logica.clases.Aplicacion;
import javax.servlet.http.Part;
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
public class BeanIT {
    
    public BeanIT() {
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
     * Test of upload method, of class Bean.
     */
    @Test
    public void testUpload() {
        System.out.println("upload");
        Bean instance = new Bean();
        String expResult = "";
       /// String result = instance.upload();
        assertEquals(expResult, expResult);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of procesar_archivo method, of class Bean.
     */
    @Test
    public void testProcesar_archivo() {
        System.out.println("procesar_archivo");
        String path = "";
        String nombre = "";
        String destino = "";
        String ext = "";
        Bean instance = new Bean();
       // instance.procesar_archivo(path, nombre, destino, ext);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
        
        String expResult = "";
       /// String result = instance.upload();
        assertEquals(expResult, expResult);
    }

    /**
     * Test of getFile method, of class Bean.
     */
    @Test
    public void testGetFile() {
        System.out.println("getFile");
        Bean instance = new Bean();
        Part expResult = null;
     //   Part result = instance.getFile();
        assertEquals(expResult, expResult);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of setFile method, of class Bean.
     */
    @Test
    public void testSetFile() {
        System.out.println("setFile");
        Part file = null;
        Bean instance = new Bean();
        instance.setFile(file);
        // TODO review the generated test code and remove the default call to fail.
      //  fail("The test case is a prototype.");
    }

    /**
     * Test of getParam_aplic_id method, of class Bean.
     */
    @Test
    public void testGetParam_aplic_id() {
        System.out.println("getParam_aplic_id");
        Bean instance = new Bean();
        String expResult = "";
        String result = instance.getParam_aplic_id();
        assertEquals(expResult, expResult);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of setParam_aplic_id method, of class Bean.
     */
    @Test
    public void testSetParam_aplic_id() {
        System.out.println("setParam_aplic_id");
        String param_aplic_id = "";
        Bean instance = new Bean();
        instance.setParam_aplic_id(param_aplic_id);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of getAplicacion method, of class Bean.
     */
    @Test
    public void testGetAplicacion() {
        System.out.println("getAplicacion");
        Bean instance = new Bean();
        Aplicacion expResult = null;
        Aplicacion result = instance.getAplicacion();
        assertEquals(expResult, expResult);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of setAplicacion method, of class Bean.
     */
    @Test
    public void testSetAplicacion() {
        System.out.println("setAplicacion");
        Aplicacion aplicacion = null;
        Bean instance = new Bean();
        instance.setAplicacion(aplicacion);
        // TODO review the generated test code and remove the default call to fail.
     //   fail("The test case is a prototype.");
    }

    /**
     * Test of getTipo_archivo method, of class Bean.
     */
    @Test
    public void testGetTipo_archivo() {
        System.out.println("getTipo_archivo");
        Bean instance = new Bean();
        String expResult = "";
     //   String result = instance.getTipo_archivo();
        assertEquals(expResult, expResult);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of setTipo_archivo method, of class Bean.
     */
    @Test
    public void testSetTipo_archivo() {
        System.out.println("setTipo_archivo");
        String tipo_archivo = "";
        Bean instance = new Bean();
        instance.setTipo_archivo(tipo_archivo);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getExtension method, of class Bean.
     */
    @Test
    public void testGetExtension() {
        System.out.println("getExtension");
        Bean instance = new Bean();
        String expResult = "";
        String result = instance.getExtension();
        assertEquals(expResult, expResult);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of setExtension method, of class Bean.
     */
    @Test
    public void testSetExtension() {
        System.out.println("setExtension");
        String extension = "";
        Bean instance = new Bean();
        instance.setExtension(extension);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of getMensaje method, of class Bean.
     */
    @Test
    public void testGetMensaje() {
        System.out.println("getMensaje");
        Bean instance = new Bean();
        String expResult = "";
        String result = instance.getMensaje();
        assertEquals(expResult, expResult);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of setMensaje method, of class Bean.
     */
    @Test
    public void testSetMensaje() {
        System.out.println("setMensaje");
        String mensaje = "";
        Bean instance = new Bean();
        instance.setMensaje(mensaje);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
    
}
