import java.util.Scanner;

public class Question05 {
    public static void main(String[] args) {
        // Declare scanner
        Scanner read = new Scanner(System.in);

        // Declare constant
        final int LIMIT = 6;

        int counter = 0;
        int numOdd = 0;
        double num = 0;
        double sum = 0;
        double average = 0;

        while (counter < LIMIT) {
            System.out.print("Enter a number: ");
            num = read.nextDouble();

            if (num % 2 > 0) {
                numOdd++;
                sum += num;
            }
            counter++;
        }
        average = sum / numOdd;
        System.out.println("Average of odd numbers: " + average);
    }

}
