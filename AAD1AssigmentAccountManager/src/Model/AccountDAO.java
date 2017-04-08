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
 * @author Monkey.TNT
 */
public class AccountDAO {

    private final Connection conn;
    private PreparedStatement stmt;
    private ResultSet resultSet;

    public AccountDAO() throws ClassNotFoundException, SQLException {
        conn = DbUtils.getConnection();
    }

    public void addAccount(Account account) throws SQLException, Exception {
        String sql = "insert into Account values(?,?,?,?,?)";
        stmt = conn.prepareStatement(sql);
        stmt.setString(1, account.getUsername());
        stmt.setString(2, account.getFullname());
        stmt.setString(3, account.getEmail());
        stmt.setString(4, account.getPassword());
        stmt.setInt(5, account.getCode());
        stmt.executeUpdate();
        conn.close();
        stmt.close();
    }

    public Account login(String username, String password) throws ClassNotFoundException, SQLException {
        String sql = "select top 1 * from Account where Username=? and Password=? ";
        stmt = conn.prepareStatement(sql);
        stmt.setString(1, username);
        stmt.setString(2, password);
        resultSet = stmt.executeQuery();
        if (resultSet.next()) {
            Account account = new Account();
            account.setUsername(resultSet.getString("Username"));
            account.setFullname(resultSet.getString("Fullname"));
            account.setEmail(resultSet.getString("Email"));
            account.setPassword(resultSet.getString("Password"));
            resultSet.close();
            conn.close();
            return account;
        } else {
            return null;
        }
    }

    public Account checkmailaccount(String emaill) throws ClassNotFoundException, SQLException {
        String sql = "select top 1 * from Account where Email=? ";
        stmt = conn.prepareStatement(sql);
        stmt.setString(1, emaill);
        resultSet = stmt.executeQuery();
        if (resultSet.next()) {
            Account account = new Account();
            account.setEmail(resultSet.getString("Email"));
            resultSet.close();
            conn.close();
            return account;
        } else {
            return null;
        }
    }

    public Account checkuseraccount(String username) throws ClassNotFoundException, SQLException {
        String sql = "select top 1 * from Account where Username=? ";
        stmt = conn.prepareStatement(sql);
        stmt.setString(1, username);
        resultSet = stmt.executeQuery();
        if (resultSet.next()) {
            Account account = new Account();
            account.setEmail(resultSet.getString("Username"));
            resultSet.close();
            conn.close();
            return account;
        } else {
            return null;
        }
    }

    public void updatepassword(String email, String password) throws SQLException {
        String sql = "update Account set Password=? where Email=?";
        stmt = conn.prepareStatement(sql);
        stmt.setString(1, password);
        stmt.setString(2, email);
        stmt.executeUpdate();
        stmt.close();
        conn.close();

    }

    public void deleteemail() throws SQLException {
        String sql = "delete from Account where ID in (select top 1 ID from Account order by ID desc)";
        stmt = conn.prepareStatement(sql);
        stmt.executeUpdate();
        stmt.close();
        conn.close();

    }

    public void updatecode() throws SQLException {
        String sql = "update Account set Code=1 where ID in (select top 1 ID from Account order by ID desc)";
        stmt = conn.prepareStatement(sql);
        stmt.executeUpdate();
        stmt.close();
        conn.close();

    }

    public void deletecode() throws SQLException {
        String sql = "delete from Account where Code=0";
        stmt = conn.prepareStatement(sql);
        stmt.executeUpdate();
        stmt.close();
        conn.close();

    }

    public Account thesamepass(String password) throws SQLException {
        String sql = "select top 1* from Account where Password=?";
        stmt = conn.prepareStatement(sql);
        stmt.setString(1, password);
        resultSet = stmt.executeQuery();
        if (resultSet.next()) {
            Account account = new Account();
            account.setPassword(resultSet.getString("Password"));
            resultSet.close();
            stmt.close();
            conn.close();
            return account;
        } else {
            return null;
        }

    }

}
