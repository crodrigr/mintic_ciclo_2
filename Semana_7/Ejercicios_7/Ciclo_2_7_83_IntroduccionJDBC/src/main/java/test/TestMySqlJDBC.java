package test;


import java.sql.*;
import java.sql.SQLException;
import datos.*;


public class TestMySqlJDBC {
    public static void main(String[] arg){
       
      
       try{
           
       Connection conexion = Conexion.getConnection();  
       Statement instruccion = conexion.createStatement();       
       String sql="SELECT Id, Nombres, Apellidos, Cedula, Direccion, Telefono, Cromosoma FROM test.persona";
       ResultSet resultado = instruccion.executeQuery(sql); 
       while(resultado.next()){
         System.out.println("Id: " + resultado.getInt("Id"));
         System.out.println("Nombres: " + resultado.getString("Nombres"));
         System.out.println("Apellidos: " + resultado.getString("Apellidos"));
         System.out.println("Cedula: " + resultado.getString("Cedula"));
         System.out.println("Direccion: " + resultado.getString("Direccion"));
         System.out.println("Telefono: " + resultado.getString("Telefono"));
         System.out.println("Cromosoma: " + resultado.getString("Cromosoma")+"\n");
       }             
       
       Conexion.close(resultado);
       Conexion.close(instruccion);
       Conexion.close(instruccion);
           
       }catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
       
    
    }  
}
