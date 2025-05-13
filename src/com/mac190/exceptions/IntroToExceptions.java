package com.mac190.exceptions;

import java.util.NoSuchElementException;
import java.util.Scanner;

/*
We use exception to manage errors or handle errors that are out of our control.
There are two main kinds of exceptions



 */
public class IntroToExceptions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter an integer:");
        int n = sc.nextInt();
        try {
            throwCheckExceptions(n);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        } finally {
            System.out.println("Program terminated");
        }

        // Unchecked exception does not need to add exception signature.
        try {
            throwMeAnUncheckedException(n);
        } catch (Exception e) {
            System.out.println("Caught an exception: " + e.getMessage());
        }
    }

    public static void throwCheckExceptions(int a) throws Exception {

        if (a < 10) {
            System.out.println("No exceptions," + a);
        } else if (a < 30) {
            // throw an exception
            throw new MyExceptions("a is larger than 0->" + a);
            // either you catch this exception here, which does not make sense
            // Or you forward the exception to the caller, using throws header
        } else {
            throw new MyExceptions("a is larger than 30");
        }
    }

    public static void throwMeAnUncheckedException(int a) throws Exception {
        if (a > 5) {
            System.out.println("No exceptions for greater than 5," + a);
        } else {
            throw new NoSuchElementException("a is smaller than 5->" + a);
        }
    }


}
