
package ventaautomovil;

public class VentaAutomovil {

    public static void main(String[] args) {
       
        Venta v = new Venta();
        Automovil auto1 = new Automovil(new Motor(6.00, "3243GJ342"), new Chasis("723GVUU", "Colombia"), "Ford", "HKBD6t8t", 4);
        
        v.ventaAutomovil(auto1, new Cliente("324234432", "pepe", "fdsabfsd", 'm', "Av 2E #38294y293"));
        v.generoClientes();
    }
    
}
