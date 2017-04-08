/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Config;

import java.io.Serializable;

/**
 *
 * @author DELL
 */
public class ReadUser implements Serializable{
    private String account,pass;

    public ReadUser(String account, String pass) {
        this.account = account;
        this.pass = pass;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getAccount() {
        return account;
    }

    public String getPass() {
        return pass;
    }
    
    
}
