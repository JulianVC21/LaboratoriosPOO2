/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;

/**
 *
 * @author julia
 */
public class Usuario {
    
    private String nombre, apellido, nick, correo, clave;
    private int edad;
    private ArrayList<Usuario> contactos = new ArrayList();
    private ArrayList<Comentario> comentarios = new ArrayList();
    private ArrayList<Grupo> grupo = new ArrayList();

    public Usuario(String nombre, String apellido, String nick, String correo, String clave, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.nick = nick;
        this.correo = correo;
        this.clave = clave;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getNick() {
        return nick;
    }

    public String getCorreo() {
        return correo;
    }

    public String getClave() {
        return clave;
    }

    public int getEdad() {
        return edad;
    }

    public ArrayList<Usuario> getContactos() {
        return contactos;
    }

    public ArrayList<Comentario> getComentarios() {
        return comentarios;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setContactos(ArrayList<Usuario> contactos) {
        this.contactos = contactos;
    }

    public void setComentarios(ArrayList<Comentario> comentarios) {
        this.comentarios = comentarios;
    }
    
    
    public void addContacto(Usuario u){
        contactos.add(u);
        System.out.println("contacto agregado");
    }
    
    public boolean addComentario(Comentario c){
        if(comentarios.size()<10){
            comentarios.add(c);
            return true;
        } else{
            System.err.println("Limite de comenatios registrado");
            return false;
        }
    }
    
    public void crearGrupo(Grupo g){
        grupo.add(g);
        System.out.println("grupo creado");
    }

    public ArrayList<Grupo> getGrupo() {
        return grupo;
    }
    
    
    
    
    
}
