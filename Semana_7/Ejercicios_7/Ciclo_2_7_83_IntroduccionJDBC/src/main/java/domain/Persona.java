package domain;

public class Persona {

    private int id;
    private String nombres;
    private String apellidos;
    private String cedula;
    private String direccion;
    private String telefono;
    private String cromosoma;

    public Persona() {
    }

    public Persona(int Id) {
        this.id = Id;
    }
    
     public Persona(String nombres, String apellidos, String cedula, String direccion, String telefono, String cromosoma) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.cedula = cedula;
        this.direccion = direccion;
        this.telefono = telefono;
        this.cromosoma = cromosoma;
    }

    public Persona(int id, String nombres, String apellidos, String cedula, String direccion, String telefono, String cromosoma) {
        this.id = id;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.cedula = cedula;
        this.direccion = direccion;
        this.telefono = telefono;
        this.cromosoma = cromosoma;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getCromosoma() {
        return cromosoma;
    }

    public void setCromosoma(String cromosoma) {
        this.cromosoma = cromosoma;
    }

    public void display() {
        System.out.println("Nombres: " + this.nombres);
        System.out.println("Apellidos: " + this.apellidos);
        System.out.println("Cedula: " + this.cedula);
        System.out.println("Dirección: " + this.direccion);
        System.out.println("Teléfono: " + this.telefono);
        System.out.println("Cromosoma: " + this.cromosoma+"\n");
    }

}

