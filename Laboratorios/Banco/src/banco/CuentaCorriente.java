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
public class CuentaCorriente extends Cuenta {
    double lineaDeCredito;
    float saldoDisponible, saldoContable;

    

    public CuentaCorriente(double lineaDeCredito, float saldoDisponible, float saldoContable, int numero, float saldo, float monto) {
        super(numero, saldo, monto);
        this.lineaDeCredito = lineaDeCredito;
        this.saldoDisponible = saldoDisponible;
        this.saldoContable = saldoContable;
    }

    

    

    public double getLineaDeCredito() {
        return lineaDeCredito;
    }

    public float getSaldoDisponible() {
        return saldoDisponible;
    }

    public float getSaldoContable() {
        return saldoContable;
    }




    public void setLineaDeCredito(double lineaDeCredito) {
        this.lineaDeCredito = lineaDeCredito;
    }

    public void setSaldoDisponible(float saldoDisponible) {
        this.saldoDisponible = saldoDisponible;
    }

    public void setSaldoContable(float saldoContable) {
        this.saldoContable = saldoContable;
    }





    
    
    
}
