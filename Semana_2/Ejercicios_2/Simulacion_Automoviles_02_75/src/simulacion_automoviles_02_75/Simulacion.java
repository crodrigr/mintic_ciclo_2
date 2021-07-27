package simulacion_automoviles_02_75;

public class Simulacion {

    public static void main(String[] args) {
        Automovil au1 = new Automovil("Mercedez","Rojo","FMS012",220);
        Automovil au2 = new Automovil("BMW","Blanco","GRS250",220);
        Automovil au3 = new Automovil("Mercedez","Negro","FSO761",220);
        System.out.println("Encender motores");
        au1.encenderMotor();
        au2.encenderMotor();
        au3.encenderMotor();
        for(int i=0;i<5;i++){
            //au1
            if(getAcelerarFrenar()==2){
                 au1.acelerar(getVelocidad());            
            }else{
                 au1.frenar(getVelocidad()); 
            }
            //au2
            if(getAcelerarFrenar()==2){
                 au2.acelerar(getVelocidad());            
            }else{
                 au2.frenar(getVelocidad()); 
            }
            //au3
            if(getAcelerarFrenar()==2){
                 au3.acelerar(getVelocidad());            
            }else{
                 au3.frenar(getVelocidad()); 
            }
        }
        printGanador(au1,au2,au3);
        printVelocidadTodos(au1,au2,au3);
        
    }
    
    public static void printVelocidadTodos(Automovil a,Automovil b,Automovil c){
        System.out.println("Velocidad de Au1: "+a.getVelocidad());
        System.out.println("Velocidad de Au2: "+b.getVelocidad());
        System.out.println("Velocidad de Au3: "+c.getVelocidad());
    }
    
    public static void printGanador(Automovil a,Automovil b,Automovil c){
       
        //Ganador a  &&(and)  || (or) 
        if( a.getVelocidad()>b.getVelocidad() && a.getVelocidad() > c.getVelocidad()){
           System.out.println("El ganador es automovil Au1");
        }
        //Ganador b
         if( b.getVelocidad()>a.getVelocidad() && b.getVelocidad() > c.getVelocidad()){
           System.out.println("El ganador es automovil Au2");
        }
        //Ganador c
         if( c.getVelocidad()>a.getVelocidad() && c.getVelocidad() > b.getVelocidad()){
           System.out.println("El ganador es automovil Au3");
        }
        
    
    
    }
    
    public static int getAcelerarFrenar(){
        return (int)(Math.random()*2+1);
      
    }
    
    public static int getVelocidad(){
        return (int)(Math.random()*50+1);
      
    }
    
}
