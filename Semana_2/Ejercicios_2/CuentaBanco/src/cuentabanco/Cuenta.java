
package cuentabanco;

public class Cuenta {
    
    //Atributos
    public int numero;
    public String titular;
    public double saldo;
    
    public  Cuenta(){
    }
    
    public Cuenta(int numero, String titular, double saldo) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
    }

    
    public void retiro(double valor){
        if(valor<=saldo){  
          saldo=saldo-valor;
        }else{
          System.out.println("El valor a retirar no puede ser mayor que el saldo.");  
        } 
    
    }
     public void deposito(double valor){
        
         saldo=saldo+valor; 
       
    
    }
     
    public void balance(){
       System.out.println("-----Balance de la Cuenta------");
       System.out.println("Numero cuenta: "+numero);
       System.out.println("Titular: "+titular);
       System.out.println("Saldo: "+saldo);
       if(saldo<500){
            System.out.println("CUENTA POR DE BAJO DEL LIMITE PERMITIDO");
       }else{
            System.out.println("CUENTA CON SALDOS NORMALES");
       }
    
    
    }
     
    public void aplicarBonificacion(){
        
        if(saldo>=500){
          saldo=saldo+(saldo*0.02);
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
