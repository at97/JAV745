import java.util.Scanner;

public class Question02 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.print("Enter number 1: ");
        double num1 = read.nextDouble();
        System.out.print("Enter number 2: ");
        double num2 = read.nextDouble();

        // Invoke method
        double result = sum(num1, num2);
        System.out.println(num1 + " + " + num2 + " = " + result);
    }

    public static double sum(double num1, double num2) {
        double sum = 0;
        sum = num1 + num2;
        return sum;
    }
}
