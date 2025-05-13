package com.mac190.midTerm;

public class Main {

    public static void main(String[] args) {

        System.out.println("*".repeat(10) + "Separating line ------- Triangle section");

        Triangle t1 = new Triangle();
        System.out.println(t1);

        Triangle t2 = new Triangle(2);
        System.out.println(t2);

        Triangle t3 = new Triangle(3, 4);
        System.out.println(t3);

        System.out.println("Area of t3: " + t3.area());

        System.out.println("*".repeat(10) + "Separating line -------------- Pyramid section");

        Pyramid p1 = new Pyramid();
        System.out.println(p1);

        Pyramid p2 = new Pyramid(2);
        System.out.println(p2);

        Pyramid p3 = new Pyramid(3, 4, 5);
        System.out.println(p3);
        System.out.println(p3.volume());
        System.out.println(p3.add(p2));

        System.out.println("*".repeat(10) + "Separating line ---------------------- iPyramid section");

        iPyramid iP1 = new iPyramid();
        iPyramid iP2 = new iPyramid(2);
        iPyramid iP3 = new iPyramid(3, 4, 5);
        System.out.println(iP1);
        System.out.println(iP2);
        System.out.println(iP3);
        System.out.println(iP3.volume());
        iPyramid iP4 = iP3.add(iP2);
        System.out.println(iP4);
        System.out.println(iP4.volume());

    }
}
