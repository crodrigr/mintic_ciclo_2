
package ciclo_2_75_appbanco;

public class Corriente extends Cuenta{
    
    @Override
    public void display(){
      System.out.println("Cuenta de Corriente");
      super.display();      
    }

    @Override
    public void calcularIntereses() {
      this.consignar(this.getSaldo()*(this.getPorcentajeInteres()/100)*2); 
    }
    
}
