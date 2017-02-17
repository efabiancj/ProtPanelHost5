/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kapyasoft.prot_panel_host5.controladores;

import com.kapyasoft.prot_panel_host5.logica.clases.Ciudad;
import com.kapyasoft.prot_panel_host5.logica.clases.Grupo;
import com.kapyasoft.prot_panel_host5.logica.clases.Usuario;
import java.util.ArrayList;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
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
public class CUsuarioIT {
    
    public CUsuarioIT() {
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
     * Test of getCiudset method, of class CUsuario.
     */
    @Test
    public void testGetCiudset() {
        System.out.println("getCiudset");
        CUsuario instance = new CUsuario();
        String expResult = "";
        String result = instance.getCiudset();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCiudset method, of class CUsuario.
     */
    @Test
    public void testSetCiudset() {
        System.out.println("setCiudset");
        String ciudset = "";
        CUsuario instance = new CUsuario();
        instance.setCiudset(ciudset);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMensaje method, of class CUsuario.
     */
    @Test
    public void testGetMensaje() {
        System.out.println("getMensaje");
        CUsuario instance = new CUsuario();
        String expResult = "";
        String result = instance.getMensaje();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMensaje method, of class CUsuario.
     */
    @Test
    public void testSetMensaje() {
        System.out.println("setMensaje");
        String mensaje = "";
        CUsuario instance = new CUsuario();
        instance.setMensaje(mensaje);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUsuario method, of class CUsuario.
     */
    @Test
    public void testGetUsuario() {
        System.out.println("getUsuario");
        CUsuario instance = new CUsuario();
        Usuario expResult = null;
        Usuario result = instance.getUsuario();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setUsuario method, of class CUsuario.
     */
    @Test
    public void testSetUsuario() {
        System.out.println("setUsuario");
        Usuario usuario = null;
        CUsuario instance = new CUsuario();
        instance.setUsuario(usuario);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUsuarios method, of class CUsuario.
     */
    @Test
    public void testGetUsuarios() {
        System.out.println("getUsuarios");
        CUsuario instance = new CUsuario();
        ArrayList<Usuario> expResult = null;
        ArrayList<Usuario> result = instance.getUsuarios();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setUsuarios method, of class CUsuario.
     */
    @Test
    public void testSetUsuarios() {
        System.out.println("setUsuarios");
        ArrayList<Usuario> usuarios = null;
        CUsuario instance = new CUsuario();
        instance.setUsuarios(usuarios);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of validar_usuario_repetido method, of class CUsuario.
     */
    @Test
    public void testValidar_usuario_repetido() {
        System.out.println("validar_usuario_repetido");
        FacesContext fc = null;
        UIComponent uic = null;
        Object o = null;
        CUsuario instance = new CUsuario();
        boolean expResult = false;
        boolean result = instance.validar_usuario_repetido(fc, uic, o);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of reset method, of class CUsuario.
     */
    @Test
    public void testReset() {
        System.out.println("reset");
        CUsuario instance = new CUsuario();
        instance.reset();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of listar_usuarios method, of class CUsuario.
     */
    @Test
    public void testListar_usuarios() {
        System.out.println("listar_usuarios");
        CUsuario instance = new CUsuario();
        instance.listar_usuarios();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLstciud method, of class CUsuario.
     */
    @Test
    public void testGetLstciud() {
        System.out.println("getLstciud");
        CUsuario instance = new CUsuario();
        ArrayList<Ciudad> expResult = null;
        ArrayList<Ciudad> result = instance.getLstciud();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLstciud method, of class CUsuario.
     */
    @Test
    public void testSetLstciud() {
        System.out.println("setLstciud");
        ArrayList<Ciudad> lstciud = null;
        CUsuario instance = new CUsuario();
        instance.setLstciud(lstciud);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNombres method, of class CUsuario.
     */
    @Test
    public void testGetNombres() {
        System.out.println("getNombres");
        CUsuario instance = new CUsuario();
        String expResult = "";
        String result = instance.getNombres();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNombres method, of class CUsuario.
     */
    @Test
    public void testSetNombres() {
        System.out.println("setNombres");
        String nombres = "";
        CUsuario instance = new CUsuario();
        instance.setNombres(nombres);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getApellidos method, of class CUsuario.
     */
    @Test
    public void testGetApellidos() {
        System.out.println("getApellidos");
        CUsuario instance = new CUsuario();
        String expResult = "";
        String result = instance.getApellidos();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setApellidos method, of class CUsuario.
     */
    @Test
    public void testSetApellidos() {
        System.out.println("setApellidos");
        String apellidos = "";
        CUsuario instance = new CUsuario();
        instance.setApellidos(apellidos);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDireccion method, of class CUsuario.
     */
    @Test
    public void testGetDireccion() {
        System.out.println("getDireccion");
        CUsuario instance = new CUsuario();
        String expResult = "";
        String result = instance.getDireccion();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDireccion method, of class CUsuario.
     */
    @Test
    public void testSetDireccion() {
        System.out.println("setDireccion");
        String direccion = "";
        CUsuario instance = new CUsuario();
        instance.setDireccion(direccion);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTelefono method, of class CUsuario.
     */
    @Test
    public void testGetTelefono() {
        System.out.println("getTelefono");
        CUsuario instance = new CUsuario();
        String expResult = "";
        String result = instance.getTelefono();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTelefono method, of class CUsuario.
     */
    @Test
    public void testSetTelefono() {
        System.out.println("setTelefono");
        String telefono = "";
        CUsuario instance = new CUsuario();
        instance.setTelefono(telefono);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEmail method, of class CUsuario.
     */
    @Test
    public void testGetEmail() {
        System.out.println("getEmail");
        CUsuario instance = new CUsuario();
        String expResult = "";
        String result = instance.getEmail();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEmail method, of class CUsuario.
     */
    @Test
    public void testSetEmail() {
        System.out.println("setEmail");
        String email = "";
        CUsuario instance = new CUsuario();
        instance.setEmail(email);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getClave method, of class CUsuario.
     */
    @Test
    public void testGetClave() {
        System.out.println("getClave");
        CUsuario instance = new CUsuario();
        String expResult = "";
        String result = instance.getClave();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setClave method, of class CUsuario.
     */
    @Test
    public void testSetClave() {
        System.out.println("setClave");
        String clave = "";
        CUsuario instance = new CUsuario();
        instance.setClave(clave);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getGrupo method, of class CUsuario.
     */
    @Test
    public void testGetGrupo() {
        System.out.println("getGrupo");
        CUsuario instance = new CUsuario();
        Grupo expResult = null;
        Grupo result = instance.getGrupo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setGrupo method, of class CUsuario.
     */
    @Test
    public void testSetGrupo() {
        System.out.println("setGrupo");
        Grupo grupo = null;
        CUsuario instance = new CUsuario();
        instance.setGrupo(grupo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getId method, of class CUsuario.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        CUsuario instance = new CUsuario();
        int expResult = 0;
        int result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setId method, of class CUsuario.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        int id = 0;
        CUsuario instance = new CUsuario();
        instance.setId(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDirectorio_virtual method, of class CUsuario.
     */
    @Test
    public void testGetDirectorio_virtual() {
        System.out.println("getDirectorio_virtual");
        CUsuario instance = new CUsuario();
        String expResult = "";
        String result = instance.getDirectorio_virtual();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDirectorio_virtual method, of class CUsuario.
     */
    @Test
    public void testSetDirectorio_virtual() {
        System.out.println("setDirectorio_virtual");
        String directorio_virtual = "";
        CUsuario instance = new CUsuario();
        instance.setDirectorio_virtual(directorio_virtual);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCiudad method, of class CUsuario.
     */
    @Test
    public void testGetCiudad() {
        System.out.println("getCiudad");
        CUsuario instance = new CUsuario();
        Ciudad expResult = null;
        Ciudad result = instance.getCiudad();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCiudad method, of class CUsuario.
     */
    @Test
    public void testSetCiudad() {
        System.out.println("setCiudad");
        Ciudad ciudad = null;
        CUsuario instance = new CUsuario();
        instance.setCiudad(ciudad);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEstado method, of class CUsuario.
     */
    @Test
    public void testGetEstado() {
        System.out.println("getEstado");
        CUsuario instance = new CUsuario();
        String expResult = "";
        String result = instance.getEstado();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEstado method, of class CUsuario.
     */
    @Test
    public void testSetEstado() {
        System.out.println("setEstado");
        String estado = "";
        CUsuario instance = new CUsuario();
        instance.setEstado(estado);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ingresar_usuario method, of class CUsuario.
     */
    @Test
    public void testIngresar_usuario() {
        System.out.println("ingresar_usuario");
        CUsuario instance = new CUsuario();
        instance.ingresar_usuario();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of generar_nombre_directorio method, of class CUsuario.
     */
    @Test
    public void testGenerar_nombre_directorio() {
        System.out.println("generar_nombre_directorio");
        CUsuario instance = new CUsuario();
        String expResult = "";
        String result = instance.generar_nombre_directorio();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of generar_directorios method, of class CUsuario.
     */
    @Test
    public void testGenerar_directorios() {
        System.out.println("generar_directorios");
        CUsuario instance = new CUsuario();
        String expResult = "";
        String result = instance.generar_directorio_ftp_real(expResult);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
