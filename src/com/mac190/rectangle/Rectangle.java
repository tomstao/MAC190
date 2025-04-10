package com.mac190.rectangle;

/*
Design and implement a class Rectangle that has the following:
- thwo double variables width and length
- as many constructors as you can
- setters/getters for each and for both
- toString equals
- method parimeter returning the perimiter of the rectangle
- method area that returns the area of the rectangle
- method zoom that accepts a positive double and returns the rectangle with
width a length augmented by the input.
- method add that accepts a rectangle and returns a rectangle as the sum of the two rectangles
- same method as above as stactic method.
- implement the add method as static method
 */
public class Rectangle {
    private double width;
    private double length;

    public Rectangle(double width, double height) {
        this.width = width;
        this.length = height;
    }

    public Rectangle() {
        width = 2;
        length = 2;
    }

    public Rectangle(double length) {
        this.width = length;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", length=" + length +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Rectangle rectangle = (Rectangle) o;
        return Double.compare(width, rectangle.width) == 0 && Double.compare(length, rectangle.length) == 0;
    }

    public double getPerimeter() {
        return (width + length) * 2;
    }

    public static double perimeter(Rectangle rectangle) {
        return rectangle.getPerimeter();
    }

    public double getArea() {
        return width * length;
    }

    public static double getArea(Rectangle rectangle) {
        return rectangle.getArea();
    }

    public Rectangle zoom (double input) {
        return new Rectangle(width * input, length * input);
    }

    public static Rectangle zoom (double input, Rectangle rectangle) {
        return Rectangle.zoom(input, rectangle);
    }

    public Rectangle plus(Rectangle other) {
        return new Rectangle(width + other.width, length + other.length);
    }

    public static Rectangle plus(Rectangle rectangle, Rectangle other) {
        return rectangle.plus(other);
    }

}
