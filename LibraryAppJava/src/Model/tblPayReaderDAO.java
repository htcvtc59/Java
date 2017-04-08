/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Controller.DateToDTime;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;

/**
 *
 * @author VuongNguyenVan
 */
public class tblPayReaderDAO implements MyDAO<tblPayReader> {

    private PreparedStatement ps;
    private ResultSet rs;

    int flag = 0;

    @Override
    public tblPayReader Insert(tblPayReader t) {
        String str = "insert into tblPayReader (DocumentId,ReaderId,QuantityPay,DatePay,MoneyBorrow,MoneyReturn,MoneyLost)"
                + " values (?,?,?,?,?,?,?)";
        try {
            ps = DataHelper.buildSQL(str);
            ps.setString(1, t.getDocumentId());
            ps.setString(2, t.getReaderId());
            ps.setInt(3, t.getQuantityPay());
            ps.setString(4, DateToDTime.SDateDateTime(t.getDatePay()));
            ps.setString(5, t.getMoneyBorrow());
            ps.setString(6, t.getMoneyReturn());
            ps.setString(7, t.getMoneyLost());

            flag = ps.executeUpdate();
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(tblDocumentDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {

            try {
                DataHelper.CloseConnect();
            } catch (SQLException ex) {
                Logger.getLogger(tblDocumentDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if (flag > 0) {
            return t;
        } else {
            return null;
        }
    }

    @Override
    public tblPayReader Update(tblPayReader t) {
        String str = "update tblPayReader set DocumentId =?, ReaderId = ? ,QuantityPay =? ,DatePay =? ,MoneyBorrow = ?,MoneyReturn = ?,MoneyLost = ? where Id = ?";
        try {
            ps = DataHelper.buildSQL(str);
            ps.setString(1, t.getDocumentId());
            ps.setString(2, t.getReaderId());
            ps.setInt(3, t.getQuantityPay());
            ps.setString(4, DateToDTime.SDateDateTime(t.getDatePay()));
            ps.setString(5, t.getMoneyBorrow());
            ps.setString(6, t.getMoneyReturn());
            ps.setString(7, t.getMoneyLost());
            ps.setInt(8, t.getId());

            flag = ps.executeUpdate();
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(tblDocumentDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {

            try {
                DataHelper.CloseConnect();
            } catch (SQLException ex) {
                Logger.getLogger(tblDocumentDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if (flag > 0) {
            return t;
        } else {
            return null;
        }
    }

    @Override
    public tblPayReader Delete(tblPayReader t) {
        String str = "delete from tblPayReader where Id = ?";
        try {
            ps = DataHelper.buildSQL(str);
            ps.setInt(1, t.getId());

            flag = ps.executeUpdate();
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(tblDocumentDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {

            try {
                DataHelper.CloseConnect();
            } catch (SQLException ex) {
                Logger.getLogger(tblDocumentDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if (flag > 0) {
            return t;
        } else {
            return null;
        }
    }
    List<tblPayReader> list;

    @Override
    public ArrayList<tblPayReader> GetAll() {
        list = new ArrayList<>();
        String str = "select Id,DocumentId, ReaderId,QuantityPay,CONVERT(varchar,DatePay,103) as DatePay,MoneyBorrow,MoneyReturn,MoneyLost"
                + " from tblPayReader";
        try {

            ps = DataHelper.buildSQL(str);
            rs = ps.executeQuery();
            while (rs.next()) {
                tblPayReader dc = new tblPayReader();
                dc.setId(rs.getInt("Id"));
                dc.setDocumentId(rs.getString("DocumentId"));
                dc.setReaderId(rs.getString("ReaderId"));
                dc.setQuantityPay(rs.getInt("QuantityPay"));
                dc.setDatePay(rs.getString("DatePay"));
                dc.setMoneyBorrow(rs.getString("MoneyBorrow"));
                dc.setMoneyReturn(rs.getString("MoneyReturn"));
                dc.setMoneyLost(rs.getString("MoneyLost"));
                list.add(dc);
            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(tblDocumentDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                DataHelper.CloseConnect();
            } catch (SQLException ex) {
                Logger.getLogger(tblDocumentDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return (ArrayList<tblPayReader>) list;
    }

    @Override
    public List<tblPayReader> Search(ArrayList<tblPayReader> list, String s) {
        return list.stream().filter(x -> x.getReaderId().contains(s) || x.getDocumentId().contains(s)).collect(Collectors.toList());
    }

}
