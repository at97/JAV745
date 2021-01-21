import java.util.Scanner;

public class QuestionFour {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter number 1: ");
        double num1 = input.nextDouble();
        System.out.print("Enter number 2: ");
        double num2 = input.nextDouble();

        if(num2 != 0) {
            double result = num1 / num2;
            System.out.println(num1 + " / " + num2 + " = " + result);
        } else {
            System.out.println("Cannot divide by 0");
        }
    }
}
