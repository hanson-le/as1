package com.example.hhle.hhle_fueltrack;

import java.util.Date;

public class Entry {
    private String date;
    private String station;
    private String odometer;
    private String grade;
    private String fuel_amount;
    private String fuel_unit_cost;

    public Entry(){
    }

    public Entry(String date,String station, String odometer, String grade, String fuel_amount, String fuel_unit_cost) throws Exception{
        this.date = date;
        this.station =station;
        this.odometer = odometer;
        this.grade = grade;
        this.fuel_amount = fuel_amount;
        this.fuel_unit_cost = fuel_unit_cost;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setStation(String station){
        this.station = station;
    }

    public void setOdometer(String odometer) throws Exception {
        this.odometer = String.format("%.1g%n", odometer);
    }

    public  void setGrade(String grade){
        this.grade = grade;
    }

    public void setFuelAmount(String fuel_amount) throws Exception{
        this.fuel_amount = String.format("%.1g%n", fuel_amount);
    }

    public void setFuelUnitCost(String fuel_unit_cost) throws Exception {
        this.fuel_unit_cost = String.format("%.1g%n", fuel_unit_cost);
    }

    public String getDate() {
        return this.date;
    }

    public String getStation() {
        return this.station;
    }

    public String getOdometer() {
        return this.odometer;
    }

    public String getGrade() {
        return this.grade;
    }

    public String getFuelAmount() {
        return this.fuel_amount;
    }

    public String getFuelUnitCost() {
        return this.fuel_unit_cost;
    }
}
