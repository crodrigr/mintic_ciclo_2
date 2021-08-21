package ciclo_2_4_proyecto_banco_83;

import java.util.ArrayList;



public class Cliente extends Persona{
    
    //Atributo
    private ArrayList<Cuenta> cuentas=new ArrayList<Cuenta>();
  
    
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
    
    public void setCuenta(Cuenta c) {
        this.cuentas.add(c);
    }
    
    public void guardarCuenta(Cuenta cuenta){
       this.cuentas.add(cuenta);
    }
    
    @Override
    public void display(){
      super.display();
      System.out.println("---Información de las cuentas del cliente");
      for(Cuenta cta :  cuentas){
         cta.display();
      }
    }
    
    
}
