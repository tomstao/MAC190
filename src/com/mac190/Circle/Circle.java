package com.mac190.Circle;

/*
A Circle is a shpe that HAS a point as a center and a radius (double).
- Default constructor
- Constructor that accepts one double, center will be default point and redius that double
- constructor that accepts three doubles, the two first for the center and the third
for the radius.
- constructor that accepts one point and a double, the point for the center and double for
the radius
- getters/setters.
-getX() getY() returns the x and y of the center
- getCenter(), getRadius and corresponding setters.
- toString
- equalCoordinate
- Circle move(int a), returns a new Circle where the center is moved by a
- Circle midCircle(Circel c) returns a Circle with center as midPoint between thi and c centers
and radius as the average. Use methods defined in the class Point.

- Test your classes extensively.
 */
public class Circle {
    private Point center;
    private double radius;

    public Circle() {
        this.center = new Point();
        this.radius = 1;
    }

    public Circle(double radius) {
        this.center = new Point();
        this.radius = radius;
    }

    public Circle(double x, double y, double radius) {
        this.center = new Point(x, y);
        this.radius = radius;
    }

    public Circle(Point center, double radius) {
        this.center = center;
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public Point getCenter() {
        return center;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    @Override
    public String toString() {
        return "This circle has radius " + radius + " and center " + center.toString();
    }

    public boolean equalShape(Circle input) {
        if (input == null) {
            return false;
        }

        if (radius != input.radius || !center.equalCoordinate(input.center)) {
            return false;
        }

        return true;
    }

    public boolean equals(Circle input) {
        if (input == null) {
            return false;
        }
        return this.getClass().getSimpleName().equals(input.getClass().getSimpleName());
    }

    public Circle move(double a) {
        return new Circle(center.move(a), radius);
    }

    public Circle midCircle(Circle c) {
        return new Circle(center.midpoint(c.center), (c.radius + radius) / 2);
    }

    static public Circle move(Circle circle, double a) {
        return circle.move(a);
    }

    static public Circle midCircle(Circle circle1, Circle circle2) {
        return circle1.midCircle(circle2);
    }

}
