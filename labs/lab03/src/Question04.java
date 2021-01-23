import java.util.Scanner;

public class Question04 {
    public static void main(String[] args) {
        // Declare scanner
        Scanner read = new Scanner(System.in);

        // Declare constant
        final int LIMIT = 6;

        int num = 0;
        int counter = 0;
        int numPositive = 0;
        int sumNegative = 0;
        while (counter < LIMIT) {
            System.out.print("Enter an integer: ");
            num = read.nextInt();

            if (num > 0) {
                numPositive++;
            } else {
                sumNegative += num;
            }
            counter++;
        }
        System.out.println("Number of positive number: " + numPositive);
        System.out.println("Sum of negative numbers: " + sumNegative);
    }
}
