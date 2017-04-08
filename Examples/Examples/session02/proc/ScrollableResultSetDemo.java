/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package session02.proc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author ChuTuanLuyen
 */
public class ScrollableResultSetDemo {

    public static void main(String[] args) throws Exception {
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver").newInstance();
        String url = "jdbc:sqlserver://localhost:1433;databaseName=C1108G";
        Connection conn = DriverManager.getConnection(url, "sa", "12345678");
        System.out.println("Connection: " + conn);
        PreparedStatement prst = conn.prepareStatement("select * from Persons", ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
        ResultSet rs = prst.executeQuery();
        //ResultSet now can be scrollable
        if (rs.first()) {//Dong dau tien
            System.out.println("Dong dau tien:");
            System.out.println("Name: " + rs.getString(2));
        }
        if (rs.next()) {
            System.out.println("Dong tiep theo:");
            System.out.println("Name: " + rs.getString(2));
        }
        if (rs.previous()) {
            System.out.println("Quay lai dong dau tien:");
            System.out.println("Name: " + rs.getString(2));
        }
        if (rs.relative(3)) {
            System.out.println("3 dong tiep theo:");
            System.out.println("Name: " + rs.getString(2));
        }
        if (rs.absolute(5)) {
            System.out.println("Dong 5:");
            System.out.println("Name: " + rs.getString(2));
        }
        if (rs.relative(2)) {
            System.out.println("2 dong tiep theo:");
            System.out.println("Name: " + rs.getString(2));
        }
        
        rs.close();
        prst.close();
        conn.close();

    }
}
