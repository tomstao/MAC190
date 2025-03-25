package com.mac190.GetterAndSetter;

public class CsecondOrder {
    private double a;
    private double b;
    private double c;


    public void solve() {
        if(a == 0) {
            if(b != 0) {
                System.out.println("The solution is: " + (-c / b));
            } else if(c != 0) {
                System.out.println("There no solution.");
            } else  {
                System.out.println("There is infinity solution.");
            }
        } else if(b != 0) {
            double rootCheck = b * b - 4 * a * c;
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

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }
}
