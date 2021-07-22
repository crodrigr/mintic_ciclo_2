
package ciclo_02;

public class reto_ejemplo_11 {
    
    public static void main(String[] args){
       
       String cromosoma_bd="010100011100011111"; 
          String cromosoma="110100011100000111";
       
       for(int i=0;i<cromosoma.length();i++){         
       
            if(cromosoma.charAt(i)==cromosoma_bd.charAt(i)){
               System.out.println("Son iguales");          
            }else{
               System.out.println("No Son iguales");      
            }
       
       }
       
        
    }
    
}
