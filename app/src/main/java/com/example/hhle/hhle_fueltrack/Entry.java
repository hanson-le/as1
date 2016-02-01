package com.example.hhle.hhle_fueltrack;

import java.util.Date;

/**
 * Created by Hanson on 2016-02-01.
 */
public class Entry {
    private Date date;
    private String station;
    private Double odometer;
    private String grade;
    private Double fuel_amount;
    private Double fuel_unit_cost;

    public Entry(){}

    public Entry(Date date,String station, double odometer, String grade, double fuel_amount, double fuel_unit_cost) {
        this.date = date;
        this.station =station;
        this.odometer = odometer;
        this.grade = grade;
        this.fuel_amount = fuel_amount;
        this.fuel_unit_cost = fuel_unit_cost;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setStation(String station){
        this.station = station;
    }

    public void setOdometer(double odometer) {
        this.odometer = odometer;
    }

    public  void setGrade(String grade){
        this.grade = grade;
    }

    public void setFuelAmount(double fuel_amount){
        this.fuel_amount = fuel_amount;
    }

    public void setFuelUnitCost(double fuel_unit_cost) {
        this.fuel_unit_cost = fuel_unit_cost;
    }

    public Date getDate() {
        return this.date;
    }

    public String getStation() {
        return this.station;
    }

    public double getOdometer() {
        return this.odometer;
    }

    public String getGrade() {
        return this.grade;
    }

    public double getFuelAmount() {
        return this.fuel_amount;
    }

    public double getFuelUnitCost() {
        return this.fuel_unit_cost;
    }
}
