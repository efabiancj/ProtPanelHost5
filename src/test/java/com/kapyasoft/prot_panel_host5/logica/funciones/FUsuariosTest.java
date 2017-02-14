/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kapyasoft.prot_panel_host5.logica.funciones;

import com.kapyasoft.prot_panel_host5.logica.clases.Usuario;
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
public class FUsuariosTest {
    
    public FUsuariosTest() {
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
     * Test of obtener_Todos_Usuarios method, of class FUsuarios.
     */
    @Test
    public void testObtener_Todos_Usuarios() throws Exception {
        System.out.println("obtener_Todos_Usuarios");
        ArrayList<Usuario> expResult = null;
        ArrayList<Usuario> result = FUsuarios.obtener_Todos_Usuarios();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of obtener_Usuario_por_email method, of class FUsuarios.
     */
    @Test
    public void testObtener_Usuario_por_email() throws Exception {
        System.out.println("obtener_Usuario_por_email");
        String email = "";
        Usuario expResult = null;
        Usuario result = FUsuarios.obtener_Usuario_por_email(email);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of obtener_Usuario_por_pk method, of class FUsuarios.
     */
    @Test
    public void testObtener_Usuario_por_pk() throws Exception {
        System.out.println("obtener_Usuario_por_pk");
        int id = 0;
        Usuario expResult = null;
        Usuario result = FUsuarios.obtener_Usuario_por_pk(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of obtenerUsuariopor_campo_nombres method, of class FUsuarios.
     */
    @Test
    public void testObtenerUsuariopor_campo_nombres() throws Exception {
        System.out.println("obtenerUsuariopor_campo_nombres");
        String nombres = "";
        ArrayList<Usuario> expResult = null;
        ArrayList<Usuario> result = FUsuarios.obtenerUsuariopor_campo_nombres(nombres);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of obtenerUsuariopor_campo_apellidos method, of class FUsuarios.
     */
    @Test
    public void testObtenerUsuariopor_campo_apellidos() throws Exception {
        System.out.println("obtenerUsuariopor_campo_apellidos");
        String apellidos = "";
        ArrayList<Usuario> expResult = null;
        ArrayList<Usuario> result = FUsuarios.obtenerUsuariopor_campo_apellidos(apellidos);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of obtenerUsuariopor_campo_direccion method, of class FUsuarios.
     */
    @Test
    public void testObtenerUsuariopor_campo_direccion() throws Exception {
        System.out.println("obtenerUsuariopor_campo_direccion");
        String direccion = "";
        ArrayList<Usuario> expResult = null;
        ArrayList<Usuario> result = FUsuarios.obtenerUsuariopor_campo_direccion(direccion);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of obtenerUsuariopor_campo_telefono method, of class FUsuarios.
     */
    @Test
    public void testObtenerUsuariopor_campo_telefono() throws Exception {
        System.out.println("obtenerUsuariopor_campo_telefono");
        String telefono = "";
        ArrayList<Usuario> expResult = null;
        ArrayList<Usuario> result = FUsuarios.obtenerUsuariopor_campo_telefono(telefono);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of obtenerUsuariopor_campo_email method, of class FUsuarios.
     */
    @Test
    public void testObtenerUsuariopor_campo_email() throws Exception {
        System.out.println("obtenerUsuariopor_campo_email");
        String email = "";
        ArrayList<Usuario> expResult = null;
        ArrayList<Usuario> result = FUsuarios.obtenerUsuariopor_campo_email(email);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of obtenerUsuariopor_campo_clave method, of class FUsuarios.
     */
    @Test
    public void testObtenerUsuariopor_campo_clave() throws Exception {
        System.out.println("obtenerUsuariopor_campo_clave");
        String clave = "";
        ArrayList<Usuario> expResult = null;
        ArrayList<Usuario> result = FUsuarios.obtenerUsuariopor_campo_clave(clave);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of obtenerUsuariopor_campo_grupo method, of class FUsuarios.
     */
    @Test
    public void testObtenerUsuariopor_campo_grupo() throws Exception {
        System.out.println("obtenerUsuariopor_campo_grupo");
        int grupo = 0;
        ArrayList<Usuario> expResult = null;
        ArrayList<Usuario> result = FUsuarios.obtenerUsuariopor_campo_grupo(grupo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of obtenerUsuariopor_campo_id method, of class FUsuarios.
     */
    @Test
    public void testObtenerUsuariopor_campo_id() throws Exception {
        System.out.println("obtenerUsuariopor_campo_id");
        int id = 0;
        ArrayList<Usuario> expResult = null;
        ArrayList<Usuario> result = FUsuarios.obtenerUsuariopor_campo_id(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of obtenerUsuariopor_campo_directorio_virtual method, of class FUsuarios.
     */
    @Test
    public void testObtenerUsuariopor_campo_directorio_virtual() throws Exception {
        System.out.println("obtenerUsuariopor_campo_directorio_virtual");
        String directorio_virtual = "";
        ArrayList<Usuario> expResult = null;
        ArrayList<Usuario> result = FUsuarios.obtenerUsuariopor_campo_directorio_virtual(directorio_virtual);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of obtenerUsuariopor_campo_ciudad method, of class FUsuarios.
     */
    @Test
    public void testObtenerUsuariopor_campo_ciudad() throws Exception {
        System.out.println("obtenerUsuariopor_campo_ciudad");
        int ciudad = 0;
        ArrayList<Usuario> expResult = null;
        ArrayList<Usuario> result = FUsuarios.obtenerUsuariopor_campo_ciudad(ciudad);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of obtenerUsuariopor_campo_estado method, of class FUsuarios.
     */
    @Test
    public void testObtenerUsuariopor_campo_estado() throws Exception {
        System.out.println("obtenerUsuariopor_campo_estado");
        char estado = ' ';
        ArrayList<Usuario> expResult = null;
        ArrayList<Usuario> result = FUsuarios.obtenerUsuariopor_campo_estado(estado);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ingresar method, of class FUsuarios.
     */
    @Test
    public void testIngresar() throws Exception {
        System.out.println("ingresar");
        Usuario usuario = null;
        boolean expResult = false;
        boolean result = FUsuarios.ingresar(usuario);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of actualizar method, of class FUsuarios.
     */
    @Test
    public void testActualizar() throws Exception {
        System.out.println("actualizar");
        Usuario usuario = null;
        boolean expResult = false;
        boolean result = FUsuarios.actualizar(usuario);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of obtenerultimo method, of class FUsuarios.
     */
    @Test
    public void testObtenerultimo() throws Exception {
        System.out.println("obtenerultimo");
        int expResult = 0;
        int result = FUsuarios.obtenerultimo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
