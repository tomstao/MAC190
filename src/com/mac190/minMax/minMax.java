package com.mac190.minMax;

/*
Design a class MinMax that has the following properties:
- two integer member variables min and max, where min should
always be smaller or equal than max.
- Default constructor setting both to 0 ✅
- constructor that accepts one value and sets both
to that value ✅
- constructor that accepts two values and sets min
to the smallest and max to the largest ✅
- setter setBoth() that accepts two values,sets
min to the smallest and max to the largest ✅
- setter setMin that accepts a value. If the value is larger
than max, then min should be set to the value of
max and max to the input value, toherwise min is set to the input value ✅
- setter setMax that accepts a value. If the value
is smaller than min, then max is set to min and min is
set to that value. Otherwise set max to the input value ✅
-getters ✅
-toString method returning a string with min and max values ✅
- equals method ✅
- method MinMax add(int a). returns a MaxMin object
similar to this plus a to both min and max ✅
- method MinMax add(MinMax m) same above but min of m
is added to the min of this and max of m is added to the max ✅
- method MinMax multiply(int a) returns a MinMax object
with min as the min of this multiplied by a and same for max
pay attention to the sign of a.
- implement add methods and multiply method above as static methods

-In a tester, test your class extensively. All methods static and non static
 */
public class minMax {
    private int min;
    private int max;

    minMax() {
        min = 0;
        max = 0;
    }

    minMax(int input) {
        setBoth(input,input);
    }

    minMax(int input1, int input2) {
        setBoth(input1, input2);
    }

    public void setBoth(int input1, int input2) {

        if (input1 >= input2) {
            max = input1;
            min = input2;
        }  else {
            max = input2;
            min = input1;
        }
    }

    public void setMin(int input) {
        setBoth(input,max);
    }

    public void setMax(int input) {
        setBoth(min, input);
    }

    public int getMin() {
        return min;
    }

    public int getMax() {
        return max;
    }

    @Override
    public String toString(){
        return "min= " + min + ", max= " + max;
    }

    public boolean equals(minMax other) {
        if(other == null || this.getClass() != other.getClass()) {
            return false;
        }
        return min == other.getMin() && max == other.getMax();
    }

    public minMax add(int input) {
        return new minMax(input + getMin(), input + getMax());
    }

    public minMax add(minMax other) {
        return new minMax(other.getMin() + getMin(), other.getMax() + getMax());
    }

    public minMax multiply(int input) {
        return new minMax(input * getMin(), input * getMax());
    }

    public static minMax add(int input, minMax other) {
        return other.add(input);
    }

    public static minMax add(minMax o1, minMax o2) {
        return o1.add(o2);
    }

    public static minMax multiply(int input, minMax other) {
        return other.multiply(input);
    }

}
