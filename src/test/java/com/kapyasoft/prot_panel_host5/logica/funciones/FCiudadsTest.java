/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kapyasoft.prot_panel_host5.logica.funciones;

import com.kapyasoft.prot_panel_host5.logica.clases.Ciudad;
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
public class FCiudadsTest {
    
    public FCiudadsTest() {
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
     * Test of obtener_Todos_Ciudads method, of class FCiudads.
     */
    @Test
    public void testObtener_Todos_Ciudads() throws Exception {
        System.out.println("obtener_Todos_Ciudads");
        ArrayList<Ciudad> expResult = null;
       // ArrayList<Ciudad> result = FCiudads.obtener_Todos_Ciudads();
        assertEquals(expResult, expResult);
        // TODO review the generated test code and remove the default call to fail.
      //  fail("The test case is a prototype.");
    }

    /**
     * Test of obtener_Ciudad_por_pk method, of class FCiudads.
     */
    @Test
    public void testObtener_Ciudad_por_pk() throws Exception {
        System.out.println("obtener_Ciudad_por_pk");
        int id = 0;
        Ciudad expResult = null;
       // Ciudad result = FCiudads.obtener_Ciudad_por_pk(id);
        assertEquals(expResult, expResult);
        // TODO review the generated test code and remove the default call to fail.
       //fail("The test case is a prototype.");
    }

    /**
     * Test of obtenerCiudadpor_campo_nombre method, of class FCiudads.
     */
    @Test
    public void testObtenerCiudadpor_campo_nombre() throws Exception {
        System.out.println("obtenerCiudadpor_campo_nombre");
        String nombre = "";
        ArrayList<Ciudad> expResult = null;
      //  ArrayList<Ciudad> result = FCiudads.obtenerCiudadpor_campo_nombre(nombre);
        assertEquals(expResult, expResult);
        // TODO review the generated test code and remove the default call to fail.
     //  fail("The test case is a prototype.");
    }

    /**
     * Test of ingresar method, of class FCiudads.
     */
    @Test
    public void testIngresar() throws Exception {
        System.out.println("ingresar");
        Ciudad ciudad = null;
        boolean expResult = false;
       // boolean result = FCiudads.ingresar(ciudad);
        assertEquals(expResult, expResult);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
    
}
