/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Respository;

import App.LichChieu;
import DataLayer.DbContext;
import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.date;
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
public class CrudLichChieu {

    private DbContext context;

    public CrudLichChieu() {
        context = new DbContext();
    }
    public ArrayList<LichChieu> search(String date)
    { 
         Connection con = context.getCon();
         ArrayList<LichChieu> data=new ArrayList<LichChieu>();
        int check = 0;
        try {
            if(!date.equals(""))
            {
            CallableStatement stm = con.prepareCall("{Call GetLichChieuBy_Date(?)}");
            stm.setString(1,date);
                ResultSet result=stm.executeQuery();
                while(result.next())
                {
                    data.add(new LichChieu(result.getString(1),result.getString(2),result.getInt(3),result.getString(4)));
                }
            
            }
            else
            { 
                 CallableStatement stm = con.prepareCall("{Call GetLichChieu}");
            
                ResultSet result=stm.executeQuery();
                while(result.next())
                {
                    data.add(new LichChieu(result.getString(1),result.getString(2),result.getInt(3),result.getString(4)));
                }
            
            }
          
        } catch (SQLException ex) {
            Logger.getLogger(CrudPhim.class.getName()).log(Level.SEVERE, null, ex);

        }
        return data;
    }
    public int[] GetGioPhat(String date)
    { 
         Connection con = context.getCon();
         int[] data=new int[5];
         
        int i=0;
        int check = 0;
        try {
            CallableStatement stm = con.prepareCall("{Call GetGioChieuBy_Date_LichChieu(?)}");
            stm.setString(1,date);
            ResultSet result=stm.executeQuery();
            while(result.next())
            {
                data[i++]=result.getInt(1);
            }
         
        } catch (SQLException ex) {
            Logger.getLogger(CrudPhim.class.getName()).log(Level.SEVERE, null, ex);

        
        }
        return data;
    }
    public ArrayList<String> GetPhong(String date,int gioPhat)
    {
         Connection con = context.getCon();
         ArrayList<String> data=new ArrayList<String>();
        try {
            CallableStatement stm = con.prepareCall("{Call GetPhongBy_Date_GioChieu(?,?)}");
            stm.setString(1,date);
            stm.setInt(2,gioPhat);
            ResultSet result=stm.executeQuery();
            while(result.next())
            {
            data.add(result.getString(1));
            }
          
        } catch (SQLException ex) {
            Logger.getLogger(CrudPhim.class.getName()).log(Level.SEVERE, null, ex);
       
        
    }
             return data;
    }
   public ArrayList<String> searchPhim(String s)
    {
         Connection con = context.getCon();
         ArrayList<String> data=new ArrayList<String>();
           ArrayList<String> data1=new ArrayList<String>();
        int i=0;
        int check = 0;
        try {
            CallableStatement stm = con.prepareCall("{Call GetNamePhim}");
            ResultSet result=stm.executeQuery();
            while(result.next())
            {
            data.add(result.getString(1));
            }
            for(String item:data)
            {
                if(item.toLowerCase().contains(s.toLowerCase()))
                    data1.add(item);
            }
           
        } catch (SQLException ex) {
            Logger.getLogger(CrudPhim.class.getName()).log(Level.SEVERE, null, ex);
       
        
    }
             return data1;
    }

    public void Add(String date,String phong,String phim,int gioPhat) {
        Connection con = context.getCon();

        try {
            CallableStatement stm = con.prepareCall("{Call Insert_LichChieu(?,?,?,?)}");
     
            stm.setString(1,phim);
            stm.setString(2, phong);
            stm.setString(3, date);
            stm.setInt(4, gioPhat);
            stm.execute();
         
        } catch (SQLException ex) {
            Logger.getLogger(CrudPhim.class.getName()).log(Level.SEVERE, null, ex);

        }
  

    }

    public int update(String phim,String phong, String date, int gioPhat, String newPhim, String newphong, String newdate, int newgiophat) {
        Connection con = context.getCon();
       int check=0;
        try {
            CallableStatement stm = con.prepareCall("{?=Call Update_LichChieu(?,?,?,?,?,?,?,?)}");
            stm.registerOutParameter(1, Types.INTEGER);
            stm.setString(2, phim);
            stm.setString(3, phong);
            stm.setString(5, date);
            stm.setInt(4, gioPhat);
            stm.setString(6, newPhim);
            stm.setString(7, newphong);
            stm.setString(9, newdate);
            stm.setInt(8, newgiophat);
            stm.execute();
            check=stm.getInt(1);           

        } catch (SQLException ex) {
            Logger.getLogger(CrudPhim.class.getName()).log(Level.SEVERE, null, ex);
        }
        return check;
  
    }

    public int remove(String phim, String phong, String date, int gioPhat) {
        Connection con = context.getCon();
        int check = 0;
        try {
            CallableStatement stm = con.prepareCall("{? = Call Remove_LichChieu(?,?,?,?)}");
             stm.registerOutParameter(1, Types.INTEGER);
            stm.setString(2, phim);
            stm.setString(3, phong);
            stm.setString(4, date);
            stm.setInt(5, gioPhat);

            stm.execute();
            check=stm.getInt(1);
            

        } catch (SQLException ex) {
            Logger.getLogger(CrudPhim.class.getName()).log(Level.SEVERE, null, ex);
        }
        return check;
    }
}
