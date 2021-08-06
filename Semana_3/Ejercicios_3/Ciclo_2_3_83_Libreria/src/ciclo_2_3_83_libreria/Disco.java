
package ciclo_2_3_83_libreria;

public class Disco extends Publicacion {
    
    private float duracion;

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
    public void mostrar(){
       System.out.println("Titulo: "+super.getTitulo());
       System.out.println("Precio: "+super.getPrecio());
       System.out.println("Duración: "+this.duracion);       
    }
    
    
    
}
