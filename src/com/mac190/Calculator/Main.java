package com.mac190.Calculator;

import java.util.Scanner;

public class Main {
    public static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        CalculatorOOP calculator = new CalculatorOOP();
        do {
            System.out.println("Please enter the expression in x (operator) y (separate by space): ");
            calculator.x = sc.nextDouble();
            calculator.op = sc.next().charAt(0);
            calculator.y = sc.nextDouble();
            calculator.calculate();
            System.out.println("Do you want to continue (y/n): ");
            char choice = sc.next().charAt(0);
            if (choice == 'n' || choice == 'N') {
                System.out.println("Thanks for using Calculator!");
                break;
            }
        } while (true);

    }
}
