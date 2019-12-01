package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.Usuario;

public class Operaciones {

    private String jdbcURL = "jdbc:mysql://localhost:3306/gamesplaza";
    private String jdbcUsername = "root";
    private String jdbcPassword = "12345";

    public Operaciones() {

    }

    public Usuario logear(String correo, String contra) {
        Connection conn;
        PreparedStatement ps;
        ResultSet rs;
        Usuario usuario = null;
        String sql = "SELECT nombre, apellido, correo, nivel FROM usuarios WHERE correo = '" + correo + "' AND contra = '" + contra + "';";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(this.jdbcURL, this.jdbcUsername, this.jdbcPassword);
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            
            if (rs.next()) {
                String nombre = rs.getString(1);
                String apellido = rs.getString(2);
                String mail = rs.getString(3);
                int nivel = rs.getInt(4);
                usuario = new Usuario(nombre, apellido, mail, nivel);
            } 
            
            conn.close();
            System.out.println("El usuario es = " + usuario);

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return usuario;

    }
    
    public boolean existe(String correo){
        Connection conn;
        PreparedStatement ps;
        ResultSet rs;
        boolean existe = false;
        String sql = "SELECT correo FROM usuarios WHERE correo = '" + correo + "';";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(this.jdbcURL, this.jdbcUsername, this.jdbcPassword);
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            
            if (rs.next()) {
                existe = true;
            } else {
                existe = false;
            }
            
            conn.close();
            System.out.println("El correo del usuario " + (existe?"ya existe":"está disponible"));

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return existe;
    }
    
    public boolean registrarUsuario(String nombre, String apellido, String correo, String contra) {
        if (nombre == null || apellido == null || correo == null || contra == null) {
            return false;
        }
        try {
            Connection conn;
            PreparedStatement ps;
            String sql = "INSERT INTO usuarios (nombre,apellido,correo,contra,nivel) "
                    + "VALUES(?,?,?,?,?);";
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(this.jdbcURL, this.jdbcUsername, this.jdbcPassword);
            ps = conn.prepareCall(sql);
            ps.setString(1, nombre);
            ps.setString(2, apellido);
            ps.setString(3, correo);
            ps.setString(4, contra);
            ps.setInt(5, 2);
            ps.executeUpdate();
            conn.close();
            System.out.println("Se registró el correo " + correo);
            return true;
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
    
}
