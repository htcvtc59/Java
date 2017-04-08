/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.Date;
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
public class tblCategoryDAO implements MyDAO<tblCategory> {

    private PreparedStatement ps;
    private ResultSet rs;

    int flag = 0;

    @Override
    public tblCategory Insert(tblCategory t) {
        try {
            String sql = "insert into tblCategory (CategoryId,CategoryName) values(?,?) ";

            ps = DataHelper.buildSQL((sql));
            ps.setString(1, t.getCategoryId());
            ps.setString(2, t.getCategoryName());

            flag = ps.executeUpdate();

        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(tblCategoryDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                DataHelper.CloseConnect();
            } catch (SQLException ex) {
                Logger.getLogger(tblCategoryDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if (flag > 0) {
            return t;
        } else {
            return null;
        }
    }

    @Override
    public tblCategory Update(tblCategory t) {
        try {
            String sql = "update tblCategory set CategoryName = ? where CategoryId = ?";

            ps = DataHelper.buildSQL((sql));
            ps.setString(2, t.getCategoryId());
            ps.setString(1, t.getCategoryName());

            flag = ps.executeUpdate();

        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(tblCategoryDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                DataHelper.CloseConnect();
            } catch (SQLException ex) {
                Logger.getLogger(tblCategoryDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if (flag > 0) {
            return t;
        } else {
            return null;
        }
    }

    @Override
    public tblCategory Delete(tblCategory t) {
        try {
            String sql = "delete from tblCategory where CategoryId = ? ";

            ps = DataHelper.buildSQL((sql));
            ps.setString(1, t.getCategoryId());

            flag = ps.executeUpdate();

        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(tblCategoryDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                DataHelper.CloseConnect();
            } catch (SQLException ex) {
                Logger.getLogger(tblCategoryDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if (flag > 0) {
            return t;
        } else {
            return null;
        }
    }
    List<tblCategory> list;

    @Override
    public ArrayList<tblCategory> GetAll() {

        list = new ArrayList<>();
        String sql = "select CategoryId, CategoryName from tblCategory ";
        try {
            ps = DataHelper.buildSQL(sql);
            rs = ps.executeQuery();
            while (rs.next()) {

                tblCategory category = new tblCategory(rs.getString("CategoryId"), rs.getString("CategoryName"));
                list.add(category);

            }

        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(tblCategoryDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                DataHelper.CloseConnect();
            } catch (SQLException ex) {
                Logger.getLogger(tblCategoryDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return (ArrayList<tblCategory>) list;
    }

    @Override
    public List<tblCategory> Search(ArrayList<tblCategory> list, String s) {
        
      return  list.stream().filter(x -> x.getCategoryId().contains(s) || x.getCategoryName().contains(s)).collect(Collectors.toList());
    }



}
