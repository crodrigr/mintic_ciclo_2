
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
        //ejemplo paso por valor 
        System.out.println("Ejemplo paso por valor");
        int x=10;
        imprimir(x);
        cambiarValor(x);
        imprimir(x);       
        //ejemplo paso por reference
        System.out.println("Ejemplo paso por referencia del persona2");
        System.out.println("Datos de la persona2: "+persona2.getNombres()+" "+persona2.getApellidos());
        cambiarNombre(persona2);
        System.out.println("Datos de la persona2: "+persona2.getNombres()+" "+persona2.getApellidos());
        //ejemplo de static
        System.out.println("Hora de inicio para persona1"+persona1.getHoraDespertar());
        System.out.println("Hora de inicio para persona2"+persona2.getHoraDespertar());
        Persona.horaDespertar="08:00:00";
        System.out.println("Hora de inicio para persona1"+persona1.getHoraDespertar());
        System.out.println("Hora de inicio para persona2"+persona2.getHoraDespertar());
        
        
    }
    
    public static void cambiarNombre(Persona w){
       w.setApellidos("XXXXXXXXX");
       w.setNombres("yyyyyyyyyyy");
    
    }
    
    public static int cambiarValor(int i){
       return i=200;
    }
    
     public static void imprimir(int i){
        System.out.println(i);
    }
    
    
}
