/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fpt.app;

import com.fpt.model.Student;
import com.fpt.model.StudentDAO;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author DatHT
 */
public class StudentTableModel extends AbstractTableModel {

    private java.util.List<Student> data;

    public List<Student> getData() {
        return data;
    }

    public void setData(List<Student> data) {
        this.data = data;
    }

    @Override
    public int getRowCount() {
        return data.size();
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        switch (columnIndex) {
            case 0:
                return String.class;
            case 1:
                return String.class;
            case 2:
                return Boolean.class;
            case 3:
                return Integer.class;
            default:
                return String.class;
        }
    }

    @Override
    public String getColumnName(int column) {
        switch (column) {
            case 0:
                return "ID";
            case 1:
                return "Name";
            case 2:
                return "Is Male";
            case 3:
                return "Age";
            default:
                return "";
        }
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Student row = data.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return row.id;
            case 1:
                return row.name;
            case 2:
                return row.isMale;
            case 3:
                return row.age;
            default:
                return "";
        }
    }

    public void add(Student s) {
        data.add(s);
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return columnIndex != 0;
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        Student row = data.get(rowIndex);
        switch (columnIndex) {
            case 1:
                row.name = (String) aValue;
                break;
            case 2:
                row.isMale = (Boolean) aValue;
                break;
            case 3:
                row.age = (Integer) aValue;
        }
        try {
            new StudentDAO().update(row);
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(StudentTableModel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
