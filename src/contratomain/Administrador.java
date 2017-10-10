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
public class Administrador extends Empleado{

    public Administrador(String nombre, int salario,int id) {
        super(id,nombre,salario);
    }

    @Override
    public double calculaSalario() {
        return 100;
    }

    @Override
    public String toString() {
        return "Administrador{" + '}';
    }
    
}
