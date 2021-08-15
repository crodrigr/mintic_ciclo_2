
package ciclo_2_75_appbanco;

public class Banco {
    //Atributos
    private String nombre;
    private String direccion;
    private int Id;

    public Banco() {
    }

    public Banco(String nombre, String direccion, int Id) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.Id = Id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }
            
    public void display(){
       System.out.println("Nombre: "+this.nombre);
       System.out.println("Dirección: "+this.direccion);
       System.out.println("Id: "+this.Id);
    }        
}
