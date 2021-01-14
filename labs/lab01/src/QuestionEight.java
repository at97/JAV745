import java.util.Scanner;

public class QuestionEight {
    public static void main(String[] args) {
        // Create a scanner
        Scanner read = new Scanner(System.in);

        // Prompt user for inputs
        System.out.print("Enter your first name: ");
        String first_name = read.next();
        System.out.print("Enter your last name: ");
        String last_name = read.next();
        System.out.print("Enter your parcel weight in grams: ");
        double weight = read.nextDouble();

        // Convert pounds to kilograms
        double weight_grams = weight / 1000;

        // Display output
        System.out.printf("%s %s, your weight is %.2f kg.", first_name, last_name, weight_grams);
    }
}
