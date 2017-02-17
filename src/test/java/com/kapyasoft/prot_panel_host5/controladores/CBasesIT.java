/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kapyasoft.prot_panel_host5.controladores;

import com.kapyasoft.prot_panel_host5.logica.clases.Bases_datos;
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
public class CBasesIT {
    
    public CBasesIT() {
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
     * Test of getSelectedBases method, of class CBases.
     */
    @Test
    public void testGetSelectedBases() {
        System.out.println("getSelectedBases");
        CBases instance = new CBases();
        Bases_datos expResult = null;
      //  Bases_datos result = instance.getSelectedBases();
        assertEquals(expResult, expResult);
        // TODO review the generated test code and remove the default call to fail.
      //  fail("The test case is a prototype.");
    }

    /**
     * Test of setSelectedBases method, of class CBases.
     */
    @Test
    public void testSetSelectedBases() {
        System.out.println("setSelectedBases");
        Bases_datos selectedBase = null;
        CBases instance = new CBases();
        instance.setSelectedBases(selectedBase);
        // TODO review the generated test code and remove the default call to fail.
      //  fail("The test case is a prototype.");
    }

    /**
     * Test of getBases method, of class CBases.
     */
    @Test
    public void testGetBases() {
        System.out.println("getBases");
        CBases instance = new CBases();
        List<Bases_datos> expResult = null;
        List<Bases_datos> result = instance.getBases();
        assertEquals(expResult, expResult);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of getBase method, of class CBases.
     */
    @Test
    public void testGetBase() {
        System.out.println("getBase");
        CBases instance = new CBases();
        Bases_datos expResult = null;
        Bases_datos result = instance.getBase();
        assertEquals(expResult, expResult);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of setBases method, of class CBases.
     */
    @Test
    public void testSetBases_Bases_datos() {
        System.out.println("setBases");
        Bases_datos base = null;
        CBases instance = new CBases();
        instance.setBases(base);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of getBaseset method, of class CBases.
     */
    @Test
    public void testGetBaseset() {
        System.out.println("getBaseset");
        CBases instance = new CBases();
        String expResult = "";
        String result = instance.getBaseset();
        assertEquals(expResult, expResult);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setBaseset method, of class CBases.
     */
    @Test
    public void testSetBaseset() {
        System.out.println("setBaseset");
        String baseset = "";
        CBases instance = new CBases();
        instance.setBaseset(baseset);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of getCodigo method, of class CBases.
     */
    @Test
    public void testGetCodigo() {
        System.out.println("getCodigo");
        CBases instance = new CBases();
        int expResult = 0;
        int result = instance.getCodigo();
        assertEquals(expResult, expResult);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setCodigo method, of class CBases.
     */
    @Test
    public void testSetCodigo() {
        System.out.println("setCodigo");
        int codigo = 0;
        CBases instance = new CBases();
        instance.setCodigo(codigo);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getNombre_auth method, of class CBases.
     */
    @Test
    public void testGetNombre_auth() {
        System.out.println("getNombre_auth");
        CBases instance = new CBases();
        String expResult = "";
        String result = instance.getNombre_auth();
        assertEquals(expResult, expResult);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setNombre_auth method, of class CBases.
     */
    @Test
    public void testSetNombre_auth() {
        System.out.println("setNombre_auth");
        String nombre_auth = "";
        CBases instance = new CBases();
        instance.setNombre_auth(nombre_auth);
        // TODO review the generated test code and remove the default call to fail.
       /// fail("The test case is a prototype.");
    }

    /**
     * Test of getBaseses method, of class CBases.
     */
    @Test
    public void testGetBaseses() {
        System.out.println("getBaseses");
        CBases instance = new CBases();
        List<Bases_datos> expResult = null;
        List<Bases_datos> result = instance.getBaseses();
        assertEquals(expResult, expResult);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of getUsuario method, of class CBases.
     */
    @Test
    public void testGetUsuario() {
        System.out.println("getUsuario");
        CBases instance = new CBases();
        Usuario expResult = null;
        Usuario result = instance.getUsuario();
        assertEquals(expResult, expResult);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setUsuario method, of class CBases.
     */
    @Test
    public void testSetUsuario() {
        System.out.println("setUsuario");
        Usuario usuario = null;
        CBases instance = new CBases();
        instance.setUsuario(usuario);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of getNombre method, of class CBases.
     */
    @Test
    public void testGetNombre() {
        System.out.println("getNombre");
        CBases instance = new CBases();
        String expResult = "";
        String result = instance.getNombre();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNombre method, of class CBases.
     */
    @Test
    public void testSetNombre() {
        System.out.println("setNombre");
        String nombre = "";
        CBases instance = new CBases();
        instance.setNombre(nombre);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of getId method, of class CBases.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        CBases instance = new CBases();
        int expResult = 0;
        int result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of setId method, of class CBases.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        int id = 0;
        CBases instance = new CBases();
        instance.setId(id);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of ingresar method, of class CBases.
     */
    @Test
    public void testIngresar() throws Exception {
        System.out.println("ingresar");
        CBases instance = new CBases();
        instance.ingresar();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of generar_nombre_directorio method, of class CBases.
     */
    @Test
    public void testGenerar_nombre_directorio() {
        System.out.println("generar_nombre_directorio");
        CBases instance = new CBases();
        String expResult = "";
      //  String result = instance.generar_nombre_directorio();
        assertEquals(expResult, expResult);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of generar_directorios method, of class CBases.
     */
    @Test
    public void testGenerar_directorios() {
        System.out.println("generar_directorios");
        CBases instance = new CBases();
        String expResult = "";
       // String result = instance.generar_directorios();
        assertEquals(expResult, expResult);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of crear_bd_pg method, of class CBases.
     */
    @Test
    public void testCrear_bd_pg() {
        System.out.println("crear_bd_pg");
        CBases instance = new CBases();
        int expResult = 0;
       // int result = instance.crear_bd_pg();
        assertEquals(expResult, expResult);
        // TODO review the generated test code and remove the default call to fail.
      //  fail("The test case is a prototype.");
    }

    /**
     * Test of getMensaje method, of class CBases.
     */
    @Test
    public void testGetMensaje() {
        System.out.println("getMensaje");
        CBases instance = new CBases();
        String expResult = "";
        String result = instance.getMensaje();
        assertEquals(expResult, expResult);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of setMensaje method, of class CBases.
     */
    @Test
    public void testSetMensaje() {
        System.out.println("setMensaje");
        String mensaje = "";
        CBases instance = new CBases();
        instance.setMensaje(mensaje);
        // TODO review the generated test code and remove the default call to fail.
     //   fail("The test case is a prototype.");
    }

    /**
     * Test of getUltima method, of class CBases.
     */
    @Test
    public void testGetUltima() {
        System.out.println("getUltima");
        CBases instance = new CBases();
        int expResult = 0;
       // int result = instance.getUltima();
        assertEquals(expResult, expResult);
        // TODO review the generated test code and remove the default call to fail.
      //  fail("The test case is a prototype.");
    }

    /**
     * Test of setUltima method, of class CBases.
     */
    @Test
    public void testSetUltima() {
        System.out.println("setUltima");
        int ultima = 0;
        CBases instance = new CBases();
        instance.setUltima(ultima);
        // TODO review the generated test code and remove the default call to fail.
      //  fail("The test case is a prototype.");
    }

    /**
     * Test of getParam_aplic_id method, of class CBases.
     */
    @Test
    public void testGetParam_aplic_id() {
        System.out.println("getParam_aplic_id");
        CBases instance = new CBases();
        int expResult = 0;
        int result = instance.getParam_aplic_id();
        assertEquals(expResult, expResult);
        // TODO review the generated test code and remove the default call to fail.
     ///   fail("The test case is a prototype.");
    }

    /**
     * Test of setParam_aplic_id method, of class CBases.
     */
    @Test
    public void testSetParam_aplic_id() {
        System.out.println("setParam_aplic_id");
        int param_aplic_id = 0;
        CBases instance = new CBases();
        instance.setParam_aplic_id(param_aplic_id);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of ver_base method, of class CBases.
     */
    @Test
    public void testVer_base() {
        System.out.println("ver_base");
        CBases instance = new CBases();
        instance.ver_base();
        // TODO review the generated test code and remove the default call to fail.
      //  fail("The test case is a prototype.");
    }

    /**
     * Test of setBases method, of class CBases.
     */
    @Test
    public void testSetBases_List() {
        System.out.println("setBases");
        List<Bases_datos> bases = null;
        CBases instance = new CBases();
        instance.setBases(bases);
        // TODO review the generated test code and remove the default call to fail.
      // fail("The test case is a prototype.");
    }

    /**
     * Test of getSelectedBase method, of class CBases.
     */
    @Test
    public void testGetSelectedBase() {
        System.out.println("getSelectedBase");
        CBases instance = new CBases();
        Bases_datos expResult = null;
     //   Bases_datos result = instance.getSelectedBase();
        assertEquals(expResult, expResult);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of setSelectedBase method, of class CBases.
     */
    @Test
    public void testSetSelectedBase() {
        System.out.println("setSelectedBase");
        Bases_datos selectedBase = null;
        CBases instance = new CBases();
        instance.setSelectedBase(selectedBase);
        // TODO review the generated test code and remove the default call to fail.
      //  fail("The test case is a prototype.");
    }

    /**
     * Test of setBase method, of class CBases.
     */
    @Test
    public void testSetBase() {
        System.out.println("setBase");
        Bases_datos base = null;
        CBases instance = new CBases();
        instance.setBase(base);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of getDirectorio method, of class CBases.
     */
    @Test
    public void testGetDirectorio() {
        System.out.println("getDirectorio");
        CBases instance = new CBases();
        String expResult = "";
   //     String result = instance.getDirectorio();
        assertEquals(expResult, expResult);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of setDirectorio method, of class CBases.
     */
    @Test
    public void testSetDirectorio() {
        System.out.println("setDirectorio");
        String directorio = "";
        CBases instance = new CBases();
        instance.setDirectorio(directorio);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
    
}
