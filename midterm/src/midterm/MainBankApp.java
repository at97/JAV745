package midterm;

import java.util.Scanner;
import java.util.ArrayList;

public class MainBankApp {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        // Question 1: Customer database
        ArrayList<Customer> customerDatabase = new ArrayList<>();
        customerDatabase.add(new Customer("Bruce", "Wayne", "Brampton", "bWayne",
                "12345"));
        customerDatabase.add(new Customer("Thanos", "Badman", "North York", "tBadman",
                "56789"));
        customerDatabase.add(new Customer("Wonder", "Woman", "Oakville", "wWoman",
                "39087"));

        // Question 2: Account database
        ArrayList<Account> accountDatabase = new ArrayList<>();
        accountDatabase.add(new SavingsAccount(1, 500, "Savings", customerDatabase.get(0)));
        accountDatabase.add(new SavingsAccount(2, 1000, "Savings", customerDatabase.get(1)));
        accountDatabase.add(new CheckingAccount(3, 500000, "Checking", customerDatabase.get(2), 1500));
        accountDatabase.add(new CheckingAccount(4, 400000, "Checking", customerDatabase.get(0), 10000));

        // Question 4: Ask for login info + account type
        boolean validLogin = false;
        Customer userCustomer = null;
        // Prompt user to enter login details until a match is found
        while (!validLogin) {
            System.out.print("Username: ");
            String username = read.nextLine();
            System.out.print("Password: ");
            String password = read.nextLine();
            // Check if username and password match
            userCustomer = verifyLoginInformation(customerDatabase, username, password);
            if (userCustomer != null) {
                System.out.println("Welcome " + userCustomer.getName());
                validLogin = true;
            }
        }
        // Prompt user to enter account type
        boolean validAccountOption = false;
        Account userAccount = null;
        while (!validAccountOption) {
            System.out.println("\nAccount type: \nEnter 'C' or 'c' for checking Account");
            System.out.println("Enter 'S' or 's' for savings Account");
            System.out.print("Please enter an option: ");
            char userAccountOption = read.next().charAt(0);
            if (userAccountOption == 'C' || userAccountOption == 'c') {
                // Check if user has that account
                userAccount = verifyAccountType(accountDatabase, userCustomer, "Checking");
                if (userAccount != null) {
                    validAccountOption = true;
                }
            } else if (userAccountOption == 'S' || userAccountOption == 's') {
                userAccount = verifyAccountType(accountDatabase, userCustomer, "Savings");
                if (userAccount != null) {
                    validAccountOption = true;
                }
            } else {
                // Invalid account type
                System.out.println("Error: select a valid account type");
            }
        }

        // Question 5: Banking operations
        // Prompt user to select banking operation
        boolean validOperation = false;
        while (!validOperation) {
            // Display operations menu
            operationsMenu(userCustomer, userAccount);
            char userBankingOperation = read.next().charAt(0);

            if (userBankingOperation == 'D' || userBankingOperation == 'd') {
                // Deposit
                System.out.print("Enter amount to deposit: $");
                double depositAmount = read.nextDouble();
                userAccount.deposit(depositAmount);
            } else if (userBankingOperation == 'W' || userBankingOperation == 'w') {
                // Withdrawal
                System.out.print("Enter amount to withdraw: $");
                double withdrawalAmount = read.nextDouble();
                userAccount.withdraw(withdrawalAmount);
            } else if (userBankingOperation == 'X' || userBankingOperation == 'x') {
                // Exit
                System.out.println("Goodbye!");
                validOperation = true;
            } else {
                // Invalid operation
                System.out.println("Error: select a valid operation");
            }
        }
    }

    public static Customer verifyLoginInformation(ArrayList<Customer> customerDatabase, String username, String password) {
        for (int i = 0; i < customerDatabase.size(); i++) {
            if ((username.equals(customerDatabase.get(i).getUsername())) && (password.equals(customerDatabase.get(i).getPassword()))) {
                // Match found: return user
                return customerDatabase.get(i);
            }
        }
        // Incorrect login information
        System.out.println("Invalid login information");
        return null;
    }

    public static Account verifyAccountType(ArrayList<Account> accountDatabase, Customer customer, String accountType) {
        for (int i = 0; i < accountDatabase.size(); i++) {
            if ((accountDatabase.get(i).getCustomer().equals(customer)) && (accountType.equals(accountDatabase.get(i).getType()))) {
                // Match found: return account
                return accountDatabase.get(i);
            }
        }
        // User does not have that account type
        System.out.println("You do not have a " + accountType + " account");
        return null;
    }

    public static void operationsMenu(Customer userCustomer, Account userAccount) {
        System.out.println("\nName: " + userCustomer.getName());
        System.out.printf("Balance: $%.2f\n", userAccount.getBalance());
        System.out.println("Account type: " + userAccount.getType());
        System.out.println("Operation: \nEnter D or 'd' to deposit");
        System.out.println("Enter W or 'w' to withdraw");
        System.out.println("Enter x or 'X' to exit app");
        System.out.print("Please select an operation: ");
    }
}
