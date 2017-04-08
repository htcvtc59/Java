import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class PreparedStatementDemo {

    public static void main(String[] args) throws Exception {
      
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver").newInstance();
        String url = "jdbc:sqlserver://localhost:1433;databaseName=C1108G";
        Connection conn = DriverManager.getConnection(url, "sa", "230697");
        String sql = "select * from persons where name like ?";
        PreparedStatement prst = conn.prepareStatement(sql);
       
        prst.setString(1, "PHuong");
        ResultSet rs = prst.executeQuery();
        while (rs.next()) {
            System.out.println(rs.getString(2));
        }

        sql = "update persons set name = ? where id=?";
        prst = conn.prepareStatement(sql);
        prst.setString(1, "Trung XYZQ");
        prst.setInt(2, 5);
        prst.executeUpdate();

        rs.close();
        prst.close();
        conn.close();
    }
}