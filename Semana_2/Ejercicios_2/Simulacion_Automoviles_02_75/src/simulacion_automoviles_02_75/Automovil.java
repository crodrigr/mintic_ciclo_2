
package simulacion_automoviles_02_75;

public class Automovil {
    
    //Atributos
    public String  marca;
    public String  color;
    public String  placa;
    public int     cilindraje;
    public boolean encendido;
    public int     velocidad;
    
    
    //metodos    
    public Automovil(){
    }

    public void encenderMotor(){
       
         if(this.encendido==true){
            System.out.println("Ya esta encendido el motor");  
         }else{
            this.encendido=true;
             System.out.println("El motor se puso en marcha");  
         }
    
    }
    
   
    
    public Automovil(String marca, String color, String placa, int cilindraje) {
        this.marca = marca;
        this.color = color;
        this.placa = placa;
        this.cilindraje = cilindraje;
        this.encendido=false;
        this.velocidad=0;
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

    public boolean isEncendido() {
        return encendido;
    }

    public void setEncendido(boolean encendido) {
        this.encendido = encendido;
    }
    
    
    
    
    
    
    
}
