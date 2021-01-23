import java.util.Scanner;

public class Question06 {
    public static void main(String[] args) {
        // Declare scanner
        Scanner read = new Scanner(System.in);

        // Declare constant
        final int LIMIT = 5;

        double num = 0;

        // Set the largest and smallest numbers to the first input
        System.out.print("Enter a number: ");
        num = read.nextDouble();
        double largest = num;
        double smallest = num;
        // First input has been received
        int counter = 1;

        while (counter < LIMIT) {
            System.out.print("Enter a number: ");
            num = read.nextDouble();
            counter++;

            // If this number is greater than the current largest number, update the largest number
            if (num > largest) {
                largest = num;
            } else if (num < smallest) {
                // If this number is smaller than the current smallest number, update the smallest number
                smallest = num;
            }
        }
        System.out.println("Smallest number: " + smallest);
        System.out.println("Largest number: " + largest);
    }
}
