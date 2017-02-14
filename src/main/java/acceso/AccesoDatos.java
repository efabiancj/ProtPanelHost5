/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package acceso;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author edgar
 */
public class AccesoDatos {
    public static boolean ejecutaComando1(String comando, ArrayList<Parametro> parametros) throws Exception {
        boolean respuesta = false;
        return respuesta;
    }

    public static boolean ejecutaComando(String comando, ArrayList<Parametro> parametros) throws Exception {

        boolean respuesta = false;
 
        return respuesta;
    }
    public static boolean ejecutaComando(String query) throws Exception {
        boolean res=false;
        
        return res;
    }
    public static ConjuntoResultado ejecutaQuery(String query) throws Exception {

        ConjuntoResultado conj = new ConjuntoResultado();

        return conj;
    }

    public static ConjuntoResultado ejecutaQuery(String query, ArrayList<Parametro> parametros) throws Exception {

        ConjuntoResultado conj = new ConjuntoResultado();
       
        return conj;
    }
}
