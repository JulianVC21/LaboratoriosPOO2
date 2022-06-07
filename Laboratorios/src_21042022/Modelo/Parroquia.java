/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.ArrayList;

/**
 *
 * @author julia
 */
public class Parroquia {
    
    ArrayList<Feligres> feligres = new ArrayList();
    int totalDiezmo;
    
    public void añadirFeligres(Feligres f){
        feligres.add(f);
        System.out.println("Feligres agregado");
    }
    
    public void eliminar(String cedula){
        for(int i=0; i<feligres.size(); i++){
            if(feligres.get(i).getCedula().equals(cedula)){
                feligres.remove(i);
                System.out.println("Feligres eliminado");
            }
        }
    }
    
    public Feligres buscar(String cedula){
        for(int i=0; i<feligres.size(); i++){
            if(feligres.get(i).getCedula().equals(cedula)){
                System.out.println("Feligres encontrado");
                return feligres.get(i);
            }
        }
        
        return null;
    }
    
    public int consultar(String cedula){
        
        for(int i=0; i<feligres.size(); i++){
            if(feligres.get(i).getCedula().equals(cedula)){
                System.out.println("Consulta hecha");
                return feligres.get(i).getDiezmo();
            }
        }
        return 0;
    }
    
    public void pagar(String cedula){
        for(int i=0; i<feligres.size(); i++){
            if(feligres.get(i).getCedula().equals(cedula)){
                if(!feligres.get(i).isPago()){
                    feligres.get(i).setPago(true);
                    totalDiezmo+=feligres.get(i).getDiezmo();
                    System.out.println("Pago registrado");
                }else{
                    System.out.println("El feligres ya ha pagado");
                }
            }
        }
    }
    
    public void actualizar(Feligres f, String cedula){
        Feligres act = buscar(cedula);
        if(!act.equals(null)){
            act.setNombre(f.getNombre());
            act.setDireccion(f.getDireccion());
            act.setEstrato(f.getEstrato());
            act.setEstado(f.getEstado());
            act.setTelefono(f.getTelefono());
        }else{
            System.out.println("no se pudo actualizar");
        }
    }
    
    public int totalizar(){
        return totalDiezmo;
    }
    
}
