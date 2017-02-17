/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kapyasoft.prot_panel_host5.logica.funciones;

import com.kapyasoft.prot_panel_host5.logica.clases.Administrador;
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
public class FAdministradorsTest {
    
    public FAdministradorsTest() {
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
     * Test of obtener_Todos_Administradors method, of class FAdministradors.
     */
    @Test
    public void testObtener_Todos_Administradors() throws Exception {
        System.out.println("obtener_Todos_Administradors");
        ArrayList<Administrador> expResult = null;
        ArrayList<Administrador> result = FAdministradors.obtener_Todos_Administradors();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of obtener_Administrador_por_pk method, of class FAdministradors.
     */
    @Test
    public void testObtener_Administrador_por_pk() throws Exception {
        System.out.println("obtener_Administrador_por_pk");
        String codigo = "";
        Administrador expResult = null;
        Administrador result = FAdministradors.obtener_Administrador_por_pk(codigo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of obtenerAdministradorpor_campo_codigo method, of class FAdministradors.
     */
    @Test
    public void testObtenerAdministradorpor_campo_codigo() throws Exception {
        System.out.println("obtenerAdministradorpor_campo_codigo");
        String codigo = "";
        ArrayList<Administrador> expResult = null;
        ArrayList<Administrador> result = FAdministradors.obtenerAdministradorpor_campo_codigo(codigo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of obtenerAdministradorpor_campo_nombres method, of class FAdministradors.
     */
    @Test
    public void testObtenerAdministradorpor_campo_nombres() throws Exception {
        System.out.println("obtenerAdministradorpor_campo_nombres");
        String nombres = "";
        ArrayList<Administrador> expResult = null;
        ArrayList<Administrador> result = FAdministradors.obtenerAdministradorpor_campo_nombres(nombres);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of obtenerAdministradorpor_campo_apellidos method, of class FAdministradors.
     */
    @Test
    public void testObtenerAdministradorpor_campo_apellidos() throws Exception {
        System.out.println("obtenerAdministradorpor_campo_apellidos");
        String apellidos = "";
        ArrayList<Administrador> expResult = null;
        ArrayList<Administrador> result = FAdministradors.obtenerAdministradorpor_campo_apellidos(apellidos);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of obtenerAdministradorpor_campo_direccion method, of class FAdministradors.
     */
    @Test
    public void testObtenerAdministradorpor_campo_direccion() throws Exception {
        System.out.println("obtenerAdministradorpor_campo_direccion");
        String direccion = "";
        ArrayList<Administrador> expResult = null;
        ArrayList<Administrador> result = FAdministradors.obtenerAdministradorpor_campo_direccion(direccion);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of obtenerAdministradorpor_campo_telefono method, of class FAdministradors.
     */
    @Test
    public void testObtenerAdministradorpor_campo_telefono() throws Exception {
        System.out.println("obtenerAdministradorpor_campo_telefono");
        String telefono = "";
        ArrayList<Administrador> expResult = null;
        ArrayList<Administrador> result = FAdministradors.obtenerAdministradorpor_campo_telefono(telefono);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of obtenerAdministradorpor_campo_email method, of class FAdministradors.
     */
    @Test
    public void testObtenerAdministradorpor_campo_email() throws Exception {
        System.out.println("obtenerAdministradorpor_campo_email");
        String email = "";
        ArrayList<Administrador> expResult = null;
        ArrayList<Administrador> result = FAdministradors.obtenerAdministradorpor_campo_email(email);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of obtenerAdministradorpor_campo_clave method, of class FAdministradors.
     */
    @Test
    public void testObtenerAdministradorpor_campo_clave() throws Exception {
        System.out.println("obtenerAdministradorpor_campo_clave");
        String clave = "";
        ArrayList<Administrador> expResult = null;
        ArrayList<Administrador> result = FAdministradors.obtenerAdministradorpor_campo_clave(clave);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of obtenerAdministradorpor_campo_grupo method, of class FAdministradors.
     */
    @Test
    public void testObtenerAdministradorpor_campo_grupo() throws Exception {
        System.out.println("obtenerAdministradorpor_campo_grupo");
        int grupo = 0;
        ArrayList<Administrador> expResult = null;
        ArrayList<Administrador> result = FAdministradors.obtenerAdministradorpor_campo_grupo(grupo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ingresar method, of class FAdministradors.
     */
    @Test
    public void testIngresar() throws Exception {
        System.out.println("ingresar");
        Administrador administrador = null;
        boolean expResult = false;
        boolean result = FAdministradors.ingresar(administrador);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of actualizar method, of class FAdministradors.
     */
    @Test
    public void testActualizar() throws Exception {
        System.out.println("actualizar");
        Administrador administrador = null;
        boolean expResult = false;
        boolean result = FAdministradors.actualizar(administrador);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of eliminar method, of class FAdministradors.
     */
    @Test
    public void testEliminar() throws Exception {
        System.out.println("eliminar");
        Administrador administrador = null;
        boolean expResult = false;
        boolean result = FAdministradors.eliminar(administrador);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
