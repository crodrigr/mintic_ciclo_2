
package ciclo_2_5_83_spd_ver_grafica;

public class Ciudadano extends Persona{
    
    private String cromosoma;

    public Ciudadano() {
    }
    
       public Ciudadano(String cromosoma, int id, String nombres, String apellidos,String direccion ,String telefono,String cedula ) {
            super(id, nombres, apellidos, cedula, direccion, telefono);
        this.cromosoma = cromosoma;
    }

    public String getCromosoma() {
        return cromosoma;
    }

    public void setCromosoma(String cromosoma) {
        this.cromosoma = cromosoma;
    }
       
       

    @Override
    public void calcularCoincidencia(String dato) {
       
    }
    
}
