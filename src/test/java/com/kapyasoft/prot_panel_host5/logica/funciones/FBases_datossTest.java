/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kapyasoft.prot_panel_host5.logica.funciones;

import com.kapyasoft.prot_panel_host5.logica.clases.Bases_datos;
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
public class FBases_datossTest {
    
    public FBases_datossTest() {
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
     * Test of obtener_Todos_Bases_datoss method, of class FBases_datoss.
     */
    @Test
    public void testObtener_Todos_Bases_datoss() throws Exception {
        System.out.println("obtener_Todos_Bases_datoss");
        ArrayList<Bases_datos> expResult = null;
        ArrayList<Bases_datos> result = FBases_datoss.obtener_Todos_Bases_datoss();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of obtener_Bases_datos_por_pk method, of class FBases_datoss.
     */
    @Test
    public void testObtener_Bases_datos_por_pk() throws Exception {
        System.out.println("obtener_Bases_datos_por_pk");
        int id = 0;
        Bases_datos expResult = null;
        Bases_datos result = FBases_datoss.obtener_Bases_datos_por_pk(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of obtenerBases_datospor_campo_id method, of class FBases_datoss.
     */
    @Test
    public void testObtenerBases_datospor_campo_id() throws Exception {
        System.out.println("obtenerBases_datospor_campo_id");
        int id = 0;
        ArrayList<Bases_datos> expResult = null;
        ArrayList<Bases_datos> result = FBases_datoss.obtenerBases_datospor_campo_id(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of obtenerBases_datospor_campo_nombre method, of class FBases_datoss.
     */
    @Test
    public void testObtenerBases_datospor_campo_nombre() throws Exception {
        System.out.println("obtenerBases_datospor_campo_nombre");
        String nombre = "";
        Bases_datos expResult = null;
        Bases_datos result = FBases_datoss.obtenerBases_datospor_campo_nombre(nombre);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of obtenerBases_datospor_campo_usuario method, of class FBases_datoss.
     */
    @Test
    public void testObtenerBases_datospor_campo_usuario() throws Exception {
        System.out.println("obtenerBases_datospor_campo_usuario");
        int usuario = 0;
        ArrayList<Bases_datos> expResult = null;
        ArrayList<Bases_datos> result = FBases_datoss.obtenerBases_datospor_campo_usuario(usuario);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ingresar method, of class FBases_datoss.
     */
    @Test
    public void testIngresar() throws Exception {
        System.out.println("ingresar");
        Bases_datos bases_datos = null;
        boolean expResult = false;
        boolean result = FBases_datoss.ingresar(bases_datos);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of crear_usuario_base_datos_pg method, of class FBases_datoss.
     */
    @Test
    public void testCrear_usuario_base_datos_pg() throws Exception {
        System.out.println("crear_usuario_base_datos_pg");
        String usuario = "";
        String clave = "";
        boolean expResult = false;
        boolean result = FBases_datoss.crear_usuario_base_datos_pg(usuario, clave);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of asignar_permisos_usario_crear_bd_pg method, of class FBases_datoss.
     */
    @Test
    public void testAsignar_permisos_usario_crear_bd_pg() throws Exception {
        System.out.println("asignar_permisos_usario_crear_bd_pg");
        String usuario = "";
        boolean expResult = false;
        boolean result = FBases_datoss.asignar_permisos_usario_crear_bd_pg(usuario);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of crear_base_datos_pg method, of class FBases_datoss.
     */
    @Test
    public void testCrear_base_datos_pg() throws Exception {
        System.out.println("crear_base_datos_pg");
        String nombre = "";
        String usuario = "";
        boolean expResult = false;
        boolean result = FBases_datoss.crear_base_datos_pg(nombre, usuario);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of restaurar_archivo_sql_sql_pg method, of class FBases_datoss.
     */
    @Test
    public void testRestaurar_archivo_sql_sql_pg() throws Exception {
        System.out.println("restaurar_archivo_sql_sql_pg");
        String archivo = "";
        String usuario = "";
        String clave = "";
        String db = "";
        String host = "";
        boolean expResult = false;
        boolean result = FBases_datoss.restaurar_archivo_sql_sql_pg(archivo, usuario, clave, db, host);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of actualizar method, of class FBases_datoss.
     */
    @Test
    public void testActualizar() throws Exception {
        System.out.println("actualizar");
        Bases_datos bases_datos = null;
        boolean expResult = false;
        boolean result = FBases_datoss.actualizar(bases_datos);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of eliminar method, of class FBases_datoss.
     */
    @Test
    public void testEliminar() throws Exception {
        System.out.println("eliminar");
        Bases_datos bases_datos = null;
        boolean expResult = false;
        boolean result = FBases_datoss.eliminar(bases_datos);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of obtenerultimo method, of class FBases_datoss.
     */
    @Test
    public void testObtenerultimo() throws Exception {
        System.out.println("obtenerultimo");
        int expResult = 0;
        int result = FBases_datoss.obtenerultimo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of obtenerEstado_bd method, of class FBases_datoss.
     */
    @Test
    public void testObtenerEstado_bd() {
        System.out.println("obtenerEstado_bd");
        String nombre = "";
        String esquema = "";
        String expResult = "";
        String result = FBases_datoss.obtenerEstado_bd(nombre, esquema);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
