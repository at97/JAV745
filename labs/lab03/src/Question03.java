import java.util.Scanner;

public class Question03 {
    public static void main(String[] args) {
        // Declare scanner
        Scanner read = new Scanner(System.in);

        // Declare constant
        final int LIMIT = 5;

        int counter = 0;
        double num = 0;
        double sum = 0;
        double product = 1;
        double average = 0;

        System.out.println("Enter -1 to quit");
        while (true) {
            System.out.print("Enter a number: ");
            num = read.nextDouble();
            counter++;
            if (num == -1) {
                System.out.println("Sum: " + sum);
                System.out.println("Product: " + product);
                System.out.println("Average: " + average);
                break;
            } else {
                sum += num;
                product *= num;
                average = sum / counter;
            }
        }
    }
}
