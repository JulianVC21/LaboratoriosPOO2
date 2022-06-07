/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventaautomovil;

import java.util.ArrayList;

/**
 *
 * @author julia
 */
public class Venta {

    int masculino = 0, femenino = 0;
    ArrayList<Automovil> autosVendidos = new ArrayList();
    ArrayList<Cliente> clientesFem = new ArrayList();
    ArrayList<Cliente> clientesMasc = new ArrayList();

    public void ventaAutomovil(Automovil auto, Cliente cliente) {
        if (cliente.getGenero() == 'f') {
            clientesFem.add(cliente);
        } else if (cliente.getGenero() == 'm') {
            clientesMasc.add(cliente);
        }

        autosVendidos.add(auto);
        System.out.println("------------------------------------------------");

        System.out.println("Vehiculo vendido: \n"
                + auto.toString() + "\n"
                + "Cliente: \n"
                + cliente.toString());

    }

    public void actualizar(Automovil auto, Motor motor, Chasis chasis, String marca, String modelo, Integer numeroPuertas) {
        auto.setChasis(chasis);
        auto.setMarca(marca);
        auto.setModelo(modelo);
        auto.setMotor(motor);
        auto.setNumeroPuertas(numeroPuertas);

        System.out.println("---------------------------------------------");
        System.out.println("Automovil actualizado:");
        System.out.println(auto.toString());

    }

    public void generoClientes() {
        System.out.println("---------------------------------------");
        System.out.println("CLIENTES FEMENINOS:");
        for (int i = 0; i < clientesFem.size(); i++) {
            System.out.println(clientesFem.get(0));
        }
        System.out.println("---------------------------------------");
        System.out.println("CLIENTES MASCULINOS");
        for (int i = 0; i < clientesMasc.size(); i++) {
            System.out.println(clientesMasc.get(0));
        }
    }

}
