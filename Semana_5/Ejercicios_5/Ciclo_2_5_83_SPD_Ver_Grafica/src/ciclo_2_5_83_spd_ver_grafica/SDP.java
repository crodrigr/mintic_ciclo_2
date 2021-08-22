
package ciclo_2_5_83_spd_ver_grafica;

import java.util.ArrayList;

public class SDP {
    public static void main(String[] args) {
      ArrayList<Ciudadano> ciudadanos=new ArrayList<Ciudadano>();
      loadData(ciudadanos);
      Principal p=new Principal();
      p.setListPersona(ciudadanos);
      p.setVisible(true);
      p.mostrar();
      
    }
    
    public static void loadData(ArrayList<Ciudadano> ciudadanos) {       
        Ciudadano c1 = new Ciudadano("00000",1,"Camilo Ernesto", "Duarte Rangel", "Calle 58 No 89-92", "3145588", "1254887");
        Ciudadano c2 = new Ciudadano("11000",2, "Lizeth Johanna", "Villamizar Perez", "cra 58 No 89-92", "3005588", "5554887");
        Ciudadano c3 = new Ciudadano("00110",3, "Juan Camilo", "Montoya Rangel", "Av 57 No 89-92", "3005588", "6694887");
        Ciudadano c4 = new Ciudadano("00001",4, "Diego Fernando", "Rangel Pinto", "Cra 96 No 89-92", "3145588", "22224887");
        Ciudadano c5 = new Ciudadano("01000",5,"Juan Carlos", "Camargo Rangel", "Calle 58 No 89-92", "3145588", "7777887");
        ciudadanos.add(c1);
        ciudadanos.add(c2);
        ciudadanos.add(c3);
        ciudadanos.add(c4);
        ciudadanos.add(c5);
        

    }
    
}
