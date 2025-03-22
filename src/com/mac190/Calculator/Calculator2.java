package com.mac190.Calculator;

import java.util.Scanner;

public class Calculator2 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Please enter the expression: ");
        String exp = sc.nextLine();
        double x;
        double y;
        if(exp.contains("+")) {
            x = (Double.parseDouble(exp.substring(0, exp.indexOf("+"))));
            y = (Double.parseDouble(exp.substring(exp.indexOf("+")+1)));
            System.out.println(x + " + " + y + " = " + (x + y));
        } else if(exp.contains("-")) {
            x = (Double.parseDouble(exp.substring(0, exp.indexOf("-"))));
            y = (Double.parseDouble(exp.substring(exp.indexOf("-")+1)));
            System.out.println(x + " - " + y + " = " + (x - y));
        } else if(exp.contains("*")) {
            x = (Double.parseDouble(exp.substring(0, exp.indexOf("*"))));
            y = (Double.parseDouble(exp.substring(exp.indexOf("*")+1)));
            System.out.println(x + " * " + y + " = " + (x * y));
        } else if(exp.contains("/")) {
            x = (Double.parseDouble(exp.substring(0, exp.indexOf("/"))));
            y = (Double.parseDouble(exp.substring(exp.indexOf("/")+1)));
            if(y == 0) {
                System.out.println("The denominator cannot be zero!");
            } else {
                System.out.println(x + " / " + y + " = " + (x / y));
            }

        } else {
            System.out.println("Invalid input!");
        }

    }
}
