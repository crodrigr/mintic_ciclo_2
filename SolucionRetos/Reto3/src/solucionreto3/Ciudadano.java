package solucionreto3;


public class Ciudadano extends Persona {

    private String cromosoma;

    public Ciudadano() {
    }

    public Ciudadano(String cromosoma, String nombres, String apellidos, String direccion, String telefono, String cedula) {
        super(nombres, apellidos, direccion, telefono, cedula);
        this.cromosoma = cromosoma;
    }

    

    public String getCromosoma() {
        return cromosoma;
    }

    public void setCromosoma(String cromosoma) {
        this.cromosoma = cromosoma;
    }
    
            
       
    @Override
    public void display(){
      System.out.println("Ciudadano: ");
      super.display();
      System.out.println("Cromosoma: "+this.cromosoma);
    
    }
    @Override   
    public void calcularCoincidencia(String dato) {
        double numCoincidencia=0;
        for(int i=0;i<this.cromosoma.length(); i++){
            if(this.cromosoma.charAt(i)==dato.charAt(i)){
              numCoincidencia++;            
            }
        
        }
        setPorcentajeCoincidencia((numCoincidencia*100)/this.cromosoma.length());
        
    }
    
}
