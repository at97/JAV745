import java.util.Scanner;

public class Question02 {
    public static void main(String[] args) {
        // Declare scanner
        Scanner read = new Scanner(System.in);

        // Declare constants
        final int EXIT = -1;
        final int LIMIT = 12;

        System.out.println("Multiplication table");
        System.out.println("Enter -1 to quit");

        while (true) {
            // Prompt for user input
            System.out.print("Enter a number: ");
            int multiplier = read.nextInt();
            if (multiplier == EXIT) {
                System.out.println("Finished");
                break;
            } else {
                for (int i = 0; i <= LIMIT; i++) {
                    int product = 0;
                    product = i * multiplier;
                    System.out.println(i + " * " + multiplier + " = " + product);
                }
            }
            System.out.print("\n");
        }

    }
}
