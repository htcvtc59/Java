/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Respository;

import DataLayer.DbContext;
import App.Phong;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;



/**
 *
 * @author DELL
 */
public class ManageRoom {
    private DbContext context;
    public ManageRoom()
    {
        context=new DbContext();
    }
    public ArrayList<Phong> Manage(String date,String phong)
    {
        ArrayList<Phong> data=new ArrayList<Phong>();
        Connection con=context.getCon();
        try {
            CallableStatement stm=con.prepareCall("{Call ManagePhong(?,?)}");
            stm.setString(1, date);
            stm.setString(2, phong);
            ResultSet result=stm.executeQuery();
            while(result.next())
            {
                data.add(new Phong(result.getString(2),result.getInt(1), result.getInt(3), result.getInt(4)));
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(ManageRoom.class.getName()).log(Level.SEVERE, null, ex);
        }
        return data;
    }
    
    
}
