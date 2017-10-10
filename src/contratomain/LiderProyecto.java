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
public class LiderProyecto extends Programador {
    public ArrayList<Programador> programadores;
    
    public LiderProyecto(String lenguaje, String nombre,int id, int salario) {
        super(lenguaje,nombre,id, salario);
        this.programadores = new ArrayList<>();
    }
    
    public double calcularSalario(){
        return this.salario + (this.salario*0.1*this.programadores.size());
    }
    
    public boolean addProgramdor(Programador programador){
        return programadores.add(programador);
    };

    @Override
    public String toString() {
        String aux = "";
        aux+=super.toString() + " a cargo de ";
        for(Programador programador:programadores){
            aux+= programador.toString();
        }
        return aux;
    }
    
    
}
