
package ciclo_2_4_proyecto_banco_83;

public class Empleado extends Persona {
    //Atributos
    private String codigo;
    private String cargo;
    private Cuenta nomina;
    
    //Metodos

    public Empleado() {
    }

    public Empleado(String codigo, String cargo, Cuenta nomina, String nombres, String apellidos, String cedula, String direccion, String telefono) {
        super(nombres, apellidos, cedula, direccion, telefono);
        this.codigo = codigo;
        this.cargo = cargo;
        this.nomina = nomina;
    }

   

    @Override
    public void display(){
      super.display();
      System.out.println("Código: "+this.codigo);
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Cuenta getNomina() {
        return nomina;
    }

    public void setNomina(Cuenta nomina) {
        this.nomina = nomina;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    
    
    
    
       
}
