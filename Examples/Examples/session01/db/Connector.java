/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package session01.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author ChuTuanLuyen
 */
public class Connector {
    public static void main(String[] args) throws Exception{
        try{
        //Tao ket noi database
        //Buoc 01: Register Driver Approach 01
        //com.microsoft.sqlserver.jdbc.SQLServerDriver
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver").newInstance();
        //Approach 02 for reistering driver:
        //DriverManager.registerDriver(new com.microsoft.sqlserver.jdbc.SQLServerDriver());
        //Buoc 02: tao ket noi
        String url = "jdbc:sqlserver://localhost:1433;databaseName=c1108g";
        String username="sa";
        String password= "12345678";
        Connection connection = DriverManager.getConnection(url, username, password);
        //Co the gap mot so loi: khong ket noi duoc cong, sai URL, sai username, password
        System.out.println("Connected: " + connection.getClientInfo());

        //Buoc 03: Thuc thi cac cau lenh
        //Buoc 03.01: Tao ra statement
        Statement st = connection.createStatement();
        //Buoc 03.02 (optiinal): select table, return resultset
        String query = "select * from persons";
        ResultSet rs = st.executeQuery(query);//using for select
        //Moi lan rs.next() thi se chuyen sang dong tiep theo
        while(rs.next()){
            String name = rs.getString(2);
            System.out.println("Name: " + name);
        }
        //Buoc 03.03: Cac cau lenh update neu co
        query = "INSERT INTO PERSONS VALUES('Phuong')";
        int i = st.executeUpdate(query);//executeUpdate using for Insert, update, delete
        if(i> 0){
            System.out.println("Inserted");
        }else{
            System.out.println("No row affected");
        }
        //Close Resources
        rs.close();
        st.close();
        connection.close();

        }catch(SQLException e){
            e.printStackTrace();
        }
    }
}
