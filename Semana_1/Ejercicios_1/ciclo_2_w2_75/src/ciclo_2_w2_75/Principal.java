package ciclo_2_w2_75;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
    
    static Scanner leer=new Scanner(System.in);
    public static void main(String[] args) {
        ArrayList<Persona> personas=new ArrayList<Persona>();
        loadData(personas);
        System.out.println("Ingrese el cromosoma de la escena del crimen");
        String cromo=leer.next();
        getCoincidendia(personas,cromo);
    }
                                                                          //00101
    public static void getCoincidendia(ArrayList<Persona> personas,String cromosoma){
    
       for(Persona p  :  personas ){
           if(p instanceof Ciudadano){
              ((Ciudadano) p).calcularCoincidencia(cromosoma);
               p.display(); //polimorfismo
           }
       
       }
    
    }

    public static void loadData(ArrayList<Persona> personas) {
        Persona p1 = new Ciudadano("Camilo Ernesto", "Rodriguez Moreno", "00001");
        Persona p2 = new Ciudadano("Sandra Viviana", "Moreno Delgado", "00011");
        Persona p3 = new Ciudadano("Diego Fernando", "Rangel Perez", "00111");
        Persona p4 = new Policia("Daniel ", "Pinto","FABCH");
        Persona p5 = new Policia("Elizana ", "Villamizar","FAECH");
        personas.add(p1);
        personas.add(p2);
        personas.add(p3);
        personas.add(p4);
        personas.add(p5);
    }

}
