package com.mac190.Calculator;
/*
Implement the calculator program as a class.
One class calculator that has three member variables" two doubles and one char'
a method calculate that show the result of the operation.

The second class you implement the main in which you ask the user for an expression,



 */


public class CalculatorOOP {
    double x;
    double y;
    char op;
    public void calculate() {
        switch (op){
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
