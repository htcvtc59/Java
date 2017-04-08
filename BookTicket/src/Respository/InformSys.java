/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Respository;

import DataLayer.DbContext;
import ModelView.DoanhThu;
import ModelView.HotDay;
import ModelView.HotPhim;
import ModelView.UuDai;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;

/**
 *
 * @author DELL
 */
public class InformSys {
    private DbContext context;
    public InformSys(){ 
    context=new DbContext();
    }
    
    public ArrayList<DoanhThu> GetDoanhThu(String beginDate,String endDate,int option)
    {
        
        ArrayList<DoanhThu> list=new ArrayList<DoanhThu>();
          Connection con=context.getCon();
          CallableStatement stm;
        try{
            stm = con.prepareCall("{Call GetDoanhThu(?,?)}");
            stm.setString(1, beginDate);
            stm.setString(2,endDate);
            ResultSet result=stm.executeQuery();
                  while(result.next())
                  {
                      list.add(new DoanhThu
                      (result.getInt(1),result.getInt(2),result.getInt(4),result.getFloat(3),result.getFloat(5))
                      );
                  }
                  if(option==1)
                  { 
                      list=(ArrayList<DoanhThu>)list.stream().sorted((s1,s2)->Integer.compare(s1.getSlVe(),s2.getSlVe())).collect(Collectors.toList());
                      
                  }
                  else{
                      list=(ArrayList<DoanhThu>)list.stream().sorted((DoanhThu s1,DoanhThu s2)->Double.compare(s1.getTongGia(),s2.getTongGia())).collect(Collectors.toList());
                  }
             
            } catch (SQLException ex) {
            Logger.getLogger(InformSys.class.getName()).log(Level.SEVERE, null, ex);
        }
        ArrayList<DoanhThu> tmp=new ArrayList<DoanhThu>();
        for(int i=list.size()-1;i>=0;i--)
        {
            tmp.add(list.get(i));
        }
        return tmp;
    }
    public ArrayList<HotPhim> GetPhim(String begin,String end,int sl)
    { 
          ArrayList<HotPhim> list=new ArrayList<HotPhim>();
          Connection con=context.getCon();
          CallableStatement stm;
        try{
            stm = con.prepareCall("{Call GetPhimHot(?,?,?)}");
            stm.setString(1, begin);
            stm.setString(2,end);
            stm.setInt(3,sl);
            ResultSet result=stm.executeQuery();
                  while(result.next())
                  {
                     list.add(new HotPhim(result.getString(1),result.getInt(2)));
                  }
                  
                 
             
            } catch (SQLException ex) {
            Logger.getLogger(InformSys.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }
    public ArrayList<HotDay> GetHotDay(String begin,String end,int sl)
    {
        ArrayList<HotDay> list=new ArrayList<HotDay>();
          Connection con=context.getCon();
          CallableStatement stm;
        try{
            stm = con.prepareCall("{Call NgayHot(?,?,?)}");
            stm.setString(1, begin);
            stm.setString(2,end);
            stm.setInt(3,sl);
            ResultSet result=stm.executeQuery();
                  while(result.next())
                  {
                     list.add(new HotDay(result.getString(1),result.getInt(2),result.getInt(3)));
                  }
                  
                 
             
            } catch (SQLException ex) {
            Logger.getLogger(InformSys.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }
    public ArrayList<UuDai> GetUuDai(String begin,String end,double mucTien,int sl)
    {
          ArrayList<UuDai> list=new ArrayList<UuDai>();
          Connection con=context.getCon();
          CallableStatement stm;
        try{
            stm = con.prepareCall("{Call UuDaiKhachHang(?,?,?,?)}");
            stm.setString(1, begin);
            stm.setString(2,end);
            stm.setDouble(3,mucTien);
            stm.setInt(4,sl);
            ResultSet result=stm.executeQuery();
                  while(result.next())
                  {
                     list.add(new UuDai(result.getString(1),result.getInt(2),result.getDouble(3)));
                  }
                  
               
             
            } catch (SQLException ex) {
            Logger.getLogger(InformSys.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }
    
}
