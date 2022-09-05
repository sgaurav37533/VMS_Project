package com.Students.app.rest.Models;

import javax.persistence.*;

@Entity
@Table
public class Opportunity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    private String company;

    @Column
    private String description;

    @Column
    private String role;

    @Column
    private String duration;

    @Column
    private String offeredsalary;

    @Column
    private String year;

    public Integer getId() {
        return id;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getOfferedsalary() {
        return offeredsalary;
    }

    public void setOfferedsalary(String offeredsalary) {
        this.offeredsalary = offeredsalary;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }
}
