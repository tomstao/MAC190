package com.mac190.MinMaxPrime;
/*
@author Tao Su

This is a Main class for testing minMac class.
 */
public class MinMaxTester {
    public static void main(String[] args) {
        MinMaxPrime test = new MinMaxPrime(23,50);
        MinMaxPrime test2 = new MinMaxPrime(43,22);
        MinMaxPrime test3 = new MinMaxPrime(43,22);
        MinMaxPrime methodTest = new MinMaxPrime(13,40);
        MinMaxPrime defaultObject = new MinMaxPrime();
        System.out.println("Test default constructor:" + defaultObject);

        System.out.println("*".repeat(80) + "\n");// separating line

        MinMaxPrime oneInput = new MinMaxPrime(74);
        System.out.println("Test oneInput constructor(input 74):" + oneInput);
        System.out.println("*".repeat(80) + "\n");// separating line


        MinMaxPrime smallAndLarge = new MinMaxPrime(25,30);
        System.out.println("Test input 25(small) and 30(large):" + smallAndLarge);
        System.out.println("*".repeat(80) + "\n");// separating line

        MinMaxPrime largeAndSmall = new MinMaxPrime(50,10);
        System.out.println("Test input 50(large) and 10(small):" + largeAndSmall);
        System.out.println("*".repeat(80) + "\n");// separating line

        MinMaxPrime sameInput = new MinMaxPrime(34,34);
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
        System.out.println("*".repeat(25) + "test getMinPrime()/getMax()(it should be 10/13 ): " + methodTest.getMinPrime() + "/" + methodTest.getMaxPrime());

        System.out.println("*".repeat(80) + "\n");// separating line


        MinMaxPrime addInt = test.add(10);
        System.out.println("Object before adding integer:" + test + ',' + " after adding 10:" + addInt);
        System.out.println("*".repeat(80) + "\n");// separating line

        MinMaxPrime addObject = test.add(test2);
        System.out.println("Object1:" + test +',' + " object2:" + test2 +',' + " after adding these two objects:" + addObject);
        System.out.println("*".repeat(80) + "\n");// separating line

        MinMaxPrime multiplyInt = test.multiply(3);
        System.out.println("Object before multiplication(multiply by 3):" + test +',' + " after:" + multiplyInt);
        System.out.println("*".repeat(80) + "\n");// separating line
        System.out.println("Test multiply by negative:");
        MinMaxPrime multiplyByNegative = test.multiply(-3);
        System.out.println("Test multiply by negative(-3):" + test +',' + " after:" + multiplyByNegative);
        System.out.println("*".repeat(20) + "Static methods:");

        MinMaxPrime addIntStatic = MinMaxPrime.add(10,test);
        System.out.println("Object before adding integer:" + test + ',' + " after adding 10:" + addIntStatic);

        MinMaxPrime addObjectStatic = MinMaxPrime.add(test2,test);
        System.out.println("Object1:" + test +',' + " object2:" + test2 +',' + " after adding these two objects:" + addObjectStatic);

        MinMaxPrime multiplyIntStatic = MinMaxPrime.multiply(3,test);
        System.out.println("Object before multiplication(multiply by 3):" + test +',' + " after:" + multiplyIntStatic);
        MinMaxPrime m1 = new MinMaxPrime(2,8);
        m1.setMax(-1);
        m1.setMin(6);
        MinMaxPrime m2 = m1.add(3);
        MinMaxPrime m3 = m1.add(m2);
        m3 = m3.multiply(-2);
        System.out.println(m3);
        m3 = m2.add(-4).add(m1).add(m3.multiply(-2));
        System.out.println(m3);


    }
}
