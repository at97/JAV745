package exercise3;

public class Customer implements IDisplay{
    private int customerID;
    private String firstName;
    private String lastName;
    private String fullName;
    private String email;
    private Bill[] BillArray = new Bill[3];
    private double totalAmount;

    public Customer(int customerID, String firstName, String lastName, String email, Bill[] billArray, double totalAmount) {
        this.customerID = customerID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.fullName = this.firstName + this.lastName;
        this.email = email;
        BillArray = billArray;
        this.totalAmount = totalAmount;
    }

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Bill[] getBillArray() {
        return BillArray;
    }

    public void setBillArray(Bill[] billArray) {
        BillArray = billArray;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    @Override
    public void display() {
        System.out.println("Customer ID: " + customerID);
        System.out.println("Customer Full Name: " + fullName);
        System.out.println("Customer Email ID: " + email);
        System.out.println();
    }
}
