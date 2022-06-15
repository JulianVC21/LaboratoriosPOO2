/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;

/**
 *
 * @author julia
 */
public class Grupo {
    
    String nombre, decripcion;
    Usuario propietario;
    ArrayList<Usuario> integrantes = new ArrayList();
    
    public Grupo(String nombre, String decripcion, Usuario propietario) {
        this.nombre = nombre;
        this.decripcion = decripcion;
        this.propietario = propietario;
        integrantes.add(propietario);
    }

    public String getNombre() {
        return nombre;
    }

    public String getDecripcion() {
        return decripcion;
    }

    public Usuario getPropietario() {
        return propietario;
    }

    public ArrayList<Usuario> getIntegrantes() {
        return integrantes;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDecripcion(String decripcion) {
        this.decripcion = decripcion;
    }

    public void setPropietario(Usuario propietario) {
        this.propietario = propietario;
    }
    
    public void añadirIntegrante(Usuario u){
        if(u != null){
            integrantes.add(u);
        }else{
            System.out.println("usuario null");
        }
    }
    
    
}
