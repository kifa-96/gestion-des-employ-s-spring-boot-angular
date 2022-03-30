package com.employeemanagement.employeemanagement.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Employee implements Serializable {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    @Column (nullable=false, updatable=false)
    private long id ;
    private String name;
    private String email;
    @Column (name="titlejob")
    private String jobTitle;
    private String phone;
    private String imageUrl;
    @Column (nullable=false, updatable=false)
    private String codeemployee;


    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", titlejob='" + jobTitle + '\'' +
                ", phone='" + phone + '\'' +
                ", imageUrl='" + imageUrl + '\'' +
                ", codeemployee='" + codeemployee + '\'' +
                '}';
    }

    public Employee(long id, String name, String email, String jobTitle, String phone, String imageUrl, String codeemployee) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.jobTitle = jobTitle;
        this.phone = phone;
        this.imageUrl = imageUrl;
        this.codeemployee = codeemployee;
    }

    public Employee() {

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitlt(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getCodeemployee() {
        return codeemployee;
    }

    public void setCodeemployee(String codeemployee) {
        this.codeemployee = codeemployee;
    }
}

