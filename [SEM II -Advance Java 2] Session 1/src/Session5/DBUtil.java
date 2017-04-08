/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Session5;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Monkey.TNT
 */
public class DBUtil {

    static Connection con = null;

    public DBUtil() {
        try {

            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DBUtil.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    static Connection getConnection() {
        if (con == null) {
            try {
                String url = "jdbc:sqlserver://127.0.0.1:1433;instanceName=MSSQLSERVER;databaseName=Allofstudent";
                con = DriverManager.getConnection(url, "sa", "230697");
            } catch (SQLException ex) {
                Logger.getLogger(DBUtil.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return con;
    }
    static Statement stm = null;

   static Statement getStatement() {

        try {
            stm = getConnection().createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            return stm;
        } catch (SQLException ex) {
            Logger.getLogger(DBUtil.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public static ResultSet getResultSet(String sql) {
        try {
            ResultSet rs = getStatement().executeQuery(sql);
            return rs;
        } catch (SQLException ex) {
            Logger.getLogger(DBUtil.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public static int exeQuery(String sql) {
        try {
            int result = getStatement().executeUpdate(sql);
            return result;
        } catch (SQLException ex) {
            Logger.getLogger(DBUtil.class.getName()).log(Level.SEVERE, null, ex);
        }
        return -1;
    }

}
