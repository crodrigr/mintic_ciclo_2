
package ciclo_2_3_75_empleado_polimorfismo;

public class EmpleadoAsalariado extends Empleado {
    
    //Atributos
    private double salarioSemanal;
    
    
    //Metodos    

    public EmpleadoAsalariado() {
    }

    public EmpleadoAsalariado(double salarioSemanal, String nombres, String apellidos, String cedula) {
        super(nombres, apellidos, cedula);
        this.salarioSemanal = salarioSemanal;
    }
      

    public double getSalarioSemanal() {
        return salarioSemanal;
    }

    public void setSalarioSemanal(double salarioSemanal) {
        this.salarioSemanal = salarioSemanal;
    }
    
    @Override
    public void display(){
      super.display();
      System.out.println("Salario semanal: "+getSalarioSemanal());
    }
    
    @Override
    public double ingresos() {     
        
       return this.getSalarioSemanal()*4;
    }
    
}
