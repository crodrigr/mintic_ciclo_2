package datos;

import static datos.Conexion.*;
import domain.Persona;
import java.sql.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PersonaDAO {

    private static final String SQL_SELECT = "SELECT Id, Nombres, Apellidos, Cedula, Direccion,Telefono,Cromosoma FROM persona";
    private static final String SQL_INSERT = "INSERT INTO persona(Nombres, Apellidos, Cedula, Direccion,Telefono,Cromosoma) VALUES(?, ?, ?, ?,?,?)";
    private static final String SQL_UPDATE = "UPDATE persona SET Nombres = ?, Apellidos = ?, Cedula = ?, Direccion = ?,Telefono = ?,Cromosoma = ? WHERE Id = ?";
    private static final String SQL_DELETE = "DELETE FROM persona WHERE id_persona = ?";
    
    public List<Persona> seleccionar() {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Persona persona = null;
        List<Persona> personas = new ArrayList<>();

        try {
            conn = getConnection();
            stmt = conn.prepareStatement(SQL_SELECT);
            rs = stmt.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("Id");
                String nombres = rs.getString("Nombres");
                String apellidos = rs.getString("Apellidos");
                String cedula = rs.getString("Cedula");
                String telefono = rs.getString("Telefono");
                String direccion = rs.getString("Direccion");
                String cromosoma = rs.getString("Cromosoma");


                persona = new Persona(id,nombres,apellidos,cedula,direccion,telefono,cromosoma);

                personas.add(persona);
            }
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            try {
                close(rs);
                close(stmt);
                close(conn);
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }
        }

        return personas;
    }
    
    public int insertar(Persona persona){
        Connection conn = null;
        PreparedStatement stmt = null;
        int registros = 0;
        try {
            conn = getConnection();
            stmt = conn.prepareStatement(SQL_INSERT);
            stmt.setString(1, persona.getNombres());
            stmt.setString(2, persona.getApellidos());
            stmt.setString(3, persona.getCedula());
            stmt.setString(4, persona.getDireccion());
            stmt.setString(5, persona.getTelefono());
            stmt.setString(6, persona.getCromosoma());
            registros = stmt.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
        finally{
            try {
                close(stmt);
                close(conn);
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }
        }
        return registros;
    }
    
    public int actualizar(Persona persona){
        Connection conn = null;
        PreparedStatement stmt = null;
        int registros = 0;
        try {
           
            conn = getConnection();
            stmt = conn.prepareStatement(SQL_UPDATE);
            stmt.setString(1, persona.getNombres());
            stmt.setString(2, persona.getApellidos());
            stmt.setString(3, persona.getCedula());
            stmt.setString(4, persona.getDireccion());
            stmt.setString(6, persona.getTelefono());
            stmt.setString(7, persona.getCromosoma());
            registros = stmt.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
        finally{
            try {
                close(stmt);
                close(conn);
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }
        }
        return registros;
    }
    
     public int eliminar(Persona persona){
        Connection conn = null;
        PreparedStatement stmt = null;
        int registros = 0;
        try {
            conn = getConnection();
            stmt = conn.prepareStatement(SQL_DELETE);
            stmt.setInt(1, persona.getId());
            registros = stmt.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
        finally{
            try {
                close(stmt);
                close(conn);
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }
        }
        return registros;
    }
}
