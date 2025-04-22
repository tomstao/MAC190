package com.mac190.Vehicle;

public class Vehicle {
    private String brand;
    private String color;
    private String vin;
    private int year;
    private String type;

    public Vehicle(String brand, String color, String vin, int year, String type) {
        this.brand = brand;
        this.color = color;
        this.vin = vin;
        this.year = year;
        this.type = type;
    }

    public Vehicle() {
        this.brand = "Unknown";
        this.color = "Unknown";
        this.vin = "Unknown";
        this.year = 2000;
        this.type = "Unknown";
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public void leftTurn() {
        System.out.println("This vehicle is making a left turn.");
    }

    public void rightTurn() {
        System.out.println("This vehicle is making a right turn.");
    }


}
