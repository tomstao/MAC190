package com.mac190.midTerm;

import java.util.Objects;

public class Pyramid {
    // ******************** field
    private Triangle base;
    private double pyHeight;

    //************************** constructors

    public Pyramid() {
        this.base = new Triangle();
        this.pyHeight = 0;
    }

    public Pyramid(Triangle t, double height) {

        this.base = t;
        this.pyHeight = height;
    }


    public Pyramid(double tBase, double tHeight, double pyHeight) {
        this.base = new Triangle(tBase, tHeight);
        this.pyHeight = pyHeight;
    }

    public Pyramid(double input) {
        this.base = new Triangle(input);
        this.pyHeight = input;
    }


    //******************************** setters/getters


    public Triangle getBase() {
        return base;
    }

    public void setBase(Triangle base) {
        this.base = base;
    }

    public double getPyHeight() {
        return pyHeight;
    }

    public void setPyHeight(double pyHeight) {
        this.pyHeight = pyHeight;
    }

    // *************************** required methods

    public double volume() {
        return this.base.area() * this.pyHeight / 3;
    }

    @Override
    public String toString() {
        return "This Pyramid consists of a triangle with the base( of triangle): " + this.base.getBase() +
                ',' + " height( of triangle): " + this.base.getHeight() + " and the height of the " +
                "Pyramid: " + this.pyHeight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pyramid pyramid = (Pyramid) o;
        return Double.compare(pyramid.pyHeight, pyHeight) == 0 && Objects.equals(base, pyramid.base);
    }

    public  Pyramid add(Pyramid input) {
        return new Pyramid(this.base.add(input.getBase()), (this.pyHeight + input.getPyHeight()) / 2);
    }

    static public Pyramid add(Pyramid p1, Pyramid p2) {
        return p1.add(p2);
    }


}
