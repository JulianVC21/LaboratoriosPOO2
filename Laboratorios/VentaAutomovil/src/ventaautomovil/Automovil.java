package ventaautomovil;

import java.util.*;
import javax.swing.JOptionPane;

public class Automovil {

    private Motor motor;
    private Chasis chasis;
    private String marca;
    private String modelo;
    private Integer numeroPuertas;

    public Automovil() {

    }

    public Automovil(Motor motor, Chasis chasis, String marca, String modelo, Integer numeroPuertas) {
        this.motor = motor;
        this.chasis = chasis;
        this.marca = marca;
        this.modelo = modelo;
        this.numeroPuertas = numeroPuertas;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public Chasis getChasis() {
        return chasis;
    }

    public void setChasis(Chasis chasis) {
        this.chasis = chasis;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Integer getNumeroPuertas() {
        return numeroPuertas;
    }

    public void setNumeroPuertas(Integer numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }

    @Override
    public String toString() {
        return "Marca: "+marca+"\n"
                + "Modelo: "+modelo+"\n"
                + "Numero de puertas: "+numeroPuertas+"\n"
                + "Motor: "+motor.toString()+"\n"
                + "Chasis: "+chasis.toString(); //To change body of generated methods, choose Tools | Templates.
    }
    
    

}
