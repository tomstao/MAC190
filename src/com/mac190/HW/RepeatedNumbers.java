package com.mac190.HW;

/*
Write a Java program that reads numbers from the user as long as no two same consecutive numbers are input.

When two consecutive numbers are same, the program stops and display the number of times the first entered number

was repeated.
 */

import java.util.Scanner;

public class RepeatedNumbers {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Please enter the numbers, when two consecutive numbers are same,\n" +
                "the program stops and display the number of times the first entered number was repeated.");
        System.out.println("Please enter the first number: ");
        int firstNumber  = sc.nextInt();
        int repeatedTimes = 1;
        int prevNumber = firstNumber;
        do{
            System.out.println("Pleas enter the next number: ");
            int currNumber = sc.nextInt();
            if(currNumber == firstNumber){
                repeatedTimes++;
            }
            if(currNumber == prevNumber){
                break;
            }
            prevNumber = currNumber;
        } while (true);

        if(repeatedTimes == 1){
            System.out.println("The first entered number is " + firstNumber + ", and it only appeared " + repeatedTimes + " time!");
        } else {
            System.out.println("The first entered number is " + firstNumber + ", and it repeated " + repeatedTimes + " times!");
        }

    }
}
