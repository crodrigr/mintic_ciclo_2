package simulacion_vehiculos_2_83;

public class Simulacion {

    public static void main(String[] args) {

        Automovil a1 = new Automovil("Mercedez", "Blanco", "FSO659", 220);
        Automovil a2 = new Automovil("BMW", "Rojo", "ASC652", 220);
        Automovil a3 = new Automovil("Mercedez", "Negro", "UIL587", 220);
        a1.encender();
        a2.encender();
        a3.encender();
        
        a1.setVelocidad(-20);
        mostrarAuto(a1);
        

        for(int i=0;i<4;i++){            
            if(getOpcion()==1){
               a1.acelerar(getVelocidad());
            }else{
               a1.frenar(getVelocidad()); 
            }
            
            if(getOpcion()==1){
               a2.acelerar(getVelocidad());
            }else{
               a2.frenar(getVelocidad()); 
            }
            
            if(getOpcion()==1){
               a3.acelerar(getVelocidad());
            }else{
               a3.frenar(getVelocidad()); 
            }
        }
        
        mostrarAuto(a1);
        mostrarAuto(a2);
        mostrarAuto(a3);
        
        if(a1.getVelocidad()>a2.getVelocidad() && a1.getVelocidad() > a3.getVelocidad()){
           System.out.println("El ganador es: ");
           mostrarAuto(a1);
        }
        if(a2.getVelocidad()>a1.getVelocidad() && a2.getVelocidad() > a3.getVelocidad()){
           System.out.println("El ganador es: ");
           mostrarAuto(a2);
        }
        if(a3.getVelocidad()>a2.getVelocidad() && a3.getVelocidad() > a1.getVelocidad()){
           System.out.println("El ganador es: ");
           mostrarAuto(a3);
        }
    }
    
    public static void mostrarAuto(Automovil a){
      System.out.println("Marca: "+a.getMarca()+"Color: "+a.getColor()+" Placa: "+a.getPlaca()+" Cilindraje: "+a.getCilindraje()+" Velocidad: "+a.getVelocidad());
    }
    
    public static int getOpcion(){
      return (int)(Math.random()*2+1);
    }
    
    public static int getVelocidad(){
      return (int)(Math.random()*50+1);
      
    }

}
