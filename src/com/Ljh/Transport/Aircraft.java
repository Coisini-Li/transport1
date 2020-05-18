package com.Ljh.Transport;

import java.util.Date;

/**
 * @description:
 * @author: LiJiaHao
 * @date: Created in 2020/5/17 17:19
 * @version: 1.0
 * @modified By:
 */
public class Aircraft {
    private String id;
    private String ownership;
    private String Price;
    private Date dateOfPurchase;
    private String GPSposition;

    public void drivingMethod(){
        System.out.println("Aircraft drivingMethod");
    }

    public Aircraft() {
    }

    public Aircraft(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPrice() {
        return Price;
    }

    public void setPrice(String price) {
        Price = price;
    }

    public Date getDateOfPurchase() {
        return dateOfPurchase;
    }

    public void setDateOfPurchase(Date dateOfPurchase) {
        this.dateOfPurchase = dateOfPurchase;
    }

    public String getGPSposition() {
        return GPSposition;
    }

    public void setGPSposition(String GPSposition) {
        this.GPSposition = GPSposition;
    }

    public String getOwnership() {
        return ownership;
    }

    public void setOwnership(String ownership) {
        this.ownership = ownership;
    }
}
