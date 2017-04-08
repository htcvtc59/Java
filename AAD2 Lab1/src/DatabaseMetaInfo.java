
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;

public class DatabaseMetaInfo {

    public static void main(String[] args) throws Exception {
      
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver").newInstance();
        String url = "jdbc:sqlserver://localhost:1433;databaseName=C1108G";
        Connection conn = DriverManager.getConnection(url, "sa", "230697");
       
        DatabaseMetaData metaData = conn.getMetaData();
        String databaseProductName = metaData.getDatabaseProductName();
        String databaseProductVersion = metaData.getDatabaseProductVersion();
        System.out.printf("Name: %s Version: %s\n", databaseProductName, databaseProductVersion);
        PreparedStatement prst = conn.prepareStatement("select t01.*,getdate() as current_day from persons t01");
     
        ResultSet rs = prst.executeQuery();
        ResultSetMetaData rsMeta = rs.getMetaData();

        for (int i = 1; i <= rsMeta.getColumnCount(); i++) {
            String columnName = rsMeta.getColumnName(i);
            System.out.println("COLUMN NAME: " + columnName);
        }

        
        rs.close();
        conn.close();
    }
}
