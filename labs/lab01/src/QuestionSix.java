import java.util.Scanner;

public class QuestionSix {
    public static void main(String[] args) {
        // Create a scanner
        Scanner read = new Scanner(System.in);

        // Prompt user for inputs
        System.out.print("Enter the name of the item: ");
        String item_title = read.next();
        System.out.print("Enter the item number: ");
        int item_number = read.nextInt();
        System.out.print("Enter the item price: $");
        double item_price = read.nextDouble();
        System.out.print("Enter the item discount as a percentage (e.g. 20 for 20% off): ");
        double item_discount = read.nextDouble();

        // Calculate discounted amount
        double discounted_amount = item_price * (item_discount/100);

        // Calculate discount price
        double discount_price = item_price - discounted_amount;

        // Output information
        System.out.printf("Original price of %s: $%.2f \n", item_title, item_price);
        System.out.printf("Discounted amount: $%.2f \n", discounted_amount);
        System.out.printf("New price: $%.2f \n", discount_price);

    }
}
