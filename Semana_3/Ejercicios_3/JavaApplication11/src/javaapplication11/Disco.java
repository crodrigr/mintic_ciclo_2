
package javaapplication11;

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
        System.out.println("Titulo: " + super.getTitulo());
        System.out.println("Precio: " + super.getPrecio());
        System.out.println("Duración: " + this.duracion);
    }
    
    
}
