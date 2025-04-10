package com.mac190.rectangle;
/*

Design a class FouDShape that has the following
- A CubicForm and the heart and a fourth dimension as a double.
- As many constructors as you deem necessary
- setters getters for all attributes
- zoom method that returns a FourDShape where all dimensions are augmented by the input.
Use the previous zoom methods created
- method add that adds two FourDShapes and returns a FourDshape as a result, use the previous add
method in class CubicForm.
- Implement the add method as a static method

--Test All you class in a single tester. Invoke all method static and non static.

 */

import java.util.Objects;

public class FourDshape {
    CubicForm cubic;
    double fourthDimension;

    public FourDshape(CubicForm cubic, double fourthDimension) {
        this.cubic = new CubicForm();
        this.fourthDimension = fourthDimension;
    }

    public FourDshape(CubicForm cubic) {
        this(cubic, 1.0);
    }

    public FourDshape(double width, double length, double height, double fourthDimension) {
        this(new CubicForm(width, length, height), fourthDimension);
    }

    public CubicForm getCubic() {
        return cubic;
    }

    public void setCubic(CubicForm cubic) {
        this.cubic = cubic;
    }

    public double getFourthDimension() {
        return fourthDimension;
    }

    public void setFourthDimension(double fourthDimension) {
        this.fourthDimension = fourthDimension;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        FourDshape that = (FourDshape) o;
        return Double.compare(fourthDimension, that.fourthDimension) == 0 && Objects.equals(cubic, that.cubic);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cubic, fourthDimension);
    }
}
