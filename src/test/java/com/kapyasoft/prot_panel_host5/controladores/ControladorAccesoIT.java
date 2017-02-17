/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kapyasoft.prot_panel_host5.controladores;

import com.kapyasoft.prot_panel_host5.logica.clases.Grupo;
import com.kapyasoft.prot_panel_host5.logica.clases.Usuario;
import javax.faces.event.ComponentSystemEvent;
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
public class ControladorAccesoIT {
    
    public ControladorAccesoIT() {
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
     * Test of isIsLoggedIn method, of class ControladorAcceso.
     */
    @Test
    public void testIsIsLoggedIn() {
        System.out.println("isIsLoggedIn");
        ControladorAcceso instance = new ControladorAcceso();
        boolean expResult = false;
        boolean result = instance.isIsLoggedIn();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setIsLoggedIn method, of class ControladorAcceso.
     */
    @Test
    public void testSetIsLoggedIn() {
        System.out.println("setIsLoggedIn");
        boolean isLoggedIn = false;
        ControladorAcceso instance = new ControladorAcceso();
        instance.setIsLoggedIn(isLoggedIn);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUsuario method, of class ControladorAcceso.
     */
    @Test
    public void testGetUsuario() {
        System.out.println("getUsuario");
        ControladorAcceso instance = new ControladorAcceso();
        Usuario expResult = null;
        Usuario result = instance.getUsuario();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setUsuario method, of class ControladorAcceso.
     */
    @Test
    public void testSetUsuario() {
        System.out.println("setUsuario");
        Usuario usuario = null;
        ControladorAcceso instance = new ControladorAcceso();
        instance.setUsuario(usuario);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLogin method, of class ControladorAcceso.
     */
    @Test
    public void testGetLogin() {
        System.out.println("getLogin");
        ControladorAcceso instance = new ControladorAcceso();
        String expResult = "";
        String result = instance.getLogin();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLogin method, of class ControladorAcceso.
     */
    @Test
    public void testSetLogin() {
        System.out.println("setLogin");
        String login = "";
        ControladorAcceso instance = new ControladorAcceso();
        instance.setLogin(login);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPassword method, of class ControladorAcceso.
     */
    @Test
    public void testGetPassword() {
        System.out.println("getPassword");
        ControladorAcceso instance = new ControladorAcceso();
        String expResult = "";
        String result = instance.getPassword();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPassword method, of class ControladorAcceso.
     */
    @Test
    public void testSetPassword() {
        System.out.println("setPassword");
        String password = "";
        ControladorAcceso instance = new ControladorAcceso();
        instance.setPassword(password);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of autenticar method, of class ControladorAcceso.
     */
    @Test
    public void testAutenticar() {
        System.out.println("autenticar");
        ControladorAcceso instance = new ControladorAcceso();
        instance.autenticar();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of logout method, of class ControladorAcceso.
     */
    @Test
    public void testLogout() {
        System.out.println("logout");
        ControladorAcceso instance = new ControladorAcceso();
        instance.logout();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of verifyUseLogin method, of class ControladorAcceso.
     */
    @Test
    public void testVerifyUseLogin() {
        System.out.println("verifyUseLogin");
        ComponentSystemEvent event = null;
        ControladorAcceso instance = new ControladorAcceso();
        instance.verifyUseLogin(event);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of registrar method, of class ControladorAcceso.
     */
    @Test
    public void testRegistrar() {
        System.out.println("registrar");
        ControladorAcceso instance = new ControladorAcceso();
        instance.registrar();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Sesion method, of class ControladorAcceso.
     */
    @Test
    public void testSesion() {
        System.out.println("Sesion");
        String expResult = "";
        String result = ControladorAcceso.Sesion();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getGrupo method, of class ControladorAcceso.
     */
    @Test
    public void testGetGrupo() {
        System.out.println("getGrupo");
        Grupo expResult = null;
        Grupo result = ControladorAcceso.getGrupo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setGrupo method, of class ControladorAcceso.
     */
    @Test
    public void testSetGrupo() {
        System.out.println("setGrupo");
        Grupo grupo = null;
        ControladorAcceso instance = new ControladorAcceso();
        instance.setGrupo(grupo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMensaje method, of class ControladorAcceso.
     */
    @Test
    public void testGetMensaje() {
        System.out.println("getMensaje");
        ControladorAcceso instance = new ControladorAcceso();
        String expResult = "";

        assertEquals(expResult, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMensaje method, of class ControladorAcceso.
     */
    @Test
    public void testSetMensaje() {
        System.out.println("setMensaje");
        String mensaje = "";
        ControladorAcceso instance = new ControladorAcceso();
       
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
    
}
