
package ciclo_2_3_75_empleado_polimorfismo;

public abstract class  Empleado {
    //Atributos
    private String nombres;
    private String apellidos;
    private String cedula;
    
    //Metodos
    public Empleado() {
    }
    
    public Empleado(String nombres, String apellidos, String cedula) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.cedula = cedula;
    }
    
    public void display(){
      System.out.println("Nombres: "+this.nombres);
      System.out.println("Apellidos: "+this.apellidos);
      System.out.println("Cedula: "+this.cedula); 
    }
    
    public abstract  double ingresos();

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }
    
    
    
    
    
}
