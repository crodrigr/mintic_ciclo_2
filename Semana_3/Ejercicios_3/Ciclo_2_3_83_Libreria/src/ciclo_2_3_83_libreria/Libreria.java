package ciclo_2_3_83_libreria;

import java.util.ArrayList;
import java.util.Scanner;

public class Libreria {

    static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {

        ArrayList<Publicacion> publicaciones = new ArrayList<Publicacion>();
        loadData(publicaciones);
        Ventas ventas = new Ventas();

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
                    int idPublicacion = getIdVenta(publicaciones);
                    ventas.agregarVenta(publicaciones.get(idPublicacion));
                    break;
                case 5:
                    System.out.println("Listar todas ventas");
                    ventas.mostrarVentas();
                    break;
            }

        } while (op >= 1 && op < 6);

    }

    public static void loadData(ArrayList<Publicacion> publicaciones) {
        Libro l1 = new Libro(255, 2021, "Java", 89000.2f);
        Libro l2 = new Libro(1250, 2021, "C#", 45000.2f);
        Libro l3 = new Libro(2890, 2021, "Javascript", 78000.2f);
        Libro l4 = new Libro(1582, 2021, "Python", 35000.2f);
        Disco d1 = new Disco(56.56f, "Vallenato", 35000.2f);
        Disco d2 = new Disco(86.56f, "Rock", 75000.2f);
        Disco d3 = new Disco(78.56f, "Ranchera", 89000.2f);
        Disco d4 = new Disco(63.56f, "Clasica", 25000.2f);
        publicaciones.add(l1);
        publicaciones.add(l2);
        publicaciones.add(l3);
        publicaciones.add(l4);
        publicaciones.add(d1);
        publicaciones.add(d2);
        publicaciones.add(d3);        
        publicaciones.add(d4);
       
    }

    public static void mostrarPublicaciones(ArrayList<Publicacion> publicaciones) {
        for (Publicacion p : publicaciones) {
            System.out.println("-----------------------------");
            if (p instanceof Libro) {
                System.out.println("Este objeto es un libro");
            }
            if (p instanceof Disco) {
                System.out.println("Este objeto es un disco");
            }
            p.mostrar();
        }

    }

    public static int getIdVenta(ArrayList<Publicacion> publicaciones) {
        int numPublicacion = 0;
        for (Publicacion p : publicaciones) {
            System.out.println("----------------" + numPublicacion);
            p.mostrar();
            numPublicacion = numPublicacion + 1;
        }
        System.out.println("Ingrese el Id de la publicación para guardar venta");
        int idPublicacion = leer.nextInt();
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
