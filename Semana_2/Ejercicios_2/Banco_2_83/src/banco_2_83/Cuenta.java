
package banco_2_83;

public class Cuenta {
    
    //Atributos
    private int numero;
    private String titular;
    private double saldo;
    
    //Metodos
    public Cuenta() {
    }

    public Cuenta(int numero, String titular, double saldo) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
    }
    
    public void deposito(double valor){
         this.saldo+=valor;       
    }
    
    public void retiro(double valor){
        
        if(this.saldo-valor>0){
         this.saldo-=valor;
        }else{
         System.out.println("Saldo insuficiente");
        }
        
    }
    
    public void setBonificacion(){
        if(this.saldo>500){
          this.saldo+=this.saldo*0.02;         
        }       
    }
    
    public void balance(){
     System.out.println("Datos de la cuenta:");
     System.out.println("Numero: "+this.numero);
     System.out.println("Titular: "+this.titular);
     System.out.println("Saldo: "+this.saldo);
     if(this.saldo<500){
      System.out.println("CUENTA POR DE BAJO DE LIMITE PERMITIDO");
     }else{
      System.out.println("CUENTA CON SALDOS NORMALES");
     }
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    
    
}
