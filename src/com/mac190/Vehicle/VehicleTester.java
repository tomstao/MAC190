package com.mac190.Vehicle;
//create a default Vehicle
//diplay it.

//set the Vehicle to be a Jeep gray
//move it forward and backwards

//create a BMW x6, that is yellow electric
//display it.
//move it forward, backwards

//create a reference to the Vehicle inside the BMW.
//use the reference to display it
//use the reference to move it forward and backward.

//Create a Truck T Volvo white and all attributes of your choice
//display it
//move it forward and backwards

//create a reference to the Vehicle inside the Truck.
//use the reference to display it
//use the reference to move it forward and backward.
public class VehicleTester {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        System.out.println(vehicle);
        vehicle.setBrand("Jeep");
        vehicle.setColor("Gray");
        System.out.println(vehicle);
        vehicle.leftTurn(90);
        vehicle.rightTurn(90);
        vehicle.moveBack();
        vehicle.moveForward(80);

        BMW x6 = new BMW();
        x6.setType("X6");
        x6.setColor("Gray");
        x6.leftTurn(90);
        x6.rightTurn(90);
        x6.moveForward(80);
        x6.moveBack();

        System.out.println(vehicle.equals(x6));;
    }
}
