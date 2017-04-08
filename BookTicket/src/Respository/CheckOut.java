/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Respository;

import DataLayer.DbContext;
import Config.ReadUser;
import ModelView.CheckLogin;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
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
public class CheckOut {

    private DbContext context;

    public CheckOut() {
        context = new DbContext();
    }

    public CheckLogin Check(String Account, String Pass) {
        int check = 0;
        String name;
        CheckLogin login = null;
        Connection con = context.getCon();
        try {
            CallableStatement stm = con.prepareCall("{?=call Login(?,?,?)}");
            stm.setString(2, Account);
            stm.setString(3, Pass);
            stm.registerOutParameter(4, Types.NVARCHAR);
            stm.registerOutParameter(1, Types.INTEGER);
            stm.execute();
            check = stm.getInt(1);
           name=stm.getString(4);
           login=new CheckLogin(check,name);
         
           

        } catch (SQLException ex) {
            Logger.getLogger(CheckOut.class.getName()).log(Level.SEVERE, null, ex);
        }
        return login;

    }
    public void writeFile(ReadUser user) 
    {
        try {
            FileOutputStream fout=new FileOutputStream(new File("C:\\Users\\DELL\\Documents\\NetBeansProjects\\AppFilmUpdate\\dist\\DangNhap.Dat"));
            ObjectOutputStream obj=new ObjectOutputStream(fout);
            obj.writeObject(user);
            
        } catch (FileNotFoundException ex) {
           
            Logger.getLogger(CheckOut.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(CheckOut.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public ReadUser readFile()
    {
        ReadUser user = null;
        try {
            FileInputStream fin=new FileInputStream(new File("C:\\Users\\DELL\\Documents\\NetBeansProjects\\AppFilmUpdate\\dist\\DangNhap.Dat"));
             ObjectInputStream obj=new ObjectInputStream(fin);
            user=(ReadUser)obj.readObject();
        } catch (FileNotFoundException ex) {
             File file=new File("C:\\Users\\DELL\\Documents\\NetBeansProjects\\AppFilmUpdate\\dist\\DangNhap.Dat");
            Logger.getLogger(CheckOut.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException | ClassNotFoundException ex) {
            Logger.getLogger(CheckOut.class.getName()).log(Level.SEVERE, null, ex);
        }
        return user;
       
    }

}
