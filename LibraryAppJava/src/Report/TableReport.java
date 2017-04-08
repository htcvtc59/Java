/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Report;

import Controller.DateToDTime;
import Model.DataHelper;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.Vector;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author MacOS
 */
public class TableReport {

    Connection conn = null;
    ResultSet rs = null;
    ResultSetMetaData rsmd = null;
    CallableStatement stm = null;
    DefaultTableModel dtm = null;

    public void rsSet(ResultSet rs, JTable table) {
        try {
            rsmd = rs.getMetaData();
            int columns = rsmd.getColumnCount();
            dtm = new DefaultTableModel();
            Vector columns_name = new Vector();
            Vector data_row = new Vector();
            for (int i = 1; i <= columns; i++) {
                columns_name.addElement(rsmd.getColumnName(i));

            }
            dtm.setColumnIdentifiers(columns_name);
            while (rs.next()) {
                data_row = new Vector();
                for (int j = 1; j <= columns; j++) {
                    data_row.addElement(rs.getString(j));
                }
                dtm.addRow(data_row);
            }
            table.setModel(dtm);
            conn.close();
            rs.close();
            stm.close();
        } catch (Exception e) {
            e.getMessage();
        }

    }

    public void HanTraSach(JTable table) {
        try {
            conn = DataHelper.getConnection();
            stm = conn.prepareCall("{call HanTraSach}");
            rs = stm.executeQuery();
            rsSet(rs, table);
        } catch (Exception ex) {
            ex.getMessage();
        }

    }

    public void SachDaMuon(JTable table, String start, String finish, String idbook, String idreader) {
        try {
            conn = DataHelper.getConnection();
            stm = conn.prepareCall("{call SachDaMuon (?,?,?,?)}");
            stm.setString(1, DateToDTime.SDateDateTime(start));
            stm.setString(2, DateToDTime.SDateDateTime(finish));
            stm.setString(3, idbook);
            stm.setString(4, idreader);
            rs = stm.executeQuery();
            rsSet(rs, table);
        } catch (Exception ex) {
            ex.getMessage();
        }
    }

    public void SachTrongKho(JTable table, String MaSach) {
        try {
            conn = DataHelper.getConnection();
            stm = conn.prepareCall("EXEC [dbo].[SachTrongKho] ?");
            stm.setString(1, MaSach);

            rs = stm.executeQuery();
            rsSet(rs, table);
        } catch (Exception ex) {
            ex.getMessage();
        }
    }

    public void SachQuaHan(JTable table, String MaSach,String MaDG) {
        try {
            conn = DataHelper.getConnection();
            stm = conn.prepareCall("EXEC [dbo].[SachQuaHan] ?,?");
            stm.setString(1, MaSach);
            stm.setString(2, MaDG);

            rs = stm.executeQuery();
            rsSet(rs, table);
        } catch (Exception ex) {
            ex.getMessage();
        }
    }

    public void SachBiMat(JTable table, String MaSach, String MaDG) {
        try {
            conn = DataHelper.getConnection();
            stm = conn.prepareCall("{call SachBiMat(?,?)}");
            stm.setString(1, MaSach);
            stm.setString(2, MaDG);

            rs = stm.executeQuery();
            rsSet(rs, table);
        } catch (Exception ex) {
            ex.getMessage();
        }
    }

    public void DoanhThu(JTable table, String MaSach, String MaDG) {
        try {
            conn = DataHelper.getConnection();
            stm = conn.prepareCall("{call DoanhThu(?,?)}");
            stm.setString(1, MaSach);
            stm.setString(2, MaDG);

            rs = stm.executeQuery();
            rsSet(rs, table);
        } catch (Exception ex) {
            ex.getMessage();
        }
    }

    public void TuanSuatMuon(JTable table, String NgayBD, String NgayKT, String MaSach) {
        try {
            conn = DataHelper.getConnection();
            stm = conn.prepareCall("{call TuanSuatMuon(?,?,?)}");
            stm.setString(1, DateToDTime.SDateDateTime(NgayBD));
            stm.setString(2, DateToDTime.SDateDateTime(NgayKT));
            stm.setString(3, MaSach);

            rs = stm.executeQuery();
            rsSet(rs, table);
        } catch (Exception ex) {
            ex.getMessage();
        }
    }

    public void XepHangSach(JTable table) {
        try {
            conn = DataHelper.getConnection();
            stm = conn.prepareCall("{call XepHangSach}");

            rs = stm.executeQuery();
            rsSet(rs, table);
        } catch (Exception ex) {
            ex.getMessage();
        }
    }

}
