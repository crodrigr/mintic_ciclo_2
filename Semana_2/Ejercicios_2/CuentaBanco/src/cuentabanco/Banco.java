
package cuentabanco;


public class Banco {
    public static void main(String[] args) {
        
        Cuenta cuenta1=new Cuenta(101,"Camilo Rodriguez",1000);
        Cuenta cuenta2=new Cuenta(102,"Juan Perez",200);
        
        cuenta1.balance();
        cuenta1.deposito(500);
        cuenta1.balance();
        cuenta1.retiro(1000);
        cuenta1.balance();
        cuenta1.aplicarBonificacion();
        cuenta1.balance();
       
    }
    
}
