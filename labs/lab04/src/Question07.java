import java.util.Scanner;

public class Question07 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter a number: ");
        double num = read.nextDouble();

        boolean result = isEven(num);
        if (result) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }

    public static boolean isEven(double num) {
        if (num % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
}
