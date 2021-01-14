import java.util.Scanner;

public class QuestionOne {
    public static void main(String[] args) {
        // Create a scanner
        Scanner read = new Scanner(System.in);

        // Prompt user for inputs
        System.out.print("Please enter the first integer: ");
        int int_1 = read.nextInt();

        System.out.print("Please enter the second integer: ");
        int int_2 = read.nextInt();

        // Calculate sum
        int sum = int_1 + int_2;

        // Display information
        System.out.println("Number one: " + int_1);
        System.out.println("Number two: " + int_2);
        System.out.println("Sum: " + sum);

    }
}
