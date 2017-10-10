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
public class CompaniaSoftware {
    private String nombre;
    private ArrayList<Contrato> contratos;
    
    public CompaniaSoftware(String nombre){
        this.nombre = nombre;
        this.contratos = new ArrayList<>();
    };
    
    public boolean addContrato(Contrato contrato){
        return this.contratos.add(contrato);
    };
    
    public double calcularNomina(){
        double totalNomina = 0;
        for(Contrato contrato:contratos){
            totalNomina += contrato.calculaSalario();
        };
        return totalNomina;
    };
    
    public ArrayList<Contrato> reportarNomina(){
        return this.contratos;
    };
    
    public String listarInformacion(){
        String aux = "";
        for(Contrato contrato: contratos){
            aux+=contrato.toString();
        }
        return aux;
    }
}
