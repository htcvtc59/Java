/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fpt.model;

import java.sql.SQLException;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author DatHT
 */
public class StudentTableModel extends AbstractTableModel{

    private List<Student> data;
    private final String columnNames[]={"ID","Name","Age","Email Address","IS Male"};
    public void loadData() throws ClassNotFoundException, SQLException{
        StudentManager stm=new StudentManager();
        data=stm.getAll();
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
       switch(columnIndex){
           case 0:return String.class;
           case 1:return String.class;
           case 2:return Integer.class;
           case 3:return String .class;
           case 4:return Boolean.class;
           default:return String.class;
       }
    }

    @Override
    public String getColumnName(int column) {
       return columnNames[column];
    }
    
    @Override
    public int getRowCount() {
        return data.size();
    }

    @Override
    public int getColumnCount() {
        return columnNames.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Student st=data.get(rowIndex);
       switch(columnIndex){
           case 0:return st.studentId;
           case 1:return st.name;
           case 2:return st.age;
           case 3:return st.mail;
           case 4:return st.isMale;
           default: return null;
       }
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return columnIndex!=0&&columnIndex!=3;
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        switch(columnIndex){
            case 1:
                data.get(rowIndex).name=String.valueOf(aValue);
                break;
            case 2:
                data.get(rowIndex).age=(Integer)aValue;
                break;
            case 4:
                data.get(rowIndex).isMale=(Boolean)aValue;
                break;
        }
        try {
            StudentManager sm=new StudentManager();
            sm.update(data.get(rowIndex));
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println(ex.toString());
        }
    }
    
    
}
