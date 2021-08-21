package ciclo_2_4_proyecto_banco_83;

public abstract class Cuenta {

    //Atributos
    private int numero;
    private double saldo;
    private double porcentajeInteres;
    private boolean estado;

    //Metodos
    public Cuenta() {
    }

    public Cuenta(int numero, double saldo, double porcentajeInteres) {
        this.numero = numero;
        this.saldo = saldo;
        this.porcentajeInteres = porcentajeInteres;
        this.estado=true;
    }

    

    public double getPorcentajeInteres() {
        return porcentajeInteres;
    }

    public void setPorcentajeInteres(double porcentajeInteres) {
        this.porcentajeInteres = porcentajeInteres;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    public void cerrar(){
       this.estado=false;
       this.saldo=0;
    }
    
    public void consignar(double valor){
        this.saldo+=valor;
    }
    
    public void retirar(double valor){
         if(valor<=this.saldo){
            this.saldo-=valor;
         }else{
           System.out.println("Fondos no suficientes");
         }
    }

    public void display() {
        System.out.println("Numero: " + this.numero);
        System.out.println("Saldo: " + this.saldo);
        System.out.println("Interes: " + this.porcentajeInteres);
        System.out.println("Estado: "+this.estado);
    }
    
    public abstract void calcularInteres();
     
}
