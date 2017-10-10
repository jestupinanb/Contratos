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
public class Consultor extends Contrato{
    String labor;

    public Consultor(String labor,int id) {
        super(id);
        this.labor = labor;
    }
    
    
    @Override
    public double calculaSalario() {
        return 220;
    }

    public String getLabor() {
        return labor;
    }

    public void setLabor(String labor) {
        this.labor = labor;
    }

    @Override
    public String toString() {
        return "Consultor{" + "labor=" + labor + '}';
    }
    
}
