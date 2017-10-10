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
public class Programador extends Empleado{
    private String lenguaje;
    public Programador(String lenguaje,String nombre,int id, int salario) {
        super(id, nombre, salario);
        this.lenguaje = lenguaje;
    }

    @Override
    public double calculaSalario() {
        if(this.lenguaje.equals("java")){
            return (this.salario + this.salario*0.1);
        }else{
            return this.salario;
        }
    }

    @Override
    public String toString() {
        return super.toString()+"Programador{" + "lenguaje=" + lenguaje + '}';
    }
    
}
