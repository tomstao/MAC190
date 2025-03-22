package com.mac190.Calculator;

import java.util.Scanner;

public class Calculator {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Please enter the expression in x + y (separate by space): ");

        double x = sc.nextDouble();
        char operation = sc.next().charAt(0);
        double y = sc.nextDouble();

        switch (operation){
            case '+':
                System.out.println(x + " + " + y + " is: " + (x + y) + '!');
            break;
            case '-':
                System.out.println(x + " - " + y + " is: " + (x - y) + '!');
            break;
            case '*':
                System.out.println(x + " * " + y + " is: " + (x * y) + '!');
            break;
            case '/':
                if(y == 0){
                    System.out.println("The denominator cannot be zero!");
                    break;
                }
                System.out.println(x + " / " + y + " is:" + (x / y) + '!');
            break;
            default:
                System.out.println("Invalid input!");

        }
    }
}
