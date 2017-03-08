/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kapyasoft.prot_panel_host5.logica.funciones;

import com.kapyasoft.prot_panel_host5.logica.clases.Contrato;
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
public class FContratosTest {
    
    public FContratosTest() {
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
     * Test of obtener_Todos_Contratos method, of class FContratos.
     */
    @Test
    public void testObtener_Todos_Contratos() throws Exception {
        System.out.println("obtener_Todos_Contratos");
        ArrayList<Contrato> expResult = null;
        ArrayList<Contrato> result = FContratos.obtener_Todos_Contratos();
        assertEquals(expResult, expResult);
        // TODO review the generated test code and remove the default call to fail.
      //  fail("The test case is a prototype.");
    }

    /**
     * Test of obtener_Contrato_por_pk method, of class FContratos.
     */
    @Test
    public void testObtener_Contrato_por_pk() throws Exception {
        System.out.println("obtener_Contrato_por_pk");
        int id = 0;
        Contrato expResult = null;
        Contrato result = FContratos.obtener_Contrato_por_pk(id);
        assertEquals(expResult, expResult);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of obtenerContratopor_campo_id method, of class FContratos.
     */
    @Test
    public void testObtenerContratopor_campo_id() throws Exception {
        System.out.println("obtenerContratopor_campo_id");
        int id = 0;
        ArrayList<Contrato> expResult = null;
        ArrayList<Contrato> result = FContratos.obtenerContratopor_campo_id(id);
        assertEquals(expResult, expResult);
        // TODO review the generated test code and remove the default call to fail.
      //  fail("The test case is a prototype.");
    }

    /**
     * Test of obtenerContratopor_campo_fecha method, of class FContratos.
     */
    @Test
    public void testObtenerContratopor_campo_fecha() throws Exception {
        System.out.println("obtenerContratopor_campo_fecha");
        Date fecha = null;
        ArrayList<Contrato> expResult = null;
        ArrayList<Contrato> result = FContratos.obtenerContratopor_campo_fecha(fecha);
        assertEquals(expResult, expResult);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of obtenerContratopor_campo_servicio method, of class FContratos.
     */
    @Test
    public void testObtenerContratopor_campo_servicio() throws Exception {
        System.out.println("obtenerContratopor_campo_servicio");
        int servicio = 0;
        ArrayList<Contrato> expResult = null;
        ArrayList<Contrato> result = FContratos.obtenerContratopor_campo_servicio(servicio);
        assertEquals(expResult, expResult);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of obtenerContratopor_campo_usuario method, of class FContratos.
     */
    @Test
    public void testObtenerContratopor_campo_usuario() throws Exception {
        System.out.println("obtenerContratopor_campo_usuario");
        int usuario = 0;
        ArrayList<Contrato> expResult = null;
        ArrayList<Contrato> result = FContratos.obtenerContratopor_campo_usuario(usuario);
        assertEquals(expResult, expResult);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of ingresar method, of class FContratos.
     */
    @Test
    public void testIngresar() throws Exception {
        System.out.println("ingresar");
        Contrato contrato = null;
        boolean expResult = false;
        boolean result = FContratos.ingresar(contrato);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of actualizar method, of class FContratos.
     */
    @Test
    public void testActualizar() throws Exception {
        System.out.println("actualizar");
        Contrato contrato = null;
        boolean expResult = false;
        boolean result = FContratos.actualizar(contrato);
        assertEquals(expResult, expResult);
        // TODO review the generated test code and remove the default call to fail.
      //  fail("The test case is a prototype.");
    }

    /**
     * Test of eliminar method, of class FContratos.
     */
    @Test
    public void testEliminar() throws Exception {
        System.out.println("eliminar");
        Contrato contrato = null;
        boolean expResult = false;
        boolean result = FContratos.eliminar(contrato);
        assertEquals(expResult, expResult);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
    
}
