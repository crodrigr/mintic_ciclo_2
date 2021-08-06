
package ciclo_2_3_83_libreria;

import java.util.ArrayList;

public class Ventas {
    
    private ArrayList<Publicacion> listaVentas;

    public Ventas() {
       listaVentas=new ArrayList<Publicacion>();
    }
    
    public void agregarVenta(Publicacion p){
       this.listaVentas.add(p);
    }
    
    public void mostrarVentas(){
       for(Publicacion  p :   this.listaVentas){
            System.out.println("-----------------------------");
            p.mostrar();
        }
    }
}
