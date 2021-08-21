package solucionreto3;

import java.util.ArrayList;
import java.util.Scanner;

public class SDP_Reto3 {

    static Scanner leer = new Scanner(System.in);
    static String[] alfabeto={"A","B","C","D","E","F","G","H","I"};

    public static void main(String[] args) {
        ArrayList<Persona> personas = new ArrayList<Persona>();
       
        loadData(personas);
        int opcion = 0;
        do {
            opcion = menu();
            switch (opcion) {
                case 1:
                    String pass=null;
                    System.out.println("Ingrese password del SPD");
                    pass=leer.next();
                    getAccesoSDP(personas,pass);
                    break;
                case 2:
                    System.out.println("Ingrese el cromosoma de la escena del crimen");
                    String crom=leer.next();
                    getCulpableCrimen(personas,crom);
                    break;
            }

        } while (opcion >= 1 && opcion < 3);

    }
    
    public static void getCulpableCrimen(ArrayList<Persona> personas,String cromosoma){
        double mayorPorcentaje=0;
        int posMayor=-1;
        for(int i=0;i<personas.size();i++){
            Persona p=personas.get(i);            
            if(p instanceof Ciudadano){
               p.calcularCoincidencia(cromosoma);
               if(mayorPorcentaje<p.getPorcentajeCoincidencia()){
               posMayor=i;
               mayorPorcentaje=p.getPorcentajeCoincidencia();
               }
            }
        }
        if(posMayor!=-1){
           System.out.println("El culpable es: ");
           personas.get(posMayor).display();
        }      
    
    
    }
    
    public static void getAccesoSDP(ArrayList<Persona> personas,String password){
        int sw=0;
        for(int i=0;i<personas.size();i++){
            Persona p=personas.get(i);            
            if(p instanceof Policia){
               p.calcularCoincidencia(password);
               if(p.getPorcentajeCoincidencia()==100){
                  System.out.println("Bienvenido al SDP: ");
                  p.display();
                  sw=1;
               }
            }
        }
        if(sw==0){
        System.out.println("Password invalido o no existe funcionario el SDP");
        }
        
    
    }

    public static int menu() {
        System.out.println("___MENU____");
        System.out.println("___1.Acceso funcionario SDP____");
        System.out.println("___2.Cromosomas coincidencia____");
        System.out.println("___3.Salir____");
        int op = leer.nextInt();
        return op;
    }

    public static void loadData(ArrayList<Persona> personas) {
        Persona c1 = new Ciudadano("00000", "Camilo Ernesto", "Duarte Rangel", "Calle 58 No 89-92", "3145588", "1254887");
        Persona c2 = new Ciudadano("11000", "Lizeth Johanna", "Villamizar Perez", "cra 58 No 89-92", "3005588", "5554887");
        Persona c3 = new Ciudadano("00110", "Juan Camilo", "Montoya Rangel", "Av 57 No 89-92", "3005588", "6694887");
        Persona c4 = new Ciudadano("00001", "Diego Fernando", "Rangel Pinto", "Cra 96 No 89-92", "3145588", "22224887");
        Persona c5 = new Ciudadano("01000", "Juan Carlos", "Camargo Rangel", "Calle 58 No 89-92", "3145588", "7777887");
        Persona p1 = new Policia("ABEFG", "Julian David", "Duarte Rangel", "Calle 58 No 89-92", "3145588", "1254887");
                                 //11223
        Persona p2 = new Policia("AABBC", "Sergio", "Villamizar Perez", "cra 58 No 89-92", "3005588", "5554887");
                                 //22331
        Persona p3 = new Policia("BBCCA", "Jairo", "Montoya Rangel", "Av 57 No 89-92", "3005588", "6694887");
                                 // 33884
        Persona p4 = new Policia("CCIIE", "Sivio Rafael", "Rangel Pinto", "Cra 96 No 89-92", "3145588", "22224887");
        Persona p5 = new Policia("AACCE", "John Jairo", "Camargo Rangel", "Calle 58 No 89-92", "3145588", "7777887");
        personas.add(c1);
        personas.add(c2);
        personas.add(c3);
        personas.add(c4);
        personas.add(c5);
        personas.add(p1);
        personas.add(p2);
        personas.add(p3);
        personas.add(p4);
        personas.add(p5);

    }

}
