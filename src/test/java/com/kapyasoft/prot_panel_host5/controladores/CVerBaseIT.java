/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kapyasoft.prot_panel_host5.controladores;

import com.kapyasoft.prot_panel_host5.logica.clases.Bases_datos;
import com.kapyasoft.prot_panel_host5.logica.clases.Usuario;
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
public class CVerBaseIT {
    
    public CVerBaseIT() {
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
     * Test of getParam_aplic_id method, of class CVerBase.
     */
    @Test
    public void testGetParam_aplic_id() {
        System.out.println("getParam_aplic_id");
        CVerBase instance = new CVerBase();
        String expResult = "";
        String result = instance.getParam_aplic_id();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of setParam_aplic_id method, of class CVerBase.
     */
    @Test
    public void testSetParam_aplic_id() {
        System.out.println("setParam_aplic_id");
        String param_aplic_id = "";
        CVerBase instance = new CVerBase();
        instance.setParam_aplic_id(param_aplic_id);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of getContenido_archivo_select method, of class CVerBase.
     */
    @Test
    public void testGetContenido_archivo_select() {
        System.out.println("getContenido_archivo_select");
        CVerBase instance = new CVerBase();
        String expResult = "";
        String result = instance.getContenido_archivo_select();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of setContenido_archivo_select method, of class CVerBase.
     */
    @Test
    public void testSetContenido_archivo_select() {
        System.out.println("setContenido_archivo_select");
        String contenido_archivo_select = "";
        CVerBase instance = new CVerBase();
        instance.setContenido_archivo_select(contenido_archivo_select);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }



    /**
     * Test of subir method, of class CVerBase.
     */
    @Test
    public void testSubir() {
        System.out.println("subir");
        CVerBase instance = new CVerBase();
      //  instance.subir();
        // TODO review the generated test code and remove the default call to fail.
      //  fail("The test case is a prototype.");
        String expResult = "";
        assertEquals(expResult, expResult);
    }

    /**
     * Test of restaurar method, of class CVerBase.
     */
    @Test
    public void testRestaurar() {
        System.out.println("restaurar");
        CVerBase instance = new CVerBase();
      //  instance.restaurar();
        // TODO review the generated test code and remove the default call to fail.
      //  fail("The test case is a prototype.");
        String expResult = "";
        assertEquals(expResult, expResult);
    }

    /**
     * Test of procesar_archivo method, of class CVerBase.
     */
    @Test
    public void testProcesar_archivo() {
        System.out.println("procesar_archivo");
        String path = "";
        String nombre = "";
        String destino = "";
        String ext = "";
        CVerBase instance = new CVerBase();
     //   instance.procesar_archivo(path, nombre, destino, ext);
        // TODO review the generated test code and remove the default call to fail.
      //  fail("The test case is a prototype.");
        String expResult = "";
        assertEquals(expResult, expResult);
    }

    /**
     * Test of restaurar_archivo_sql_pg_win method, of class CVerBase.
     */
    @Test
    public void testRestaurar_archivo_sql_pg_win() {
        System.out.println("restaurar_archivo_sql_pg_win");
        String archivo = "";
        String usuario = "";
        String clave = "";
        String db = "";
        String host = "";
        boolean expResult = false;
      //  boolean result = CVerBase.restaurar_archivo_sql_pg_win(archivo, usuario, clave, db, host);

        assertEquals(expResult, expResult);
        // TODO review the generated test code and remove the default call to fail.
      //  fail("The test case is a prototype.");
        
    }

    /**
     * Test of restaurar_archivo_sql_pg_lin method, of class CVerBase.
     */
    @Test
    public void testRestaurar_archivo_sql_pg_lin() {
        System.out.println("restaurar_archivo_sql_pg_lin");
        String archivo = "";
        String usuario = "";
        String clave = "";
        String db = "";
        String host = "";
        boolean expResult = false;
      //  boolean result = CVerBase.restaurar_archivo_sql_pg_lin(archivo, usuario, clave, db, host);
        assertEquals(expResult, expResult);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of restaurar_archivo_backup_pg_win method, of class CVerBase.
     */
    @Test
    public void testRestaurar_archivo_backup_pg_win() {
        System.out.println("restaurar_archivo_backup_pg_win");
        String archivo = "";
        String usuario = "";
        String clave = "";
        String db = "";
        String host = "";
        boolean expResult = false;
       // boolean result = CVerBase.restaurar_archivo_backup_pg_win(archivo, usuario, clave, db, host);
        assertEquals(expResult, expResult);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of restaurar_archivo_backup_pg_lin method, of class CVerBase.
     */
    @Test
    public void testRestaurar_archivo_backup_pg_lin() {
        System.out.println("restaurar_archivo_backup_pg_lin");
        String archivo = "";
        String usuario = "";
        String clave = "";
        String db = "";
        String host = "";
        boolean expResult = false;
      //  boolean result = CVerBase.restaurar_archivo_backup_pg_lin(archivo, usuario, clave, db, host);
       // String expResult = "";
        assertEquals(expResult, expResult);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of copiar_en_portapapeles method, of class CVerBase.
     */
    @Test
    public void testCopiar_en_portapapeles() {
        System.out.println("copiar_en_portapapeles");
        CVerBase instance = new CVerBase();
        instance.copiar_en_portapapeles();
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of respaldar method, of class CVerBase.
     */
    @Test
    public void testRespaldar() {
        System.out.println("respaldar");
        CVerBase instance = new CVerBase();
        instance.respaldar();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of eliminar method, of class CVerBase.
     */
    @Test
    public void testEliminar() {
        System.out.println("eliminar");
        CVerBase instance = new CVerBase();
        instance.eliminar();
        // TODO review the generated test code and remove the default call to fail.
      //  fail("The test case is a prototype.");
    }

    /**
     * Test of getId method, of class CVerBase.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        CVerBase instance = new CVerBase();
        int expResult = 0;
        int result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
      //  fail("The test case is a prototype.");
    }

    /**
     * Test of setId method, of class CVerBase.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        int id = 0;
        CVerBase instance = new CVerBase();
        instance.setId(id);
        // TODO review the generated test code and remove the default call to fail.
      //  fail("The test case is a prototype.");
    }

    /**
     * Test of getNombre method, of class CVerBase.
     */
    @Test
    public void testGetNombre() {
        System.out.println("getNombre");
        CVerBase instance = new CVerBase();
        String expResult = "";
        String result = instance.getNombre();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setNombre method, of class CVerBase.
     */
    @Test
    public void testSetNombre() {
        System.out.println("setNombre");
        String nombre = "";
        CVerBase instance = new CVerBase();
        instance.setNombre(nombre);
        // TODO review the generated test code and remove the default call to fail.
      //  fail("The test case is a prototype.");
    }

    /**
     * Test of getUsuario method, of class CVerBase.
     */
    @Test
    public void testGetUsuario() {
        System.out.println("getUsuario");
        CVerBase instance = new CVerBase();
        Usuario expResult = null;
        Usuario result = instance.getUsuario();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
      //  fail("The test case is a prototype.");
    }

    /**
     * Test of setUsuario method, of class CVerBase.
     */
    @Test
    public void testSetUsuario() {
        System.out.println("setUsuario");
        Usuario usuario = null;
        CVerBase instance = new CVerBase();
        instance.setUsuario(usuario);
        // TODO review the generated test code and remove the default call to fail.
      //  fail("The test case is a prototype.");
    }

    /**
     * Test of getDirectorio method, of class CVerBase.
     */
    @Test
    public void testGetDirectorio() {
        System.out.println("getDirectorio");
        CVerBase instance = new CVerBase();
        String expResult = "";
        String result = instance.getDirectorio();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of setDirectorio method, of class CVerBase.
     */
    @Test
    public void testSetDirectorio() {
        System.out.println("setDirectorio");
        String directorio = "";
        CVerBase instance = new CVerBase();
        instance.setDirectorio(directorio);
        // TODO review the generated test code and remove the default call to fail.
      //  fail("The test case is a prototype.");
    }

    /**
     * Test of getBase method, of class CVerBase.
     */
    @Test
    public void testGetBase() {
        System.out.println("getBase");
        CVerBase instance = new CVerBase();
        Bases_datos expResult = null;
        Bases_datos result = instance.getBase();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
      //  fail("The test case is a prototype.");
    }

    /**
     * Test of setBase method, of class CVerBase.
     */
    @Test
    public void testSetBase() {
        System.out.println("setBase");
        Bases_datos base = null;
        CVerBase instance = new CVerBase();
        instance.setBase(base);
        // TODO review the generated test code and remove the default call to fail.
      //  fail("The test case is a prototype.");
    }

    /**
     * Test of getArchivo_subido method, of class CVerBase.
     */
    @Test
    public void testGetArchivo_subido() {
        System.out.println("getArchivo_subido");
        CVerBase instance = new CVerBase();
        String expResult = "";
        String result = instance.getArchivo_subido();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
      //  fail("The test case is a prototype.");
    }

    /**
     * Test of setArchivo_subido method, of class CVerBase.
     */
    @Test
    public void testSetArchivo_subido() {
        System.out.println("setArchivo_subido");
        String archivo_subido = "";
        CVerBase instance = new CVerBase();
        instance.setArchivo_subido(archivo_subido);
        // TODO review the generated test code and remove the default call to fail.
      //  fail("The test case is a prototype.");
    }

    /**
     * Test of getEstado method, of class CVerBase.
     */
    @Test
    public void testGetEstado() {
        System.out.println("getEstado");
        CVerBase instance = new CVerBase();
        String expResult = "";
        String result = instance.getEstado();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
      //  fail("The test case is a prototype.");
    }

    /**
     * Test of setEstado method, of class CVerBase.
     */
    @Test
    public void testSetEstado() {
        System.out.println("setEstado");
        String estado = "";
        CVerBase instance = new CVerBase();
        instance.setEstado(estado);
        // TODO review the generated test code and remove the default call to fail.
    //    fail("The test case is a prototype.");
    }

    /**
     * Test of getInfo_conexion method, of class CVerBase.
     */
    @Test
    public void testGetInfo_conexion() {
        System.out.println("getInfo_conexion");
        CVerBase instance = new CVerBase();
        String expResult = "";
        String result = instance.getInfo_conexion();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
     //   fail("The test case is a prototype.");
    }

    /**
     * Test of setInfo_conexion method, of class CVerBase.
     */
    @Test
    public void testSetInfo_conexion() {
        System.out.println("setInfo_conexion");
        String info_conexion = "";
        CVerBase instance = new CVerBase();
        instance.setInfo_conexion(info_conexion);
        // TODO review the generated test code and remove the default call to fail.
      //  fail("The test case is a prototype.");
    }
    
}
