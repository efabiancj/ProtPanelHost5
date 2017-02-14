/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kapyasoft.prot_panel_host5.logica.funciones;

import com.kapyasoft.prot_panel_host5.logica.clases.Aplicacion;
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
public class FAplicacionsTest {
    
    public FAplicacionsTest() {
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
     * Test of obtener_Todos_Aplicacions method, of class FAplicacions.
     */
    @Test
    public void testObtener_Todos_Aplicacions() throws Exception {
        System.out.println("obtener_Todos_Aplicacions");
        ArrayList<Aplicacion> expResult = null;
        ArrayList<Aplicacion> result = FAplicacions.obtener_Todos_Aplicacions();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of obtener_Aplicacion_por_pk method, of class FAplicacions.
     */
    @Test
    public void testObtener_Aplicacion_por_pk() throws Exception {
        System.out.println("obtener_Aplicacion_por_pk");
        int id = 0;
        Aplicacion expResult = null;
        Aplicacion result = FAplicacions.obtener_Aplicacion_por_pk(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of obtenerAplicacionpor_campo_id method, of class FAplicacions.
     */
    @Test
    public void testObtenerAplicacionpor_campo_id() throws Exception {
        System.out.println("obtenerAplicacionpor_campo_id");
        int id = 0;
        ArrayList<Aplicacion> expResult = null;
        ArrayList<Aplicacion> result = FAplicacions.obtenerAplicacionpor_campo_id(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of obtenerAplicacionpor_campo_nombre method, of class FAplicacions.
     */
    @Test
    public void testObtenerAplicacionpor_campo_nombre() throws Exception {
        System.out.println("obtenerAplicacionpor_campo_nombre");
        String nombre = "";
        Aplicacion expResult = null;
        Aplicacion result = FAplicacions.obtenerAplicacionpor_campo_nombre(nombre);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of obtenerAplicacionpor_campo_usuario method, of class FAplicacions.
     */
    @Test
    public void testObtenerAplicacionpor_campo_usuario() throws Exception {
        System.out.println("obtenerAplicacionpor_campo_usuario");
        int usuario = 0;
        ArrayList<Aplicacion> expResult = null;
        ArrayList<Aplicacion> result = FAplicacions.obtenerAplicacionpor_campo_usuario(usuario);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of obtenerAplicacionpor_campo_directorio method, of class FAplicacions.
     */
    @Test
    public void testObtenerAplicacionpor_campo_directorio() throws Exception {
        System.out.println("obtenerAplicacionpor_campo_directorio");
        String directorio = "";
        ArrayList<Aplicacion> expResult = null;
        ArrayList<Aplicacion> result = FAplicacions.obtenerAplicacionpor_campo_directorio(directorio);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of obtenerAplicacionpor_campo_archivo_war method, of class FAplicacions.
     */
    @Test
    public void testObtenerAplicacionpor_campo_archivo_war() throws Exception {
        System.out.println("obtenerAplicacionpor_campo_archivo_war");
        String archivo_war = "";
        ArrayList<Aplicacion> expResult = null;
        ArrayList<Aplicacion> result = FAplicacions.obtenerAplicacionpor_campo_archivo_war(archivo_war);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ingresar method, of class FAplicacions.
     */
    @Test
    public void testIngresar() throws Exception {
        System.out.println("ingresar");
        Aplicacion aplicacion = null;
        boolean expResult = false;
        boolean result = FAplicacions.ingresar(aplicacion);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of actualizar method, of class FAplicacions.
     */
    @Test
    public void testActualizar() throws Exception {
        System.out.println("actualizar");
        Aplicacion aplicacion = null;
        boolean expResult = false;
        boolean result = FAplicacions.actualizar(aplicacion);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of eliminar method, of class FAplicacions.
     */
    @Test
    public void testEliminar() throws Exception {
        System.out.println("eliminar");
        Aplicacion aplicacion = null;
        boolean expResult = false;
        boolean result = FAplicacions.eliminar(aplicacion);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of obtenerultimo method, of class FAplicacions.
     */
    @Test
    public void testObtenerultimo() throws Exception {
        System.out.println("obtenerultimo");
        int expResult = 0;
        int result = FAplicacions.obtenerultimo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
