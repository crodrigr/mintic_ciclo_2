
package ciclo_2_3_75_libreria_arraylist;

public class Libro extends Publicacion {
    //Atributos

    private int numPaginas;
    private int añoPublicacion;
    //Metodos

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
    public void mostrar() {      
        super.mostrar();
        System.out.println("Numero paginas: " + this.numPaginas);
        System.out.println("Año de publicacion: " + this.añoPublicacion);
    }
    
}