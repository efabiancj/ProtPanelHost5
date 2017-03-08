/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kapyasoft.prot_panel_host5.logica.funciones;

import com.kapyasoft.prot_panel_host5.logica.clases.Pago;
import java.sql.Date;
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
public class FPagosTest {
    
    public FPagosTest() {
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
     * Test of obtener_Todos_Pagos method, of class FPagos.
     */
    @Test
    public void testObtener_Todos_Pagos() throws Exception {
        System.out.println("obtener_Todos_Pagos");
        ArrayList<Pago> expResult = null;
        ArrayList<Pago> result = FPagos.obtener_Todos_Pagos();
        assertEquals(expResult, expResult);
        // TODO review the generated test code and remove the default call to fail.
      //  fail("The test case is a prototype.");
    }

    /**
     * Test of obtener_Pago_por_pk method, of class FPagos.
     */
    @Test
    public void testObtener_Pago_por_pk() throws Exception {
        System.out.println("obtener_Pago_por_pk");
        int id = 0;
        Pago expResult = null;
        Pago result = FPagos.obtener_Pago_por_pk(id);
        assertEquals(expResult, expResult);
        // TODO review the generated test code and remove the default call to fail.
      //  fail("The test case is a prototype.");
    }

    /**
     * Test of obtenerPagopor_campo_id method, of class FPagos.
     */
    @Test
    public void testObtenerPagopor_campo_id() throws Exception {
        System.out.println("obtenerPagopor_campo_id");
        int id = 0;
        ArrayList<Pago> expResult = null;
        ArrayList<Pago> result = FPagos.obtenerPagopor_campo_id(id);
        assertEquals(expResult, expResult);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of obtenerPagopor_campo_valor method, of class FPagos.
     */
    @Test
    public void testObtenerPagopor_campo_valor() throws Exception {
        System.out.println("obtenerPagopor_campo_valor");
        double valor = 0.0;
        ArrayList<Pago> expResult = null;
        ArrayList<Pago> result = FPagos.obtenerPagopor_campo_valor(valor);
        assertEquals(expResult, expResult);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of obtenerPagopor_campo_mes method, of class FPagos.
     */
    @Test
    public void testObtenerPagopor_campo_mes() throws Exception {
        System.out.println("obtenerPagopor_campo_mes");
        Date mes = null;
        ArrayList<Pago> expResult = null;
        ArrayList<Pago> result = FPagos.obtenerPagopor_campo_mes(mes);
        assertEquals(expResult, expResult);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of obtenerPagopor_campo_fecha_pago method, of class FPagos.
     */
    @Test
    public void testObtenerPagopor_campo_fecha_pago() throws Exception {
        System.out.println("obtenerPagopor_campo_fecha_pago");
        Date fecha_pago = null;
        ArrayList<Pago> expResult = null;
        ArrayList<Pago> result = FPagos.obtenerPagopor_campo_fecha_pago(fecha_pago);
        assertEquals(expResult, expResult);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of obtenerPagopor_campo_usuario method, of class FPagos.
     */
    @Test
    public void testObtenerPagopor_campo_usuario() throws Exception {
        System.out.println("obtenerPagopor_campo_usuario");
        int usuario = 0;
        ArrayList<Pago> expResult = null;
        ArrayList<Pago> result = FPagos.obtenerPagopor_campo_usuario(usuario);
        assertEquals(expResult, expResult);
        // TODO review the generated test code and remove the default call to fail.
      //  fail("The test case is a prototype.");
    }

    /**
     * Test of ingresar method, of class FPagos.
     */
    @Test
    public void testIngresar() throws Exception {
        System.out.println("ingresar");
        Pago pago = null;
        boolean expResult = false;
        boolean result = FPagos.ingresar(pago);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of actualizar method, of class FPagos.
     */
    @Test
    public void testActualizar() throws Exception {
        System.out.println("actualizar");
        Pago pago = null;
        boolean expResult = false;
        boolean result = FPagos.actualizar(pago);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of eliminar method, of class FPagos.
     */
    @Test
    public void testEliminar() throws Exception {
        System.out.println("eliminar");
        Pago pago = null;
        boolean expResult = false;
        boolean result = FPagos.eliminar(pago);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
