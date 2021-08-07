
package ciclo_2_3_75_interfaces;

public abstract class Animal implements AccionesGeneral {
    
    private String especie;
    private String tipo;

    public Animal() {
    }
    
    

    public Animal(String especie, String tipo) {
        this.especie = especie;
        this.tipo = tipo;
    }    
    

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

   
    
    
    
    
}
