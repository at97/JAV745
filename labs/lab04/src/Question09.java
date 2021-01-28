import java.util.Scanner;

public class Question09 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter your monthly salary: ");
        double salary = read.nextDouble();

        double tax = calculate(salary);
        System.out.println("Monthly gross salary: " + tax);
    }

    public static double calculate(double salary) {
        final double TAX = 0.24;
        final double ALLOWANCE = 1500;

        double taxableSalary = salary - ALLOWANCE;
        double tax = taxableSalary + (TAX * taxableSalary);
        return tax;
    }
}
