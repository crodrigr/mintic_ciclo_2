package ciclo_02;

public class arreglos_04 {

    public static void main(String[] agr) {
        System.out.println("Arreglos en java");
        int numeros[] = new int[20];
        llenarArreglo(numeros);
        imprimirArreglo(numeros);        
        System.out.println("El promedio es:" + promedio(numeros));       

    }
    
    public static void llenarArreglo(int[] p){        
        for (int i=0;i<p.length;i++){
              p[i]= (int)(Math.random() * ((100 - 1) + 1));
        }    
    }
    
    public static int promedio(int[] y){
        int acumulador=0;       
        int promedio=0;
        for (int i=0;i<y.length;i++){
           acumulador=acumulador+y[i];
        }
        promedio=acumulador/y.length;
        
        return promedio;
    
    }
    
    public static void imprimirArreglo(int[] x){
        for (int i=0;i<x.length;i++){
          System.out.println("Valor en "+i+":"+x[i]);
        }
    }

}
