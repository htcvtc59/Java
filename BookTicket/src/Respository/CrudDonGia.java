/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Respository;

import App.DonGia;
import App.LichChieu;
import DataLayer.DbContext;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author DELL
 */
public class CrudDonGia {

    private DbContext context;

    public CrudDonGia() {
        context = new DbContext();
    }

    public ArrayList<DonGia> search(String date) {
        int check = -1;
        ArrayList<DonGia> data = new ArrayList<DonGia>();
        Connection con = context.getCon();
        try {

            if (!date.equals("")) {
                CallableStatement stm = con.prepareCall("{Call GetDonGiaBy_Date(?)}");
                stm.setString(1, date);

                ResultSet result = stm.executeQuery();
                while (result.next()) {
                    data.add(new DonGia(result.getString(1), result.getInt(2), result.getFloat(3), result.getFloat(4)));
                }
            } else {
                CallableStatement stm = con.prepareCall("{Call GetDonGia}");

                ResultSet result = stm.executeQuery();
                while (result.next()) {
                    data.add(new DonGia(result.getString(1), result.getInt(2), result.getFloat(3), result.getFloat(4)));
                }
            }

          

        } catch (SQLException ex) {
            Logger.getLogger(CrudDonGia.class.getName()).log(Level.SEVERE, null, ex);
        }
        return data;

    }
    public int[] GetGioPhat(String date)
    {
         Connection con = context.getCon();
       int[] data=new int[5];
       int i=0;
        try {
            CallableStatement stm = con.prepareCall("{Call GetGioPhatBy_Date_DonGia(?)}");
            stm.setString(1, date);
            ResultSet result=stm.executeQuery();
            while(result.next())
            {
                data[i++]=result.getInt(1);
            }
            

        } catch (SQLException ex) {
            Logger.getLogger(CrudDonGia.class.getName()).log(Level.SEVERE, null, ex);
        }
        return data;
    }
    public void Add(String date, int gioPhat,float thuong, float vip) {
        int check = -1;
        Connection con = context.getCon();
        try {
            CallableStatement stm = con.prepareCall("{Call Insert_DonGia(?,?,?,?)}");
         
            stm.setString(1, date);
            stm.setInt(2, gioPhat);
            stm.setFloat(3,thuong);
            stm.setFloat(4, vip);
     
            stm.execute();
        
           

        } catch (SQLException ex) {
            Logger.getLogger(CrudDonGia.class.getName()).log(Level.SEVERE, null, ex);
        }
     
    }

    public int update(String date, int gioPhat,float thuong,float vip) {
        int check = 0;
        Connection con = context.getCon();
        try {
            CallableStatement stm = con.prepareCall("{?=Call Update_DonGia(?,?,?,?)}");
            stm.registerOutParameter(1, Types.INTEGER);
            stm.setString(2, date);
            stm.setInt(3, gioPhat);
            stm.setFloat(4,thuong);
            stm.setFloat(5,vip);
            
            stm.execute();
            check = stm.getInt(1);
            

        } catch (SQLException ex) {
            Logger.getLogger(CrudDonGia.class.getName()).log(Level.SEVERE, null, ex);
        }
        return check;
    }

    public int remove(String date, int gioPhat) {
        int check = 0;
        Connection con = context.getCon();
        try {

            CallableStatement stm = con.prepareCall("{?=Call Remove_DonGia(?,?)}");
            stm.registerOutParameter(1, Types.INTEGER);
            stm.setString(2, date);
            stm.setInt(3, gioPhat);
           

            stm.execute();
            check = stm.getInt(1);
            

        } catch (SQLException ex) {
            Logger.getLogger(CrudDonGia.class.getName()).log(Level.SEVERE, null, ex);
        }
        return check;
    }

}
