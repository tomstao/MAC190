package com.mac190.selection;

import java.util.Scanner;

public class TemperatureSwitch {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        do
        {
            System.out.println("Please choose the units you would like to convert, 1 for converting Celsius, 2 for Fahrenheit: ");

            switch (sc.nextInt()) {
                case 1: {
                    System.out.println("Please enter the temperature in Celsius: ");
                    int temp = sc.nextInt();
                    System.out.println("The temperature in Fahrenheit is: " + (temp * 9.0 / 5.0 + 32.0) + " degree!");
                }
                break;
                case 2: {
                    System.out.println("Please enter the temperature in Fahrenheit: ");
                    int temp = sc.nextInt();
                    System.out.println("The temperature in Celsius is: " + (temp * 5.0 / 9.0 - 32.0) + " degree!");
                }
                break;
                default:
                    System.out.println("Invalid input!");

            }

            System.out.println("Do you want to continue? (Press N to quit, otherwise continue) ");
            char ch = sc.next().charAt(0);
            if (ch == 'n' || ch == 'N') {
                System.out.println("Thank you for using this program!");
                break;
            }
        } while (true);

    }
}
