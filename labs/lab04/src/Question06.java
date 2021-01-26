import java.util.Scanner;

public class Question06 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter number 1: ");
        double num1 = read.nextDouble();
        System.out.print("Enter number 2: ");
        double num2 = read.nextDouble();
        System.out.println("Enter 1 for addition ");
        System.out.println("Enter 2 for subtraction ");
        System.out.println("Enter 3 for multiplication ");
        System.out.println("Enter 4 for division ");
        int code = 0;
        while (!(code >= 1 && code <= 4)) {
            System.out.print("Code: ");
            code = read.nextInt();
            if (!(code >= 1 && code <= 4)) {
                System.out.println("Code should be between 1 and 4.");
            } else {
                // Invoke method
                double result = operation(num1, num2, code);
            }
        }
    }

    public static double operation(double num1, double num2, int code) {
        double result = 0;
        if (code == 1) {
            result = num1 + num2;
            System.out.println(num1 + " + " + num2 + " = " + result);
        } else if (code == 2) {
            result = num1 - num2;
            System.out.println(num1 + " - " + num2 + " = " + result);
        } else if (code == 3) {
            result = num1 * num2;
            System.out.println(num1 + " x " + num2 + " = " + result);
        } else if (code == 4) {
            if (num2 != 0) {
                result = num1 / num2;
                // Round to 2 digits
                double quotientRound = Math.round(result * 100.0) / 100.0;
                System.out.println(num1 + " / " + num2 + " = " + quotientRound);
            } else {
                System.out.println("Cannot divide by 0");
            }
        }
        return result;
    }
}