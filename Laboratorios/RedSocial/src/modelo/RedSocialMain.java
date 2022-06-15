/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import control.Control;
import vista.*;
import modelo.*;

/**
 *
 * @author julia
 */
public class RedSocialMain {
    
    public static void main(String[] args) {
        Usuario u = new Usuario("julian", "villamizar", "admin", "admin", "12345", 0);
        Usuario u2 = new Usuario("", "", "admin2", "admin", "12345", 0);
        Usuario u3 = new Usuario("", "", "admin3", "admin", "12345", 0);
        
        u.addContacto(u2);
        u.addContacto(u3);
        App app = new App();
        Login login = new Login();
        Registro registro = new Registro();
        CrearGrupo grupo = new CrearGrupo();
        RedSocial red = new RedSocial();
        
        red.registrar(u);
        red.registrar(u2);
        red.registrar(u3);
        Control c = new Control(app, login, registro, grupo, red);
        login.setVisible(true);
    }
    
}
