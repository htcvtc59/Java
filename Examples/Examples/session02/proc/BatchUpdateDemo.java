/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package session02.proc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 *
 * @author ChuTuanLuyen
 */
public class BatchUpdateDemo {

    public static void main(String[] args) throws Exception {
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver").newInstance();
        String url = "jdbc:sqlserver://localhost:1433;databaseName=C1108G";
        Connection conn = DriverManager.getConnection(url, "sa", "12345678");
        System.out.println("Connection: " + conn);
        Statement st = conn.createStatement();
        for(int i=0; i< 10; i++){
            st.addBatch("insert into persons values('Name-"+i+"')");
        }
        //execute Batch
        st.executeBatch();

        st.close();
        conn.close();
    }
}
