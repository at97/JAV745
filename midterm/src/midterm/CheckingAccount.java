package midterm;

public class CheckingAccount extends Account{
    private double overdraft;
    private String type;

    public CheckingAccount(double overdraft, String type, Customer customer) {
        super(customer);
        this.overdraft = overdraft;
        this.type = type;
    }

    public CheckingAccount(double balance, String type, Customer customer, double overdraft) {
        super(balance, customer);
        this.overdraft = overdraft;
        this.type = type;
    }

    public double getOverdraft() {
        return overdraft;
    }

    public void setOverdraft(double overdraft) {
        this.overdraft = overdraft;
    }

    // Withdraw
    @Override
    public void withdraw(double amount) {
        if (amount > (overdraft + balance)) {
            System.out.println("The amount you are trying to withdraw exceeds your current balance and overdraft");
        } else {
            balance -= amount;
            System.out.printf("Successfully withdrawn $%.2f\nUpdated Balance: $%.2f", amount, balance);
        }
    }

    @Override
    public String toString() {
        return "CheckingAccount{" +
                "customer=" + customer +
                ", balance=" + balance +
                ", type='" + type + '\'' +
                ", overdraft=" + overdraft +
                '}';
    }
}
