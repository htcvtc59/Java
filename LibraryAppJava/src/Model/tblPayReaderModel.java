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
public class tblPayReaderModel extends AbstractTableModel {
    private List<tblPayReader> data;

    public List<tblPayReader> getData() {
        return data;
    }

    public void setData(List<tblPayReader> data) {
        this.data = data;
    }

    String name[] = {"Id","DocumentId","ReaderId","QuantityPay","DatePay","MoneyBorrow","MoneyReturn","MoneyLost"};
    
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
        tblPayReader row = data.get(rowIndex);
        switch(columnIndex){
            case 0: return row.getId();
            case 1: return row.getDocumentId();
            case 2: return row.getReaderId();
            case 3: return row.getQuantityPay();
            case 4: return row.getDatePay();
            case 5: return row.getMoneyBorrow();
            case 6: return row.getMoneyReturn();
            case 7: return row.getMoneyLost();
            
            default: return "";
        }
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
       switch(columnIndex){
           case 0: return Integer.class;
           case 1: return String.class;
           case 2: return String.class;
           case 3: return String.class;
           case 4: return String.class;
           case 5: return String.class;
           case 6: return String.class;
           case 7: return String.class;
           default: return String.class;
       
       }
    }

    @Override
    public String getColumnName(int column) {
       return name[column];
    }
    
}
