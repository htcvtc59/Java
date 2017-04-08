/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author VuongNguyenVan
 */
public class DataHelper {

    private static final String url = "jdbc:sqlserver://localhost:1433;databaseName=Project";
    private static final String user = "sa";
    private static final String pass = "230697";

    private PreparedStatement ps;
    private ResultSet rs;
    private static Connection con;

    public static PreparedStatement buildSQL(String sql) throws ClassNotFoundException, SQLException {

        Class.forName(com.microsoft.sqlserver.jdbc.SQLServerDriver.class.getName());
        con = DriverManager.getConnection(url, user, pass);
        return con.prepareStatement(sql);

    }

    public static void CloseConnect() throws SQLException {
        con.close();
    }

    public static Connection getConnection() throws ClassNotFoundException, SQLException {
        Class.forName(com.microsoft.sqlserver.jdbc.SQLServerDriver.class.getName());
        con = DriverManager.getConnection(url, user, pass);
        return con;
    }
}
