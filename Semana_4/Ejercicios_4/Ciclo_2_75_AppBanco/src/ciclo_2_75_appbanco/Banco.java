
package ciclo_2_75_appbanco;

import java.util.ArrayList;

public class Banco {
    //Atributos
    private String nombre;
    private String direccion;
    private int Id;
    private ArrayList<Empleado> empleados;
    private ArrayList<Cliente> clientes;

    public Banco() {
    }

    public Banco(String nombre, String direccion, int Id) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.Id = Id;
        empleados=new ArrayList<Empleado>();
        clientes=new ArrayList<Cliente>();
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

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }
            
    public void display(){
       System.out.println("Nombre: "+this.nombre);
       System.out.println("Dirección: "+this.direccion);
       System.out.println("Id: "+this.Id);
    }
    
    public void guardarEmpleado(Empleado emp){
      this.empleados.add(emp);
      
         
    }
    public void guardarCliente(Cliente cliente){
      this.clientes.add(cliente);
      
         
    }
    
    public void mostrarClientes(){
        System.out.println("Listado de clientes");
       for(Cliente c: this.clientes){
          c.display();
          System.out.println("-------------------------------");
       }
    
    }
    public void mostrarEmpleados(){
        System.out.println("Listado de Empleados");
       for(Empleado e: this.empleados){
          e.display();
          System.out.println("-------------------------------");
       }
    
    }
    
    public int buscarCliente(String cedula){
          
        for(int i=0;i<this.clientes.size();i++){
            Cliente c=this.clientes.get(i);
            if(c.getCedula().equals(cedula)){
               return i;           
            }
        }
        return -1;
     
    }
    
     public void cerraCuenta(int num){
          
        for(Cliente c: this.clientes){
            for(Cuenta cuenta: c.getCuentas()){
               if(cuenta.getNumero()==num){
                  cuenta.cerrar();
               }
            
            }
            
        }       
     
    }
    
    public int getCantidadCuentas(){
       int numCuenta=0;
       for(Cliente c: this.clientes){
            numCuenta+=c.getCuentas().size();          
       }
       return numCuenta;
    }
}
