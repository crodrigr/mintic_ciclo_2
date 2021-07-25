package cilco_02_83_1;

import javax.swing.JOptionPane;

public class Ejemplo_JOptionPane {
    
    public static void main(String[] arg){
    
//         int numero=Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));

           int numero = Integer.parseInt( JOptionPane.showInputDialog("Ingrese un numero"));
           numero=numero*2;
         
         JOptionPane.showMessageDialog(null, "El numero ingresado es: "+numero,
  "WARNING_MESSAGE", JOptionPane.WARNING_MESSAGE);
    
    }
    
    
}
