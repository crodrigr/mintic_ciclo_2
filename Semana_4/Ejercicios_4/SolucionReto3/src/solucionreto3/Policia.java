
package solucionreto3;

public class Policia extends Persona {

    private String placa;

    public Policia() {
    }

    public Policia(String placa, String nombres, String apellidos, String direccion, String telefono, String cedula) {
        super(nombres, apellidos, direccion, telefono, cedula);
        this.placa = placa;
    }

   
    

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }
    
                                       //   ABEDH
    @Override                         //dat="12548"
    public void calcularCoincidencia(String dato) {
       String placa="";
       for(int i=0;i<dato.length();i++){
            int num=Integer.parseInt(String.valueOf(dato.charAt(i)));            
            placa+=SDP_Reto3.alfabeto[num-1];
       }
       if(this.placa.equals(placa)){
         setPorcentajeCoincidencia(100);
       }else{
           setPorcentajeCoincidencia(0);
       }
       
       
    }
    
    @Override
    public void display(){
      System.out.println("Funcionario del SPD");
      super.display();
      System.out.println("Placa: "+this.placa);
    
    }
    
}
