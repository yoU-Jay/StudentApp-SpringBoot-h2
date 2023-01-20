package com.org.studentrestapp.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;
/*
* Student Table
*   '-> Long id
*   '-> String firstName
*   '-> String lastName
*   '-> String departmentName
*   '-> String universityName
*   '-> Double percentage
*   '-> Date dateOfBirth
*
*
*
* */
@Entity
public class Student {
    private @Id @GeneratedValue Long id;
    private String firstName;
    private String lastName;
    private String departmentName;
    private  String universityNumber;
    private Double percentage;
    private Date dateOfBirth;
    Student() {}
    Student(String firstName, String lastName, String departmentName, String universityNumber, Double percentage){
        this.firstName = firstName;
        this.lastName = lastName;
        this.departmentName = departmentName;
        this.universityNumber = universityNumber;
        this.percentage = percentage;
        this.dateOfBirth = dateOfBirth;

    }

    //Getters and Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }


    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Double getPercentage() {
        return percentage;
    }
    public void setPercentage(Double percentage) {
        this.percentage = percentage;
    }

    public String getUniversityNumber() {
        return universityNumber;
    }

    public void setUniversityNumber(String universityNumber) {
        this.universityNumber = universityNumber;
    }


}

