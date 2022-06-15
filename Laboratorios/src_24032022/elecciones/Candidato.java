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
public class Candidato {
    
    String nombre, email;
    int documento, telefono;
    char genero;
    PartidoPolitico partido;
    int numero, votos;

    public Candidato(String nombre, String email, int documento, int telefono, char genero, PartidoPolitico partido, int votos) {
        this.nombre = nombre;
        this.email = email;
        this.documento = documento;
        this.telefono = telefono;
        this.genero = genero;
        this.partido = partido;
        this.votos=votos;
    }
//GETTER
    public String getNombre() {
        return nombre;
    }

    public String getEmail() {
        return email;
    }

    public int getDocumento() {
        return documento;
    }

    public int getTelefono() {
        return telefono;
    }

    public char getGenero() {
        return genero;
    }

    public PartidoPolitico getPartido() {
        return partido;
    }

    public int getNumero() {
        return numero;
    }

    public int getVotos() {
        return votos;
    }
    
    
//SETTER

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setDocumento(int documento) {
        this.documento = documento;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public void setPartido(PartidoPolitico partido) {
        this.partido = partido;
    }

    public void setNumero(String data) {
        if(data.toLowerCase().equals("senado")){
            numero= (int) (Math.random() *100);
        }else if(data.toLowerCase().equals("camara")){
            numero= (int) (100 + (Math.random()*partido.getCurules()));
        }
    }

    public void setVotos(int votos) {
        this.votos = votos;
    }
    
    

    @Override
    public String toString() {
        return "----------------------------------------------------\n"
                + "Candidato: "+nombre+"\n"
                + "Documento "+documento+"\n"
                + "Email: "+email+"\n"
                + "Genero: "+genero+"\n"
                + "Partido: "+partido.toString()+"\n"
                + "Numero: "+numero+"\n"
                + "Votos: "+votos;
    }
    
    
    
    
}
