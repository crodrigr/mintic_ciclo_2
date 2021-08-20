
package ciclo_2_w2_75;

public class Policia extends Persona{

    private String placa;

    public Policia(String placa, String a, String b) {
        super(a, b);
        this.placa = placa;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }
    
        
    
    @Override
    public void calcularCoincidencia(String dato) {
        
    }
    
}
