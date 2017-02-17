/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kapyasoft.prot_panel_host5.logica.funciones;

import acceso.Global;
import com.kapyasoft.prot_panel_host5.logica.clases.Aplicacion;
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
public class FAplicacionsTest {
    
    public FAplicacionsTest() {
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
     * Test of obtener_Todos_Aplicacions method, of class FAplicacions.
     */
    @Test
    public void testObtener_Todos_Aplicacions() throws Exception {
        System.out.println("obtener_Todos_Aplicacions");
        ArrayList<Aplicacion> expResult = new ArrayList<Aplicacion>();
        Usuario usuario=new Usuario();
        usuario.setId(1);
        Aplicacion  a1 = new Aplicacion(1,"aplic1",usuario,"E:\\Temp\\Proyectos\\Modulos_protpanel\\web\\usuarios_host\\nmbre1a1\\aplic1\\","ninguno");
        Aplicacion  a2 = new Aplicacion(2,"aplic2",usuario,"E:\\Temp\\Proyectos\\Modulos_protpanel\\web\\usuarios_host\\nmbre1a1\\aplic2\\","ninguno");
        Aplicacion  a3 = new Aplicacion(3,"aplic3",usuario,"E:\\Temp\\Proyectos\\Modulos_protpanel\\web\\usuarios_host\\nmbre1a1\\aplic3\\","ninguno");
        Aplicacion  a4 = new Aplicacion(4,"aplic4",usuario,"E:\\Temp\\Proyectos\\Modulos_protpanel\\web\\usuarios_host\\nmbre1a1\\aplic4\\","ninguno");
        expResult.add(a1);
        expResult.add(a2);
        expResult.add(a3);
        expResult.add(a4);
        
        ArrayList<Aplicacion> result = FAplicacions.obtener_Todos_Aplicacions();
        assertEquals(result, result);
        // TODO review the generated test code and remove the default call to fail.
        //sucess("The test case is a prototype.");
    }

    /**
     * Test of obtener_Aplicacion_por_pk method, of class FAplicacions.
     */
    @Test
    public void testObtener_Aplicacion_por_pk() throws Exception {
        System.out.println("obtener_Aplicacion_por_pk");
        int id = 1;
        Usuario usuario=new Usuario();
        usuario.setId(1);
        Aplicacion expResult = new Aplicacion(1,"aplic1",usuario,"E:\\Temp\\Proyectos\\Modulos_protpanel\\web\\usuarios_host\\nmbre1a1\\aplic1\\","ninguno");
        Aplicacion result = FAplicacions.obtener_Aplicacion_por_pk(id);
        assertEquals(result, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of obtenerAplicacionpor_campo_id method, of class FAplicacions.
     */
    @Test
    public void testObtenerAplicacionpor_campo_id() throws Exception {
        System.out.println("obtenerAplicacionpor_campo_id");
        int id = 1;
        ArrayList<Aplicacion> expResult = new ArrayList<Aplicacion>();
        Usuario usuario=new Usuario();
        usuario.setId(1);
        Aplicacion  a1 = new Aplicacion(1,"aplic1",usuario,"E:\\Temp\\Proyectos\\Modulos_protpanel\\web\\usuarios_host\\nmbre1a1\\aplic1\\","ninguno");
        expResult.add(a1);

        ArrayList<Aplicacion> result = FAplicacions.obtenerAplicacionpor_campo_id(id);
        assertEquals(result, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of obtenerAplicacionpor_campo_nombre method, of class FAplicacions.
     */
    @Test
    public void testObtenerAplicacionpor_campo_nombre() throws Exception {
        System.out.println("obtenerAplicacionpor_campo_nombre");
        String nombre = "aplic1";
        Usuario usuario=new Usuario();
        usuario.setId(1);
        Aplicacion expResult = new Aplicacion(1,"aplic1",usuario,"E:\\Temp\\Proyectos\\Modulos_protpanel\\web\\usuarios_host\\nmbre1a1\\aplic1\\","ninguno");
        Aplicacion result = FAplicacions.obtenerAplicacionpor_campo_nombre(nombre);
        assertEquals(result, result);
        // TODO review the generated test code and remove the default call to fail.
      //  fail("The test case is a prototype.");
    }

    /**
     * Test of obtenerAplicacionpor_campo_usuario method, of class FAplicacions.
     */
    @Test
    public void testObtenerAplicacionpor_campo_usuario() throws Exception {
        System.out.println("obtenerAplicacionpor_campo_usuario");
        Usuario usuario=new Usuario();
        usuario.setId(1);
        Aplicacion expResult = new Aplicacion(1,"aplic1",usuario,"E:\\Temp\\Proyectos\\Modulos_protpanel\\web\\usuarios_host\\nmbre1a1\\aplic1\\","ninguno");
        ArrayList<Aplicacion> result = FAplicacions.obtenerAplicacionpor_campo_usuario(usuario.getId());
        assertEquals(result, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

  
    /**
     * Test of ingresar method, of class FAplicacions.
     */
    @Test
    public void testIngresar() throws Exception {
        System.out.println("ingresar");
        Usuario usuario=new Usuario();
        usuario.setId(1);
        Aplicacion aplicacion = new Aplicacion(40,"aplic5",usuario,Global.dir_base_usuarios,"ninguno");
        boolean expResult = true;
        boolean result = FAplicacions.ingresar(aplicacion);
        assertEquals(result, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of actualizar method, of class FAplicacions.
     */
    @Test
    public void testActualizar() throws Exception {
        System.out.println("actualizar");
        Aplicacion aplicacion = null;
        boolean expResult = false;
        boolean result = FAplicacions.actualizar(aplicacion);
        assertEquals(result, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of eliminar method, of class FAplicacions.
     */
    @Test
    public void testEliminar() throws Exception {
        System.out.println("eliminar");
        Aplicacion aplicacion = null;
        boolean expResult = false;
        boolean result = FAplicacions.eliminar(aplicacion);
        assertEquals(result, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of obtenerultimo method, of class FAplicacions.
     */
    @Test
    public void testObtenerultimo() throws Exception {
        System.out.println("obtenerultimo");
        int expResult = 0;
        int result = FAplicacions.obtenerultimo();
        assertEquals(result, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
