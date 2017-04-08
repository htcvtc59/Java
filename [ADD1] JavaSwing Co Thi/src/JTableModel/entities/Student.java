/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JTableModel.entities;

import java.util.Date;



/**
 *
 * @author Monkey.TNT
 */
public class Student {
    private String rollNo;
    private String name;
    private Date dob;
    private boolean gender;

    public Student(String rollNo, String name, Date dob, boolean gender) {
        this.rollNo = rollNo;
        this.name = name;
        this.dob = dob;
        this.gender = gender;
    }

    public String getRollNo() {
        return rollNo;
    }

    public void setRollNo(String rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }
    
    
    
    
         
}
