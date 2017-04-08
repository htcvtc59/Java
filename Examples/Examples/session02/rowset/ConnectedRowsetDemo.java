/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package session02.rowset;

import com.sun.rowset.JdbcRowSetImpl;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author ChuTuanLuyen
 */
public class ConnectedRowsetDemo {

    public static void main(String[] args) throws Exception {
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver").newInstance();
        String url = "jdbc:sqlserver://localhost:1433;databaseName=C1108G";
        Connection conn = DriverManager.getConnection(url, "sa", "12345678");
        PreparedStatement st = conn.prepareStatement("select * from persons",ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
        ResultSet rs = st.executeQuery();
        //Create Connected Rowset
        JdbcRowSetImpl rowset = new JdbcRowSetImpl(rs);
        boolean b = rowset.next();
        if (b) {
            String name = rowset.getString(2);
            System.out.println("Name; " + name);
        }
        b = false;
        b = rowset.relative(3);
        if(b){
            System.out.println("Gia tri tinh 3 dong tu dong dau tien");
            String name = rowset.getString(2);
            System.out.println("Name; " + name);
        }
        //Cap nhat du lieu: luu y: da de resultset type la scrollable, va updateable
        //Them moi du lieu
        rowset.moveToInsertRow();
        rowset.updateString(2, "Thanh 33322");//Truong 1 la khoa chinh tu tang
        rowset.insertRow();
        rowset.moveToCurrentRow();
        //Cap nhat
        b = rowset.first();
        if(b){
            //Neu co dong dau tien
            rowset.updateString(2, "Luong Miss C1108G");
            rowset.updateRow();//Commit
        }
        b = rowset.first();
        rowset.relative(2);
        if(b){
            //neu co dong cuoi cung
            rowset.deleteRow();
        }

        rs.close();
        conn.close();


    }
}
