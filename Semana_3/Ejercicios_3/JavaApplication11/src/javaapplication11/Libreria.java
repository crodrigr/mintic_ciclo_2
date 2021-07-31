
package javaapplication11;

import java.util.Scanner;

public class Libreria {
    
    static Scanner leer=new Scanner(System.in);
    static int numElementos=0;
    

    public static void main(String[] args) {
       
        Publicacion[] listPublicaciones=new Publicacion[10];
        int op=0;
        do{
          op=menu();
          switch(op){
              case 1 : 
               crearLibro(listPublicaciones);       
              break;
              case 2 : 
               listarPublicaciones(listPublicaciones);       
              break;
          }
        }while(op>=1 && op<3);
        System.out.println("_____FIN PROGRAMA ________"); 
    }
    
    public static int menu(){    
        System.out.println("____MENU_________________");
        System.out.println("____1. Crear Libro ______");
        System.out.println("____2. Listar libros_____");
        System.out.println("____3. Salir_____________");
        int opcion=leer.nextInt();
        return opcion;    
    }
    
    public static void listarPublicaciones(Publicacion[] p){
         for(int i=0;i<p.length;i++){
             if(p[i]!=null){
              System.out.println("-------------------------------");      
              p[i].mostrar();
             }
         }
    
    }    
    public static void crearLibro(Publicacion[] p){
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
        p[numElementos]=libro;
        numElementos++;
    }
    
    
}
