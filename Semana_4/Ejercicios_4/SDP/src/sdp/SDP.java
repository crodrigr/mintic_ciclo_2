
package sdp;

import java.util.ArrayList;


public class SDP {

   
    public static void main(String[] args) {
       Principal p=new Principal();
       ArrayList<Ciudadano> list=loadCiudadanos();
       p.setCiudadano(list);
       p.setVisible(true);
       p.mostrar();
    }
    
    public static ArrayList<Ciudadano> loadCiudadanos(){
       ArrayList<Ciudadano> ciudadanos=new  ArrayList<Ciudadano>();
       Ciudadano c1=new Ciudadano("00001","Camilo Ernesto","Rodriguez Mendez","Cra 25 no 25-89","3145588","12355");
       Ciudadano c2=new Ciudadano("00011","Lizeth Johanna","Villamizar Perez","Cra 85 no 93-89","3145588","12355");
       Ciudadano c3=new Ciudadano("00111","Digo Fernando","Rangel Martinez","Cra 96 no 75-89","3145588","12355");
       Ciudadano c4=new Ciudadano("01111","Juan Carlos","Camargo Lea","Cra 25 no 120-89","3145588","12355");
       Ciudadano c5=new Ciudadano("111111","Maria Angelica","Gómez Gómez","Cra 09 no 64-89","3145588","12355");
       Ciudadano c6=new Ciudadano("10101","Juan Sebastian","Ortega Uribe","Cra 10 no 125-89","3145588","12355");
       Ciudadano c7=new Ciudadano("10111","Martin Elias","Mendez Ramirez","Cra 45 no 259-89","3145588","12355");
       Ciudadano c8=new Ciudadano("11011","Eduardo Andres","Fernandez Monsalve","Cra 75 no 02-89","3145588","12355");
       Ciudadano c9=new Ciudadano("11101","Catalina Andrea","Moreno Ferreira","Cra 36 no 368-89","3145588","12355");
       Ciudadano c10=new Ciudadano("00001","Jorge Armando","Rico Pico","Cra 00 no 96-89","3145588","12355");
       Ciudadano c11=new Ciudadano("11110","Josefina Maria","De las Casas","Cra 15 no 3-89","3145588","12355");
       Ciudadano c12=new Ciudadano("10011","Laura Rocio","Botia Moreno","Cra 69 no 3-89","3145588","12355");
       Ciudadano c13=new Ciudadano("10001","Deysi Matilde","Moreno Delgado","Cra 35 no 30-89","3145588","12355");
       ciudadanos.add(c1);
       ciudadanos.add(c2);
       ciudadanos.add(c3);
       ciudadanos.add(c4);
       ciudadanos.add(c5);
       ciudadanos.add(c6);
       ciudadanos.add(c7);
       ciudadanos.add(c8);
       ciudadanos.add(c9);
       ciudadanos.add(c10);
       ciudadanos.add(c11);
       ciudadanos.add(c12);
       ciudadanos.add(c13);
       
       return  ciudadanos;
       
    
    }
}
