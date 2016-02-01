package com.example.hhle.hhle_fueltrack;

/* This is a simple model class that deals with individual logs. There are getters and setters for
all the inputs. There is also a method that calculates the fuel cost. While it is primarily a data class,
this class overrides the "toString" method in order to limit the amount of function calls.
 */

public class Entry {
    private String date;
    private String station;
    private double odometer;
    private String grade;
    private double fuel_amount;
    private double fuel_unit_cost;

    public Entry(String date,String station, String odometer,
                 String grade, String fuel_amount, String fuel_unit_cost){
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
        this.odometer = Double.parseDouble(odometer);
    }

    public  void setGrade(String grade){
        this.grade = grade;
    }

    public void setFuelAmount(String fuel_amount){
        this.fuel_amount = Double.parseDouble(fuel_amount);
    }

    public void setFuelUnitCost(String fuel_unit_cost){
        this.fuel_unit_cost = Double.parseDouble(fuel_unit_cost);
    }

    public String getDate() {
        return this.date;
    }

    public String getStation() {
        return this.station;
    }

    public String getOdometer() {
        return String.format("%.1f",this.odometer);
    }

    public String getGrade() {
        return this.grade;
    }

    public String getFuelAmount() {
        return String.format("%.3f", this.fuel_amount);
    }

    public String getFuelUnitCost() {
        return String.format("%.1f",this.fuel_unit_cost);
    }

    public String getFuelCost() {
        double value = fuel_amount * fuel_unit_cost / 100;
        return  String.format("%.2f", value);
    }

    @Override
    public String toString(){
        String rv = "Date: " + getDate() + "\nStation: " + getStation() +
                "\nOdometer reading: " + getOdometer() + " km\nFuel Grade: " +
                getGrade() + "\nFuel Amount: " + getFuelAmount() +
                " L\nFuel Unit Cost: " + getFuelUnitCost() +
                " c/L\nFuel Cost: $ " + getFuelCost() + "\n";
        return rv;
    }
}
