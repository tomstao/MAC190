package com.mac190.IntroToClass;

public class ExampleClass {
    int num;
    double dnum;
    String name;

    ExampleClass(int num, double dnum, String name) {
        this.num = num;
        this.dnum = dnum;
        this.name = name;
    }

    ExampleClass(){}

    public void increment() {
        num++;
    }

    public void incrementDnum(double a) {
        dnum += a;
    }

    public void show() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return  "num = " + num +  ",dnum = " + dnum +  ",name = " + name;
    }

}
