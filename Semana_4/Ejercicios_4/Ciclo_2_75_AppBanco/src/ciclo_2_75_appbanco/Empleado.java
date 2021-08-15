
package ciclo_2_75_appbanco;

public class Empleado extends Persona {
    //Atributos
    private String codigo;
    
    //Metodos

    public Empleado() {
    }   
    
    public Empleado(String codigo, String nombres, String apellidos, String cedula, String direccion, String telefono) {
        super(nombres, apellidos, cedula, direccion, telefono);
        this.codigo = codigo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    
    @Override
    public void display(){
      super.display();
      System.out.println("Codigo: "+this.codigo);
    }
    
    
}
