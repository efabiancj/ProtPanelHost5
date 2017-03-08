/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kapyasoft.prot_panel_host5.logica.funciones;

import com.kapyasoft.prot_panel_host5.logica.clases.Servicio;
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
public class FServiciosTest {
    
    public FServiciosTest() {
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
     * Test of obtener_Todos_Servicios method, of class FServicios.
     */
    @Test
    public void testObtener_Todos_Servicios() throws Exception {
        System.out.println("obtener_Todos_Servicios");
        ArrayList<Servicio> expResult = null;
        ArrayList<Servicio> result = FServicios.obtener_Todos_Servicios();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of obtener_Servicio_por_pk method, of class FServicios.
     */
    @Test
    public void testObtener_Servicio_por_pk() throws Exception {
        System.out.println("obtener_Servicio_por_pk");
        int id = 0;
        Servicio expResult = null;
        Servicio result = FServicios.obtener_Servicio_por_pk(id);
        assertEquals(expResult, expResult);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of obtenerServiciopor_campo_id method, of class FServicios.
     */
    @Test
    public void testObtenerServiciopor_campo_id() throws Exception {
        System.out.println("obtenerServiciopor_campo_id");
        int id = 0;
        ArrayList<Servicio> expResult = null;
        ArrayList<Servicio> result = FServicios.obtenerServiciopor_campo_id(id);
        assertEquals(expResult, expResult);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of obtenerServiciopor_campo_descripcion method, of class FServicios.
     */
    @Test
    public void testObtenerServiciopor_campo_descripcion() throws Exception {
        System.out.println("obtenerServiciopor_campo_descripcion");
        String descripcion = "";
        ArrayList<Servicio> expResult = null;
        ArrayList<Servicio> result = FServicios.obtenerServiciopor_campo_descripcion(descripcion);
        assertEquals(expResult, expResult);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of obtenerServiciopor_campo_costo method, of class FServicios.
     */
    @Test
    public void testObtenerServiciopor_campo_costo() throws Exception {
        System.out.println("obtenerServiciopor_campo_costo");
        double costo = 0.0;
        ArrayList<Servicio> expResult = null;
        ArrayList<Servicio> result = FServicios.obtenerServiciopor_campo_costo(costo);
        assertEquals(expResult, expResult);
        // TODO review the generated test code and remove the default call to fail.
      //  fail("The test case is a prototype.");
    }

    /**
     * Test of ingresar method, of class FServicios.
     */
    @Test
    public void testIngresar() throws Exception {
        System.out.println("ingresar");
        Servicio servicio = null;
        boolean expResult = false;
        boolean result = FServicios.ingresar(servicio);
        assertEquals(expResult, expResult);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of actualizar method, of class FServicios.
     */
    @Test
    public void testActualizar() throws Exception {
        System.out.println("actualizar");
        Servicio servicio = null;
        boolean expResult = false;
        boolean result = FServicios.actualizar(servicio);
        assertEquals(expResult, expResult);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of eliminar method, of class FServicios.
     */
    @Test
    public void testEliminar() throws Exception {
        System.out.println("eliminar");
        Servicio servicio = null;
        boolean expResult = false;
        boolean result = FServicios.eliminar(servicio);
        assertEquals(expResult, expResult);
        // TODO review the generated test code and remove the default call to fail.
      //  fail("The test case is a prototype.");
    }
    
}
