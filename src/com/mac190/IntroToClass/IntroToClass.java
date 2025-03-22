package com.mac190.IntroToClass;
/*
 Object carries its own data and methods, it's called encapsulation.




 */
public class IntroToClass {
    public static void main(String[] args) {

        ExampleClass ex = new ExampleClass(3,-1.2, "Jack");
        ex.show();
        ex.increment();
        ex.show();
        ex.incrementDnum(-2);

        ExampleClass obj = new ExampleClass();
        obj.num = 5;
        obj.dnum = -16.5;
        obj.name = "yo";
        obj.show();
        obj.increment();
        obj.show();

        ExampleClass prof = obj;
        prof.show();

//        ExampleClass ex2 = new ExampleClass(5,-16.5, "yo");
//        ex2.show();

    }
}
