
package ciclo_2_w2_75;

public class Persona {
    
    //Atributos
    public String nombres;
    public String apellidos;
    public static String horaDespertar="07:00:00";
    
    public Persona(){
       
    }
    
    public Persona(String a,String b){
        this.nombres=a;
        this.apellidos=b;
        
    }
    
    public String getHoraDespertar(){
    
       return horaDespertar;
    
    }
    
    //Metodos    
    public void setNombres(String nombres){
       this.nombres=nombres;
    }
     public void setApellidos(String apellidos){
       this.apellidos=apellidos;
    }
    public String getNombres(){
        return this.nombres;
    }
     public String getApellidos(){
        return this.apellidos;
    }
    
}
