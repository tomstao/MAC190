package com.mac190.Vehicle;
/*
Design a class Truck that is a Vehicle that has all the Vehicle has an in addition
if has the folowing:
        - load in tons
        - leftTurn here displays turing left smoothly
        - rightTurn here displays turing right smoothly
        - moveBack implement a different method than in Vehicle.
        - toString
        - equals
        */

public class Truck {

    private int loads;

    public Truck(int loads) {
        super();
        this.loads = loads;
    }

    public int getLoads() {
        return loads;
    }

    public void setLoads(int loads) {
        this.loads = loads;
    }

    public void leftTurn (double degrees) {
        System.out.println("This truck is making a " + degrees + " degrees left turn smoothly");
    }

    public void rightTurn (double degrees) {
        System.out.println("This truck is making a " + degrees + " right tunr degrees smoothly");
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Truck truck)) return false;
        return loads == truck.loads;
    }

    @Override
    public String toString() {
        return "Truck{" +
                "loads=" + loads +
                '}';
    }
}
