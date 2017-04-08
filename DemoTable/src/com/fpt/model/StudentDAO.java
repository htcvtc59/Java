/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fpt.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author DatHT
 */
public class StudentDAO {

    private PreparedStatement buildSQL(String sql) throws ClassNotFoundException, SQLException {
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        String url = "jdbc:sqlserver://localhost:1433;databaseName=fai_student";
        Connection con = DriverManager.getConnection(url, "sa", "123456");
        return con.prepareStatement(sql);
    }

    public java.util.List<Student> getAll() throws ClassNotFoundException, SQLException {
        java.util.List<Student> data = new ArrayList<>();
        PreparedStatement stm = buildSQL("select * from tbl_student");
        java.sql.ResultSet rs = stm.executeQuery();
        while (rs.next()) {
            Student st = new Student();
            st.id = rs.getString("student_id");
            st.name = rs.getString("fullname");
            st.age = rs.getInt("age");
            st.isMale = rs.getBoolean("is_male");
            data.add(st);
        }
        stm.getConnection().close();
        return data;
    }

    public boolean add(Student st) throws ClassNotFoundException, SQLException {
        PreparedStatement stm = buildSQL("insert into tbl_student values(?,?,?,?)");
        stm.setString(1,st.id);
        stm.setString(2,st.name);
        stm.setInt(3,st.age);
        stm.setBoolean(4,st.isMale);
        return stm.executeUpdate()==1;
    }
     public boolean update(Student st) throws ClassNotFoundException, SQLException {
        PreparedStatement stm = buildSQL("update tbl_student set fullname=?,age=?,is_male=? where student_id=?");
        stm.setString(4,st.id);
        stm.setString(1,st.name);
        stm.setInt(2,st.age);
        stm.setBoolean(3,st.isMale);
        return stm.executeUpdate()==1;
    }
}
