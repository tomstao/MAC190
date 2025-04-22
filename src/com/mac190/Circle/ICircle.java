package com.mac190.Circle;

public class ICircle  extends Point {
    private double radius;
    private double x, y;

    public ICircle(double x, double y, double radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public ICircle(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public ICircle(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "This Point has x-coordinate =" + x + ", and y-coordinate=" + y;
    }

    public boolean equalCoordinate(Point point) {
        if (point == null) {
            return false;
        }
        if(point.getClass().getSimpleName().equals("Point")) {
            return this == point;
        }
        return false;
    }

    public boolean equals(Point point) {
        return this == point;
    }

    ICircle midpoint(Point point) {
        return new ICircle((x + point.getX()) / 2, (y + point.getY()) / 2);
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    ICircle move(double a) {
        return new ICircle(x + a, y + a);
    }

    double distance(Point point) {
        if (this.equalCoordinate(point)) {
            return 0;
        }

        return Math.sqrt(Math.pow(x - point.getX(), 2) + Math.pow(y - point.getY(), 2));
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public static double distance(ICircle point1, ICircle point2) {
        return point1.distance(point2);
    }

    public static ICircle midpoint(ICircle point1, ICircle point2) {
        return point1.midpoint(point2);
    }

    public static ICircle move(ICircle point, double a) {
        return point.move(a);
    }

}
