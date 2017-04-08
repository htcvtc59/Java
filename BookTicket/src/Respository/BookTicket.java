/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Respository;

import DataLayer.DbContext;
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
public class BookTicket {

    private DbContext context;

    public BookTicket() {
        context = new DbContext();
    }

    public ArrayList<String> getPhim(String theloai,String begin,String end) {
        ArrayList<String> data = new ArrayList<String>();
        Connection con = context.getCon();
        CallableStatement stm;
        try {
            stm = con.prepareCall("{Call GetPhimBy_Date_DatVe(?,?,?)}");
            stm.setString(1, theloai);
            stm.setString(2, begin);
            stm.setString(3, end);
            ResultSet result = stm.executeQuery();
            while (result.next()) {
               data.add(result.getString(1));
            }
          
        } catch (SQLException ex) {
            Logger.getLogger(BookTicket.class.getName()).log(Level.SEVERE, null, ex);
        }

        return data;
    }
    public ArrayList<String> getDate(String theloai,String begin,String end,String phim)
    {
         ArrayList<String> data = new ArrayList<String>();
        Connection con = context.getCon();
        CallableStatement stm;
        try {
            stm = con.prepareCall("{Call GetDateBy_Phim_Date_DateVe(?,?,?,?)}");
            stm.setString(1, theloai);
            stm.setString(2, begin);
            stm.setString(3, end);
            stm.setString(4, phim);
            ResultSet result = stm.executeQuery();
            while (result.next()) {
               data.add(result.getString(1));
            }
          
        } catch (SQLException ex) {
            Logger.getLogger(BookTicket.class.getName()).log(Level.SEVERE, null, ex);
        }

        return data;
        
    }
    public int[] getGioPhat(String phim,String date) {
        int[] data = new int[10];
        Connection con = context.getCon();
        CallableStatement stm;
        try {
            stm = con.prepareCall("{Call GetGioPhatBy_Phim_Date_DatVe(?,?)}");
            stm.setString(1, phim);
            stm.setString(2, date);
            ResultSet result = stm.executeQuery();
            int i = 0;
            while (result.next()) {
                data[i++] = result.getInt(1);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(BookTicket.class.getName()).log(Level.SEVERE, null, ex);
        }

        return data;
    }
    public ArrayList<String> getPhong(String date,String phim,int gioPhat)
    {
       ArrayList<String> data=new ArrayList<String>();
            Connection con = context.getCon();
        CallableStatement stm;
        try {
            stm = con.prepareCall("{Call GetPhongBy_LichChieu_DatVe(?,?,?)}");
            stm.setString(1, phim);
            stm.setString(2, date);
            stm.setInt(3, gioPhat);
            ResultSet result = stm.executeQuery();
     
            while(result.next()) {
               data.add(result.getString(1));
            }
            
            
        } catch (SQLException ex) {
            Logger.getLogger(BookTicket.class.getName()).log(Level.SEVERE, null, ex);
        }
        return data;
    }
    public ArrayList<String> getGhe(String date,String phong,int gioPhat,String phim)
    {
        ArrayList<String> list=new ArrayList<String>();
          Connection con = context.getCon();
        CallableStatement stm;
        try {
            stm = con.prepareCall("{Call Get_ghe(?,?,?,?)}");
            stm.setString(1, date);
            stm.setString(2, phong);
            stm.setInt(3, gioPhat);
            stm.setString(4, phim);
            ResultSet result = stm.executeQuery();
     
            while(result.next()) {
                list.add(result.getString(1));
            }
            
            
        } catch (SQLException ex) {
            Logger.getLogger(BookTicket.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
        
    }
    public void Add(String date,String phong,int gioPhat,int loai,String dienthoai,String ghe)
    { 
     
             Connection con = context.getCon();
        CallableStatement stm;
        try {
            stm = con.prepareCall("{Call Insert_datVe(?,?,?,?,?,?)}");
            stm.setString(1, date);
            stm.setString(2, phong);
            stm.setInt(3, gioPhat);
            stm.setInt(4, loai);
            stm.setString(5,ghe);
            stm.setString(6,dienthoai);
            stm.execute();
     
           
            
           
        } catch (SQLException ex) {
            Logger.getLogger(BookTicket.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }

}
