/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JTableModel.Model;

import JTableModel.entities.Student;
import java.util.List;
import java.util.LinkedList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Monkey.TNT
 */
public class StudentTableModel extends AbstractTableModel {

    private String[] headers = {"RollNo", "Name", "DOB", "Gender"};
    private List<Student> data = new LinkedList<>();

    public StudentTableModel(String[] headers, List<Student> data) {
        this.headers = headers;
        this.data = data;
    }
public String getColumnName(int columnIndex){
    if(columnIndex < getColumnCount()){
        return headers[columnIndex];
    }
        return "";
}
    @Override
    public int getRowCount() {
        if (data != null) {
            return data.size();
        }
        return 0;
    }

    @Override
    public int getColumnCount() {
        if (headers != null) {
            return headers.length;
        }
        return 0;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        if (rowIndex > getRowCount() || columnIndex > getColumnCount()) {
            return "";
        }
        Student row = data.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return row.getRollNo();

            case 1:
                return row.getName();
            case 2:
                return row.getDob();
            case 3:
                return row.isGender();
            default:
                return "";

        }
    }

}
