package exercise3;

public class Bill {
    protected int billID;
    protected String billDate;
    protected String billType;
    protected double billAmount;

    public Bill() {
    }

    public Bill(int billID, String billDate, String billType, double billAmount) {
        this.billID = billID;
        this.billDate = billDate;
        this.billType = billType;
        this.billAmount = billAmount;
    }

    public int getBillID() {
        return billID;
    }

    public void setBillID(int billID) {
        this.billID = billID;
    }

    public String getBillDate() {
        return billDate;
    }

    public void setBillDate(String billDate) {
        this.billDate = billDate;
    }

    public String getBillType() {
        return billType;
    }

    public void setBillType(String billType) {
        this.billType = billType;
    }

    public double getBillAmount() {
        return billAmount;
    }

    public void setBillAmount(double billAmount) {
        this.billAmount = billAmount;
    }
}
