
package simulacion_vehiculos_2_83;

public class Automovil {
    
    //Atributos
    private String  marca;
    private String  color;
    private String  placa;
    private int     cilindraje;
    private boolean motor;
    private int     velocidad;
    
    
    //Metodos    
    public Automovil(){
    }

    public Automovil(String marca, String color, String placa, int cilindraje) {
        this.marca = marca;
        this.color = color;
        this.placa = placa;
        this.cilindraje = cilindraje;
        this.motor=false;
        this.velocidad=0;
        
    }
    
    public void acelerar(int valor){
       this.velocidad+=valor;     
    }
    
    public void frenar(int valor){
       if(this.velocidad-valor<=0){
          this.velocidad=0;
       }else{    
       this.velocidad-=valor;
       }
    }
    
    public void encender(){
      
        if(this.motor!=true){ 
        this.motor=true;
        System.out.println("Motor se puso en marcha el auto: "+this.placa);
        }else{
        System.out.println("Ojo! el Motor ya está en marcha el auto: "+this.placa);
        }
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(int cilindraje) {
        this.cilindraje = cilindraje;
    }

    public boolean isMotor() {
        return motor;
    }

    public void setMotor(boolean motor) {
        this.motor = motor;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        if(velocidad>=0){
        this.velocidad = velocidad;
        }else{
        this.velocidad=0;
        System.out.println("La velocidad debe ser mayor o igual a cero");
        }
    }
    
    
    
    
    
    
    
}
