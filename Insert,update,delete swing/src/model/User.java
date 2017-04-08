/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Monkey.TNT
 */
public class User {

    private int id;
    private String firstname;
    private String lastnaem;
    private int age;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastnaem() {
        return lastnaem;
    }

    public void setLastnaem(String lastnaem) {
        this.lastnaem = lastnaem;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public User(int id, String firstname, String lastnaem, int age) {
        this.id = id;
        this.firstname = firstname;
        this.lastnaem = lastnaem;
        this.age = age;
    }

    
    
}
