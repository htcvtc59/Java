/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author VuongNguyenVan
 */
public class tblDocumentModel extends AbstractTableModel{

    private List<tblDocument> data;

    public List<tblDocument> getData() {
        return data;
    }

    public void setData(List<tblDocument> data) {
        this.data = data;
    }
    
    String[] name = {"DocumentId","DocumentName","Description","CategoryId","PublisherId","Quantity","Price","YearDocument","Edition","Author"};
    @Override
    public int getRowCount() {
      return data.size();
    }

    @Override
    public int getColumnCount() {
        return name.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        
        tblDocument row = data.get(rowIndex);
        switch(columnIndex){
            case 0: return row.getDocumentId();
            case 1: return row.getDocumentName();
            case 2: return row.getDescription();
            case 3: return row.getCategoryId();
            case 4: return row.getPublisherId();
            case 5: return row.getQuantity();
            case 6: return row.getPrice();
            case 7: return row.getYearDocument();
            case 8: return row.getEdition();
            case 9: return row.getAuthor();
            default: return "";
        
        
        }
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
       switch(columnIndex){
           case 0: return String.class;
           case 1: return String.class;
           case 2: return String.class;
           case 3: return String.class;
           case 4: return String.class;
           case 5: return Integer.class;
           case 6: return String.class;
           case 7: return String.class;
           case 8: return Integer.class;
           case 9: return String.class;
           default: return String.class ;
       }
    }

    @Override
    public String getColumnName(int column) {
      return name[column];
    }
    
    
    
}
