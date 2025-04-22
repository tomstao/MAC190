package com.mac190.Vehicle;

import java.util.Objects;

/*
Design a aclass Vehicle that describs a vehicle. It can have
- Brand
- Color
- VIN
- Year
- type: "pas", "truck", "bus", ...

-getters setters
-toString
- method leftTurn(double degrees) "don't know how to turn yet!
- method rightTurn(double degrees) "don't know how to turn yet!
- moveForward(double speed);
- brake(); //puts speed to 0 and display stop.
- boolean moveBack(); //moves back only if it was stopped.
 */
public class Vehicle {
    private String brand;
    private String color;
    private String vin;
    private int year;
    private String type;
    private double speed;

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


    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }


    public void leftTurn(double degrees) {
        if (this.getBrand().equals("Unknown")) {
            System.out.println("don't know how to turn yet!");
        } else {
            System.out.println("This " + this.getBrand() + " is turning left by" + degrees + "degrees!");
        }
    }

    public void rightTurn(double degrees) {
        if (this.getBrand().equals("Unknown")) {
            System.out.println("don't know how to turn yet!");
        } else {
            System.out.println("This " + this.getBrand() + " is turning left by" + degrees + "degrees!");
        }
    }

    public void moveForward(double speed) {
        this.speed = speed;
        if (this.getBrand().equals("Unknown")) {
            System.out.println("This vehicle is moving forward by " + speed + "km/h");
        } else {
            System.out.println("This " + this.getBrand() + " is moving forward by " + speed + "km/h");
        }
    }

    public void brake() {
        if (this.getSpeed() == 0) {
            System.out.println(this.getBrand() == "Unknown" ? "This vehicle is stopped already! Speed 0 km/h." :
                    this.getBrand() + " is stopped! Speed 0 km/h.");
        } else {
            speed = 0;
            System.out.println(this.getBrand() == "Unknown" ? "This vehicle is stopped already! Speed 0 km/h." :
                    this.getBrand() + " is stopped! Speed 0 km/h.");
        }
    }

    public boolean moveBack() {
        if (speed == 0) {
            return true;
        } else {
            return false;
        }
    }


    @Override
    public String toString() {
        return "Vehicle{" +
                "brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                ", vin='" + vin + '\'' +
                ", year=" + year +
                ", type='" + type + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || !(o instanceof Vehicle)) return false;
        Vehicle vehicle = (Vehicle) o;
        return year == vehicle.year && Double.compare(speed, vehicle.speed) == 0 && Objects.equals(brand, vehicle.brand) && Objects.equals(color, vehicle.color) && Objects.equals(vin, vehicle.vin) && Objects.equals(type, vehicle.type);
    }


}
