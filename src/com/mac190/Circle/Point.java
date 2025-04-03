package com.mac190.Circle;

/*
Desing a class Point that has two coordinates X and Y.
-Default constructor
- A constructor that takes in one double
- A constructor that accepts two doubles
- toString
-  equalCoordinate
- Method Point midPoint(Point p) that returns the mid point between this point and p
(average X and average y)
- Point move(int a) //returns a Point similar to this where x and y are increases by a
- double distance(Point p) returns the distance between this point and p.
the distance is computed as  squareroot of the sum of difference of Xs square and difference
of Ys square.
 */
public class Point {
    private double x, y;

    public Point() {

    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Point(double input) {
        this.x = input;
        this.y = input;
    }

    @Override
    public String toString() {
        return "This Point x-coordinate =" + x + ", y-coordinate=" + y;
    }

    public boolean equalCoordinate(Point point) {
        return x == point.x && y == point.y;
    }

    public boolean equals(Point point) {
        return this == point;
    }

    Point midpoint(Point point) {
        return new Point(x + (point.x - x) / 2, y + (point.y - y) / 2);
    }

    Point move(double a) {
        return new Point(x + a, y + a);
    }

    double distance(Point point) {
        if (this.equalCoordinate(point)) {
            return 0;
        }

        if (x == point.x) {
            return Math.abs(y - point.y);
        }

        if (y == point.y) {
            return Math.abs(x - point.x);
        }

        return Math.sqrt(Math.pow(x - point.x, 2) + Math.pow(y - point.y, 2));
    }
}
