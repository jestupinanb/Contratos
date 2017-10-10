/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contratomain;

/**
 *
 * @author Estudiante
 */
public abstract class Contrato {
    protected int id;
    
    public Contrato(int id){
        this.id = id;
    };
    
    public abstract double calculaSalario();
    
    public int getId(){
        return id;
    };
}
