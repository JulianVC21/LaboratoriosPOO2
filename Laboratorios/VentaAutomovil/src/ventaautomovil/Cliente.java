package ventaautomovil;

import java.util.*;

/**
 * 
 */
public class Cliente {

    private String identificacion;
    private String nombre;
    private String apellido;
    private Character genero;
    private String direccion;
    
    public Cliente() {
    }
    
    public Cliente(String identificacion, String nombre, String apellido, Character genero, String direccion){
        this.identificacion = identificacion;
        this.nombre = nombre;
        this.apellido = apellido;
        this.genero = genero;
        this.direccion = direccion;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Character getGenero() {
        return genero;
    }

    public void setGenero(Character genero) {
        this.genero = genero;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Identificacion"+identificacion+"\n"
                + "Nombre: "+nombre+"\n"
                + "Apellido: "+apellido+"\n"
                + "Genero: "+genero+"\n"
                + "Direccion: "+direccion;
    }
    
    
    
    

}