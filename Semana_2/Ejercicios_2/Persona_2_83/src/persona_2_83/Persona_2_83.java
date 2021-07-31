
package persona_2_83;



public class Persona_2_83 {

    public static void main(String[] args) {
        
      Persona  persona1=new Persona(); 
      
      persona1.setNombres("Camilo Ernesto");
      persona1.setApellidos("Rodriguez Moreno");
       
      System.out.println("Nombre completo: "+persona1.getNombreCompleto());
      
      
      //Por valor
      int x=10;
      System.out.println(x);
      x=incrementar(x,persona1);
      System.out.println(x);
      System.out.println("Nombre completo: "+persona1.getNombreCompleto());
      //Por reference
      
         
    }
    
    public static int incrementar(int i, Persona p){
        i=i+1;
        System.out.println("El valor de i es: "+i);
        p.setNombres("Maria");
        return i;
        
    } 
    
}
