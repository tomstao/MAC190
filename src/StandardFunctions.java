import java.util.Scanner;

public class StandardFunctions {
    /*
    Write a Java program in which you compute the following:
    get a double input.
    Computer its square root
    its fourth power.
    its fifth root.

     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number you want to compute root: ");
        double num = sc.nextDouble();
        sc.nextLine();
        System.out.println("Please enter a number for the root: ");
        double power = sc.nextDouble();

        double root = Math.pow(num, power);
        System.out.println("The number for computing is " + num + ", the power is " + power +
               " ,the root is : " + root);


        num = sc.nextDouble();
        sc.nextLine();
        double fifthRoot = Math.pow(num, 1.0 / 5.0);
        System.out.println("The fifth root of " +num + " is " + fifthRoot);
        num = sc.nextDouble();
        sc.nextLine();
        double fourthPower = Math.pow(num, 4.0);
        System.out.println("The fourth root of " +num + " is " + fourthPower);

        num = sc.nextDouble();
        sc.nextLine();
        double squareRoot = Math.sqrt(num);
        System.out.println("The square root of " +num + " is " + squareRoot);

    }

}
