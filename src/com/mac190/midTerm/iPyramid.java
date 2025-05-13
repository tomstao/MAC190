package com.mac190.midTerm;

public class iPyramid extends Triangle {
    // *********************** field
    private double pyHeight;

    // ************************* constructors

    public iPyramid() {
        super();
        this.pyHeight = 0;
    }

    public iPyramid(double tBase, double tHeight, double pyHeight) {
        super.setBase(tBase);
        super.setHeight(tHeight);
        this.pyHeight = pyHeight;
    }

    public iPyramid(double input) {
        super.setBase(input);
        super.setHeight(input);
        this.pyHeight = input;
    }


    // ******************* setters/getters
    public double getPyHeight() {
        return pyHeight;
    }

    public void setPyHeight(double pyHeight) {
        this.pyHeight = pyHeight;
    }

    // ********************* required methods

    public double volume() {
        return super.area() * pyHeight / 3;
    }

    @Override
    public String toString() {
        return "This pyramid consists of a triangle with base(of Triangle) of " + super.getBase() + ',' +
                " height(of triangle) of " + super.getHeight() + ',' + " and height of " + this.pyHeight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        iPyramid iPyramid = (iPyramid) o;
        return Double.compare(iPyramid.pyHeight, pyHeight) == 0;
    }

    public iPyramid add(iPyramid input) {
        return new iPyramid(input.getBase() + this.getBase(), (input.getHeight() + this.getHeight()) / 2, (this.pyHeight + input.getPyHeight()) / 2);
    }

    public static iPyramid add(iPyramid p1, iPyramid p2) {
        return p1.add(p2);
    }

}
