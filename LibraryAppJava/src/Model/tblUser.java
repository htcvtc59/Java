/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author MacOS
 */
public class tblUser {

    private String UserName;
    private String UserFullName;
    private String Password;

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    public String getUserFullName() {
        return UserFullName;
    }

    public void setUserFullName(String UserFullName) {
        this.UserFullName = UserFullName;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public tblUser() {
        this("", "", "");
    }

    public tblUser(String UserName, String UserFullName, String Password) {
        this.UserName = UserName;
        this.UserFullName = UserFullName;
        this.Password = Password;
    }

}
