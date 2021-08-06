package ciclo_2_3_75_solucion_reto1;

import java.util.Scanner;

public class Ciclo_2_3_75_solucion_reto1 {

    static Scanner leer=new Scanner(System.in); 
    
    public static void main(String[] args) {

        String nombres[] = new String[10];
        String cromosomas[] = new String[10];
        loadDatos(nombres,cromosomas);
        mostrar(nombres,cromosomas);
        System.out.println("Ingrese el cromosoma del delito");
        String cdelito=leer.nextLine();
       encontrarCulpable(nombres,cromosomas,cdelito);
    }
    
    public static void encontrarCulpable(String[] nombres,String[] cromosomas,String cdelito){
         
         int mayorCoincidencia=0;
         int mayorPos=0;
         for(int i=0; i<cromosomas.length;i++){
             if(cromosomas[i]!=null){
                    System.out.println("--------------------------------------");
                    int totalIguales=0;
                    int porcentaje=0;
                    for(int j=0;j<cromosomas[i].length();j++){                  
                         if(cromosomas[i].charAt(j)==cdelito.charAt(j)){
                             totalIguales++;
                            System.out.println(cromosomas[i].charAt(j)+"=="+cdelito.charAt(j));                  
                         }else{
                         System.out.println(cromosomas[i].charAt(j)+"!="+cdelito.charAt(j));    
                         }
                    }
                    porcentaje=(totalIguales*100)/4;
                    System.out.println("Porcentaje es: "+porcentaje);
                    if(mayorCoincidencia<porcentaje){
                      mayorCoincidencia=porcentaje;
                      mayorPos=i;
                    }
             }       
         }
         
         System.out.println("El culpable es: "+nombres[mayorPos]+" con un porcentaje de: "+mayorCoincidencia);
        
        
    }
    
    public static void mostrar(String[] a,String[] b){
          for(int i=0;i<a.length;i++){
              if(a[i]!=null && b[i]!=null){
                 System.out.println("Nombre: "+a[i]+ " Cromosoma: "+b[i]);
              }
          }
    }
    
    public static void loadDatos(String[] a, String[] b) {
        a[0] = "Camilo";
        a[1] = "Juan";
        a[2] = "Maria";
        b[0] = "0001";
        b[1] = "0011";
        b[2] = "0111";
    }

}
