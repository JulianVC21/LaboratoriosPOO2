/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

import javax.swing.JOptionPane;

/**
 *
 * @author estudiante
 */
public class Cuenta {
    int numero;
    float saldo, monto;

    public Cuenta(){}
    
    
    public Cuenta(int numero, float saldo, float monto) {
        this.numero = numero;
        this.saldo = saldo;
        this.monto = monto;

    }


    

    public int getNumero() {
        return numero;
    }

    public float getSaldo() {
        return saldo;
    }

    public float getMonto() {
        return monto;
    }

    

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public void setMonto(float monto) {
        this.monto = monto;
    }

}
