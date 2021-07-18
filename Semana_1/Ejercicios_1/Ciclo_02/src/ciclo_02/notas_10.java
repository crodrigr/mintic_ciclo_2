
package ciclo_02;

import java.util.Scanner;

public class notas_10 {
    //metodo principal
    public static void main(String[] args){
               
        int notas[]=new int[3];        
        llenarNotas(notas);
        mostrarNotas(notas);
        int pro=calcularPromedio(notas);
        int[] totalAproRepro= totalAprobadosReprobados(notas);
        maximaNota(notas);
        System.out.println("El promedio de las notas es: "+pro);
        System.out.println("Total aprobados: "+totalAproRepro[0]);
        System.out.println("Total reaprobados: "+totalAproRepro[1]);
        
        
    }
    
    public static void llenarNotas(int [] x){
        //
        Scanner leer=new Scanner(System.in);
        for(int i=0;i<x.length;i++){
            System.out.print ("Ingrese la nota del estudiante; "+i);
            int nota=leer.nextInt();
            x[i]=nota;
        }        
    }
    
    public static void mostrarNotas(int [] y){       
        for(int i=0;i<y.length;i++){
           System.out.println("La nota del estudiante "+i+" es "+y[i]);            
        }        
    }
    
    public static int calcularPromedio(int[] z){
       int suma=0;
       int promedio=0;
       for(int i=0;i<z.length;i++){
           suma=suma+z[i];           
        }   
       promedio=suma/z.length;
       return promedio;        
    }
    
    public static int[] totalAprobadosReprobados(int[] w){
           int totales[]=new int[2];
            for(int i=0;i<w.length;i++){
                  if(w[i]>=3){
                    totales[0]=totales[0]+1;
                  }else{
                    totales[1]=totales[1]+1;
                  }        
             }  
          return totales;         
    }
    
    public static void maximaNota(int[] p){
       for(int i=0;i<p.length;i++){
           if(p[i]==5){
             System.out.print ("Estudiante: "+i); 
           }         
        } 
    }
    
}
