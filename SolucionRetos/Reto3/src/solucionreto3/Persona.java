package solucionreto3;

public abstract class Persona {

    private String nombres;
    private String apellidos;
    private String direccion;
    private String telefono;
    private String cedula;
    private double porcentajeCoincidencia;

    public Persona() {
    }

    public Persona(String nombres, String apellidos, String direccion, String telefono, String cedula) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.direccion = direccion;
        this.telefono = telefono;
        this.cedula = cedula;
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

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public double getPorcentajeCoincidencia() {
        return porcentajeCoincidencia;
    }

    public void setPorcentajeCoincidencia(double porcentajeCoincidencia) {
        this.porcentajeCoincidencia = porcentajeCoincidencia;
    }

    public void display() {
        System.out.println("Nombres" + this.nombres);
        System.out.println("Apellidos" + this.apellidos);
        System.out.println("Dirección" + this.direccion);
        System.out.println("Teléfono" + this.telefono);
        System.out.println("Cedula" + this.cedula);
        System.out.println("Porcentaje coincidencia" + this.porcentajeCoincidencia);
    }
    
    public abstract void calcularCoincidencia(String dato);

}
