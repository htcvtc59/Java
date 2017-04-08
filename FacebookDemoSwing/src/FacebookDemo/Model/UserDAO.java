/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FacebookDemo.Model;


import java.sql.*;

/**
 *
 * @author Monkey.TNT
 */
public class UserDAO {
    public static ResultSet rs = null;
    public static PreparedStatement stm = null;

    
    private static PreparedStatement getPreparedStatement(String sql) throws ClassNotFoundException, SQLException {
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        String url = "jdbc:sqlserver://127.0.0.1:1433;databaseName=thefakebook";
        Connection con = DriverManager.getConnection(url, "sa", "230697");
        return con.prepareStatement(sql);
    }

    public boolean register(User user) throws ClassNotFoundException, SQLException {
        String sql = "insert into fb_user(name,email,password,gender) values (?,?,?,?)";
        stm = getPreparedStatement(sql);
        stm.setString(1, user.name);
        stm.setString(2, user.email);
        stm.setString(3, user.password);
        stm.setString(4, user.gender);
        int result = stm.executeUpdate();
        stm.getConnection().close();
        return result == 1;
    }
    

    public static String TestConnect() {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://127.0.0.1:1433;databaseName=thefakebook";
            Connection con = DriverManager.getConnection(url, "sa", "230697");
            return "Connection successful";
        } catch (Exception e) {
            return "Connection fail";
        }
    }

    public static ResultSet Login(String User, String Password) throws SQLException {
        String sql = "SELECT * FROM dbo.fb_user WHERE email=? and password=?";
        try {
            stm = getPreparedStatement(sql);
            stm.setString(1, User);
            stm.setString(2, Password);  
            return rs = stm.executeQuery();    
        } catch (Exception e) {
            return rs = null;
        }
    }
    
    

}
