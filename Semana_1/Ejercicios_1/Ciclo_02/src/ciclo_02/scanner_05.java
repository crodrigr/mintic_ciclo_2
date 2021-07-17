package ciclo_02; 

import java.util.Scanner;

public class scanner_05 {
  
public static void main(String[] args){
   // Declarar el objeto e inicializar con
   // el objeto de entrada estándar predefinido
   Scanner leer = new Scanner(System.in); 
   System.out.println("Ingrese un mensaje: ");
   String msg=leer.nextLine();
   System.out.println("Este es el mensaje:" +msg);
   
   
}
    
    
}
