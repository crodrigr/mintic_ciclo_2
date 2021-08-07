package ciclo_2_3_75_interfaces;
 
import java.util.ArrayList;

public class App {
    
    
    public static void main(String[] args) {               
        ArrayList<AccionesGeneral> acciones=new ArrayList<AccionesGeneral>();
        
        Hombre h=new Hombre(10,23,"Juan");
        Mujer m=new Mujer(20,25,"Maria");
        Perro p=new Perro("Pekines","perro","mascota");
        Gato g=new Gato("negro","gato","mascota");
        
        acciones.add(h);
        acciones.add(m);
        acciones.add(p);
        acciones.add(g);
        
        for(AccionesGeneral a : acciones ){
           System.out.println("--------------");
           a.display();
           a.hablar();
           a.alimentarse();
           a.desplazarse();
           a.jugar();
           a.dormir();
        }
        
    } 
}
