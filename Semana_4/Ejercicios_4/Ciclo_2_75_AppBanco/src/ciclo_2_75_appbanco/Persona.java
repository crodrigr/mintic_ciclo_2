
package ciclo_2_75_appbanco;
public class Persona {
    //Atributos
    private String nombres;
    private String apellidos;
    private String cedula;
    private String direccion;
    private String telefono;

    public Persona() {
    }
    
    public Persona(String nombres, String apellidos, String cedula, String direccion, String telefono) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.cedula = cedula;
        this.direccion = direccion;
        this.telefono = telefono;
    }

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

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    public void display(){
       System.out.println("Nombre: "+this.nombres);
       System.out.println("Apellidos: "+this.apellidos);
       System.out.println("Cedula: "+this.cedula);
       System.out.println("Dirección: "+this.direccion);
       System.out.println("Teléfono: "+this.telefono);       
    }
    
    
    
    
}
