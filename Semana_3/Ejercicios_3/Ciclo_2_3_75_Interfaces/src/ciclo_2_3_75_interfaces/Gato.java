
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
        System.out.print("Miau miau !!!!!")  ;
    }

    @Override
    public void desplazarse() {
       System.out.print("El gato se esta desplazando !")  ;
    }

    @Override
    public void jugar() {
       System.out.print("El gato esta jugando !")  ;
    }

    @Override
    public void alimentarse() {
       System.out.print("El gato se esta alimentandose !")  ;
    }

    @Override
    public void dormir() {
        System.out.print("El gato se esta dormiendo !")  ;
    }
    
}
