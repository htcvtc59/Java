/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package session02.proc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

/**
 *
 * @author ChuTuanLuyen
 */
public class StoreProcedureDemo {

    public static void main(String[] args) throws Exception {
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver").newInstance();
        String url = "jdbc:sqlserver://localhost:1433;databaseName=C1108G";
        Connection conn = DriverManager.getConnection(url, "sa", "12345678");
        System.out.println("Connection: " + conn);
        //Trieu goi Store Procedure
        CallableStatement cs = conn.prepareCall("{call proc_viewPersons()}");
        ResultSet rs = cs.executeQuery();
        while(rs.next()){
            System.out.println("Name; " + rs.getString(2));
        }

        rs.close();
        cs.close();

        conn.close();
    }
}
