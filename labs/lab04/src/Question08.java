import java.util.Scanner;

public class Question08 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter total sales made this month: ");
        double sales = read.nextDouble();
        System.out.print("Enter your monthly salary: ");
        double salary = read.nextDouble();

        double grossSalary = calculate(sales, salary);
        System.out.println("Monthly gross salary: " + grossSalary);

    }

    public static double calculate(double sales, double salary) {
        final double commission = 0.08;

        double grossSalary = salary + (commission * sales);
        return grossSalary;
    }
}
