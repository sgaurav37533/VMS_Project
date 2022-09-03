package com.Students.app.rest.Models;

import javax.persistence.*;

@Entity
@Table
public class StudentData {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    private String usn;

    @Column
    private String name;

    @Column
    private String date;

    @Column
    private String email;

    @Column
    private String number;

    public Integer getId() {
        return id;
    }

    public String getUSN() {
        return usn;
    }

    public void setUSN(String usn) {
        this.usn = usn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}
