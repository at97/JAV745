import java.util.Scanner;

public class QuestionTen {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter the student's name: ");
        String name = input.next();
        System.out.print("Enter the student number: ");
        int num = input.nextInt();
        System.out.print("Enter the student exam score: ");
        double grade = input.nextDouble();

        if (grade < 60) {
            System.out.println("Grade: F");
        } else if (grade <= 69.9) {
            System.out.println("Grade: D");
        } else if (grade <= 79.9) {
            System.out.println("Grade: C");
        } else if (grade <= 89.9) {
            System.out.println("Grade: B");
        } else {
            System.out.println("Grade: A");
        }
    }
}
