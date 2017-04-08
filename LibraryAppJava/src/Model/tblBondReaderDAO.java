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
public class tblBondReaderDAO implements MyDAO<tblBondReader> {

    private PreparedStatement ps;
    private ResultSet rs;

    int flag = 0;

    @Override
    public tblBondReader Insert(tblBondReader t) {
        String sql = "insert into tblBondReader (ReaderId,DocumentId,Quantity,DateStart,DateFinish) values(?,?,?,?,?) ";

        try {
            ps = DataHelper.buildSQL((sql));
            ps.setString(1, t.getReaderId());
            ps.setString(2, t.getDocumentId());
            ps.setInt(3, t.getQuantity());
            ps.setString(4, DateToDTime.SDateDateTime(t.getDateStart()));
            ps.setString(5, DateToDTime.SDateDateTime(t.getDateFinish()));

            flag = ps.executeUpdate();

        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(tblBondReaderDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                DataHelper.CloseConnect();
            } catch (SQLException ex) {
                Logger.getLogger(tblBondReaderDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if (flag > 0) {
            return t;
        } else {
            return null;
        }
    }

    @Override
    public tblBondReader Update(tblBondReader t) {
        String sql = "update tblBondReader set ReaderId = ?,DocumentId = ?,Quantity = ?,DateStart = ?,DateFinish = ? where Id = ? ";

        try {
            ps = DataHelper.buildSQL((sql));
            ps.setString(1, t.getReaderId());
            ps.setString(2, t.getDocumentId());
            ps.setInt(3, t.getQuantity());
            ps.setString(4, DateToDTime.SDateDateTime(t.getDateStart()));
            ps.setString(5, DateToDTime.SDateDateTime(t.getDateFinish()));

            ps.setInt(6, t.getId());
            flag = ps.executeUpdate();

        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(tblBondReaderDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                DataHelper.CloseConnect();
            } catch (SQLException ex) {
                Logger.getLogger(tblBondReaderDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if (flag > 0) {
            return t;
        } else {
            return null;
        }
    }

    @Override
    public tblBondReader Delete(tblBondReader t) {
        String sql = "delete from  tblBondReader where Id = ? ";

        try {
            ps = DataHelper.buildSQL((sql));
            ps.setInt(1, t.getId());
            flag = ps.executeUpdate();

        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(tblBondReaderDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                DataHelper.CloseConnect();
            } catch (SQLException ex) {
                Logger.getLogger(tblBondReaderDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if (flag > 0) {
            return t;
        } else {
            return null;
        }
    }
    ArrayList<tblBondReader> list;

    @Override
    public ArrayList<tblBondReader> GetAll() {
        list = new ArrayList<>();
        String sql = "select Id,ReaderId,DocumentId,Quantity,CONVERT(varchar,DateStart,103) as DateStart,"
                + " CONVERT(varchar,DateFinish,103) as DateFinish from tblBondReader ";
        try {
            ps = DataHelper.buildSQL(sql);

            rs = ps.executeQuery();

            while (rs.next()) {
                tblBondReader read = new tblBondReader();
                read.setId(rs.getInt("Id"));
                read.setReaderId(rs.getString("ReaderId"));
                read.setDocumentId(rs.getString("DocumentId"));
                read.setQuantity(rs.getInt("Quantity"));
                read.setDateStart(String.valueOf(rs.getString("DateStart")));
                read.setDateFinish(String.valueOf(rs.getString("DateFinish")));

                list.add(read);

            }

        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(tblBondReaderDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                DataHelper.CloseConnect();
            } catch (SQLException ex) {
                Logger.getLogger(tblBondReaderDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return list;
    }

    @Override
    public List<tblBondReader> Search(ArrayList<tblBondReader> list, String s) {

        return list.stream().filter(x -> x.getDocumentId().contains(s) || x.getReaderId().contains(s)).collect(Collectors.toList());
    }

}
