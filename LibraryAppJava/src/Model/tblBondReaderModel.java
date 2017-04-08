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
public class tblBondReaderModel extends AbstractTableModel{

    private List<tblBondReader> data;

    public List<tblBondReader> getData() {
        return data;
    }

    public void setData(List<tblBondReader> data) {
        this.data = data;
    }
    String[] name = {"Id","ReaderId","DocumentId","Quantity","DateStart","DateFinish"};
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
        tblBondReader row = data.get(rowIndex);
        switch(columnIndex){
            case 0: return row.getId();
            case 1: return row.getReaderId();
            case 2: return row.getDocumentId();
            case 3: return row.getQuantity();
            case 4: return row.getDateStart();
            case 5: return row.getDateFinish();
           
        
            default: return "";
        }
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        switch(columnIndex){
            case 0: return Integer.class;
            case 1: return String.class;
            case 2:return String.class;
            case 3:return Integer.class;
            case 4: return String.class;
            case 5: return String.class;
         
       
            default: return String.class;
        
        }
    }

    @Override
    public String getColumnName(int column) {
       return name[column];
    }
    
    
    
}
