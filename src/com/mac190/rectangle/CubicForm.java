package com.mac190.rectangle;

import java.util.Objects;

/*
Design a class that has the follwing
- a Rectangle object as the base and a height as a double.
- as many constructors as you may deem necessary
- setters for the base and height as well as setters and getters for width and length
- toString equals
- method zoom that accepts an integer and returns a CubicForm where length, width and height
are augmented by the input. Always use previously defined methods in class Rectangle whenever
possible.
- method add that accepts another CubicForm object and returns a CubicForm that has the base
as the sum of the two bases and the height as the sum of the heighs.
- method Volume that returns the volume as the area of the base multiplied by the height.
- Method area that returns the area of the cubic form, you have 6 areas to add up.
-implement add method as static method

 */
public class CubicForm {
    Rectangle rectangle;
    double height;
    public CubicForm() {
        this.rectangle = new Rectangle();
        height = 2;
    }

    public CubicForm(double length, double width) {
        this.rectangle = new Rectangle(length, width);
        height = 2;
    }

    public CubicForm(Rectangle rectangle) {
        this.rectangle = rectangle;
        height = 2;
    }

    public CubicForm(Rectangle rectangle, double height) {
        this.rectangle = rectangle;
        this.height = height;
    }

    public CubicForm(double width, double length, double height) {
        this.rectangle = new Rectangle(width, length);
        this.height = height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWidthLength(double width, double length) {
        rectangle.setWidth(width);
        rectangle.setLength(length);
    }

    public void setWidth(double width) {
        rectangle.setWidth(width);
    }

    public void setLength(double length) {
        rectangle.setLength(length);
    }

    public Rectangle getRectangle() {
        return rectangle;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        CubicForm cubicForm = (CubicForm) o;
        return Double.compare(height, cubicForm.height) == 0 && Objects.equals(rectangle, cubicForm.rectangle);
    }

    @Override
    public String toString() {
        return "CubicForm{" +
                "rectangle=" + rectangle +
                ", height=" + height +
                '}';
    }

    public CubicForm zoom(double input) {
        return new CubicForm(rectangle.zoom(input), height * input);
    }

    public static CubicForm zoom(CubicForm cubic, double input) {
        return cubic.zoom(input);
    }

    public CubicForm sum(CubicForm cubic) {
        return new CubicForm(rectangle.plus(cubic.getRectangle()), height + cubic.getHeight());
    }

    public static CubicForm sum(CubicForm cubic, CubicForm cubic2) {
        return cubic.sum(cubic2);
    }

    public double volume() {
        return rectangle.getArea() * height;
    }

    static double volume(CubicForm cubic) {
        return cubic.volume();
    }

    public double area() {
        return rectangle.getArea() * 2 + rectangle.getLength() * height * 2 + rectangle.getWidth() * height * 2;
    }

    static double area(CubicForm cubic) {
        return cubic.area();
    }
}
