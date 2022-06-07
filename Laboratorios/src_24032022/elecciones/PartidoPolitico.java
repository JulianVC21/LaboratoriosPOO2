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
public class PartidoPolitico {
    
    String nombre, creacion;

    public PartidoPolitico(String nombre, String creacion) {
        this.nombre = nombre;
        this.creacion = creacion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCreacion() {
        return creacion;
    }

    @Override
    public String toString() {
        return ""+nombre; //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
    
}
