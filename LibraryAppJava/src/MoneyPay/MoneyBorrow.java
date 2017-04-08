/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MoneyPay;

import Model.DataHelper;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.Types;

/**
 *
 * @author MacOS
 */
public class MoneyBorrow {

    Connection conn;
    CallableStatement stm;

    public int TienMuon(String MaSach, int SoLuong) {
        int money = 0;
        try {
            conn = DataHelper.getConnection();
            stm = conn.prepareCall("{?=call TienTra(?,?)}");
            stm.registerOutParameter(1, Types.INTEGER);
            stm.setString(2, MaSach);
            stm.setInt(3, SoLuong);
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
