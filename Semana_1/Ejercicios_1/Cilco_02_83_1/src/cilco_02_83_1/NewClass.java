
package cilco_02_83_1;

public class NewClass {
    
    public static void main(String[] args){
      
        int notas[]={1,3,4,5};
        String nombres[]={"Camilo","Juan","Pedro","Dario"};
         int notaMayor=notas[0];
         int posMayor=0;
         
        for(int i=1;i<notas.length;i++){
             if(notaMayor<notas[i]){
                notaMayor=notas[i];
                posMayor=i;
        }
        }
         System.out.println("La mayor nota: "+ nombres[posMayor]+" nota: "+notaMayor);
        
       
    
    }
}
