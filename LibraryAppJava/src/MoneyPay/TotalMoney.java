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
import java.sql.Types;

/**
 *
 * @author MacOS
 */
public class TotalMoney {

    Connection conn;
    CallableStatement stm;

    public int TongTienTra(String NgayTra, String MaDG) {
        int money = 0;
        try {
            conn = DataHelper.getConnection();
            stm = conn.prepareCall("{?=call TongTienTra(?,?)}");
            stm.registerOutParameter(1, Types.INTEGER);
            stm.setString(2, DateToDTime.SDateDateTime(NgayTra));
            stm.setString(3, MaDG);
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
