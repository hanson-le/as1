package com.example.hhle.hhle_fueltrack;

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

    public double getFuelCost() {
        return  getFuelAmount() * getFuelUnitCost() / 100;
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
