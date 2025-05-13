package com.mac190.midTerm;

public class Triangle {
    // ********************** field
    private double base;
    private double height;

    //******************* Constructors
    public Triangle() {

        this.base = 0;
        this.height = 0;
    }

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    public Triangle(double base) {
        this.base = base;
        this.height = base;
    }

    //************************************** getters/setters
    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
//*******************************************  required methods

    public double area() {
        return this.base * this.height * 0.5;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "base=" + base +
                ", height=" + height +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Triangle triangle = (Triangle) o;
        return Double.compare(triangle.base, base) == 0 && Double.compare(triangle.height, height) == 0;
    }

    public Triangle add(Triangle input) {
        return new Triangle(this.base + input.getBase(), (this.height + input.getHeight()) / 2);
    }

    static public Triangle add(Triangle t1, Triangle t2) {
        return new Triangle(t1.getBase() + t2.getBase(), (t1.getHeight() + t2.getHeight()) / 2);
    }
}
