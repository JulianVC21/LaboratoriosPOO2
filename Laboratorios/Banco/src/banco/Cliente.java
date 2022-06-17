/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

import java.util.ArrayList;

/**
 *
 * @author estudiante
 */
public class Cliente {
    
    String rut, nombre, apellidos;
    ArrayList<CuentaCorriente> cuentaCorriente = new ArrayList();
    ArrayList<CuentaAhorro> cuentaAhorros = new ArrayList();

    public Cliente() {
    }

    public Cliente(String rut, String nombre, String apellidos) {
        this.rut = rut;
        this.nombre = nombre;
        this.apellidos = apellidos;
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

    public void setRut(String rut) {
        this.rut = rut;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public ArrayList<CuentaAhorro> getCuentaAhorros() {
        return cuentaAhorros;
    }

    public ArrayList<CuentaCorriente> getCuentaCorriente() {
        return cuentaCorriente;
    }
    
    public void añadirCuentaAhorro(CuentaAhorro c){
        cuentaAhorros.add(c);
    }
    
    public void añadirCuentaCorriente(CuentaCorriente c){
        cuentaCorriente.add(c);
    }

    @Override
    public String toString() {
        return "Nombre: "+nombre+" "+apellidos+"\n"
                + "RUT: "+rut+"\n"
                + "Cuentas de ahorro: "+cuentaAhorros.size()+"\n"
                + "Cuentas Corrientes: "+cuentaCorriente.size()+"\n"; //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
    
}
