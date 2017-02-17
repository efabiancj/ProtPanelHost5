package clases_utiles;

import java.util.ArrayList;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Edgar
 */
public class Directorio {
    ArrayList<Directorio> nodo;
    String nombre;

    public Directorio(ArrayList<Directorio> nodo, String nombre) {
        this.nodo = nodo;
        this.nombre = nombre;
    }
    public Directorio() {
        this.nodo = null;
        this.nombre = "";
    }
 
    
    public ArrayList<Directorio> getNodo() {
        return nodo;
    }

    public void setNodo(ArrayList<Directorio> nodo) {
        this.nodo = nodo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
}
