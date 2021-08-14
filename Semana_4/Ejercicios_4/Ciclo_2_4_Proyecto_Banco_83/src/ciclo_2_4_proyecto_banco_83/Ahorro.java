
package ciclo_2_4_proyecto_banco_83;

public class Ahorro extends Cuenta{

    public Ahorro(){
    }

    public Ahorro(int numero, double saldo, double porcentajeInteres) {
        super(numero, saldo, porcentajeInteres);
    }
    
    
    
    
    
    @Override
    public void display(){
       System.out.println("Cuenta de Ahorros:");
       super.display();
    }
   
    
    @Override
    public void calcularInteres() {
       this.setSaldo(this.getSaldo()+(this.getSaldo()*this.getPorcentajeInteres()/100));
    }
    

    
}
