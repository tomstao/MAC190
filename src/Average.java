import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number for calculating average: ");
        int ave1 = sc.nextInt();
        System.out.println("Enter the second number for calculating average: ");
        int ave2 = sc.nextInt();
        System.out.println("Enter the third number for calculating average: ");
        int ave3 = sc.nextInt();
        int sum = ave1 + ave2 + ave3;
        double avg = (double)sum/3;
        System.out.println("The total of the three numbers is " + sum +  " ,the average is " + avg );
    }
}
