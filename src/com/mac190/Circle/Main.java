package com.mac190.Circle;

public class Main {
    public static void main(String[] args) {
        Circle defaultCircle = new Circle();
        Circle oneInput = new Circle(5.5);
        Point center = new Point(9.3, 4.5);
        Circle cAndOne = new Circle(center, 5.5);
        Circle threeInput = new Circle(3.5, 10, 9);
        Circle movedCircle = oneInput.move(3);
        Circle aveCircle = oneInput.midCircle(threeInput);
        Point point1 = new Point(2,3);
        Point point2 = new Point(4,5);
        Point staticTest = new Point(0,0);
        Point staticTest2 = new Point(4,23);

        System.out.println("Default: " + defaultCircle);
        System.out.println("One input: " + oneInput);
        System.out.println("Input center and radius: " + cAndOne);
        System.out.println("Three input(3.5,10,9): " + threeInput);
        System.out.println("Moved Circle(default center and radius moved by 3): " + movedCircle);
        System.out.println("Ave(0,0,5.5) and (3.5, 10, 9): " + aveCircle);
        System.out.println("Distance: " + point1.distance(point2));
        System.out.println("*".repeat(20) + "test for static methods:");
        System.out.println("staticTest distance: " + Point.distance(staticTest, staticTest2));
        System.out.println("staticTest mid point: " + Point.midpoint(staticTest, staticTest2) );
        System.out.println("staticTest2 move: " + Point.move(staticTest2, 5));

    }
}
