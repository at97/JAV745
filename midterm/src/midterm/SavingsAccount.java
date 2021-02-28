package midterm;

public class SavingsAccount extends Account{
    private String type = "Savings";

    public SavingsAccount(String type, Customer customer) {
        super(customer);
        this.type = type;
    }

    public SavingsAccount(double balance, String type, Customer customer) {
        super(balance, customer);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "SavingsAccount{" +
                "customer=" + customer +
                ", balance=" + balance +
                ", type='" + type + '\'' +
                '}';
    }
}
