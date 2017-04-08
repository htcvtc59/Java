/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.event.TableModelListener;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author VuongNguyenVan
 */
public class tblCategoryModel extends AbstractTableModel{
    private java.util.List<tblCategory> data;
     
    public List<tblCategory> getData() {
        return data;
    }

    public void setData(List<tblCategory> data) {
        this.data = data;
    }
    
    String[] name = {"CategoryId","CategoryName"};
    
    
    @Override
    public int getRowCount() {
        
        return data.size();
        
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        
        switch(columnIndex){
            case 0: return String.class;
            case 1: return String.class;
            case 2: return JButton.class;
            case 3: return JButton.class;
            
            default: return String.class;
        }
    }

    @Override
    public String getColumnName(int column) {
      return name[column];
      
      
    }

    @Override
    public int getColumnCount() {
      return name.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
      tblCategory row = data.get(rowIndex);
      switch(columnIndex){
          case 0: return row.getCategoryId();
          case 1: return row.getCategoryName();
          case 2: final JButton button1 = new JButton(name[columnIndex]);
                button1.addActionListener((ActionEvent e) -> {
                    JOptionPane.showMessageDialog(JOptionPane.getFrameForComponent(button1), "Button click for row " + rowIndex);
      });
                return button1;
          case 3: final JButton button2 = new JButton(name[columnIndex]);
                button2.addActionListener((ActionEvent e) -> {
                    JOptionPane.showMessageDialog(JOptionPane.getFrameForComponent(button2), "Button click for row " + rowIndex);
      });
                return button2;      
          default: return "";
      }
    }

   
    
}
