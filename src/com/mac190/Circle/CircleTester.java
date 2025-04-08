package com.mac190.Circle;
//make a default Circle and display it

//set the circle C1 so that center is 2, 4 and radius 5, display it

//create a circle C2 wirh center (1, 5) radius 2

//move C2 by 2

//create a circle C3 as the mid Circle of C1 and C2
public class CircleTester {
    public static void main(String[] args) {
        Circle c1 = new Circle(2,4,5);
        System.out.println(c1);
        Circle c2 = new Circle(1,5,2);
        System.out.println(c2);
        Circle movedC2 = c2.move(2);
        System.out.println("c2 moved by 2: " + movedC2);
        Circle c3 = c1.midCircle(c2);
        System.out.println("Mid circle of c1 and c2: " + c3);
    }
}
