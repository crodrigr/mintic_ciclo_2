package ciclo_02;

import javax.swing.JOptionPane;

public class JOptionPane_06 {

    public static void main(String arg[]) {

        int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un"
                + " numero para multiplicarlo por 2"));
        
        JOptionPane.showMessageDialog(null, "Este es numero: "+numero,
  "WARNING_MESSAGE", JOptionPane.WARNING_MESSAGE);
        
        System.out.println(numero);

    }

}
