package ciclo_2_4_proyecto_banco_83;

import java.util.ArrayList;

public class Banco {
    //Atributos

    private int id;
    private String nombre;
    private String direccion;
    private ArrayList<Empleado> empleados;
    private ArrayList<Cliente> clientes;

    public Banco() {
    }

    public Banco(int id, String nombre, String direccion) {
        this.id = id;
        this.nombre = nombre;
        this.direccion = direccion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public ArrayList<Empleado> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(ArrayList<Empleado> empleados) {
        this.empleados = empleados;
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(ArrayList<Cliente> clientes) {
        this.clientes = clientes;
    }

    public void display() {
        System.out.println("Banco: " + this.nombre);
        System.out.println("Direccion: " + this.direccion);
    }

    public void setEmpleado(Empleado emp) {
        this.empleados.add(emp);
    }

    public void setCliente(Cliente cliente) {
        this.clientes.add(cliente);
    }

    public void displayClientes() {
        System.out.println("Listado de clientes del banco " + this.nombre);
        for (Cliente cliente : clientes) {
            System.out.println("------------------");
            cliente.display();
        }
    }

    public void displayEmpleados() {
        System.out.println("Listado de empleados del banco " + this.nombre);
        for (Empleado emp : empleados) {
            System.out.println("------------------");
            emp.display();
        }
    }
    
    public void abrirCuentaCliente(int pos,Cuenta cuenta){
      clientes.get(pos).guardarCuenta(cuenta);
    }
    
    public int getNumeroCuenta(){
        int totalCuentas=0;
        for(Cliente c : clientes){
            totalCuentas+=c.getCuentas().size();
        }
       return totalCuentas;
    }
    
    public int buscarCliente(String cedula){
         for(int i=0;i<clientes.size();i++){              
             if(clientes.get(i).getCedula().equals(cedula)){
                return i;  
             }
         }
       return -1;
    }
    
    public int cerrarCuenta(int numeroCuenta){        
         for(int i=0;i<clientes.size();i++){              
             ArrayList<Cuenta> cuentas=clientes.get(i).getCuentas();
             for(int j=0;j<cuentas.size();j++){
                if(cuentas.get(j).getNumero()==numeroCuenta){
                   cuentas.get(j).cerrar();
                   return 1;
                } 
             }
         }
         return -1;
    }
    
    public int consignarCuenta(int numeroCuenta,double valor){        
         for(int i=0;i<clientes.size();i++){              
             ArrayList<Cuenta> cuentas=clientes.get(i).getCuentas();
             for(int j=0;j<cuentas.size();j++){
                if(cuentas.get(j).getNumero()==numeroCuenta){
                   cuentas.get(j).consignar(valor);
                   return 1;
                } 
             }
         }
         return -1;
    }
    
     public int retirarCuenta(int numeroCuenta,double valor){        
         for(int i=0;i<clientes.size();i++){              
             ArrayList<Cuenta> cuentas=clientes.get(i).getCuentas();
             for(int j=0;j<cuentas.size();j++){
                if(cuentas.get(j).getNumero()==numeroCuenta){
                   cuentas.get(j).retirar(valor);
                   return 1;
                } 
             }
         }
         return -1;
    }
    
    public Cliente getCliente(int pos){
        return clientes.get(pos);
    }
    
     public void procesoCalcularIntereses(){        
         for(int i=0;i<clientes.size();i++){              
             ArrayList<Cuenta> cuentas=clientes.get(i).getCuentas();
             for(int j=0;j<cuentas.size();j++){
                 cuentas.get(j).calcularInteres();
             }
         }
         System.out.println("Proceso de calcular intereses finalizó correctamente!");
         
    }

}
