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

}
