/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Respository;

import DataLayer.DbContext;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Types;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author DELL
 */
public class User {
    private DbContext context;
    public User(){ 
    context=new DbContext();
    }
    public int Add(String name,String account,String pass,int aut)
    {
        int check=0;
        Connection con=context.getCon();
        try {
            CallableStatement stm=con.prepareCall("{?=Call Insert_Admin(?,?,?,?)}");
            stm.setString(2, name);
            stm.setString(3,account);
            stm.setString(4,pass);
            stm.setInt(5, aut);
            stm.registerOutParameter(1, Types.INTEGER);
            stm.execute();
            check=stm.getInt(1);

                    } catch (SQLException ex) {
            Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);
        }
        return check;
    }
    public int changePass(String account,String pass,String newPass)
    {
         int check=0;
        Connection con=context.getCon();
        try {
            CallableStatement stm=con.prepareCall("{?=Call ChangePass(?,?,?)}");
            stm.setString(2, account);
            stm.setString(3,pass);
            stm.setString(4, newPass);
            stm.registerOutParameter(1, Types.INTEGER);
            stm.execute();
            check=stm.getInt(1);

                    } catch (SQLException ex) {
            Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);
        }
        return check;
    }
    
    
}
