package com.mac190.SecondOrder;

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
            do {
            CsecondOrder cs = new CsecondOrder();
            System.out.println("Enter the coefficients as the form of aX^2 + bX + c:");
            cs.a = sc.nextInt();
            cs.b = sc.nextInt();
            cs.c = sc.nextInt();
            cs.solve();
                System.out.println("Do you want to continue? Enter N for exiting otherwise continue:");
                char choice = sc.next().charAt(0);
                if(choice == 'N' || choice == 'n') {
                    System.out.println("Thanks for using the program!");
                    break;
                }
            } while (true);
    }
}


