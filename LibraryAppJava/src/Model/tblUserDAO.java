/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


/**
 *
 * @author MacOS
 */
public class tblUserDAO {

    private Connection conn;
    private PreparedStatement stmt;
    private ResultSet rs;

    public tblUserDAO() throws ClassNotFoundException, SQLException {
        conn = DataHelper.getConnection();
    }

    public tblUser Login(String username, String password) throws SQLException {
        String sql = "select top 1* from tblUser where UserName=? and Password=?";
        stmt = conn.prepareStatement(sql);
        stmt.setString(1, username);
        stmt.setString(2, password);
        rs = stmt.executeQuery();
        if (rs.next()) {
            tblUser user = new tblUser();
            user.setUserName(rs.getString("UserName"));
            user.setUserFullName(rs.getString("UserFullName"));
            user.setPassword(rs.getString("Password"));
            rs.close();
            conn.close();
            return user;

        } else {
            return null;
        }

    }
    
    
    
}
