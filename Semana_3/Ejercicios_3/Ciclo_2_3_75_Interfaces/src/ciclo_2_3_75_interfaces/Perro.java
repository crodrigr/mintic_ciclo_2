
package ciclo_2_3_75_interfaces;

public class Perro extends Animal{ 
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
      System.out.print("Gua.gua gua gual !!!!!")  ;
    }

    @Override
    public void desplazarse() {
        System.out.print("El perro se esta desplazando !")  ;
    }

    @Override
    public void jugar() {
        System.out.print("El perro esta jugando !")  ;
    }

    @Override
    public void alimentarse() {
        System.out.print("El perro se esta alimentandose !")  ;
    }

    @Override
    public void dormir() {
        System.out.print("El perro se esta dormiendo !")  ;
    }
    
    
}
