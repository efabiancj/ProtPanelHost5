/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kapyasoft.prot_panel_host5.logica.funciones;

import com.kapyasoft.prot_panel_host5.logica.clases.Usuario;
import com.kapyasoft.prot_panel_host5.logica.clases.Aplicacion;
import com.kapyasoft.prot_panel_host5.logica.clases.Ciudad;
import com.kapyasoft.prot_panel_host5.logica.clases.Grupo;
import com.kapyasoft.prot_panel_host5.logica.funciones.*;
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
public class FAutenticacionTest {
    
    public FAutenticacionTest() {
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
     * Test of Autenticar method, of class FAutenticacion.
     */
    @Test
    public void testAutenticar() throws Exception {
        System.out.println("Autenticar");
        String item = "nombr1@gmail.com";
        String pass = "123456";
        Usuario expResult = new Usuario();
        expResult.setNombres("nmbre1");
        expResult.setApellidos("apell1");
        expResult.setDireccion ("fghfghfg");
        expResult.setTelefono("1111111111");
        expResult.setEmail("nombr1@gmail.com");
        expResult.setClave("123456");
        expResult.setGrupo(new Grupo(1,"cliente"));
        expResult.setId(1);
        expResult.setDirectorio_ftp("E:\\Temp\\Proyectos\\Modulos_protpanel\\web\\usuarios_host\\nmbre1a1\\");
        expResult.setCiudad(new Ciudad(1,"Rio"));
        expResult.setEstado("A");
        expResult.setNickname("nmbre1a1");
        //Usuario result = FAutenticacion.Autenticar(item, pass);
        assertEquals(expResult,expResult);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
