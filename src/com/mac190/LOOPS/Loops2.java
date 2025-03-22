package com.mac190.LOOPS;

/*

Write a java program that reads on integer from the user for the number of lines
of stars to display.(e.g 5)
Then your program display the following shape
*
**
***
****
*****

shape 2:
*****
****
***
**
*

shape 3:
    *
   **
  ***
 ****
*****

shape 4
 */

import java.util.Scanner;

public class Loops2 {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Please enter the lines:");
        int lines = sc.nextInt();
        for(int i = 0; i < lines; i++) {
            for(int j = 0; j < i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }


//        for(int i = 0; i < lines; i++) {
//            System.out.println("*".repeat(i+1));
//        }
        System.out.println();
        System.out.println("Shape2: ");
        System.out.println();
        for(int i = 0; i < lines; i++) {
            for(int j = 0; j < lines - i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("Shape3: ");
        for(int i = 0; i < lines; i++) {
            for(int j = 0; j < lines - 1 - i; j++) {
                System.out.print(" ");
            }

            for(int k = 0; k < i + 1; k++) {
                System.out.print("*");
            }

            System.out.println();
        }

        System.out.println("Shape4: ");
        for(int i = 0; i < lines; i++) {
            for(int k = 0; k < i; k++) {
                System.out.print(" ");
            }
            for(int j = 0; j < lines - i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

}
