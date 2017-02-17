/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kapyasoft.prot_panel_host5.controladores;

import com.kapyasoft.prot_panel_host5.logica.clases.Bases_datos;
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
public class BeanBDIT {
    
    public BeanBDIT() {
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
     * Test of upload method, of class BeanBD.
     */
    @Test
    public void testUpload() {
        System.out.println("upload");
        BeanBD instance = new BeanBD();
        String expResult = "";
        String result = instance.upload();
        assertEquals(expResult, expResult);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getFile method, of class BeanBD.
     */
    @Test
    public void testGetFile() {
        System.out.println("getFile");
        BeanBD instance = new BeanBD();
        Part expResult = null;
        Part result = instance.getFile();
        assertEquals(expResult, expResult);
        // TODO review the generated test code and remove the default call to fail.
      //  fail("The test case is a prototype.");
    }

    /**
     * Test of setFile method, of class BeanBD.
     */
    @Test
    public void testSetFile() {
        System.out.println("setFile");
        Part file = null;
        BeanBD instance = new BeanBD();
        instance.setFile(file);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of getParam_aplic_id method, of class BeanBD.
     */
    @Test
    public void testGetParam_aplic_id() {
        System.out.println("getParam_aplic_id");
        BeanBD instance = new BeanBD();
        String expResult = "";
     //   String result = instance.getParam_aplic_id();
        assertEquals(expResult, expResult);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of setParam_aplic_id method, of class BeanBD.
     */
    @Test
    public void testSetParam_aplic_id() {
        System.out.println("setParam_aplic_id");
        String param_aplic_id = "";
        BeanBD instance = new BeanBD();
        instance.setParam_aplic_id(param_aplic_id);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of getBase method, of class BeanBD.
     */
    @Test
    public void testGetBase() {
        System.out.println("getBase");
        BeanBD instance = new BeanBD();
        Bases_datos expResult = null;
    //    Bases_datos result = instance.getBase();
        assertEquals(expResult, expResult);
        // TODO review the generated test code and remove the default call to fail.
      //  fail("The test case is a prototype.");
    }

    /**
     * Test of setBase method, of class BeanBD.
     */
    @Test
    public void testSetBase() {
        System.out.println("setBase");
        Bases_datos base = null;
        BeanBD instance = new BeanBD();
        instance.setBase(base);
        // TODO review the generated test code and remove the default call to fail.
      ///  fail("The test case is a prototype.");
    }

    /**
     * Test of getTipo_archivo method, of class BeanBD.
     */
    @Test
    public void testGetTipo_archivo() {
        System.out.println("getTipo_archivo");
        BeanBD instance = new BeanBD();
        String expResult = "";
        String result = instance.getTipo_archivo();
        assertEquals(expResult, expResult);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of setTipo_archivo method, of class BeanBD.
     */
    @Test
    public void testSetTipo_archivo() {
        System.out.println("setTipo_archivo");
        String tipo_archivo = "";
        BeanBD instance = new BeanBD();
        instance.setTipo_archivo(tipo_archivo);
        // TODO review the generated test code and remove the default call to fail.
      //  fail("The test case is a prototype.");
    }

    /**
     * Test of getExtension method, of class BeanBD.
     */
    @Test
    public void testGetExtension() {
        System.out.println("getExtension");
        BeanBD instance = new BeanBD();
        String expResult = "";
        String result = instance.getExtension();
        assertEquals(expResult, expResult);
        // TODO review the generated test code and remove the default call to fail.
      //  fail("The test case is a prototype.");
    }

    /**
     * Test of setExtension method, of class BeanBD.
     */
    @Test
    public void testSetExtension() {
        System.out.println("setExtension");
        String extension = "";
        BeanBD instance = new BeanBD();
        instance.setExtension(extension);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of getMensaje method, of class BeanBD.
     */
    @Test
    public void testGetMensaje() {
        System.out.println("getMensaje");
        BeanBD instance = new BeanBD();
        String expResult = "";
        String result = instance.getMensaje();
        assertEquals(expResult, expResult);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setMensaje method, of class BeanBD.
     */
    @Test
    public void testSetMensaje() {
        System.out.println("setMensaje");
        String mensaje = "";
        BeanBD instance = new BeanBD();
        instance.setMensaje(mensaje);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
    
}
