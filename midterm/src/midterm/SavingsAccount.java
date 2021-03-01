package midterm;

public class SavingsAccount extends Account{

    public SavingsAccount(Customer customer) {
        super(customer);
    }

    public SavingsAccount(int accountNum, double balance, String type, Customer customer) {
        super(accountNum, balance, type, customer);
    }

    @Override
    public String toString() {
        return "SavingsAccount{" +
                "accountNum=" + accountNum +
                ", customer=" + customer +
                ", balance=" + balance +
                ", type='" + type + '\'' +
                '}';
    }
}
