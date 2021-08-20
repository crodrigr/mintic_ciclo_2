
package ciclo_2_w2_75;

public class Ciudadano extends Persona {
    
     private String cromosoma;
     private double porcentajeCoincidencia;

    public Ciudadano(String a, String b, String c) {
        super(a, b);
        this.cromosoma=c;
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
    public void display(){
      super.display();
      System.out.println("Cromosoma: "+this.cromosoma);
      System.out.println("Porcentaje de coincidencia: "+this.porcentajeCoincidencia);
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
