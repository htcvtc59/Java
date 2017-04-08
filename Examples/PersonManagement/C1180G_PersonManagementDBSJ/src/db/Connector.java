/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author ChuTuanLuyen
 */
public class Connector {

    public Connection getConnection() throws Exception {
        //1. Register driver
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver").newInstance();
        //2. Establish connection
        String url = "jdbc:sqlserver://localhost:1433;databaseName=C1108G";
        return DriverManager.getConnection(url, "sa", "12345678");
    }

    public static void close(ResultSet v) {
        if (v != null) {
            try {
                v.close();
            } catch (Exception ignore) {
            }
        }
    }

    public static void close(PreparedStatement v) {
        if (v != null) {
            try {
                v.close();
            } catch (Exception ignore) {
            }
        }
    }

    public static void close(Connection v) {
        if (v != null) {
            try {
                v.close();
            } catch (Exception ignore) {
            }
        }
    }
}
