/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package session02.proc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author ChuTuanLuyen
 */
public class UpdatableResultsetDemo {

    public static void main(String[] args) throws Exception {
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver").newInstance();
        String url = "jdbc:sqlserver://localhost:1433;databaseName=C1108G";
        Connection conn = DriverManager.getConnection(url, "sa", "12345678");
        System.out.println("Connection: " + conn);
        PreparedStatement prst = conn.prepareStatement("select * from Persons", ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
        ResultSet rs = prst.executeQuery();
        //ResultSet now can be scrollable, and updatable
        //cap nhat
        if(rs.absolute(5)){
            rs.updateString(2, "Trung XYZ");
            rs.updateRow();
        }
        //xoa
        if(rs.last()){
            rs.deleteRow();
        }
        //them moi
        rs.moveToInsertRow();
        rs.updateString(2, "RandomName");
        rs.insertRow();
        //Quay lai dong truoc do
        rs.moveToCurrentRow();


        rs.close();
        prst.close();
        conn.close();
    }
}
