package com.mac190.MinMaxPrime;

import com.mac190.Prime.Prime;
/*
Redesign MinMax class so that min and max are Prime objects.
Keep all setters and getters from the revious class as well as add methods.
In addition add setters and getters for Prime.
 */

public class MinMaxPrime {
    private Prime min = new Prime();
    private Prime max = new Prime();

    MinMaxPrime() {

    }

    MinMaxPrime(int input) {
        setBoth(input,input);
    }

    MinMaxPrime(int input1, int input2) {
        setBoth(input1, input2);
    }

    public void setBoth(int input1, int input2) {

        if (input1 >= input2) {
            max.setPrime(input1);
            min.setPrime(input2);
        }  else {
            max.setPrime(input2);
            min.setPrime(input1);
        }
    }

    public void setMin(int input) {
        setBoth(input,max.getPrime());
    }

    public void setMax(int input) {
        setBoth(min.getPrime(), input);
    }

    public Prime getMin() {
        return min;
    }

    public Prime getMax() {
        return max;
    }

    @Override
    public String toString(){
        return "min= " + min + ", max= " + max;
    }

    public boolean equals(MinMaxPrime other) {
        if(other == null || this.getClass() != other.getClass()) {
            return false;
        }
        return min == other.getMin() && max == other.getMax();
    }

    public MinMaxPrime add(int input) {
        return new MinMaxPrime(input + getMin().getPrime(), input + getMax().getPrime());
    }

    public MinMaxPrime add(MinMaxPrime other) {
        return new MinMaxPrime(other.getMin().getPrime() + getMin().getPrime(), other.getMax().getPrime() + getMax().getPrime());
    }

    public MinMaxPrime multiply(int input) {
        return new MinMaxPrime(input * getMin().getPrime(), input * getMax().getPrime());
    }

    public static MinMaxPrime add(int input, MinMaxPrime other) {
        return other.add(input);
    }

    public static MinMaxPrime add(MinMaxPrime o1, MinMaxPrime o2) {
        return o1.add(o2);
    }

    public static MinMaxPrime multiply(int input, MinMaxPrime other) {
        return other.multiply(input);
    }

}
