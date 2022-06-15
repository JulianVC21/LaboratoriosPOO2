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
        Departamento ns = new Departamento("Norte de Santander", 5);
        Departamento cun = new Departamento("Cundinamarca", 8);
        
        PartidoPolitico liberal = new PartidoPolitico("Partido Liberal", "1930", ns);
        PartidoPolitico conservador = new PartidoPolitico("Partido Conservador", "1928", ns);
        
        EleccionesParlamentarias.inscribirPartido(liberal);
        EleccionesParlamentarias.inscribirPartido(conservador);
        
        EleccionesParlamentarias.inscribirCandidato(new Candidato("pablo", "pablo@gmail.com", 123234234, 31314233, 'm', liberal,4231), "senado");
        EleccionesParlamentarias.inscribirCandidato(new Candidato("pepe", "pepe@gmail.com", 36784287, 6782332, 'm', conservador, 2182), "camara");
        
        EleccionesParlamentarias.mostrarSenado();
        EleccionesParlamentarias.mostrarCamara();
        EleccionesParlamentarias.votosPorPartido();
    }
    
}
