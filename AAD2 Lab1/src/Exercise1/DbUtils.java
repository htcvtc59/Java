package Exercise1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbUtils {

    private static Connection conn;
    static final String DRIVER_JDBC = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
    static final String URL = "jdbc:sqlserver://localhost:1433;databaseName=c1108g";

    public static Connection getConnection() throws ClassNotFoundException, SQLException {
        Class.forName(DRIVER_JDBC);
        conn = DriverManager.getConnection(URL, "sa", "230697");
        return conn;
    }
      
}
