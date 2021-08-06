
package ciclo_2_3_83_libreria;

public class Libro extends Publicacion {
    
    private int numPaginas;
    private int añoPublicacion;

    public Libro() {
    }

    public Libro(int numPaginas, int añoPublicacion, String titulo, float precio) {
        super(titulo, precio);
        this.numPaginas = numPaginas;
        this.añoPublicacion = añoPublicacion;
    }
    
    
    

    public int getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }

    public int getAñoPublicacion() {
        return añoPublicacion;
    }

    public void setAñoPublicacion(int añoPublicacion) {
        this.añoPublicacion = añoPublicacion;
    }
    
    @Override
    public void mostrar(){
       System.out.println("Titulo: "+super.getTitulo());
       System.out.println("Precio: "+super.getPrecio());
       System.out.println("Número de paginas: "+this.numPaginas);
       System.out.println("Año de publicacion: "+this.getAñoPublicacion());
    }
    
    
    
}
