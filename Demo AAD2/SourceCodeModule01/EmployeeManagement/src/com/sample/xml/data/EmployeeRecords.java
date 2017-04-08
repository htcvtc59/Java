/* FileName:       EmployeeRecords.java
* Purpose:         This Class is used as a Bean class for storing data.
* Features covered : SQLXML
* Author:          Vincent
* Created Date:    20-Nov-2013
* Version:         1.1(Initial Version)
* Last Modified:   05-Dec-2013*/
package com.sample.xml.data;
public class EmployeeRecords {
    private String name;
    private String email;
    private String department;
    private String degree;
    private String college;
    private float aggregate;

    public String getName()
    {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the department
     */
    public String getDepartment() {
        return department;
    }

    /**
     * @param department the department to set
     */
    public void setDepartment(String department) {
        this.department = department;
    }

    /**
     * @return the degree
     */
    public String getDegree() {
        return degree;
    }

    /**
     * @param degree the degree to set
     */
    public void setDegree(String degree) {
        this.degree = degree;
    }

    /**
     * @return the college
     */
    public String getCollege() {
        return college;
    }

    /**
     * @param college the college to set
     */
    public void setCollege(String college) {
        this.college = college;
    }

    /**
     * @return the aggregate
     */
    public float getAggregate() {
        return aggregate;
    }

    /**
     * @param aggregate the aggregate to set
     */
    public void setAggregate(float aggregate) {
        this.aggregate = aggregate;
    }
        
}
