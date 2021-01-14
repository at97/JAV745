import java.util.Scanner;

public class QuestionTwo {
    public static void main(String[] args) {
        // Create a scanner
        Scanner read = new Scanner(System.in);

        // Prompt user for inputs
        System.out.print("Please enter the radius of a circle: ");
        double radius = read.nextDouble();

        // Calculate area of circle
        double area = 3.1415926 * radius * radius;

        // Display information
        System.out.println("The area of the circle is " + area);
    }
}
