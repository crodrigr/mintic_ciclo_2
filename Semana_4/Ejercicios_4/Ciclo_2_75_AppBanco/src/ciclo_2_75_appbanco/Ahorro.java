
package ciclo_2_75_appbanco;

public class Ahorro extends Cuenta {
    
    @Override
    public void display(){
      System.out.println("Cuenta de Ahorros");
      super.display();
      
    }

    @Override
    public void calcularIntereses() {
       this.consignar(this.getSaldo()*(this.getPorcentajeInteres()/100));
    }
    
}
