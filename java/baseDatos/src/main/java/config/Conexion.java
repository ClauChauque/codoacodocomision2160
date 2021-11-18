package config;

import java.sql.*;
import java.util.logging.
import java.util.logging.

public class Conexion {
    public String driver = "com.mysql.cj.jdbc.Driver"; //Conector de la base de datos
    public Connection getConection() throws ClassNotFoundException{
      Connection conexion = null;
      try{
          Class.forName(driver);
          conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/comision2160",
                  "root","");
      }catch(SQLException e){
          System.out.println(e.toString());
      }
      return conexion;
    }
    public static void main (String [] args) throws ClassNotFoundException, SQLException{
        Connection conexion = null;
        Conexion con = new Conexion();
        conexion = con.getConection();
        PreparedStatement ps;
        ResultSet rs;
        
        ps = conexion.prepareStatement("SELECT * FROM participantes");
        rs = ps.executeQuery();
        while (rs.next()){
            int id = rs.getInt("id");
            String nombre = rs.getString("nombres");
            String apellido = rs.getString("apellidos");
            String email = rs.getString("email");
            int telefono = rs.getInt("telefono");
            
            System.out.println("id: " + id + "\n Nombre: " + nombre + "\n Apellido: " + apellido + "\n email: " + email + "\n Telefono: " + telefono);
        }
        System.out.println("Hola");
    }
}