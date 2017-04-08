/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package session02.rowset;

import com.sun.rowset.CachedRowSetImpl;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Iterator;
import javax.sql.rowset.CachedRowSet;

/**
 *
 * @author ChuTuanLuyen
 */
public class DisconnectedRowset {

    public static void main(String[] args) throws Exception {
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver").newInstance();
        //Tao ra disconnected Rowset
        CachedRowSetImpl rowset = new CachedRowSetImpl();
        rowset.setUrl("jdbc:sqlserver://localhost:1433;databaseName=C1108G");
        rowset.setUsername("sa");
        rowset.setPassword("12345678");
        rowset.setCommand("select * from student");
        rowset.execute();
        //Dong cac resource
        //Lay du lieu ke ca khi da dong ResultSet, Connection
        while (rowset.next()) {
            String name = rowset.getString(2);
            System.out.println(name);
        }


        //Thuc hien update, delete
        rowset.setTableName("student");
        rowset.setKeyColumns(new int[]{1});

        rowset.last();
        rowset.updateString(2, "LUYEN 02");
        rowset.updateRow();
        try {
            rowset.moveToInsertRow();
            rowset.updateString(01, "B003");
            rowset.updateString(2, "CHu Tuan");
            rowset.insertRow();
            rowset.moveToCurrentRow();
            System.out.println("Inserted");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        //Commit
        rowset.acceptChanges();
    }

    public static Connection getConnection() throws Exception {
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver").newInstance();
        String url = "jdbc:sqlserver://localhost:1433;databaseName=C1108G";
        return DriverManager.getConnection(url, "sa", "12345678");
    }
}
