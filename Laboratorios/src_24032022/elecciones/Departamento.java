/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elecciones;

/**
 *
 * @author julia
 */
public class Departamento {
    
    String nombre;
    int curules;

    public Departamento(String nombre, int curules) {
        this.nombre = nombre;
        this.curules = curules;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCurules() {
        return curules;
    }
    
    
    
}
