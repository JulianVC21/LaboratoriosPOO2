/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.*;
import modelo.*;
import vista.*;

/**
 *
 * @author julia
 */
public class Control implements ActionListener {

    App app;
    Login login;
    Registro registro;
    CrearGrupo grupo;
    RedSocial red;

    //Models
    DefaultListModel<String> listaContactos = new DefaultListModel<>();
    DefaultListModel<String> listaGrupos = new DefaultListModel<>();
    DefaultListModel<String> listaIntegrantes = new DefaultListModel<>();

    //comentarios
    StringBuffer comentarios = new StringBuffer();

    public Control(App app, Login login, Registro registro, CrearGrupo grupo, RedSocial red) {
        super();
        this.app = app;
        this.login = login;
        this.registro = registro;
        this.grupo = grupo;
        this.red = red;
        actionListener(this);
        app.jListContactos.setModel(listaContactos);
        app.jListGrupos.setModel(listaGrupos);
        app.jListIntegrantes.setModel(listaIntegrantes);
    }

    public void actionListener(ActionListener evt) {
        System.out.println("funcionando");
        //inicio sesion
        login.btnIniciar.addActionListener(evt);
        login.btnRegistro.addActionListener(evt);
        //registro
        registro.btnRegistro.addActionListener(evt);
        //app
        app.btnAddContacto.addActionListener(evt);
        app.btnComentar.addActionListener(evt);
        app.btnSubirFoto.addActionListener(evt);
        app.btnMostrarInfo.addActionListener(evt);
        app.btnAddIntegrante.addActionListener(evt);
        app.btnCrearGrupo.addActionListener(evt);
        //crear grupo
        grupo.btnCrearGrupo.addActionListener(evt);
    }

    @Override
    public void actionPerformed(ActionEvent evt) {
        try {
            if (evt.getActionCommand().contentEquals("REGISTRARSE")) {
                registro.setVisible(true);
                login.setEnabled(false);

            } else if (evt.getActionCommand().contentEquals("INICIAR SESION")) {
                String nick = login.txtNick.getText();
                String clave = login.txtContraseña.getText();

                if (red.iniciarSesion(nick)) {
                    login.setVisible(false);
                    app.setVisible(true);

                    Usuario user = red.buscar(nick, clave);
                    app.lblNombre.setText(user.getNombre() + " " + user.getApellido());
                    app.lblNick.setText(user.getNick());

                    ArrayList<Usuario> c = user.getContactos();
                    for (int i = 0; i < c.size(); i++) {
                        listaContactos.addElement(c.get(i).getNick());
                    }

                    ArrayList<Grupo> g = user.getGrupo();
                    for (int i = 0; i < g.size(); i++) {
                        listaGrupos.addElement(g.get(i).getNombre());
                        app.jComboBoxMostrarGrupo.addItem(g.get(i).getNombre());
                    }

                } else {
                    login.txtNick.setText("");
                    login.txtContraseña.setText("");
                }

            } else if (evt.getActionCommand().contentEquals("Registrarse")) {
                String nombre = registro.txtNombre.getText();
                String ap = registro.txtApellido.getText();
                String nick = registro.txtNick.getText();
                String clave = registro.txtContraseña.getText();
                int edad = (Integer) registro.txtEdad.getValue();
                String correo = registro.txtCorreo.getText();

                if (!nick.equals("") && !clave.equals("") && edad != 0 && !correo.equals("")) {
                    Usuario u = new Usuario(nombre, ap, nick, correo, clave, edad);
                    red.registrar(u);
                    registro.setVisible(false);
                    login.setEnabled(true);
                } else {
                    registro.txtNombre.setText("");
                    registro.txtApellido.setText("");
                    registro.txtNick.setText("");
                    registro.txtCorreo.setText("");
                    registro.txtContraseña.setText("");
                    registro.txtEdad.setValue(0);
                    System.out.println("error al registrar");

                }

            } else if (evt.getActionCommand().contentEquals("AÑADIR CONTACTO")) {
                String nick = JOptionPane.showInputDialog("Digite el nick del usuario que va a agregar");
                Usuario user = red.buscar(app.lblNick.getText());
                Usuario u = red.buscar(nick);
                if (red.buscarUsuario(u)) {
                    user.addContacto(u);
                    listaContactos.addElement(nick);

                } else {
                    System.out.println("Contacto no encontrado");
                }
            } else if (evt.getActionCommand().contentEquals("COMENTAR")) {
                Usuario user = red.buscar(app.lblNick.getText());
                String c = app.txtComentario.getText();

                if (c.length() > 200) {
                    app.txtComentario.setText("");
                    System.out.println("Comentario superior a 200 caracteres");
                } else {
                    Comentario cm = new Comentario(c);
                    if (user.addComentario(cm)) {
                        System.out.println("comentario agregado");
                        comentarios.append(cm.toString());
                        app.txtComentarios.setText("");
                        app.txtComentarios.setText(comentarios.toString());
                    }

                }

            }else if (evt.getActionCommand().contentEquals("SUBIR FOTO")) {
                Usuario user = red.buscar(app.lblNick.getText());
                String foto = JOptionPane.showInputDialog("Digite el nombre de la foto");
                foto+=".png";
                if (foto.length() > 200) {
                    app.txtComentario.setText("");
                    System.out.println("Comentario superior a 200 caracteres");
                } else {
                    Comentario cm = new Comentario(foto);
                    if (user.addComentario(cm)) {
                        System.out.println("comentario agregado");
                        comentarios.append(cm.toString());
                        app.txtComentarios.setText("");
                        app.txtComentarios.setText(comentarios.toString());
                    }
                }
                
            }else if (evt.getActionCommand().contentEquals("CREAR GRUPO")) {
                grupo.setVisible(true);
            }else if (evt.getActionCommand().contentEquals("CREAR")) {
                String nombre = grupo.txtNombreGrupo.getText();
                String d = grupo.txtDescripcion.getText();
                Usuario user = red.buscar(app.lblNick.getText());
                Grupo g = new Grupo(nombre, d, user);
                user.crearGrupo(g);
                listaGrupos.addElement(nombre);
                app.jComboBoxMostrarGrupo.addItem(nombre);
                
                grupo.setVisible(false);
            }else if (evt.getActionCommand().contentEquals("CREAR GRUPO")) {
                
            }
        } catch (Exception e) {
            System.err.println(e);
        }
    }

}
