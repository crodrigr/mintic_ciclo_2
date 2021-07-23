
package cilco_02_83_1;


public class funciones {
    
      static int z=0;
      public static void main(String[] args) {   
          
          System.out.println("Operaciones aritmeticas");          
          int a=4;
          int b=6;
          z=10;          
                  System.out.println("Z es: "+z); 
          System.out.println("suma es: "+suma(a,b));
           System.out.println("Z es: "+z);
          System.out.println("resta es: "+resta(a,b));
          System.out.println("division es: "+division(a,b));
          System.out.println("multiplicacion es: "+multiplicacion(a,b));     
      }
      
      public static int suma(int a, int w){
          z++;
          return a+w;      
      }
      
      public static int resta(int a, int z){
          return a-z;      
      }
      
      public static double division(int a, int z){
          double x=(double)a;
          double p=(double)z;
          return x/p;      
      }
      
       public static int multiplicacion(int a, int z){          
          return a*z;      
      }
    
    
}
