package ciclo_2_3_83_libreria;

import java.util.ArrayList;
import java.util.Scanner;

public class Libreria {

    static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {

        ArrayList<Publicacion> publicaciones = new ArrayList<Publicacion>();
        Ventas ventas=new Ventas();

        int op = 0;
        do {
            op = menu();
            switch (op) {
                case 1:
                    System.out.print("Crear libro\n");
                    crearLibro(publicaciones);
                    break;
                case 2:
                    System.out.println("Crear disco");
                    crearDisco(publicaciones);
                    break;
                case 3:
                    System.out.println("Listar todas las publicaciones");
                    mostrarPublicaciones(publicaciones);
                    break;
                case 4:
                      System.out.println("Guardar venta");
                      int idPublicacion=getIdVenta(publicaciones);
                      ventas.agregarVenta(publicaciones.get(idPublicacion));
                    break;
                case 5:
                    System.out.println("Listar todas ventas");
                    ventas.mostrarVentas();
                    break;
            }

        } while (op >= 1 && op < 6);

    }

    public static void mostrarPublicaciones(ArrayList<Publicacion> publicaciones) {
        for (Publicacion p : publicaciones) {
            System.out.println("-----------------------------");
            p.mostrar();
        }

    }
    
    public static int getIdVenta(ArrayList<Publicacion> publicaciones) {
        int numPublicacion=0;
        for (Publicacion p : publicaciones) {
            System.out.println("----------------"+ numPublicacion);
            p.mostrar();
            numPublicacion=numPublicacion+1;
        }
        System.out.println("Ingrese el Id de la publicación para guardar venta");
        int idPublicacion=leer.nextInt();
        return idPublicacion;
    }

    public static void crearDisco(ArrayList<Publicacion> p) {
        String titulo;
        float precio;
        float duracion;
        System.out.println("Ingrese el titulo");
        titulo = leer.next();
        System.out.println("Ingrese el precio");
        precio = leer.nextFloat();
        System.out.println("Ingrese la duración del disco");
        duracion = leer.nextFloat();
        p.add(new Disco(duracion, titulo, precio));

    }

    public static void crearLibro(ArrayList<Publicacion> p) {
        String titulo;
        float precio;
        int numPaginas;
        int año;
        System.out.println("Ingrese el titulo");
        titulo = leer.next();
        System.out.println("Ingrese el precio");
        precio = leer.nextFloat();
        System.out.println("Ingrese el número de paginas");
        numPaginas = leer.nextInt();
        System.out.println("Ingrese el año de publicación");
        año = leer.nextInt();
        p.add(new Libro(numPaginas, año, titulo, precio));
    }

    public static int menu() {
        System.out.println("____MENU________________________");
        System.out.println("____1.Crear Libro_______________");
        System.out.println("____2.Crear Disco_______________");
        System.out.println("____3.Mostrar Publicaciones_____");
        System.out.println("____4.Guardar Venta_____________");
        System.out.println("____5.Mostrar Ventas_____________");
        System.out.println("____6.Salir_____________________");
        int op = leer.nextInt();
        return op;
    }

}
