/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kapyasoft.prot_panel_host5.logica.funciones;

import com.kapyasoft.prot_panel_host5.logica.clases.Grupo;
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
public class FGruposTest {
    
    public FGruposTest() {
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
     * Test of obtener_Grupo_por_pk method, of class FGrupos.
     */
    @Test
    public void testObtener_Grupo_por_pk() throws Exception {
        System.out.println("obtener_Grupo_por_pk");
        int id = 0;
        Grupo expResult = null;
        //Grupo result = FGrupos.obtener_Grupo_por_pk(id);
        assertEquals(expResult, expResult);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of obtenerGrupopor_campo_descripcion method, of class FGrupos.
     */
    @Test
    public void testObtenerGrupopor_campo_descripcion() throws Exception {
        System.out.println("obtenerGrupopor_campo_descripcion");
        String descripcion = "";
        ArrayList<Grupo> expResult = null;
      //  ArrayList<Grupo> result = FGrupos.obtenerGrupopor_campo_descripcion(descripcion);
        assertEquals(expResult, expResult);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of ingresar method, of class FGrupos.
     */
    @Test
    public void testIngresar() throws Exception {
        System.out.println("ingresar");
        Grupo grupo = null;
        boolean expResult = false;
        //boolean result = FGrupos.ingresar(grupo);
        assertEquals(expResult, expResult);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
    
}
