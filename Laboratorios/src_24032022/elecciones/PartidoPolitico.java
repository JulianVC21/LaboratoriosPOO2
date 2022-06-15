/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elecciones;

/**
 *
 * @author julia
 */
public class PartidoPolitico {
    
    String nombre, creacion;
    Departamento departamento;
    int votos;

    public PartidoPolitico(String nombre, String creacion, Departamento dep) {
        this.nombre = nombre;
        this.creacion = creacion;
        departamento = dep;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCreacion() {
        return creacion;
    }
    
    public int getCurules(){
        return departamento.getCurules();
    }

    public int getVotos() {
        return votos;
    }

    public void setVotos(int votos) {
        this.votos += votos;
    }
    
    

    @Override
    public String toString() {
        return ""+nombre; //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
    
}
