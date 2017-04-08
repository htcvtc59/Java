
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Connector {

    public static void main(String[] args) throws Exception {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver").newInstance();
            String url = "jdbc:sqlserver://localhost:1433;databaseName=c1108g";
            String username = "sa";
            String password = "230697";
            Connection connection = DriverManager.getConnection(url, username, password);
            
            System.out.println("Connected: " + connection);

            Statement st = connection.createStatement();

            String query = "select * from persons";
            ResultSet rs = st.executeQuery(query);

            while (rs.next()) {
                String name = rs.getString(2);
                System.out.println("Name: " + name);
            }

            query = "INSERT INTO PERSONS VALUES('Phuong')";
            int i = st.executeUpdate(query);
            if (i > 0) {
                System.out.println("Inserted");
            } else {
                System.out.println("No row affected");
            }
            rs.close();
            st.close();
            connection.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
