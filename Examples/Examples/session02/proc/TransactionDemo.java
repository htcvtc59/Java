/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package session02.proc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

/**
 *
 * @author ChuTuanLuyen
 */
public class TransactionDemo {

    public static void main(String[] args) throws Exception {
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        String url = "jdbc:sqlserver://localhost:1433;databaseName=c1108g";
        Connection conn = DriverManager.getConnection(url, "sa", "12345678");
        //Begin Transaction
        conn.setAutoCommit(false);
        PreparedStatement prst = conn.prepareStatement("insert into Persons values('Long')");
        int inserted = prst.executeUpdate();
        System.out.println("Insert New Person OK(>0 means inserted): " + inserted);
        prst.close();
        prst = conn.prepareStatement("update persons set name='Luong Miss' where id=1");
        //There is no id valued 1000
        int updated = prst.executeUpdate();
        if(updated > 0){
            //commit
            conn.commit();
            System.out.println("Commited transaction");
        }else{
            conn.rollback();
            System.out.println("rolledback transaction");
        }


        conn.setAutoCommit(true);
        conn.close();
    }
}
