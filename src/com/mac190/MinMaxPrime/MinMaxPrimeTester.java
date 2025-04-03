package com.mac190.MinMaxPrime;

/*
@author Tao Su

This is a Main class for testing minMac class.
 */
public class MinMaxPrimeTester {
    public static void main(String[] args) {
        MinMaxPrime testDefault = new MinMaxPrime();
        MinMaxPrime inputOneValue = new MinMaxPrime(10);
        MinMaxPrime testTwoValue = new MinMaxPrime(12, 18);
        MinMaxPrime sameInput = new MinMaxPrime(16, 16);
        MinMaxPrime test1 = new MinMaxPrime(4, 24);
        MinMaxPrime test2 = new MinMaxPrime(18, 9);
        MinMaxPrime test3 = new MinMaxPrime(3, 16);

        System.out.println("Default minMaxPrime: " + testDefault);
        System.out.println("Input 10 minMaxPrime: " + inputOneValue);
        System.out.println("Input 12,18 minMaxPrime: " + testTwoValue);
        System.out.println("Input 16,16(two same input) minMaxPrime: " + sameInput);

        System.out.println("*".repeat(20) + " Methods test below " + "*".repeat(20));
        System.out.println("Test setter and getters of MinMaxPrime:");
        System.out.println("Original MinMaxPrime: " + test3);
        test3.setMin(10);
        System.out.println("setMin(input 10): " + test3);
        test3.setMax(20);
        System.out.println("setMax(input 20): " + test3);
        System.out.println("Because setBoth method is used internally when object is created, I will omit its test.");
        System.out.println("Test getters of MinMaxPrime:");
        System.out.println(test3.getMin() + " " + test3.getMax());

        System.out.println("*".repeat(20) + " Numerical operations methods test below: " + "*".repeat(20));

        System.out.println("Object test1: " + test1);
        System.out.println("Object test2: " + test2);
        System.out.println("test1 plus int 10:");
        MinMaxPrime testPlusInt = test1.add(10);
        System.out.println(testPlusInt);
        System.out.println("test1 plus test2:");
        MinMaxPrime testPlusTest2 = test1.add(test2);
        System.out.println(testPlusTest2);
        System.out.println("Test test1 multiply by 10:");
        MinMaxPrime timeTen = test1.multiply(10);
        System.out.println(timeTen);
        System.out.println("Test test1 multiply by -10(negative multiplier, because prime can't be negative,\n" + "it will " +
                " become 2 if the program work properly):");
        MinMaxPrime testMultiplyByNegative = test1.multiply(-10);
        System.out.println(testMultiplyByNegative);
        System.out.println("*".repeat(20) + " Static methods test below: " + "*".repeat(20));

        System.out.println("test1 plus int 10:");
        MinMaxPrime testPlusIntStatic = MinMaxPrime.add(10, test1);
        System.out.println(testPlusIntStatic);
        System.out.println("test1 plus test2:");
        MinMaxPrime testPlusTest2Static = MinMaxPrime.add(test1, test2);
        System.out.println(testPlusTest2Static);
        System.out.println("Test test1 multiply by 10:");
        MinMaxPrime timeTenStatic = MinMaxPrime.multiply(10, test1);
        System.out.println(timeTenStatic);
        System.out.println("Test test1 multiply by -10(negative multiplier, because prime can't be negative,\n" + "it will " +
                " become 2 if the program work properly):");
        MinMaxPrime timeNegativeStatic = MinMaxPrime.multiply(-10, test1);
        System.out.println(timeNegativeStatic);
        System.out.println("*".repeat(20) + " equals method test below: ");
        MinMaxPrime test4 = new MinMaxPrime(4, 24);
        System.out.println("The value of the object test4 for comparison: " + test4);
        System.out.println("test1(4,24) equals test4(4,24)? " + (test1.equals(test4) ? "Yes" : "No"));
        System.out.println("test1(4,24) equals test2(18,9)? " + (test1.equals(test2) ? "Yes" : "No"));

    }
}
