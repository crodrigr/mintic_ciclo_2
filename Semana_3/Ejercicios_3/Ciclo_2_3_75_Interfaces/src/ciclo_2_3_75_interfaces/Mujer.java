package ciclo_2_3_75_interfaces;
public class Mujer extends Humano {
    
    private int progesterona;

    public Mujer(int progesterona, int edad, String nombre) {
        super(edad, nombre);
        this.progesterona = progesterona;
    }

    public int getProgesterona() {
        return progesterona;
    }

    public void setProgesterona(int progesterona) {
        this.progesterona = progesterona;
    }

    @Override
    public void display() {
      System.out.println("La mujer tiene la edad: "+super.getEdad()+" nombre: "+super.getNombre());    
    }

    @Override
    public void hablar() {
        System.out.println("El mujer está hablando");
    }

    @Override
    public void desplazarse() {
         System.out.println("El mujer se está desplanzando"); 
    }

    @Override
    public void jugar() {
         System.out.println("El mujer se está jugando"); 
    }

    @Override
    public void alimentarse() {
        System.out.println("El mujer se está alimentado"); 
    }

    @Override
    public void dormir() {
       System.out.println("El mujer esta durmiendo"); 
    }

    
    
    
    
    
}
