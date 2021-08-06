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

    
    
    
    
    
}
