import java.util.Scanner;

public class QuestionEight {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter number 1: ");
        double num1 = input.nextDouble();
        System.out.print("Enter number 2: ");
        double num2 = input.nextDouble();
        System.out.println("Enter 1 for addition ");
        System.out.println("Enter 2 for subtraction ");
        System.out.println("Enter 3 for multiplication ");
        System.out.println("Enter 4 for division ");
        System.out.print("Code: ");
        int code = input.nextInt();

        if (code == 1) {
            double sum = num1 + num2;
            System.out.println(num1 + " + " + num2 + " = " + sum);
        } else if (code == 2) {
            double difference = num1 - num2;
            System.out.println(num1 + " - " + num2 + " = " + difference);
        } else if (code == 3) {
            double multiply = num1 * num2;
            System.out.println(num1 + " x " + num2 + " = " + multiply);
        } else if (code == 4) {
            double quotient = num1 / num2;
            // Round to 2 digits
            double quotientRound = Math.round(quotient * 100.0) / 100.0;
            System.out.println(num1 + " / " + num2 + " = " + quotientRound);
        } else {
            System.out.println("Enter a valid code");
        }
    }
}
