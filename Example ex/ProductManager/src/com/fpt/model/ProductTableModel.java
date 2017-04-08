/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fpt.model;

import java.util.LinkedList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author datht2@fpt.edu.vn
 */
public class ProductTableModel extends AbstractTableModel {

    private List<Product> data;

    public List<Product> getData() {
        return data;
    }

    public void setData(List<Product> data) {
        this.data = data;
    }

    public ProductTableModel() {
        this.data = new LinkedList<>();
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
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {

        Product row = data.get(rowIndex);
        System.out.println("Input: "+aValue);
        switch (columnIndex) {
            case 0:
                row.id = aValue.toString();
                break;
            case 1:
                row.name = aValue.toString();
                break;
            case 2:
                row.price = Float.parseFloat(aValue.toString());
                break;
            case 3:
                row.check=Boolean.parseBoolean(aValue.toString());
                break;
           
           

        }

    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        switch (columnIndex) {
            case 0:
                return String.class;
            case 1:
                return String.class;
            case 2:
                return Float.class;
            case 3:
                return Boolean.class;
            default:
                return String.class;

        }

    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return true;

    }

    @Override
    public String getColumnName(int column) {
        switch (column) {
            case 0:
                return "ID";
            case 1:
                return "Name";
            case 2:
                return "Price";
            default:
                return "Not Found";
        }

    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Product row = data.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return row.id;
            case 1:
                return row.name;
            case 2:
                return row.price;
            case 3:
                return row.check;
            default:
                return "Not Found";
        }

    }

}
