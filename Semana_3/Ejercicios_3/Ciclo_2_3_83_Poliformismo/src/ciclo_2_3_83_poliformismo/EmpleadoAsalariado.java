/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ciclo_2_3_83_poliformismo;

public class EmpleadoAsalariado extends Empleado {
    
    private double salarioSemanal;

    public double getSalarioSemanal() {
        return salarioSemanal;
    }

    public void setSalarioSemanal(double salarioSemanal) {
        this.salarioSemanal = salarioSemanal;
    }

    public EmpleadoAsalariado() {
    }

    public EmpleadoAsalariado(double salarioSemanal, String nombre, String apellido, String cedula) {
        super(nombre, apellido, cedula);
        this.salarioSemanal = salarioSemanal;
    }
    
//    @Override
    public void display(){
      super.display();
      System.out.println("Salario semanal: " + this.salarioSemanal);
    }

    @Override
    public double ingresos() {
        return 0.d;
    }
    
}
