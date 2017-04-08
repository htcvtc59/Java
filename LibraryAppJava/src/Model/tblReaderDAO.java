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
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;

/**
 *
 * @author VuongNguyenVan
 */
public class tblReaderDAO implements MyDAO<tblReader> {

    private PreparedStatement ps;
    private ResultSet rs;

    int flag = 0;

    @Override
    public tblReader Insert(tblReader t) {

        String sql = "insert into tblReader(ReaderId,ReaderName,Briday,Phone,Email,Address) values(?,?,?,?,?,?)";
        try {
            ps = DataHelper.buildSQL(sql);
            ps.setString(1, t.getReaderId());
            ps.setString(2, t.getReaderName());
            ps.setString(3, DateToDTime.SDateDateTime(t.getBirday()));
            ps.setString(4, t.getPhone());
            ps.setString(5, t.getEmail());
            ps.setString(6, t.getAddress());
            flag = ps.executeUpdate();
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(tblReaderDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                DataHelper.CloseConnect();
            } catch (SQLException ex) {
                Logger.getLogger(tblReaderDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if (flag > 0) {
            return t;
        } else {
            return null;
        }
    }

    @Override
    public tblReader Update(tblReader t) {
        String sql = "update tblReader set ReaderName = ?,Briday = ?,Phone =? ,Email = ?,Address =?  where ReaderId = ? ";
        try {
            ps = DataHelper.buildSQL(sql);
            ps.setString(6, t.getReaderId());
            ps.setString(1, t.getReaderName());
            ps.setString(2, DateToDTime.SDateDateTime(t.getBirday()));
            ps.setString(3, t.getPhone());
            ps.setString(4, t.getEmail());
            ps.setString(5, t.getAddress());
            flag = ps.executeUpdate();
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(tblReaderDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                DataHelper.CloseConnect();
            } catch (SQLException ex) {
                Logger.getLogger(tblReaderDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if (flag > 0) {
            return t;
        } else {
            return null;
        }
    }

    @Override
    public tblReader Delete(tblReader t) {
        String sql = "delete from tblReader where  ReaderId = ? ";
        try {
            ps = DataHelper.buildSQL(sql);
            ps.setString(1, t.getReaderId());

            flag = ps.executeUpdate();
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(tblReaderDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                DataHelper.CloseConnect();
            } catch (SQLException ex) {
                Logger.getLogger(tblReaderDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if (flag > 0) {
            return t;
        } else {
            return null;
        }
    }
    List<tblReader> list;

    @Override
    public ArrayList<tblReader> GetAll() {
        list = new ArrayList<>();
        String sql = "select ReaderId, ReaderName, CONVERT(varchar,Briday,103) as Briday, Address,Phone,Email from tblReader";
        try {
            ps = DataHelper.buildSQL(sql);
            rs = ps.executeQuery();

            while (rs.next()) {
                tblReader re = new tblReader();
                re.setReaderId(rs.getString("ReaderId"));
                re.setReaderName(rs.getString("ReaderName"));
                re.setBirday(rs.getString("Briday"));
                re.setAddress(rs.getString("Address"));
                re.setPhone(rs.getString("Phone"));
                re.setEmail(rs.getString("Email"));

                list.add(re);
            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(tblReaderDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                DataHelper.CloseConnect();
            } catch (SQLException ex) {
                Logger.getLogger(tblReaderDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        return (ArrayList<tblReader>) list;
    }

    @Override
    public List<tblReader> Search(ArrayList<tblReader> list, String s) {
        return list.stream().filter(x -> x.getReaderId().contains(s) || x.getReaderName().contains(s)).collect(Collectors.toList());
    }

}
