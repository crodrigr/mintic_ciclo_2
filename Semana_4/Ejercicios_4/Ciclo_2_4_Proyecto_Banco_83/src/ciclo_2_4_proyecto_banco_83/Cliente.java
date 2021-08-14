package ciclo_2_4_proyecto_banco_83;

import java.util.ArrayList;



public class Cliente extends Persona{
    
    //Atributo
    private ArrayList<Cuenta> cuentas;
  
    
    //Metodos
    public Cliente() {
    }

    public Cliente(String nombres, String apellidos, String cedula, String direccion, String telefono) {
        super(nombres, apellidos, cedula, direccion, telefono);
    }
    
    public ArrayList<Cuenta> getCuentas() {
        return cuentas;
    }

    public void setCuentas(ArrayList<Cuenta> cuentas) {
        this.cuentas = cuentas;
    }
    
    
    
}
