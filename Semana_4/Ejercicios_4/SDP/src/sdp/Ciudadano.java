package sdp;

public class Ciudadano extends Persona{
    
    private String cromosoma;

    public Ciudadano() {
    }

    public Ciudadano(int id,String cromosoma, String nombres, String apellidos, String direccion, String telefono, String cedula) {
        super(id, nombres, apellidos, direccion, telefono, cedula);
        this.cromosoma = cromosoma;
    }

    
   

    public String getCromosoma() {
        return cromosoma;
    }

    public void setCromosoma(String cromosoma) {
        this.cromosoma = cromosoma;
    }
    
    
    
}
