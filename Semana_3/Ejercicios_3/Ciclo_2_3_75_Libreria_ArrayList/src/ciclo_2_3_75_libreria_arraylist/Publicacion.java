
package ciclo_2_3_75_libreria_arraylist;

public class Publicacion {
    
     //Atributos

    private String titulo;
    private float precio;

    public Publicacion() {
    }
    
    public Publicacion(String titulo, float precio) {
        this.titulo = titulo;
        this.precio = precio;
    }
 
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }
    
    public void mostrar(){
        System.out.println("Titulo: "+this.titulo);
        System.out.println("Precio: "+this.precio);
    
    }
    
}
