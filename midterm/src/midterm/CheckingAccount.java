package midterm;

public class CheckingAccount extends Account {
    private double overdraft;

    public CheckingAccount(double overdraft, Customer customer) {
        super(customer);
        this.overdraft = overdraft;
    }

    public CheckingAccount(int accountNum, double balance, String type, Customer customer, double overdraft) {
        super(accountNum, balance, type, customer);
        this.overdraft = overdraft;
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
        if (amount < 0) {
            System.out.println("Withdrawal amount must be greater than or equal to $0.00");
        } else if (amount > (overdraft + balance)) {
            System.out.println("The amount you are trying to withdraw exceeds your current balance and overdraft");
        } else {
            balance -= amount;
        }
    }

    @Override
    public String toString() {
        return "CheckingAccount{" +
                "accountNum=" + accountNum +
                ", customer=" + customer +
                ", balance=" + balance +
                ", type='" + type + '\'' +
                ", overdraft=" + overdraft +
                '}';
    }
}
