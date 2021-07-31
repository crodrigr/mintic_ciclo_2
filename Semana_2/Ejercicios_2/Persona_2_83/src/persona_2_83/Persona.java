package persona_2_83;




public class Persona {
    
    //Atributos
    public String nombres;
    public String apellidos;
    
    //Metodos
    public Persona(){
    }

    public Persona(String nombres, String apellidos) {
        this.nombres = nombres;
        this.apellidos = apellidos;
    }
    
    public String getNombreCompleto(){
       return nombres+" "+apellidos;
     
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

    
    
    
    
}
