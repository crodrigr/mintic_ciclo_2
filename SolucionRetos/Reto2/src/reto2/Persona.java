package reto2;


public class Persona {
    //Atributos
    private String nombres;
    private String apellidos;
    private String direccion;
    private String telefono;
    private String cromosoma;
    private double porcentajeCoincidencia;
    
    //Metodos

    public Persona() {
    }

    public Persona(String nombres, String apellidos, String direccion, String telefono, String cromosoma) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.direccion = direccion;
        this.telefono = telefono;
        this.cromosoma = cromosoma;
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

    public String getCromosoma() {
        return cromosoma;
    }

    public void setCromosoma(String cromosoma) {
        this.cromosoma = cromosoma;
    }

    public double getPorcentajeCoincidencia() {
        return porcentajeCoincidencia;
    }

    public void setPorcentajeCoincidencia(double porcentajeCoincidencia) {
        this.porcentajeCoincidencia = porcentajeCoincidencia;
    }

    public void calcularCoincidencia(String dato){
         double numCoincidencias=0;
         for(int i=0;i<this.cromosoma.length();i++){
             if(this.cromosoma.charAt(i)==dato.charAt(i)){
                numCoincidencias++;
             }
         }
        this.porcentajeCoincidencia=(numCoincidencias*100)/this.cromosoma.length();
    }
    
    public void display(){
      System.out.println("Nombres: "+this.nombres);
      System.out.println("Apellidos: "+this.apellidos);
      System.out.println("Direcccio: "+this.direccion);
      System.out.println("Telefono: "+this.telefono);
      System.out.println("Cromosoma: "+this.cromosoma);
      System.out.println("Porcentaje de coincidencia: "+this.porcentajeCoincidencia+"\n");      
    }
    
}
