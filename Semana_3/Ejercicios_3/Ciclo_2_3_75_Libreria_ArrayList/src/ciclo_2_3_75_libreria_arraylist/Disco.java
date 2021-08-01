
package ciclo_2_3_75_libreria_arraylist;

public class Disco extends Publicacion {
    //Atributos
    private float duracion;
    //Metodos

    public Disco() {
    }    

    public Disco(float duracion, String titulo, float precio) {
        super(titulo, precio);
        this.duracion = duracion;
    }
    
    public float getDuracion() {
        return duracion;
    }

    public void setDuracion(float duracion) {
        this.duracion = duracion;
    }
    @Override
    public void mostrar() {
        super.mostrar();
        System.out.println("Duración: " + this.duracion);
    }
    
    
}
