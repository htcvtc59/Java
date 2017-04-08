/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MoneyPay;

import Controller.DateToDTime;
import Model.DataHelper;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.Date;
import java.sql.Types;

/**
 *
 * @author MacOS
 */
public class MoneyReturn {

    Connection conn;
    CallableStatement stm;

    public int TienQuaHan(String NgayTra, String MaSach, String MaDG, int SoLuong) {
        int money = 0;
        try {
            conn = DataHelper.getConnection();
            stm = conn.prepareCall("{?=call TienQuaHan(?,?,?,?)}");
            stm.registerOutParameter(1, Types.INTEGER);
            stm.setString(2, DateToDTime.SDateDateTime(NgayTra));
            stm.setString(3, MaSach);
            stm.setString(4, MaDG);
            stm.setInt(5, SoLuong);
            stm.execute();
            money = stm.getInt(1);
            conn.close();
            stm.close();
        } catch (Exception ex) {
            ex.getMessage();
        }
        return money;
    }
}
