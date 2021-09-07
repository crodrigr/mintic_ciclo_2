
package test;

import datos.*;
import domain.*;
import java.util.ArrayList;


public class Principal {
    public static void main(String[] arg){
       PersonaDAO pDAO=new PersonaDAO();
       
       Persona p1=new Persona("Jimmy","Hernandez","155585","cra 259-966","3154488","11110");
       pDAO.insertar(p1);
       
       ArrayList<Persona> personas=pDAO.getAll();
       
       for(Persona p: personas){
          p.display();
       }
       
       
    
    
    
    }
    
    
}
