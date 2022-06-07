/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import Control.Controlador;
import Modelo.Parroquia;
import laboratorioparroquia.Vista;

/**
 *
 * @author julia
 */
public class ParroquiaMain {
    
    public static void main(String[] args) {
        Parroquia p = new Parroquia();
        Vista v = new Vista();
        v.setVisible(true);
        
        Controlador c = new Controlador(v,p);
        
    }
    
}
