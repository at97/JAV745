import java.util.Scanner;

public class EmployeeSalaryApp {
    public static void main(String[] args) {
        // Create a scanner
        Scanner read = new Scanner(System.in);

        // Prompt user for inputs
        System.out.println("Hello accounts");
        System.out.print("Please enter the first name of the employee you wish to generate: ");
        String first_name = read.next();

        System.out.print("Please enter the last name of the employee you wish to generate: ");
        String last_name = read.next();
        String full_name = first_name + " " + last_name;

        System.out.print("Please enter the hourly wage of " + first_name + ": $");
        double wage = read.nextDouble();

        System.out.print("Please enter the number of hours worked per week: ");
        double hours = read.nextDouble();

        // Calculate gross salary
        double gross_salary = wage * hours;

        // Calculate net salary
        double tax = gross_salary * 0.25;
        double net_salary = gross_salary - tax;

        // Display information
        System.out.println("Employee name: " + full_name);
        System.out.println("Rate of pay: $" + wage);
        System.out.println("Hours worked: " + hours);
        System.out.println("Gross salary: $" + gross_salary);
        System.out.println("Tax amount: $" + tax);
        System.out.println("Net salary: $" + net_salary);
    }
}
