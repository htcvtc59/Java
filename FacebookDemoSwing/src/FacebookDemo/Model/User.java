/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FacebookDemo.Model;

/**
 *
 * @author Monkey.TNT
 */
public class User {
    public int id;
    public String name;
    public String email;
    public String password;
    public String gender;

    @Override
    public String toString() {
        return "User{" + "id=" + id + ", name=" + name + ", email=" + email + ", password=" + password + ", gender=" + gender + '}';
    }
    
    
    
}
