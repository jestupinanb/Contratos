/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contratomain;

import java.util.ArrayList;

/**
 *
 * @author Estudiante
 */
public class ContratoMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Consultor consultor  = new Consultor("POO",1);
        Administrador admin = new Administrador("Valeria",220,2);
        Programador programador = new Programador("java","isabel",500,3);
        Programador programador2 = new Programador("c","fabian",600,4);
        LiderProyecto lider = new LiderProyecto("java","hernan",600,5);
        lider.addProgramdor(programador);
        lider.addProgramdor(programador);
        CompaniaSoftware compania = new CompaniaSoftware("unal");
        compania.addContrato(consultor);
        compania.addContrato(admin);
        compania.addContrato(programador);
        compania.addContrato(programador2);
        compania.addContrato(lider);
        
        String datosCompania = compania.listarInformacion();
        System.out.println(datosCompania);
        double valorNomina = compania.calcularNomina();
        System.out.println("Valor Nomina "+ valorNomina);
        
        ArrayList<Contrato> contratos = compania.reportarNomina();
        
        for(Contrato contrato: contratos){
            if(contrato instanceof Consultor){
            Consultor _consultor = (Consultor)contrato;
            System.out.println("Consultor "+_consultor.getLabor());
            }
            else if(contrato instanceof Administrador){
                
            }
            else if(contrato instanceof Programador){
            }
            else if(contrato instanceof LiderProyecto){
            }
        };
    }
    
}
