/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

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
public class tblPublisherDAO implements MyDAO<tblPublisher>{

    private PreparedStatement ps;
    private ResultSet rs;

    int flag = 0;
    @Override
    public tblPublisher Insert(tblPublisher t) {
        String sql = "insert into tblPublisher (PublisherId,PublisherName,Address,Phone,Email) values(?,?,?,?,?) ";

        try {
            ps = DataHelper.buildSQL(sql);
            ps.setString(1, t.getPublisherId());
            ps.setString(2, t.getPublisherName());
            ps.setString(3, t.getAddress());
            ps.setString(4,t.getPhone());
            ps.setString(5, t.getEmail());
            
            
            flag = ps.executeUpdate();
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(tblPublisherDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            try {
                DataHelper.CloseConnect();
            } catch (SQLException ex) {
                Logger.getLogger(tblPublisherDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
       if(flag > 0) return t;
       else return null;
    }

    @Override
    public tblPublisher Update(tblPublisher t) {
         String sql = "update tblPublisher set PublisherName = ? ,Address = ?,Phone = ?,Email =?  where PublisherId = ? ";

        try {
            ps = DataHelper.buildSQL(sql);
            ps.setString(5, t.getPublisherId());
            ps.setString(1, t.getPublisherName());
            ps.setString(2, t.getAddress());
            ps.setString(3,t.getPhone());
            ps.setString(4, t.getEmail());
            
            
            flag = ps.executeUpdate();
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(tblPublisherDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            try {
                DataHelper.CloseConnect();
            } catch (SQLException ex) {
                Logger.getLogger(tblPublisherDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
       if(flag > 0) return t;
       else return null;
    }

    @Override
    public tblPublisher Delete(tblPublisher t) {
         String sql = "delete from tblPublisher where PublisherId = ? ";

        try {
            ps = DataHelper.buildSQL(sql);
            ps.setString(1, t.getPublisherId());
        
            
            
            flag = ps.executeUpdate();
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(tblPublisherDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            try {
                DataHelper.CloseConnect();
            } catch (SQLException ex) {
                Logger.getLogger(tblPublisherDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
       if(flag > 0) return t;
       else return null;
    }
List<tblPublisher> list;
    @Override
    public ArrayList<tblPublisher> GetAll() {
       list = new ArrayList<>();
        String sql = "select * from tblPublisher";
        try {
            ps = DataHelper.buildSQL(sql);
            rs = ps.executeQuery();
            
            while(rs.next()){
              tblPublisher pub = new tblPublisher();
              pub.setPublisherId(rs.getString("PublisherId"));
              pub.setPublisherName(rs.getString("PublisherName"));
              pub.setAddress(rs.getString("Address"));
              pub.setPhone(rs.getString("Phone"));
              pub.setEmail(rs.getString("Email"));
              list.add(pub);
            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(tblPublisherDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
           try {
               DataHelper.CloseConnect();
           } catch (SQLException ex) {
               Logger.getLogger(tblPublisherDAO.class.getName()).log(Level.SEVERE, null, ex);
           }
        }
        return (ArrayList<tblPublisher>) list;
    }

    @Override
    public List<tblPublisher> Search(ArrayList<tblPublisher> list, String s) {
       return list.stream().filter(x->x.getPublisherId().contains(s) || x.getPublisherName().contains(s) || x.getPhone().contains(s)).collect(Collectors.toList());
    }

}
