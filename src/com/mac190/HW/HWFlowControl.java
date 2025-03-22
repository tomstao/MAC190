package com.mac190.HW;

/*
Write a Java program that converts a number grade in to a letter grade.

>90 is A

80 to 90 is B and so on.
 */

import java.util.Scanner;

public class HWFlowControl {

    public static Scanner sc = new Scanner(System.in);

    public  static void main(String[] args) {
        System.out.println("Please enter the number of score:");
        int score = sc.nextInt();
        char grade;
        if (score > 90) {
            grade = 'A';
        } else if (score >= 80) {
            grade = 'B';
        } else if (score >= 70) {
            grade = 'C';
        } else {
            grade = 'F';
        }
        System.out.println("Your grade is " + grade + '!');

    }
}
