/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fpt.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author DatHT
 */
public class StudentManager {
    private Connection con;
    
    public StudentManager() throws ClassNotFoundException, SQLException{
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        String url="jdbc:sqlserver://localhost:1433;databaseName=student_manager";
        con=DriverManager.getConnection(url,"sa","123456");
    }
    public List<Student> getAll() throws SQLException{
        List<Student> data=new ArrayList<>();
        String sql="select * from student";
        PreparedStatement stm=con.prepareStatement(sql);
        ResultSet rs= stm.executeQuery();
        while(rs.next()){
            Student st=new Student();
            st.studentId=rs.getString("id");
            st.name=rs.getString("name");
            st.age=rs.getInt("age");
            st.mail=rs.getString("mail");
            st.isMale=rs.getBoolean("is_male");
            data.add(st);
        }
        rs.close();
        stm.close();
        return data;
    }
    public void update(Student st) throws SQLException{
        String sql="update student set name=?,age=?,is_male=? where id=?";
        PreparedStatement stm=con.prepareStatement(sql);
        stm.setString(1,st.name);
        stm.setInt(2,st.age);
        stm.setBoolean(3,st.isMale);
        stm.setString(4, st.studentId);
        stm.executeUpdate();
    }
    
    public static void main(String[] args) {
        try {
            StudentManager stm=new StudentManager();
            System.out.println(stm.getAll());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(StudentManager.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(StudentManager.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
