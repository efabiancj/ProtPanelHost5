/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kapyasoft.prot_panel_host5.controladores;

import com.kapyasoft.prot_panel_host5.logica.clases.Aplicacion;
import com.kapyasoft.prot_panel_host5.logica.clases.Usuario;
import java.util.List;
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
public class CAplicacionIT {
    
    public CAplicacionIT() {
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
     * Test of getSelectedAplicacion method, of class CAplicacion.
     */
    @Test
    public void testGetSelectedAplicacion() {
        System.out.println("getSelectedAplicacion");
        CAplicacion instance = new CAplicacion();
        Aplicacion expResult = null;
        Aplicacion result = instance.getSelectedAplicacion();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSelectedAplicacion method, of class CAplicacion.
     */
    @Test
    public void testSetSelectedAplicacion() {
        System.out.println("setSelectedAplicacion");
        Aplicacion selectedAplicacion = null;
        CAplicacion instance = new CAplicacion();
        instance.setSelectedAplicacion(selectedAplicacion);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAplicacions method, of class CAplicacion.
     */
    @Test
    public void testGetAplicacions() {
        System.out.println("getAplicacions");
        CAplicacion instance = new CAplicacion();
        List<Aplicacion> expResult = null;
        List<Aplicacion> result = instance.getAplicacions();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAplicacion method, of class CAplicacion.
     */
    @Test
    public void testGetAplicacion() {
        System.out.println("getAplicacion");
        CAplicacion instance = new CAplicacion();
        Aplicacion expResult = null;
        Aplicacion result = instance.getAplicacion();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAplicacion method, of class CAplicacion.
     */
    @Test
    public void testSetAplicacion() {
        System.out.println("setAplicacion");
        Aplicacion aplicacion = null;
        CAplicacion instance = new CAplicacion();
        instance.setAplicacion(aplicacion);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAplicset method, of class CAplicacion.
     */
    @Test
    public void testGetAplicset() {
        System.out.println("getAplicset");
        CAplicacion instance = new CAplicacion();
        String expResult = "";
        String result = instance.getAplicset();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAplicset method, of class CAplicacion.
     */
    @Test
    public void testSetAplicset() {
        System.out.println("setAplicset");
        String aplicset = "";
        CAplicacion instance = new CAplicacion();
        instance.setAplicset(aplicset);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCodigo method, of class CAplicacion.
     */
    @Test
    public void testGetCodigo() {
        System.out.println("getCodigo");
        CAplicacion instance = new CAplicacion();
        int expResult = 0;
        int result = instance.getCodigo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCodigo method, of class CAplicacion.
     */
    @Test
    public void testSetCodigo() {
        System.out.println("setCodigo");
        int codigo = 0;
        CAplicacion instance = new CAplicacion();
        instance.setCodigo(codigo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNombre_auth method, of class CAplicacion.
     */
    @Test
    public void testGetNombre_auth() {
        System.out.println("getNombre_auth");
        CAplicacion instance = new CAplicacion();
        String expResult = "";
        String result = instance.getNombre_auth();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNombre_auth method, of class CAplicacion.
     */
    @Test
    public void testSetNombre_auth() {
        System.out.println("setNombre_auth");
        String nombre_auth = "";
        CAplicacion instance = new CAplicacion();
        instance.setNombre_auth(nombre_auth);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAplicaciones method, of class CAplicacion.
     */
    @Test
    public void testGetAplicaciones() {
        System.out.println("getAplicaciones");
        CAplicacion instance = new CAplicacion();
        List<Aplicacion> expResult = null;
        List<Aplicacion> result = instance.getAplicaciones();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAplicaciones method, of class CAplicacion.
     */
    @Test
    public void testSetAplicaciones() {
        System.out.println("setAplicaciones");
        List<Aplicacion> aplicaciones = null;
        CAplicacion instance = new CAplicacion();
        instance.setAplicaciones(aplicaciones);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getId_usuario method, of class CAplicacion.
     */
    @Test
    public void testGetId_usuario() {
        System.out.println("getId_usuario");
        CAplicacion instance = new CAplicacion();
        int expResult = 0;
        int result = instance.getId_usuario();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setId_usuario method, of class CAplicacion.
     */
    @Test
    public void testSetId_usuario() {
        System.out.println("setId_usuario");
        int id_usuario = 0;
        CAplicacion instance = new CAplicacion();
        instance.setId_usuario(id_usuario);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUsuario method, of class CAplicacion.
     */
    @Test
    public void testGetUsuario() {
        System.out.println("getUsuario");
        CAplicacion instance = new CAplicacion();
        Usuario expResult = null;
        Usuario result = instance.getUsuario();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setUsuario method, of class CAplicacion.
     */
    @Test
    public void testSetUsuario() {
        System.out.println("setUsuario");
        Usuario usuario = null;
        CAplicacion instance = new CAplicacion();
        instance.setUsuario(usuario);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNombre method, of class CAplicacion.
     */
    @Test
    public void testGetNombre() {
        System.out.println("getNombre");
        CAplicacion instance = new CAplicacion();
        String expResult = "";
        String result = instance.getNombre();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNombre method, of class CAplicacion.
     */
    @Test
    public void testSetNombre() {
        System.out.println("setNombre");
        String nombre = "";
        CAplicacion instance = new CAplicacion();
        instance.setNombre(nombre);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getArchivo_war method, of class CAplicacion.
     */
    @Test
    public void testGetArchivo_war() {
        System.out.println("getArchivo_war");
        CAplicacion instance = new CAplicacion();
        String expResult = "";
        String result = instance.getArchivo_war();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setArchivo_war method, of class CAplicacion.
     */
    @Test
    public void testSetArchivo_war() {
        System.out.println("setArchivo_war");
        String archivo_war = "";
        CAplicacion instance = new CAplicacion();
        instance.setArchivo_war(archivo_war);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getId method, of class CAplicacion.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        CAplicacion instance = new CAplicacion();
        int expResult = 0;
        int result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setId method, of class CAplicacion.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        int id = 0;
        CAplicacion instance = new CAplicacion();
        instance.setId(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDirectorio method, of class CAplicacion.
     */
    @Test
    public void testGetDirectorio() {
        System.out.println("getDirectorio");
        CAplicacion instance = new CAplicacion();
        String expResult = "";
        String result = instance.getDirectorio();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDirectorio method, of class CAplicacion.
     */
    @Test
    public void testSetDirectorio() {
        System.out.println("setDirectorio");
        String directorio = "";
        CAplicacion instance = new CAplicacion();
        instance.setDirectorio(directorio);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ingresar method, of class CAplicacion.
     */
    @Test
    public void testIngresar() throws Exception {
        System.out.println("ingresar");
        CAplicacion instance = new CAplicacion();
        instance.ingresar();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of generar_directorio_real method, of class CAplicacion.
     */
    @Test
    public void testGenerar_directorio_real() {
        System.out.println("generar_directorio_real");
        String path = "";
        CAplicacion instance = new CAplicacion();
        String expResult = "";
        String result = instance.generar_directorio_real(path);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of generar_nombre_directorio method, of class CAplicacion.
     */
    @Test
    public void testGenerar_nombre_directorio() {
        System.out.println("generar_nombre_directorio");
        CAplicacion instance = new CAplicacion();
        String expResult = "";
        String result = instance.generar_nombre_directorio();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of generar_directorios method, of class CAplicacion.
     */
    @Test
    public void testGenerar_directorios() {
        System.out.println("generar_directorios");
        CAplicacion instance = new CAplicacion();
        String expResult = "";
        String result = instance.generar_directorios();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMensaje method, of class CAplicacion.
     */
    @Test
    public void testGetMensaje() {
        System.out.println("getMensaje");
        CAplicacion instance = new CAplicacion();
        String expResult = "";
        String result = instance.getMensaje();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMensaje method, of class CAplicacion.
     */
    @Test
    public void testSetMensaje() {
        System.out.println("setMensaje");
        String mensaje = "";
        CAplicacion instance = new CAplicacion();
        instance.setMensaje(mensaje);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUltima method, of class CAplicacion.
     */
    @Test
    public void testGetUltima() {
        System.out.println("getUltima");
        CAplicacion instance = new CAplicacion();
        int expResult = 0;
        int result = instance.getUltima();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setUltima method, of class CAplicacion.
     */
    @Test
    public void testSetUltima() {
        System.out.println("setUltima");
        int ultima = 0;
        CAplicacion instance = new CAplicacion();
        instance.setUltima(ultima);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getParam_aplic_id method, of class CAplicacion.
     */
    @Test
    public void testGetParam_aplic_id() {
        System.out.println("getParam_aplic_id");
        CAplicacion instance = new CAplicacion();
        int expResult = 0;
        int result = instance.getParam_aplic_id();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setParam_aplic_id method, of class CAplicacion.
     */
    @Test
    public void testSetParam_aplic_id() {
        System.out.println("setParam_aplic_id");
        int param_aplic_id = 0;
        CAplicacion instance = new CAplicacion();
        instance.setParam_aplic_id(param_aplic_id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ver_aplicacion method, of class CAplicacion.
     */
    @Test
    public void testVer_aplicacion() {
        System.out.println("ver_aplicacion");
        CAplicacion instance = new CAplicacion();
        instance.ver_aplicacion();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
