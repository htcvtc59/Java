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
public class tblReaderModel extends AbstractTableModel {

    private List<tblReader> data;

    public List<tblReader> getData() {
        return data;
    }

    public void setData(List<tblReader> data) {
        this.data = data;
    }
    String name[] = {"ReaderId","ReaderName","Briday","Phone","Email","Address"};
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
       tblReader row = data.get(rowIndex);
       switch(columnIndex){
           case 0: return row.getReaderId();
           case 1: return row.getReaderName();
           case 2: return row.getBirday();
           case 3: return row.getPhone();
           case 4: return row.getEmail();
           case 5: return row.getAddress();
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
            case 5: return String.class;
            default: return String.class;
        }
    }

    @Override
    public String getColumnName(int column) {
       return name[column];
    }
    
}
