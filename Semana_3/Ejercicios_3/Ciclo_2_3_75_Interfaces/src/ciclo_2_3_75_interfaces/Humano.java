package ciclo_2_3_75_interfaces;

public abstract class Humano implements AccionesGeneral  {
  //Atributos
    private int edad;
    private String nombre;
  //Metodos

    public Humano(int edad, String nombre) {
        this.edad = edad;
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public abstract void display();
    

    
    
    
}
