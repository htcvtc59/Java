/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataLayer;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author DELL
 */
public class DbContext {
    private static Connection con;
    public static int config(String server,int port,String account,String pass,String db){
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            con=DriverManager.getConnection("jdbc:sqlserver://"+server+":"+port+";databaseName="+db,account,pass);
        } catch (ClassNotFoundException | SQLException ex) {
            return -1;
        }
        return 1;
        
    }

    public static Connection getCon() {
        return con;
    }
    
    
}
