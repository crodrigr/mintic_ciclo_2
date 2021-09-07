package ciclo2__7_sdp_grafico_75;

public class Ciudadano extends Persona {
   
    private String cromosoma;
    private double porcentajeCoincidencia;

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
    public double getPorcentajeCoincidencia() {
        return porcentajeCoincidencia;
    }

    public void setPorcentajeCoincidencia(double porcentajeCoincidencia) {
        this.porcentajeCoincidencia = porcentajeCoincidencia;
    }
       
    @Override
    public void calcularCoincidencia(String dato) {
          double numCoincidencias=0;
         for(int i=0;i<this.cromosoma.length(); i++    ){
                if(this.cromosoma.charAt(i)==cromosoma.charAt(i) ){
                   numCoincidencias++;
                }
           }
        porcentajeCoincidencia=(numCoincidencias/100)*100;
    }
    
}
