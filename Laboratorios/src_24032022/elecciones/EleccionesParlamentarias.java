/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elecciones;

import java.util.ArrayList;

/**
 *
 * @author julia
 */
public class EleccionesParlamentarias {
    
    static ArrayList<Candidato> senado = new ArrayList();
    static ArrayList<Candidato> camara = new ArrayList();
    
    public static void inscribirCandidato(Candidato candidato, String representacion){
        
        if(representacion.equals("senado")){
            candidato.setNumero("senado");
            senado.add(candidato);
        }else if(representacion.equals("camara")){
            candidato.setNumero("camara");
            camara.add(candidato);
        }
    }
    
    public static void mostrarSenado(){
        System.out.println("--------------------------------------------\n"
                + "REPRESENTANTES A SENADO");
        for(int i=0; i<senado.size(); i++){
            System.out.println(senado.get(i));
        }
    }
    
    public static void mostrarCamara(){
        System.out.println("--------------------------------------------\n"
                + "REPRESENTANTES A CAMARA");
        for(int i=0; i<camara.size(); i++){
            System.out.println(camara.get(i));
        }
    }
    
}
