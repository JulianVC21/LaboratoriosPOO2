package ventaautomovil;

import java.util.*;

public class Motor {
    
    private Double capacidad;
    private String numeroSerie;
    
    public Motor() {
        
    }

    public Motor(Double capacidad, String numeroSerie) {
        this.capacidad = capacidad;
        this.numeroSerie = numeroSerie;
    }

    public Double getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(Double capacidad) {
        this.capacidad = capacidad;
    }

    public String getNumeroSerie() {
        return numeroSerie;
    }

    public void setNumeroSerie(String numeroSerie) {
        this.numeroSerie = numeroSerie;
    }

    @Override
    public String toString() {
        return "Capacidad: "+capacidad+" Numero de serie: "+numeroSerie; //To change body of generated methods, choose Tools | Templates.
    }
    
    


}