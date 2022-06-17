/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

import java.util.ArrayList;

/**
 *
 * @author julia
 */
public class Banco {
    
    ArrayList<Cliente> clientes = new ArrayList();
    
    public void addCliente(String nombre, String apellido, String rut){
        clientes.add(new Cliente(rut, nombre, apellido));
    }
    
    public void crearCuentaAhorro(CuentaAhorro ca, String cliente){
        if(toFind(cliente) == null){
            System.out.println("no se ha encontrado el cliente");
        }else{
            toFind(cliente).añadirCuentaAhorro(ca);
            System.out.println("Cuenta de ahorro creada al cliente "+cliente);
        }
        
    }
    
    public void crearCuentaCorriente(CuentaCorriente ca, String cliente){
        if(toFind(cliente) == null){
            System.out.println("no se ha encontrado el cliente");
        }else{
            toFind(cliente).añadirCuentaCorriente(ca);
            System.out.println("Cuenta corriente creada al cliente "+cliente);
        }
        
    }
    
    private Cliente toFind(String nombre){
        Cliente c=null;
        for(int i=0;i<clientes.size();i++){
            if(nombre.equals(clientes.get(i).getNombre())){
                c=clientes.get(i);
            }
        }
        return c;
    }
    
    public void printClientes(){
        System.out.println("----------------------------------------\n"
                + "CLIENTES");
        for(int i=0;i<clientes.size();i++){
            System.out.println(clientes.get(i));
        }
    }
}
