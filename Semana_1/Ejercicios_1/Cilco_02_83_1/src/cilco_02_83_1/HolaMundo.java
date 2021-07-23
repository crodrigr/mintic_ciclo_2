package cilco_02_83_1;

public class HolaMundo {

    public static void main(String[] args) {

        int a = 5;
        int b = 20;
        int rta = a + b;

        double g = 1.2;
        double v = 2.9;

        double r = g + v;

        String mensaje = "Bienvenido a mi programa";

        System.out.println(mensaje);

        if (a < 10) {
            System.out.println("a es menor de 10");
        } else {
            System.out.println("a No es menor de 10");

        }

        int numVeces = 0;
        while (numVeces < 10) {
            System.out.println("print: " + numVeces);
//            numVeces = numVeces + 1;
              numVeces++;
        }
        
        for(int i=1;i<=10;i=i+2){
         System.out.println("for: " +i);
        
        }
        
        // break -- continue 
        
        
         for(int i=1;i<=10;i++){
             System.out.println("for: " +i);
             if(i==2){
               break;
             }
        
        }
         
         for(int i=1;i<=10;i++){
             System.out.println("antes del if: " +i);
             if(i==2){
              continue;
             }
            System.out.println("despues del if: " +i);
        }
         
          for(int i=1;i<=10;i++){
             
             if( i<5 && i%2==0   ){
               System.out.println("la i es menor de cinco y es par "+i);
             }
            
        }
         
         
        

    }

}
