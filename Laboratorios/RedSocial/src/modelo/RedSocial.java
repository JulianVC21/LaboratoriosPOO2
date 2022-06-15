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
public class RedSocial {
    
    ArrayList<Usuario> usuarios = new ArrayList();
    
    public boolean registrar(Usuario u){
        if(!buscarUsuario(u)){
            if(u != null){
                usuarios.add(u);
            }
        }
        return false;
    }
    
    public boolean buscarUsuario(Usuario u){
        for(int i=0;i<usuarios.size();i++){
            if(usuarios.get(i).equals(u)){
                return true;
            }
        }
        
        return false;
    }
    
    public boolean iniciarSesion(String nick){
        for(int i=0;i<usuarios.size();i++){
            if(usuarios.get(i).getNick().equals(nick)){
                return true;
            }
        }
        return false;
    }
    
    public Usuario buscar(String nick, String clave){
        for(int i=0;i<usuarios.size();i++){
            if(usuarios.get(i).getNick().equals(nick) && usuarios.get(i).getClave().equals(clave)){
                return usuarios.get(i);
            }
        }
        return null;
    }
    
    public Usuario buscar(String nick){
        for(int i=0;i<usuarios.size();i++){
            if(usuarios.get(i).getNick().equals(nick)){
                return usuarios.get(i);
            }
        }
        return null;
    }
    
}
