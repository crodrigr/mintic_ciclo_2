
package ciclo_2_83_joption;

import javax.swing.JOptionPane;

public class Ejemplo_Joption {

    
    public static void main(String[] args) {
         int numero = Integer.parseInt( JOptionPane.showInputDialog("Ingrese un numero"));
           numero=numero*2;
         
         JOptionPane.showMessageDialog(null, "El numero ingresado es: "+numero,
  "WARNING_MESSAGE", JOptionPane.WARNING_MESSAGE);
    }
    
}
