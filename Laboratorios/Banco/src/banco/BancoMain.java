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
public class BancoMain {
    public static void main(String[] args) {
        Cuenta c1 = new CuentaAhorro(10, 1.2, 1, 1000000, 1000000);
        Cuenta c2 = new CuentaAhorro(10, 0.92, 2, 1000000, 1000000);
        
        Cuenta c3 = new CuentaCorriente(1000.2, 2049823.94f, 2371231.32f, 3, 432423423, 12321412.34f);
        Cuenta c4 = new CuentaCorriente(1033210.2, 23213823.94f, 4371231.32f, 4, 1232423423, 52341412.34f);
        
        
        Banco b = new Banco();

        b.addCliente("Pepe", "Martinez", "342342354");
        b.addCliente("Bob", "fsgdfs", "534534");
        
        b.crearCuentaAhorro((CuentaAhorro) c1, "Pepe");
        b.crearCuentaCorriente((CuentaCorriente) c4, "Bob");
        b.printClientes();
    }
    
}
