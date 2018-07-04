package com.example.Java_Poc.model;

import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@Entity
public class User {
    public User(String message) {
        this.message = message;
    }

    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    private Long userId;
    private String email;
    private  String password;
    private  Long phoneNumber;
    private String name;
    private Long annualIncome;
    private Date dateOfBirth;
    private Date createedAt;
    private Date updatedAt;
    private String message;


    public User() {
    }


    public User( Long userId, String email, String password, Long phoneNumber, String name, Long annualIncome, Date dateOfBirth, Date createdAt, Date updatedAt) {
        this.email = email;
        this.userId = userId;
        this.password = password;
        this.phoneNumber = phoneNumber;
        this.name = name;
        this.annualIncome = annualIncome;
        this.dateOfBirth = dateOfBirth;
        this.createedAt = createdAt;
        this.updatedAt = updatedAt;
    }


    public String getEmail() {
        return email;
    }


    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(Long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getAnnualIncome() {
        return annualIncome;
    }

    public void setAnnualIncome(Long annualIncome) {
        this.annualIncome = annualIncome;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Date getCreateedAt() {
        return createedAt;
    }

    public void setCreateedAt(Date createedAt) {
        this.createedAt = createedAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }


}
