
package ciclo_2_w2_75;


public class Principal {
    public static void main(String[] args) {
        
        Persona persona1=new Persona();
        Persona persona2=new Persona("Ana María","Perez Pinto");
        
        System.out.println("Datos de la persona2: "+persona2.getNombres()+" "+persona2.getApellidos());
        
        persona1.setNombres("Camilo Ernesto");
        persona1.setApellidos("Rodriguez Moreno");
        
        persona2.setNombres("Maria Clara");
        persona2.setApellidos("Perez Pinto");
        
        System.out.println("Datos de la persona1: "+persona1.getNombres()+" "+persona1.getApellidos());
        System.out.println("Datos de la persona2: "+persona2.getNombres()+" "+persona2.getApellidos());
        
        
        
                
       
    }
    
}
