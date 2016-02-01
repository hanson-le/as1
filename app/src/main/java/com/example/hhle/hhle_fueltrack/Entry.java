package com.example.hhle.hhle_fueltrack;

import java.util.Date;

public class Entry {
    private String date;
    private String station;
    private double odometer;
    private String grade;
    private double fuel_amount;
    private double fuel_unit_cost;

    public Entry(){
    }

    public Entry(String date,String station, String odometer, String grade, String fuel_amount, String fuel_unit_cost){
        setDate(date);
        setStation(station);
        setOdometer(odometer);
        setGrade(grade);
        setFuelAmount(fuel_amount);
        setFuelUnitCost(fuel_unit_cost);
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setStation(String station){
        this.station = station;
    }

    public void setOdometer(String odometer){

        double temp = Double.parseDouble(odometer);
        this.odometer = temp;
    }

    public  void setGrade(String grade){
        this.grade = grade;
    }

    public void setFuelAmount(String fuel_amount){
        double temp = Double.parseDouble(fuel_amount);
        this.fuel_amount = temp;
    }

    public void setFuelUnitCost(String fuel_unit_cost){
        double temp = Double.parseDouble(fuel_unit_cost);
        this.fuel_unit_cost = temp;
    }

    public String getDate() {
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
