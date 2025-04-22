package com.mac190.Vehicle;
/*
Desing a class BMW that is a Vehicle that has all the Vehicle has an in addition
if has the folowing:
- fuel type can be 'g' gas 'd' for diesel and 'e' for electric
- model "X5"
- leftTurn here displays turing left smoothly
- rightTurn here displays turing right smoothly
- moveBack implement a different method than in Vehicle.
- toString
- equals
 */


import java.util.Objects;

public class BMW extends Vehicle {
    private String fuelType;
    private String model = "X5";

    public BMW() {
        super();
        this.setBrand("BMW");
        fuelType = "d";
    }


    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void leftTurn(double degrees) {
        System.out.println("This " + this.getBrand() + '-' + this.getModel() + " is turning left " + degrees + " smoothly!");
    }
    public void rightTurn(double degrees) {
        System.out.println("This " + this.getBrand() + '-' + this.getModel() + " is turning right " + degrees + " smoothly!");
    }

    @Override
    public String toString() {
        return "BMW{" +
                "fuelType='" + fuelType + '\'' +
                ", model='" + model + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof BMW bmw)) return false;
        return Objects.equals(fuelType, bmw.fuelType) && Objects.equals(model, bmw.model);
    }

    public boolean moveBack() {
        if (getSpeed() == 0) {
            System.out.println("This " + this.getBrand() + '-' + this.getModel() + " is starting moving back!");
            return true;
        } else {
            System.out.println("You need to stop your car before moving back!");
            return false;
        }
    }
}
