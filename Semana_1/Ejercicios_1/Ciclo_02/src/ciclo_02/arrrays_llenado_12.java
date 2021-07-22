package ciclo_02;

public class arrrays_llenado_12 {

    //Variables globales
    //Variables locales
    public static void main(String arg[]) {
        String[] cromosomas = new String[3];
        cromosomas[0] = "000111";
        cromosomas[1] = "101110";
        cromosomas[2] = "111110"; 
        mostrar(cromosomas);
        
    }
    
    public static void mostrar(String[] s){
        for(int i=0;i<s.length;i++){
          System.out.println(s[i]);  
        } 
    }

}
