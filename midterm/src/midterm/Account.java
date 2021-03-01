package midterm;

public class Account {
    protected static int accountNum;
    protected Customer customer;
    protected double balance;
    protected String type;

    public Account(Customer customer) {
        this.customer = customer;
        accountNum++;
    }

    public Account(double balance, String type, Customer customer) {
        this.balance = balance;
        this.type = type;
        this.customer = customer;
        accountNum++;
    }

    public static int getAccountNum() {
        return accountNum;
    }

    public static void setAccountNum(int accountNum) {
        Account.accountNum = accountNum;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    // Deposit
    public void deposit(double amount) {
        if (amount < 0) {
            System.out.println("Deposit amount must be greater than or equal to $0.00");
        } else {
            balance += amount;
        }
    }

    // Withdraw
    public void withdraw(double amount) {
        if (amount < 0) {
            System.out.println("Withdrawal amount must be greater than or equal to $0.00");
        } else if (amount > balance) {
            System.out.println("The amount you are trying to withdraw exceeds your current balance");
        } else {
            balance -= amount;
        }
    }

    @Override
    public String toString() {
        return "Account{" +
                "customer=" + customer +
                ", balance=" + balance +
                ", type=" + type +
                '}';
    }
}
