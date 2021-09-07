import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
public class IntroduccionJDBC {
     public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/test?useSSL=false&useTimezone=true&serverTimezone=UTC&allowPublicKeyRetrieval=true";
        try {
            //Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conexion = DriverManager.getConnection(url, "root", "admin");
            Statement instruccion = conexion.createStatement();
            var sql = "SELECT Id, Nombres, Apellidos, Cedula, Direccion, Telefono, Cromosoma FROM test.persona";
            ResultSet resultado = instruccion.executeQuery(sql);
            while(resultado.next()){
                System.out.print("Id Persona: " + resultado.getInt("Id"));
                System.out.print(" Nombre: " + resultado.getString("Nombres"));
                System.out.print(" Apellido: " + resultado.getString("Apellidos"));
                System.out.print(" Email: " + resultado.getString("Cedula"));
                System.out.print(" Telefono: " + resultado.getString("Direccion"));
                System.out.print(" Cromosoma: " + resultado.getString("Cromosoma"));
                System.out.println("");
            }
            resultado.close();
            instruccion.close();
            conexion.close();
        }catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
    }
    
    
}
