package com.mac190.HW;

import java.util.Scanner;


/*
    Write a program to convert temperature from Fahrenheit to Celcius
    celcius is fahr - 32 * 5/9

    Modify the program so that it converts oth ways from fahrenheit to celcius
    and from celcius to fahrenheit depending on the user's choice.
    you ask the user which conversion he/she whishes to perform.
 */

public class Temperature {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the temperature you wish to convert:");
        double temp = sc.nextDouble();
        System.out.println("Please enter \"F\" for converting Fahrenheit to Celsius or \"C\"  for converting Celsius to Fahrenheit:");
        char ch  = sc.next().charAt(0);
        sc.nextLine();
        if(ch == 'F' || ch == 'f'){
            System.out.println("The temperature "+ temp + " in Fahrenheit is " + (temp-32.0) * 5.0/9.0 + " Celsius degree!");
        } else if(ch == 'C' || ch == 'c'){
            System.out.println("The temperature " + temp + " in Celsius is " + (temp * 9.0/5.0 + 32.0) + " Fahrenheit degree!");
        } else {
            System.out.println("Invalid input!");
        }
    }
}
