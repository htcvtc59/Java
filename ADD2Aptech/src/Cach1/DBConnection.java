package Cach1;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Monkey.TNT
 */
public class DBConnection {

    private static Connection conn;
    static final String DRIVER_JDBC = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
    static final String URL = "jdbc:sqlserver://localhost:1433;databaseName=ContactInfo";

    public static Connection getConnection() throws ClassNotFoundException, SQLException {
        Class.forName(DRIVER_JDBC);
        conn = DriverManager.getConnection(URL, "sa", "230697");
        return conn;
    }

  

}
