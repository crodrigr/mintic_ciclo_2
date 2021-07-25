package ciclo_02;

import java.util.Scanner;

public class reto1_11 {
    
    //Variables Globales
    static Scanner leer=new Scanner(System.in);//variable global
    static int size=3;

    public static void main(String[] arg) {
        
        String personas[] = new String[size];//definicion e inialización de personas
        String cromosomas[] = new String[size];//definicion e inialización de cromosomas
        loadData(personas,cromosomas);
        printData(personas,cromosomas);
        
        System.out.println("Ingrese el cromosoma de la escena del crimen: ");
        String cromosoma=leer.nextLine();
        getGuilty(personas,cromosomas,cromosoma);        

    }
    
    public static void getGuilty(String[] personas,String[] cromosomas, String prueba){
        int sw=0;
        for(int i=0;i<size;i++){
           if(cromosomas[i].equals(prueba)){
             sw=1;
             System.out.println("Culpable Nombre: "+personas[i]+" cromosoma: "+cromosomas[i]+ "100%");  
           }
        }
        if(sw==0){
          System.out.println(prueba+" no existe conincidencias en la base de datos");  
        }
    
    }
    
    public static void printData(String[] personas,String[] cromosomas){
        for(int i=0;i<size;i++){
          System.out.println("Nombre: "+personas[i]+" cromosoma: "+cromosomas[i]);
        }
    
    }
    
    public static void loadData(String[] personas,String[] cromosomas){
           //llenado nombre de las personas   
           personas[0] = "Camilo Rodriguez";
           personas[1] = "Juan Perez";
           personas[2] = "Maria Gómez"; 
           //llenado de los cromosomas
           cromosomas[0] = "010";
           cromosomas[1] = "011";
           cromosomas[2] = "111";     
    
    }
    
    
    
    
    
}
