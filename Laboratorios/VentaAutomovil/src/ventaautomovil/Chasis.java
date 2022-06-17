package ventaautomovil;


import java.util.*;

public class Chasis {
    
    private String numeroProcedencia;
    private String procedencia;

    public Chasis() {
    }

    public Chasis(String numeroProcedencia, String procedencia) {
        this.numeroProcedencia = numeroProcedencia;
        this.procedencia = procedencia;
    }

    public String getNumeroProcedencia() {
        return numeroProcedencia;
    }

    public void setNumeroProcedencia(String numeroProcedencia) {
        this.numeroProcedencia = numeroProcedencia;
    }

    public String getProcedencia() {
        return procedencia;
    }

    public void setProcedencia(String procedencia) {
        this.procedencia = procedencia;
    }

    @Override
    public String toString() {
        return "Numero de procedencia: "+ numeroProcedencia+" procedencia: "+procedencia; //To change body of generated methods, choose Tools | Templates.
    }
    
    
    

}