package ciclo_02;

public class HolaMundo {

    public static void main(String[] args) {

//        int a = 45;
//        int b = 90;
//        int c = 30;
//        float r = (a + b + c) / 3;
//        String mensaje = "Resultado:";
//        mensaje = mensaje.toUpperCase();
//        
//                
//        if (mensaje.equalsIgnoreCase("resultado:")) {
//            System.out.println("Si son iguales\'");
//        } else {
//            System.out.print("\nNo son iguales\"");
//        }
//
//        System.out.println(mensaje + r);

//          int a=1;
//          int b=2;
//          System.out.println("a: " + a);
//          a++; //a=a+1; /a--
//          System.out.println("a: " + a);
//          
//          if (a==b && (a+b)> 10){
//              System.out.println("Son iguales");
//          }else{
//            System.out.println("Nno son iguales");
//          }

            //Ejemplo while
//            int inicio=0;
//            while(inicio<10){
//                System.out.println(inicio);
//                inicio++;
//            }
//            
//            for(int i=0;i<10;i++) {
//             System.out.println(i);
//            }


//             int inicio=0;
//             do{
//                System.out.println(inicio);
//                inicio++;
//             
//             }while(inicio<10);


//         for(int i=1;i<=10;i++){
//            if(i%2==0){
//              System.out.println(i+" es par");
//              if(i>=6)
//                 break;               
//            }
//         }

       for(int i=1;i<=10;i++){
           
           System.out.println("incio del for " + i);
           
           
            if(i%2==0){
              System.out.println(i+" es par");
              if(i>=6)
                 continue;               
            }
            
             System.out.println("fin del for ");
         }


    }

}
