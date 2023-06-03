package com.Students.app.rest.Models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Details {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    private String company;

    @Column
    private String country;

    @Column
    private String image;

    @Column
    private String vehicleDetails;

    @Column
    private Boolean deviceType;

    @Column
    private Boolean wifiReq;

    @Column
    private Boolean deviceSerialNum;

    public Integer getId() {
        return id;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getVehicleDetails() {
        return vehicleDetails;
    }

    public void setVehicleDetails(String vehicleDetails) {
        this.vehicleDetails = vehicleDetails;
    }

    public boolean getDeviceType() {
        return deviceType;
    }

    public void setDeviceType(boolean deviceType) {
        this.deviceType = deviceType;
    }

    public boolean getWifi() {
        return wifiReq;
    }

    public void setWifi(boolean wifiReq) {
        this.wifiReq = wifiReq;
    }

    public boolean getDeviceSerialNum() {
        return deviceSerialNum;
    }

    public void setDeviceSerialNum(boolean deviceSerialNum) {
        this.deviceSerialNum = deviceSerialNum;
    }
}
