/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package acceso;

import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.sql.*;


public class ConjuntoResultado {

    private String[] cabecera;
    private ArrayList<Object[]> Datos;
    private int indCol;
    private int indFil;
    private int tamCol;
    private int tamFil;

    public ConjuntoResultado() throws SQLException, Exception {
        tamFil = 0;
        tamCol = 0;
        indCol = -1;
        indFil = -1;
    }

}
