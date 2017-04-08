/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fpt.loginsample.db;

import java.sql.SQLException;

/**
 *
 * @author DatHT
 */
public class AccountManager {
    
    public Account login(String username,String password) throws ClassNotFoundException, SQLException{
      java.sql.Connection con=DBUtils.getConnection();
      java.sql.Statement stm=con.createStatement();
      String sql="select top 1 * from account where username='"+username+"' and password='"+password+"'";
      java.sql.ResultSet resultSet=stm.executeQuery(sql);
      if(resultSet.next()){
          Account ac=new Account();
          ac.username=resultSet.getString("username");
          ac.full_name=resultSet.getString("full_name");
          ac.phone_number=resultSet.getString("phone_number");
          ac.birth_date=resultSet.getDate("birth_date");
          resultSet.close();
          con.close();
          return ac;
      }else return null;
    }
}
