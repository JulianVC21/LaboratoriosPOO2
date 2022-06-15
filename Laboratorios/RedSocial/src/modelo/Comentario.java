/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.Date;

/**
 *
 * @author julia
 */
public class Comentario {
    
    String texto;
    Date fecha;

    public Comentario(String texto) {
        this.texto = texto;
        fecha = new Date();
    }

    public String getTexto() {
        return texto;
    }

    public Date getFecha() {
        return fecha;
    }

    @Override
    public String toString() {
        return texto+"\n"
                +fecha+"\n"; //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
}
