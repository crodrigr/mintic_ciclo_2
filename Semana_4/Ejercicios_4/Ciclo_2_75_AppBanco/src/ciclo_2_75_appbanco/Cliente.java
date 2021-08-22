
package ciclo_2_75_appbanco;

import java.util.ArrayList;

public class Cliente extends Persona{
    
    private ArrayList<Cuenta> cuentas;

    public Cliente(){
    }   
    
    public Cliente(String nombres, String apellidos, String cedula, String direccion, String telefono) {
        super(nombres, apellidos, cedula, direccion, telefono);
        cuentas=new ArrayList<Cuenta>();
    }

    public ArrayList<Cuenta> getCuentas() {
        return cuentas;
    }

    public void setCuentas(ArrayList<Cuenta> cuentas) {
        this.cuentas = cuentas;
    }
    
    @Override
    public void display(){
       super.display();
       System.out.println("Cuentas: ");
       for(Cuenta c  : this.cuentas  ){
          c.display();
       }
    }
    
    public void guardarCuenta(Cuenta cuenta){
      this.cuentas.add(cuenta);
    }
    
    
}
