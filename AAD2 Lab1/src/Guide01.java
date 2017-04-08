
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Monkey.TNT
 */
public class Guide01 {

    public static void main(String[] args) {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://localhost:1433;databaseName=c1108g";
            String username = "sa";
            String password = "230697";
            Connection connection = DriverManager.getConnection(url, username, password);
            System.out.println("Connected: " + connection);

            Statement st = connection.createStatement();

            String query = "select * from persons";

            st.executeQuery(query);
            ResultSet rs = st.executeQuery(query);//using for select
            //Moi lan rs.next() thi se chuyen sang dong tiep theo
            while (rs.next()) {
                String name = rs.getString(2);
                System.out.println("Name: " + name);
            }

            String query2 = "INSERT INTO PERSONS VALUES('Phuong')";
            int i = st.executeUpdate(query2);//executeUpdate using for Insert, update, delete
            if (i > 0) {
                System.out.println("Inserted");
            } else {
                System.out.println("No row affected");
            }

        } catch (Exception x) {
            System.out.println("Unable to load the driver class!");
        }
    }

}
