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
public class CuentaAhorro extends Cuenta {
    int maxGiros;
    double tasaInteresMensual;

    public CuentaAhorro(int maxGiros, double tasaInteresMensual, int numero, float saldo, float monto) {
        super(numero, saldo, monto);
        this.maxGiros = maxGiros;
        this.tasaInteresMensual = tasaInteresMensual;
    }

    
    
  
    public int getMaxGiros() {
        return maxGiros;
    }

    public double getTasaInteresMensual() {
        return tasaInteresMensual;
    }




    public void setMaxGiros(int maxGiros) {
        this.maxGiros = maxGiros;
    }

    public void setTasaInteresMensual(double tasaInteresMensual) {
        this.tasaInteresMensual = tasaInteresMensual;
    }



    
    
    
    
}
