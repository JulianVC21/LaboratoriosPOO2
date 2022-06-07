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
public class EleccionesMain {
    
    public static void main(String[] args) {
        PartidoPolitico liberal = new PartidoPolitico("Partido Liberal", "1930");
        PartidoPolitico conservador = new PartidoPolitico("Partido Conservador", "1928");
        
        EleccionesParlamentarias.inscribirCandidato(new Candidato("pablo", "pablo@gmail.com", 123234234, 31314233, 'm', liberal), "senado");
        EleccionesParlamentarias.inscribirCandidato(new Candidato("pepe", "pepe@gmail.com", 36784287, 6782332, 'm', conservador), "camara");
        
        EleccionesParlamentarias.mostrarSenado();
        EleccionesParlamentarias.mostrarCamara();
    }
    
}
