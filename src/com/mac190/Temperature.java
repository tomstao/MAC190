package com.mac190;
/*

Write a program to convert the temperature from Fahrenheit to Celsius.
Celsius is fahr - 32 * 5 / 9

Modify the program so that is converts the temperature in both way of Fahrenheit and Celsius.

 */

import java.util.Scanner;

public class Temperature {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Please enter the temperature in Fahrenheit");
        double temperature = scanner.nextDouble();
        double celsius = (temperature-32.0)*5.0/9.0;
        System.out.println("The temperature in Celsius is " + celsius);

    }

    static public void temperatureConverter(){
        System.out.println("Please enter \"F\" for Fahrenheit or \"C\" for Celsius: ");
        char choice = scanner.next().charAt(0);
        while(choice != 'F' && choice != 'C'){
            System.out.println("Please enter the temperature in Fahrenheit");
            scanner.nextLine();
            choice = scanner.next().charAt(0);
        }
        String unitBeforeConvert = choice == 'F' ? "Fahrenheit" : "Celsius";
        System.out.println("Please enter the temperature: ");


    }
}
