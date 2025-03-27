package com.mac190.minMax;
/*
@author Tao Su

This is a Main class for testing minMac class.
 */
public class Main {
    public static void main(String[] args) {
        minMax test = new minMax(23,50);
        minMax test2 = new minMax(43,22);
        minMax test3 = new minMax(43,22);
        minMax methodTest = new minMax(13,40);
        minMax defaultObject = new minMax();
        System.out.println("Test default constructor:" + defaultObject);

        System.out.println("*".repeat(80) + "\n");// separating line

        minMax oneInput = new minMax(74);
        System.out.println("Test oneInput constructor(input 74):" + oneInput);
        System.out.println("*".repeat(80) + "\n");// separating line


        minMax smallAndLarge = new minMax(25,30);
        System.out.println("Test input 25(small) and 30(large):" + smallAndLarge);
        System.out.println("*".repeat(80) + "\n");// separating line

        minMax largeAndSmall = new minMax(50,10);
        System.out.println("Test input 50(large) and 10(small):" + largeAndSmall);
        System.out.println("*".repeat(80) + "\n");// separating line

        minMax sameInput = new minMax(34,34);
        System.out.println("Test input 34 and 34(two equal numbers):" + sameInput);
        System.out.println("*".repeat(80) + "\n");// separating line

        System.out.println("Test setMin and test setMax:");
        System.out.println("Object before setMin(input 10): " + methodTest);
        methodTest.setMin(10);
        System.out.println("Object after setMin: " + methodTest);
        System.out.println("Object before setMax(input 13): " + methodTest);
        methodTest.setMax(13);
        System.out.println("Object after setMax: " + methodTest);
        System.out.println("Test for equals method:");
        System.out.println("Is object1(input 43,22) equal to object2(input 43,22): " + (test3.equals(test2) ? "Yes" : "No"));
        System.out.println("Is object1(input 23,50) equal to object2(input 43,22): " + (test.equals(test2) ? "Yes" : "No"));

        System.out.println("*".repeat(80) + "\n");// separating line


        minMax addInt = test.add(10);
        System.out.println("Object before adding integer:" + test + ',' + " after adding 10:" + addInt);
        System.out.println("*".repeat(80) + "\n");// separating line

        minMax addObject = test.add(test2);
        System.out.println("Object1:" + test +',' + " object2:" + test2 +',' + " after adding these two objects:" + addObject);
        System.out.println("*".repeat(80) + "\n");// separating line

        minMax multiplyInt = test.multiply(3);
        System.out.println("Object before multiplication:" + test +',' + " after:" + multiplyInt);
        System.out.println("*".repeat(80) + "\n");// separating line

        System.out.println("Static methods:");

        minMax addIntStatic = minMax.add(10,test);
        System.out.println("Object before adding integer:" + test + ',' + " after adding 10:" + addIntStatic);
        System.out.println("*".repeat(80) + "\n");// separating line

        minMax addObjectStatic = minMax.add(test2,test);
        System.out.println("Object1:" + test +',' + " object2:" + test2 +',' + " after adding these two objects:" + addObjectStatic);
        System.out.println("*".repeat(80) + "\n");// separating line

        minMax multiplyIntStatic = minMax.multiply(3,test);
        System.out.println("Object before multiplication:" + test +',' + " after:" + multiplyIntStatic);



    }
}
