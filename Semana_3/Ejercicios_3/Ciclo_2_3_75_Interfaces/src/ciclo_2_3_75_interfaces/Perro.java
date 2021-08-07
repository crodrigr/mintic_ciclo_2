
package ciclo_2_3_75_interfaces;

public class Perro extends Animal { 
    
    
    private String raza;

    public Perro() {
    }


    public Perro(String raza, String especie, String tipo) {
        super(especie, tipo);
        this.raza = raza;
    }

  
   

    

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    @Override
    public void hablar() {
      System.out.println("Gua.gua gua gual !!!!!")  ;
    }

    @Override
    public void desplazarse() {
        System.out.println("El perro se esta desplazando !")  ;
    }

    @Override
    public void jugar() {
        System.out.println("El perro esta jugando !")  ;
    }

    @Override
    public void alimentarse() {
        System.out.println("El perro se esta alimentando !")  ;
    }

    @Override
    public void dormir() {
        System.out.println("El perro  esta durmiendo !")  ;
    }

    @Override
    public void display() {
      System.out.println("Color: "+this.raza) ; 
      System.out.println("Especie: "+super.getEspecie()); 
      System.out.println("Especie: "+super.getTipo()); 
    }
    
    
}
