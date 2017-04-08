/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Respository;

import App.Phim;
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
public class CrudPhim {

    private DbContext context = null;

    public CrudPhim() {
        context = new DbContext();

    }
    public ArrayList<Phim> search(String s)
    {
         ArrayList<Phim> data=new ArrayList<Phim>();
         ArrayList<Phim> tmp=new ArrayList<Phim>();
         Connection con = context.getCon();
        int check = 0;
        try {
            CallableStatement stm = con.prepareCall("{call Get_Phim}");
          
            ResultSet result=stm.executeQuery();

            while(result.next())
            {
                data.add(new Phim(
   result.getString(2).trim(),result.getString(4),result.getString(3),result.getString(5),result.getString(6).trim()
                                ));
            }
            if(s.equals(""))
                tmp=data;
            else
           for(int i=0;i<data.size();i++)
           {
               if(data.get(i).getPhim().toLowerCase().contains(s.toLowerCase()))
                   tmp.add(data.get(i));
           } 
      
            
        } catch (SQLException ex) {
            Logger.getLogger(CrudPhim.class.getName()).log(Level.SEVERE, null, ex);
        }
   return tmp;
    }
 

    public int Add(String name, String theloai,String quocgia, String nsx,String mota) {
        Connection con = context.getCon();
        int check = 0;
        try {
            CallableStatement stm = con.prepareCall("{?=call Insert_phim(?,?,?,?,?)}");
            stm.registerOutParameter(1, Types.INTEGER);
            stm.setString(4, quocgia);
            stm.setString(3, name);
            stm.setString(2, theloai);
            stm.setString(5,nsx);
            stm.setString(6,mota);
            stm.execute();
            check = stm.getInt(1);
           
        } catch (SQLException ex) {
            Logger.getLogger(CrudPhim.class.getName()).log(Level.SEVERE, null, ex);
        }

        return check;
    }


  public int Update(String name,String newName,String theloai,String quocgia, String nsx,String mota) 
    {
                int check = 0;

        Connection con = context.getCon();
        try {
            CallableStatement stm = con.prepareCall("{?=call Update_Phim(?,?,?,?,?,?)}");
            stm.registerOutParameter(1, Types.INTEGER);
           stm.setString(2, name);
            stm.setString(3,theloai );
            stm.setString(4, newName);
            stm.setString(5, quocgia);
            stm.setString(6,nsx);
            stm.setString(7, mota);
            stm.execute();
           check=stm.getInt(1);
        } catch (SQLException ex) {
            Logger.getLogger(CrudPhim.class.getName()).log(Level.SEVERE, null, ex);
        }
        return check;
    }

    public int remove(String phim) {
        int check=-1;
        Connection con = context.getCon();
        try {
            CallableStatement stm = con.prepareCall("{?=call Remove_Phim(?)}");
             stm.registerOutParameter(1, Types.INTEGER);
            stm.setString(2, phim);
           
            stm.execute();
            check=stm.getInt(1);

        } catch (SQLException ex) {
            Logger.getLogger(CrudPhim.class.getName()).log(Level.SEVERE, null, ex);
        }
        return check;
    }
}


