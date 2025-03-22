package com.mac190.SecondOrder;
/*
Write java program that solves a second order equation in the form aX^2 + bX + c = 0
Read the coefficient a, b, and c from the user.
if a is 0 then we have two cases for b
    if b is 0 then we have two cases for c
        if c is 0 then there is an infinite number of solution (0=0)
        if c is not zero then there no solution.
    if b is not zero then this is a first order equation and there is one solution: -c/b
if a is not 0 then
    Compute the dicriminant D as b square minus 4 ac there are three cases
    if D is 0 then there is one double solution -b over 2a
    if D > 0 then there are two distinct solutions: X1 is -b plus squareRoot of D over 2a
     X2 is -b minus squareRoot of D over 2a
    if D is negative then there are no real solutions.

 */

import java.util.Scanner;

public class SecondOrder {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter the coefficients as the form of aX^2 + bX + c:");
        double a = sc.nextInt();
        double b = sc.nextInt();
        double c = sc.nextInt();
        double rootCheck;

        if(a == 0) {
            if(b != 0) {
                System.out.println("The solution is: " + (-c / b));
            } else if(c != 0) {
                System.out.println("There no solution.");
            } else  {
                System.out.println("There is infinity solution.");
            }
        } else if(b != 0) {
            rootCheck = b * b - 4 * a * c;
            if(rootCheck < 0) {
                System.out.println("There is no solution.");
            } else if(rootCheck == 0) {
                System.out.println("There is one solution: " + (-b /(2 * a)));
            } else {
                System.out.println("There are two solutions: "  + ((-b + Math.sqrt(rootCheck)) /(2 * a))
                + " and " + ((-b - Math.sqrt(rootCheck)) /(2 * a)));
            }
        }

    }
}
