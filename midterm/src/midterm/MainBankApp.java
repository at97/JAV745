package midterm;

import java.util.Scanner;
import java.util.ArrayList;

public class MainBankApp {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        // Question 1: Customer database
        ArrayList<Customer> customerDatabase = new ArrayList<Customer>();
        customerDatabase.add(new Customer("Bruce", "Wayne", "Brampton", "bWayne",
                "12345"));
        customerDatabase.add(new Customer("Thanos", "Badman", "North York", "tBadman",
                "56789"));
        customerDatabase.add(new Customer("Wonder", "Woman", "Oakville", "wWoman",
                "39087"));

        // Question 2: Account database
        ArrayList<Account> accountDatabase = new ArrayList<Account>();
        accountDatabase.add(new SavingsAccount(500, "Savings", customerDatabase.get(0)));
        accountDatabase.add(new SavingsAccount(1000, "Savings", customerDatabase.get(1)));
        accountDatabase.add(new CheckingAccount(500000, "Checking", customerDatabase.get(2), 1500));
        accountDatabase.add(new CheckingAccount(400000, "Checking", customerDatabase.get(0), 10000));

        // Question 4:

    }
}
