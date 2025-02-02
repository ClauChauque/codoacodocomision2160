
package modelo;

import config.Conexion;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class AlumnosDAO {
    Connection conexion;
    public AlumnosDAO(){
        Conexion con = new Conexion();
        conexion = con.getConection();
    }
    
    //METODO LISTAR ALUMNOS
    public List<Alumnos> listarAlumnos(){
        PreparedStatement ps;
        ResultSet rs;
        List<Alumnos> lista = new ArrayList<>();
        /*List es abstracta*/
        try{
            ps = conexion.prepareStatement("SELECT * FROM participantes");
            rs = ps.executeQuery();
            while(rs.next()){
                int id = rs.getInt("id");
                String nombre = rs.getString("nombre");
                String apellido = rs.getString("apellido");
                String email = rs.getString("email");
                int telefono = rs.getInt("telefono");
                Alumnos alumnos = new Alumnos(id, nombre, apellido, email, telefono);
                lista.add(alumnos);
            }
            return lista;
        }catch(SQLException e){
            System.out.println(e.toString());
            return null;
        }
    }
    //METODO MOSTRAR ALUMNOS
    public Alumnos mostrarAlumno(int _id){
        PreparedStatement ps;
        ResultSet rs;
        Alumnos alumno = null;
        
        try{
            ps = conexion.prepareStatement("SELECT * FROM participantes WHERE id=?");
            ps.setInt(1,_id);
            rs = ps.executeQuery();
            
            while(rs.next()){
                int id = rs.getInt("id");
                String nombre = rs.getString("nombre");
                String apellido = rs.getString("apellido");
                String email = rs.getString("email");
                int telefono = rs.getInt("telefono");
                alumno = new Alumnos(id, nombre, apellido, email, telefono);
            }return alumno;
        }catch(SQLException e){
            System.out.println(e.toString());
            return null;
        }
    }
    //METODO INSERTAR ALUMNOS
    public boolean insertarAlumno(Alumnos alumno){
        PreparedStatement ps;
        try{
            ps = conexion.prepareStatement("INSERT INTO participantes (nombre,apellido,email,telefono)VALUES(?,?,?,?)");
            ps.setString(1,alumno.getNombre());
            ps.setString(2, alumno.getApellido());
            ps.setString(3, alumno.getEmail());
            ps.setInt(4,alumno.getTelefono());
            ps.execute();
            return true;
        }catch(SQLException e){
            System.out.println(e.toString());
            return false;
        }
    }
    //METODO MODIFICAR ALUMNO
    public boolean actualizarAlumno(Alumnos alumno){
        PreparedStatement ps;
        try{
            ps = conexion.prepareStatement("UPDATE participantes SET nombre=?, apellido=?, email=?, telefono=? WHERE id=?");
            ps.setString(1,alumno.getNombre());
            ps.setString(2, alumno.getApellido());
            ps.setString(3, alumno.getEmail());
            ps.setInt(4,alumno.getTelefono());
            ps.setInt(5,alumno.getId());
            ps.execute();
            return true;
        }catch(SQLException e){
            System.out.println(e.toString());
            return false;
        }
    }
    //METODO ELIMINAR ALUMNO
    public boolean eliminarAlumno(int _id){
        PreparedStatement ps;
        try{
            ps = conexion.prepareStatement("DELETE FROM participantes WHERE id=?");
            ps.setInt(1,_id);
            ps.execute();
            return true;
        }catch(SQLException e){
            System.out.println(e.toString());
            return false;
        }
    }
    //METODO PARA INGRESAR
    public boolean ingresarUsuario(String email, String clave){
        PreparedStatement ps;
        ResultSet rs;
        try{
            ps= conexion.prepareStatement("SELECT * FROM usuarios WHERE email=?");
            ps.setString(1, email);
            rs = ps.executeQuery();
            while(rs.next()){
            return email.equals(rs.getString("email"))&& clave.equals(rs.getString("password"));                
            } return false;
        }catch(SQLException e){
            System.out.println(e.toString());
            return false;
        }
    }
}
