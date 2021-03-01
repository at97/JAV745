package midterm;

public class SavingsAccount extends Account{

    public SavingsAccount(Customer customer) {
        super(customer);
    }

    public SavingsAccount(double balance, String type, Customer customer) {
        super(balance, type, customer);
    }

    @Override
    public String toString() {
        return "SavingsAccount{" +
                "customer=" + customer +
                ", balance=" + balance +
                '}';
    }
}
