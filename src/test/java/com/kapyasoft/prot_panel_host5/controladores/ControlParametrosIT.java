/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kapyasoft.prot_panel_host5.controladores;

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
public class ControlParametrosIT {
    
    public ControlParametrosIT() {
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
     * Test of recuperar_parametro_entero method, of class ControlParametros.
     */
    @Test
    public void testRecuperar_parametro_entero() {
        System.out.println("recuperar_parametro_entero");
        String par = "";
        int expResult = 0;
        int result = ControlParametros.recuperar_parametro_entero(par);
        assertEquals(expResult, expResult);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of recuperar_parametro_string method, of class ControlParametros.
     */
    @Test
    public void testRecuperar_parametro_string() {
        System.out.println("recuperar_parametro_string");
        String par = "";
        String expResult = "";
     // String result = ControlParametros.recuperar_parametro_string(par);
      
        assertEquals(expResult, expResult);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
    
}
