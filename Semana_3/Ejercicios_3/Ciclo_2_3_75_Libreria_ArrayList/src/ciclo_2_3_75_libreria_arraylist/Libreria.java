
package ciclo_2_3_75_libreria_arraylist;

import java.util.ArrayList;
import java.util.Scanner;


public class Libreria {
    
    static Scanner leer=new Scanner(System.in);
    static int numElementos=0;
    public static void main(String[] args) {
        
        ArrayList<Publicacion>  listPublicaciones = new ArrayList<Publicacion>();        
        
        int op=0;
        do{
          op=menu();
          switch(op){
              case 1 : 
               crearLibro(listPublicaciones);       
              break;
              case 2 : 
               crearDisco(listPublicaciones);       
              break;
               case 3 : 
               listarPublicaciones(listPublicaciones);       
              break;
          }
        }while(op>=1 && op<4);
        System.out.println("_____FIN PROGRAMA ________"); 
    }
    
    public static int menu(){    
        System.out.println("____MENU________________________");
        System.out.println("____1. Crear Libro _____________");
        System.out.println("____2. Crear Disco _____________");
        System.out.println("____3. Listar publicaciones_____");
        System.out.println("____4. Salir____________________");
        int opcion=leer.nextInt();
        return opcion;    
    }
    
    public static void listarPublicaciones(ArrayList<Publicacion> p){
         for(Publicacion  obj :  p){             
              System.out.println("-------------------------------");      
              obj.mostrar();
         }
    
    }    
    public static void crearLibro(ArrayList<Publicacion> p){
        //Libro capturando los datos del libro por parte del usuario
        System.out.println("Ingrese el nombre del libro");
        String titulo=leer.next();
        System.out.println("Ingrese el precio del libro");
        float precio=leer.nextFloat();
        System.out.println("Ingrese el número de paginas del libro");
        int numPaginas=leer.nextInt();
        System.out.println("Ingrese el año de publicacion del libro");
        int añoPublicacion=leer.nextInt();
        Libro libro=new Libro(numPaginas,añoPublicacion,titulo,precio);
        p.add(libro);     
      
    }
    public static void crearDisco(ArrayList<Publicacion> p){
        //Libro capturando los datos del libro por parte del usuario
        System.out.println("Ingrese el nombre del titulo");
        String titulo=leer.next();
        System.out.println("Ingrese el precio");
        float precio=leer.nextFloat();
        System.out.println("Ingrese la duracion del disco");
        float duracion=leer.nextFloat();
        Disco disco=new Disco(duracion,titulo,precio);
        p.add(disco);
    }
    
    
}
