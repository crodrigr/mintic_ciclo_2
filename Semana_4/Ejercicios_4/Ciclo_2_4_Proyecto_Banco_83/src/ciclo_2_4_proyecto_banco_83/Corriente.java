package ciclo_2_4_proyecto_banco_83;

public class Corriente extends Cuenta {

    public Corriente() {
    }

    public Corriente(int numero, double saldo, double porcentajeInteres) {
        super(numero, saldo, porcentajeInteres);
    }
    
    

    @Override
    public void display() {
        System.out.println("Cuenta de Corriente:");
        super.display();
    }

    @Override
    public void calcularInteres() {
        this.setSaldo(this.getSaldo() + (this.getSaldo() * this.getPorcentajeInteres() / 100) * 0.015);
    }

}
