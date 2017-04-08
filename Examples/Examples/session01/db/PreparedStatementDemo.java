/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package session01.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author ChuTuanLuyen
 */
public class PreparedStatementDemo {

    public static void main(String[] args) throws Exception {
        //Tao ket noi database
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver").newInstance();
        String url = "jdbc:sqlserver://localhost:1433;databaseName=C1108G";
        Connection conn = DriverManager.getConnection(url, "sa", "12345678");
        String sql = "select * from persons where name like ?";
        PreparedStatement prst = conn.prepareStatement(sql);
        //Cai dat tham so
        prst.setString(1, "PHuong");
        ResultSet rs = prst.executeQuery();
        while (rs.next()) {
            System.out.println(rs.getString(2));
        }

        //Insert, Update, delete
        sql = "update persons set name = ? where id=?";
        prst = conn.prepareStatement(sql);
        prst.setString(1, "Trung XYZQ");
        prst.setInt(2, 5);
        prst.executeUpdate();

        rs.close();
        prst.close();
        conn.close();
    }
}
