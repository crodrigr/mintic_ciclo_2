
package test;

import datos.*;
import domain.*;
import java.util.ArrayList;

public class Principal {
    
    public static void main(String[] arg){
        PersonaDAO pDao=new PersonaDAO();
        
        Persona personaNueva = new Persona("Silvio Rafale","De Avila","37885598","Cr ddd","31458888","111000");
        pDao.insertar(personaNueva);
        
        ArrayList<Persona> personas=pDao.getAll();
        
        for(Persona p: personas){
            p.display();
        }
    
    }
    
}
