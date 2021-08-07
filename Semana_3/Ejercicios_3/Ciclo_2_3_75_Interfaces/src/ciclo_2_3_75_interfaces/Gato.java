
package ciclo_2_3_75_interfaces;

public class Gato extends Animal{
    
    private String color;

    public Gato(String color, String especie, String tipo) {
        super(especie, tipo);
        this.color = color;
    }


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void hablar() {
        System.out.println("Miau miau !!!!!")  ;
    }

    @Override
    public void desplazarse() {
       System.out.println("El gato se esta desplazando !")  ;
    }

    @Override
    public void jugar() {
       System.out.println("El gato esta jugando !")  ;
    }

    @Override
    public void alimentarse() {
       System.out.println("El gato se esta alimentando !")  ;
    }

    @Override
    public void dormir() {
        System.out.println("El gato  esta durmiendo !")  ;
    }

    @Override
    public void display() {
      System.out.println("Color: "+this.color) ; 
      System.out.println("Especie: "+super.getEspecie()); 
      System.out.println("Especie: "+super.getTipo()); 
    }
    
}
