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
public class tblDocumentDAO implements MyDAO<tblDocument> {

    private PreparedStatement ps;
    private ResultSet rs;

    int flag = 0;

    @Override
    public tblDocument Insert(tblDocument t) {

        String str = "insert into tblDocument (DocumentId,DocumentName,Description,CategoryId,PublisherId,Quantity,Price,YearDocument,Edition,Author)"
                + " values (?,?,?,?,?,?,?,?,?,?)";
        try {
            ps = DataHelper.buildSQL(str);
            ps.setString(1, t.getDocumentId());
            ps.setString(2, t.getDocumentName());
            ps.setString(3, t.getDescription());
            ps.setString(4, t.getCategoryId());
            ps.setString(5, t.getPublisherId());
            ps.setInt(6, t.getQuantity());
            ps.setString(7, t.getPrice());
            ps.setString(8, t.getYearDocument());
            ps.setInt(9, t.getEdition());
            ps.setString(10, t.getAuthor());

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
    public tblDocument Update(tblDocument t) {
        String str = "update tblDocument set DocumentName = ?,Description = ?,CategoryId = ?,PublisherId =?,Quantity =?,Price =?,YearDocument = ?,Edition = ?,Author = ?"
                + " where DocumentId = ?";
        try {
            ps = DataHelper.buildSQL(str);
            ps.setString(10, t.getDocumentId());
            ps.setString(1, t.getDocumentName());
            ps.setString(2, t.getDescription());
            ps.setString(3, t.getCategoryId());
            ps.setString(4, t.getPublisherId());
            ps.setInt(5, t.getQuantity());
            ps.setString(6, t.getPrice());
            ps.setString(7, t.getYearDocument());
            ps.setInt(8, t.getEdition());
            ps.setString(9, t.getAuthor());

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
    public tblDocument Delete(tblDocument t) {
        String str = "Delete from tblDocument where DocumentId  = ?";

        try {
            ps = DataHelper.buildSQL(str);
            ps.setString(1, t.getDocumentId());

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
    List<tblDocument> list;

    @Override
    public ArrayList<tblDocument> GetAll() {
        list = new ArrayList<>();
        String str = "select DocumentId,DocumentName,Description,CategoryId,Quantity,PublisherId,Price,CONVERT(varchar,YearDocument,103) as YearDocument, "
                + " Edition,Author from tblDocument";
        try {
            ps = DataHelper.buildSQL(str);
            rs = ps.executeQuery();
            while (rs.next()) {
                tblDocument dc = new tblDocument();
                dc.setDocumentId(rs.getString("DocumentId"));
                dc.setDocumentName(rs.getString("DocumentName"));
                dc.setDescription(rs.getString("Description"));
                dc.setCategoryId(rs.getString("CategoryId"));
                dc.setPublisherId(rs.getString("PublisherId"));
                dc.setQuantity(rs.getInt("Quantity"));
                dc.setPrice(rs.getString("Price"));
                dc.setYearDocument(rs.getString("YearDocument"));
                dc.setEdition(rs.getInt("Edition"));
                dc.setAuthor(rs.getString("Author"));
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
        return (ArrayList<tblDocument>) list;
    }

    @Override
    public List<tblDocument> Search(ArrayList<tblDocument> list, String s) {
        return list.stream().filter(x -> x.getDocumentId().contains(s) || x.getDocumentName().contains(s)).collect(Collectors.toList());
    }

}
