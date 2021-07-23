
package ciclo_2_w2_75;

public class Persona {
    
    //Atributos
    public String nombres;
    public String apellidos;
    
    public Persona(){
    }
    
    public Persona(String a,String b){
        this.nombres=a;
        this.apellidos=b;   
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
