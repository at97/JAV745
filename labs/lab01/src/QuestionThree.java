import java.util.Scanner;

public class QuestionThree {
    public static void main(String[] args) {
        // Create a scanner
        Scanner read = new Scanner(System.in);

        // Prompt user for inputs
        System.out.print("Please enter the length of the rectangle: ");
        double length = read.nextDouble();
        System.out.print("Please enter the width of the rectangle: ");
        double width = read.nextDouble();

        // Calculate perimeter of rectangle
        double perimeter = 2 * (length + width);

        // Display information
        System.out.println("The perimeter of the rectangle is " + perimeter);
    }
}
