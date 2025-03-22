import java.util.Scanner;

public class Variables {
    static public void main(String[] args) {

        Scanner input = new Scanner(System.in);


        // Get the value of number of students from the users.

        System.out.println("Enter the number of the students: ");
        int stuentNumber = input.nextInt();
        System.out.println("There are " + stuentNumber + " students in the class.");

        System.out.println("Enter the money in my pocket: ");
        double money = input.nextDouble();
        System.out.println("There is " + money + " dollars in the my pocket.");

        char answer;
        System.out.println("Enter your answer: ");
        answer = input.next().charAt(0);
        System.out.println("The answer is: " + answer);

        String name;
        System.out.println("Enter your name: ");
        input.nextLine();
        name = input.nextLine();
        System.out.println("My name is : " + name);



    }
}
