package reto2;

import java.util.ArrayList;
import java.util.Scanner;

public class Reto2 {

    static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<Persona> personas = new ArrayList<Persona>();
        loadData(personas);
        mostrarPersonas(personas);
        System.out.println("Ingrese el cromosoma de la escena del crimen");
        String dato=leer.next();
        getCulpable(personas,dato);

    }

    public static void loadData(ArrayList<Persona> personas) {
        Persona p1 = new Persona("Camilo Ernesto", "Rodriguez Moreno", "Call 20 no 78-98", "31528887", "00000000000000000000");
        Persona p2 = new Persona("Lizeth Johanna", "Pinto Perez", "Call 35 no 98-23", "315025555", "11000000000000000011");
        Persona p3 = new Persona("Digo Fernando", "Rangel Moreno", "Call 220 no 45-988", "30028887", "11100000000000000111");
        personas.add(p1);
        personas.add(p2);
        personas.add(p3);
    }
    
    public static void mostrarPersonas(ArrayList<Persona> personas){
          System.out.println("Listado de Personas: \n");
          for(Persona p : personas){
              p.display();
          }
    
    }
    
    public static void getCulpable(ArrayList<Persona> personas, String dato){
            double mayorPorcentaje=0;
            int posMayor=-1;
            for(int i=0;i<personas.size();i++){
                Persona p=personas.get(i);
                p.calcularCoincidencia(dato);
                if(mayorPorcentaje<p.getPorcentajeCoincidencia()){
                   mayorPorcentaje=p.getPorcentajeCoincidencia();
                   posMayor=i;
                }
            }
            if(posMayor!=-1){
               System.out.println("La persona culpable es con un porcentaje de:"+mayorPorcentaje +"\n");
               personas.get(posMayor).display();
            }else{
               System.out.println("No se encontro culpable \n");
            }
            
            
        
    
    }

}
