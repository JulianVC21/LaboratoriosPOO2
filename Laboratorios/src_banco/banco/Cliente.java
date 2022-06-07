/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

/**
 *
 * @author estudiante
 */
public class Cliente {
    
    String rut, nombre, apellidos;
    Cuenta[] cuenta;

    public Cliente() {
    }

    public Cliente(String rut, String nombre, String apellidos, Cuenta[] cuenta) {
        this.rut = rut;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.cuenta = cuenta;
    }

    
    public String getRut() {
        return rut;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public Cuenta[] getCuenta() {
        return cuenta;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setCuenta(Cuenta[] cuenta) {
        this.cuenta = cuenta;
    }
    
    
    
}
