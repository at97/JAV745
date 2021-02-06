import java.sql.SQLOutput;
import java.util.Scanner;

public class PoSSystem {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.print("Enter your first name: ");
        String first_name = read.nextLine();
        System.out.print("Enter your last name: ");
        String last_name = read.nextLine();
        System.out.print("Enter how many categories you want to purchase from: ");
        int categories = read.nextInt();
        System.out.print("Enter the discount as a percent: ");
        double discount = read.nextDouble();

        // Ask for item inputs
        int[] item_num_array = new int[categories];
        String[] item_desc_array = new String[categories];
        double[] unit_price_array = new double[categories];
        int[] quantity_array = new int[categories];
        double[] extended_price_array = new double[categories];

        for (int i = 1; i < categories + 1; i++) {
            System.out.println("Item category " + i);
            System.out.print("Enter the item number: ");
            item_num_array[i - 1] = read.nextInt();
            // Clear buffer
            read.nextLine();
            System.out.print("Enter a description of the item: ");
            item_desc_array[i - 1] = read.nextLine();
            System.out.print("Enter the unit price of the item: $");
            unit_price_array[i - 1] = read.nextDouble();
            System.out.print("Enter the quantity you would like to purchase: ");
            quantity_array[i - 1] = read.nextInt();
            extended_price_array[i - 1] = unit_price_array[i - 1] * quantity_array[i - 1];
            System.out.println();
        }

        // Calculate grand total
        double total = grandTotal(extended_price_array);

        // Calculate final total
        double discounted_amount = total * (discount/100);
        double final_total = finalTotal(total, discount);

        // Cash
        double cash_amount = getCash(final_total);
        double change = cash_amount - final_total;

        // Output
        displayOutput(first_name, last_name, item_num_array, item_desc_array, unit_price_array, quantity_array,
                extended_price_array, total, discounted_amount, final_total, cash_amount, change);
    }

    public static double grandTotal(double[] array) {
        double total = 0.0;
        for (int i = 0; i < array.length; i++) {
            total += array[i];
        }
        return total;
    }

    public static double finalTotal(double total, double discount) {
        return total - (total * (discount / 100));
    }

    public static double getCash(double final_total) {
        Scanner read = new Scanner(System.in);
        System.out.printf("Total: $%.2f\n", final_total);
        System.out.print("Enter payment: $");
        double cash_amount = read.nextDouble();
        double amount_owed = final_total - cash_amount;
        while (amount_owed > 0) {
            System.out.printf("Please pay the additional $%.2f\n", amount_owed);
            System.out.print("Enter payment: $");
            double remainder = read.nextDouble();
            amount_owed -= remainder;
            cash_amount += remainder;
        }
        return cash_amount;
    }

    public static void displayOutput(String first_name, String last_name, int[] item_num, String[] item_desc, double[] unit_price,
                                     int[] quantity, double[] extended_price, double grand_total,
                                     double discounted_amount, double final_total, double cash, double change) {
        System.out.println("------------------------------------------------------");
        System.out.println("Bill for " + first_name + " " + last_name);
        System.out.println("------------------------------------------------------");
        for (int i = 1; i < item_num.length + 1; i++) {
            System.out.println("Item category " + i);
            System.out.println("Item number: " + item_num[i - 1 ]);
            System.out.println("Item description: " + item_desc[i - 1]);
            System.out.printf("Unit price: $%.2f\n", unit_price[i - 1]);
            System.out.println("Item quantity: " + quantity[i - 1]);
            System.out.printf("Extended price: $%.2f\n", extended_price[i - 1]);
            System.out.println();
        }
        System.out.printf("Grand total: $%.2f\n", grand_total);
        System.out.printf("Discounted amount: $%.2f\n", discounted_amount);
        System.out.println("------------------------------------------------------");
        System.out.printf("Final price: $%.2f\n", final_total);
        System.out.println("------------------------------------------------------");
        System.out.printf("Cash tendered: $%.2f\n", cash);
        System.out.printf("Change: $%.2f\n", change);
    }
}
