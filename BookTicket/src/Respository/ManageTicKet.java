/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Respository;

import App.Ve;
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
public class ManageTicKet {

    private DbContext context;

    public ManageTicKet() {
        context = new DbContext();
    }

    public void remove(String id) {
        Connection con = context.getCon();
        try {
            CallableStatement stm = con.prepareCall("{Call Cancel_ve(?)}");
            stm.setString(1, id);
            stm.execute();

        } catch (SQLException ex) {
            Logger.getLogger(ManageTicKet.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public ArrayList<Ve> search(String date, String dt, int status, int gioPhat, int option) {
        ArrayList<Ve> data = new ArrayList<Ve>();
        Connection con = context.getCon();
        try {
            if (option == 1) {
                CallableStatement stm = con.prepareCall("{Call GetVe(?,?,?)}");
                stm.setString(1, date);
                stm.setString(2, dt);
                stm.setInt(3, status);
                ResultSet result = stm.executeQuery();
                while (result.next()) {
                    data.add(new Ve(result.getString(1), result.getString(2), result.getInt(3), result.getString(4), result.getString(5), result.getString(6), result.getDouble(7), result.getString(8), result.getInt(9)));

                }
            } else if (option == 2) {
                CallableStatement stm = con.prepareCall("{Call GetVeBy_Date_Dt(?,?)}");
                stm.setString(1, date);
                stm.setString(2, dt);

                ResultSet result = stm.executeQuery();
                while (result.next()) {
                    data.add(new Ve(result.getString(1), result.getString(2), result.getInt(3), result.getString(4), result.getString(5), result.getString(6), result.getDouble(7), result.getString(8), result.getInt(9)));

                }
            } else if (option == 3) {
                CallableStatement stm = con.prepareCall("{Call GetVeBy_Date_Dt_GioPhat(?,?,?)}");
                stm.setString(1, date);
                stm.setString(2, dt);
                stm.setInt(3, gioPhat);

                ResultSet result = stm.executeQuery();
                while (result.next()) {
                    data.add(new Ve(result.getString(1), result.getString(2), result.getInt(3), result.getString(4), result.getString(5), result.getString(6), result.getDouble(7), result.getString(8), result.getInt(9)));

                }

            } else if (option == 4) {
                CallableStatement stm = con.prepareCall("{Call GetVeBy_Date_Dt_GioPhat_TrangThai(?,?,?,?)}");
                stm.setString(1, date);
                stm.setString(2, dt);
                stm.setInt(3, gioPhat);
                stm.setInt(4, status);

                ResultSet result = stm.executeQuery();
                while (result.next()) {
                    data.add(new Ve(result.getString(1), result.getString(2), result.getInt(3), result.getString(4), result.getString(5), result.getString(6), result.getDouble(7), result.getString(8), result.getInt(9)));

                }
            } else if (option == 5) {
                CallableStatement stm = con.prepareCall("{Call GetVeBy_Date_GioPhat(?,?)}");
                stm.setString(1, date);

                stm.setInt(2, gioPhat);

                ResultSet result = stm.executeQuery();
                while (result.next()) {
                    data.add(new Ve(result.getString(1), result.getString(2), result.getInt(3), result.getString(4), result.getString(5), result.getString(6), result.getDouble(7), result.getString(8), result.getInt(9)));
                }

            } else if (option == 6) {
                CallableStatement stm = con.prepareCall("{Call GetVeBy_Date_GioPhat_TrangThai(?,?,?)}");
                stm.setString(1, date);

                stm.setInt(2, gioPhat);
                stm.setInt(3, status);

                ResultSet result = stm.executeQuery();
                while (result.next()) {
                    data.add(new Ve(result.getString(1), result.getString(2), result.getInt(3), result.getString(4), result.getString(5), result.getString(6), result.getDouble(7), result.getString(8), result.getInt(9)));

                }

            }
            else if(option==7)
            {
                CallableStatement stm = con.prepareCall("{Call GetVeBy_Date(?)}");
                stm.setString(1, date);

                ResultSet result = stm.executeQuery();
                while (result.next()) {
                    data.add(new Ve(result.getString(1), result.getString(2), result.getInt(3), result.getString(4), result.getString(5), result.getString(6), result.getDouble(7), result.getString(8), result.getInt(9)));

                }
            }
            else if(option==8)
            {
                CallableStatement stm = con.prepareCall("{Call GetVeBy_Date_TrangThai(?,?)}");
                stm.setString(1, date);
                stm.setInt(2, status);
                ResultSet result = stm.executeQuery();
                while (result.next()) {
                    data.add(new Ve(result.getString(1), result.getString(2), result.getInt(3), result.getString(4), result.getString(5), result.getString(6), result.getDouble(7), result.getString(8), result.getInt(9)));

                }
            }
                

        } catch (SQLException ex) {
            Logger.getLogger(ManageTicKet.class.getName()).log(Level.SEVERE, null, ex);
        }
        return data;
    }

    public ArrayList<Ve> GetAll() {
        ArrayList<Ve> data = new ArrayList<Ve>();
        Connection con = context.getCon();
        try {
            CallableStatement stm = con.prepareCall("{Call GetAllVe}");

            ResultSet result = stm.executeQuery();
            while (result.next()) {
                data.add(new Ve(result.getString(1), result.getString(2), result.getInt(3), result.getString(4), result.getString(5), result.getString(6), result.getDouble(7), result.getString(8), result.getInt(9)));

            }

        } catch (SQLException ex) {
            Logger.getLogger(ManageTicKet.class.getName()).log(Level.SEVERE, null, ex);
        }
        return data;

    }

    public Ve thanhToanTrucTiep(String date,int gioPhat,String phong,String ghe) {
Connection con=context.getCon();
        CallableStatement stm;
        Ve data=null;
        try {
            stm = con.prepareCall("{Call GetVeBy_Date_GioPhat_Phong_Ghe(?,?,?,?)}");
            stm.setString(1, date);
        
        stm.setInt(2, gioPhat);
        stm.setString(3, phong);
        stm.setString(4, ghe);

        ResultSet result = stm.executeQuery();
        while (result.next()) {
            data=new Ve(result.getString(1), result.getString(2), result.getInt(3), result.getString(4), result.getString(5), result.getString(6), result.getDouble(7), result.getString(8), result.getInt(9));

        }
        
        } catch (SQLException ex) {
            Logger.getLogger(ManageTicKet.class.getName()).log(Level.SEVERE, null, ex);
        }
        
return data;
    }
    public int getLoai(String id)
    {
        Connection con=context.getCon();
        CallableStatement stm;
        int data=-1;
        try {
            stm = con.prepareCall("{?=Call GetLoaiVe(?)}");
          
            stm.registerOutParameter(1,Types.INTEGER);
              stm.setString(2,id);
            stm.execute();
            data=stm.getInt(1);
        
        } catch (SQLException ex) {
            Logger.getLogger(ManageTicKet.class.getName()).log(Level.SEVERE, null, ex);
        }
        
return data;
    }

    public void thanhToan(String id) {
        Connection con = context.getCon();
        try {
            CallableStatement stm = con.prepareCall("{Call ThanhToan(?)}");
            stm.setString(1, id);
            stm.execute();

        } catch (SQLException ex) {
            Logger.getLogger(ManageTicKet.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void xuatVe(String id)
    {
        Connection con = context.getCon();
        try {
            CallableStatement stm = con.prepareCall("{Call XuatVe(?)}");
            stm.setString(1, id);
            stm.execute();

        } catch (SQLException ex) {
            Logger.getLogger(ManageTicKet.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
