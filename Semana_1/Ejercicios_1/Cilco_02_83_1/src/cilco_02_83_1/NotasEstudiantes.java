package cilco_02_83_1;

import java.util.Scanner;


public class NotasEstudiantes {
    
    static Scanner leer=new Scanner(System.in);
    
    public static void main(String[] args){
         //tipoDato[] nombreVariable=new TipoDato[tamaño];
         //Persona[]  personas=new Persona[20];
         int[] notas=new int[50]; //declaramos e inicializamos el arreglo de notas        
//         llenarNotas(notas); 
         llenarNotasRandom(notas);
         mostrasNotas(notas);
         System.out.println("El promedio es: "+calcularPromedio(notas));
         mostrarMaximaNota(notas);
         int[] rta=getAprobadosReprobados(notas);
         System.out.println("Cantidad de aprobados: "+rta[1]);
         System.out.println("Cantidad de reaprobados: "+rta[0]);
         System.out.print("Random: "+Math.random());
    }
    
    public static int[] getAprobadosReprobados(int[]  h){
        int[] totales=new int[2]; 
        for(int i=0;i<h.length;i++){
            if(h[i]<3){
              totales[0]=totales[0]+1;
            }else{
              totales[1]=totales[1]+1;
            }   
                
        } 
       return totales;
    }
    
    public static void mostrarMaximaNota(int[] t){
        System.out.println("Estudiantes con maxima nota de 5 "); 
       for(int i=0;i<t.length;i++){
            if(t[i]==5)
            System.out.println("nota del estudiante: "+ i +": "+t[i]);   
                
        } 
    
    }
    
    public static int calcularPromedio(int[] p){
        int suma=0;
        int promedio=0;
        for(int i=0;i<p.length;i++){              
            suma=suma+p[i];    
        } 
        promedio=suma/p.length;
        return promedio;
    }
    
    public static void mostrasNotas(int[] w){
         for(int i=0;i<w.length;i++){
            System.out.println("nota del estudiante: "+ i +": "+w[i]);   
                
        } 
    }    
    public static void llenarNotas(int[] x){
         for(int i=0;i<x.length;i++){
            System.out.println("Ingrese la nota del estudiante: "+ i);
            x[i]=leer.nextInt();            
        } 
    }
    
    public static void llenarNotasRandom(int[] x){
         for(int i=0;i<x.length;i++){
             x[i]=(int)(Math.random()*5+1);           
        } 
    } 
    
}
