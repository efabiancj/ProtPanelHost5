/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases_utiles;

/**
 *
 * @author Edgar
 */
public class Arbol_directorios {
    private Directorio raiz;
    private String nombre;

    public Arbol_directorios(Directorio raiz, String nombre) {
        this.raiz = raiz;
        this.nombre = nombre;
    }

    public Arbol_directorios() {
        this.raiz = null;
        this.nombre = "";
    }
    
    public Directorio getRaiz() {
        return raiz;
    }

    public void setRaiz(Directorio raiz) {
        this.raiz = raiz;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
}
