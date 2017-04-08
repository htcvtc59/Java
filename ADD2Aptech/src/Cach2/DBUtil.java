/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cach2;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Monkey.TNT
 */
public class DBUtil {
     private static Connection conn;
 static final String JDBC_DRIVER = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
 static final String DB_URL = "jdbc:sqlserver://localhost:1433;databaseName=ContactInfo";
 static final String DB_USER = "sa";
 static final String DB_PASS = "230697";

 public static Connection getConnection() {
  if (conn != null) {
   return conn;
  } else {

   try {
    Class.forName(JDBC_DRIVER);
    conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);
   } catch (Exception e) {
    e.printStackTrace();
   }

   return conn;
  }
 }
    
}
