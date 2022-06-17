/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Modelo.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import laboratorioparroquia.Vista;

/**
 *
 * @author estudiante
 */
public class Controlador implements ActionListener {

    //vista
    private Vista parroquia = null;
    Parroquia modelo = null;

    public Controlador(Vista v, Parroquia p) {
        super();
        this.parroquia = v;
        modelo = p;
        actionListener(this);
    }

    private void actionListener(ActionListener controlador) {
        parroquia.btnGuardar.addActionListener(controlador);
        parroquia.btnEliminar.addActionListener(controlador);
        parroquia.btnActualizar.addActionListener(controlador);
        parroquia.btnBuscar.addActionListener(controlador);
        parroquia.btnTotalizar.addActionListener(controlador);
        parroquia.btnPagar.addActionListener(controlador);
        parroquia.btnConsultar.addActionListener(controlador);

    }

    @Override
    public void actionPerformed(ActionEvent evento) {

        try {
            if (evento.getActionCommand().contentEquals("Guardar")) {
                String cedula = this.parroquia.txtCedula.getText();
                String nombre = this.parroquia.txtNombre.getText();
                String direccion = this.parroquia.txtDireccion.getText();
                String telefono = this.parroquia.txtTelefono.getText();
                int estrato = Integer.parseInt(this.parroquia.txtEstrato.getText());
                String estado = this.parroquia.txtEstado.getText();

                Feligres f = new Feligres(cedula, nombre, direccion, telefono, estrato, estado);
                if (estrato < 1) {
                    JOptionPane.showMessageDialog(null, "Digite un estrato valido");
                } else {
                    modelo.añadirFeligres(f);
                    
                    parroquia.txtCedula.setText("");
                    parroquia.txtNombre.setText("");
                    parroquia.txtDireccion.setText("");
                    parroquia.txtEstado.setText("");
                    parroquia.txtEstrato.setText("");
                    parroquia.txtTelefono.setText("");
                }

            } else if (evento.getActionCommand().contentEquals("Eliminar")) {
                if (parroquia.txtCedula.getText() != "") {
                    modelo.eliminar(parroquia.txtCedula.getText());
                } else {
                    JOptionPane.showMessageDialog(null, "Digite la cedula en el campo correspondiente");
                }

            } else if (evento.getActionCommand().contentEquals("Actualizar")) {

                if (parroquia.txtCedula.getText() == "" || parroquia.txtNombre.getText() == "" || parroquia.txtDireccion.getText() == "" || parroquia.txtEstado.getText() == ""
                        || parroquia.txtTelefono.getText() == "" || parroquia.txtEstrato.getText() == "") {
                    JOptionPane.showMessageDialog(null, "Campos incompletos");

                } else {

                }

            } else if (evento.getActionCommand().contentEquals("Buscar")) {
                Feligres f = modelo.buscar(parroquia.txtCedula.getText());
                parroquia.jTextArea1.setText(f.toString());

                if (f == null) {
                    System.out.println("Feligres no encontrado");
                }else{
                    parroquia.txtNombre.setText(f.getNombre());
                    parroquia.txtDireccion.setText(f.getDireccion());
                    parroquia.txtEstado.setText(f.getEstado());
                    parroquia.txtEstrato.setText("" + f.getEstrato());
                    parroquia.txtTelefono.setText(f.getTelefono());
                }

            } else if (evento.getActionCommand().contentEquals("Consultar")) {
                
                parroquia.txtValorDiezmo.setText(""+modelo.consultar(parroquia.txtCédulaDiezmo.getText()));
                

            } else if (evento.getActionCommand().contentEquals("Pagar")) {
                
                modelo.pagar(parroquia.txtCédulaDiezmo.getText());
                Feligres f = modelo.buscar(parroquia.txtCédulaDiezmo.getText());
                
                if(f != null){
                    parroquia.txtValorDiezmo.setText(""+f.getDiezmo());
                }

            } else if (evento.getActionCommand().contentEquals("Totalizar")) {
                
                parroquia.jTextArea1.setText(""+modelo.totalizar());

            }

        } catch (Exception e) {

        }

    }

}
