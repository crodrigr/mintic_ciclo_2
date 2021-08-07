
package ciclo_2_3_75_interfaces;

public class Hombre extends Humano{
    
    private int testosterona;

    public Hombre(int testosterona, int edad, String nombre) {
        super(edad, nombre);
        this.testosterona = testosterona;
    }

    public int getTestosterona() {
        return testosterona;
    }

    public void setTestosterona(int testosterona) {
        this.testosterona = testosterona;
    }

    @Override
    public void display() {
      System.out.println("El Hombre tiene la edad: "+super.getEdad()+" nombre: "+super.getNombre());  
    }

    @Override
    public void hablar() {
       System.out.println("El hombre está hablando");
    }

    @Override
    public void desplazarse() {
        System.out.println("El hombre se está desplanzando"); 
    }

    @Override
    public void jugar() {
       System.out.println("El hombre se está jugando"); 
    }

    @Override
    public void alimentarse() {
        System.out.println("El hombre se está alimentado"); 
    }

    @Override
    public void dormir() {
       System.out.println("El hombre esta durmiendo"); 
    }

    
    
    
}
