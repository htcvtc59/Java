/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercise2;

/**
 *
 * @author Monkey.TNT
 */
public class Student {
    private String name;
    private int rollno;
    private String classs;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public String getClasss() {
        return classs;
    }

    public void setClasss(String classs) {
        this.classs = classs;
    }

    public Student(String name, int rollno, String classs) {
        this.name = name;
        this.rollno = rollno;
        this.classs = classs;
    }
    
    
    
    
}
