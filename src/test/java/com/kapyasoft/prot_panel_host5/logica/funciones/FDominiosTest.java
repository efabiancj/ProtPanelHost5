/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kapyasoft.prot_panel_host5.logica.funciones;

import com.kapyasoft.prot_panel_host5.logica.clases.Dominio;
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
public class FDominiosTest {
    
    public FDominiosTest() {
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
     * Test of obtener_Todos_Dominios method, of class FDominios.
     */
    @Test
    public void testObtener_Todos_Dominios() throws Exception {
        System.out.println("obtener_Todos_Dominios");
        ArrayList<Dominio> expResult = null;
        ArrayList<Dominio> result = FDominios.obtener_Todos_Dominios();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of obtener_Dominio_por_pk method, of class FDominios.
     */
    @Test
    public void testObtener_Dominio_por_pk() throws Exception {
        System.out.println("obtener_Dominio_por_pk");
        int id = 0;
        Dominio expResult = null;
        Dominio result = FDominios.obtener_Dominio_por_pk(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of obtenerDominiopor_campo_id method, of class FDominios.
     */
    @Test
    public void testObtenerDominiopor_campo_id() throws Exception {
        System.out.println("obtenerDominiopor_campo_id");
        int id = 0;
        ArrayList<Dominio> expResult = null;
        ArrayList<Dominio> result = FDominios.obtenerDominiopor_campo_id(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of obtenerDominiopor_campo_nombre method, of class FDominios.
     */
    @Test
    public void testObtenerDominiopor_campo_nombre() throws Exception {
        System.out.println("obtenerDominiopor_campo_nombre");
        String nombre = "";
        ArrayList<Dominio> expResult = null;
        ArrayList<Dominio> result = FDominios.obtenerDominiopor_campo_nombre(nombre);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ingresar method, of class FDominios.
     */
    @Test
    public void testIngresar() throws Exception {
        System.out.println("ingresar");
        Dominio dominio = null;
        boolean expResult = false;
        boolean result = FDominios.ingresar(dominio);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of actualizar method, of class FDominios.
     */
    @Test
    public void testActualizar() throws Exception {
        System.out.println("actualizar");
        Dominio dominio = null;
        boolean expResult = false;
        boolean result = FDominios.actualizar(dominio);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of eliminar method, of class FDominios.
     */
    @Test
    public void testEliminar() throws Exception {
        System.out.println("eliminar");
        Dominio dominio = null;
        boolean expResult = false;
        boolean result = FDominios.eliminar(dominio);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
