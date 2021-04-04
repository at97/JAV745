package exercise3;

public class Internet extends Bill {
    private String providerName;
    private double internetDataUsage;

    public Internet() {

    }

    public Internet(String providerName, double internetDataUsage) {
        this.providerName = providerName;
        this.internetDataUsage = internetDataUsage;
    }

    public Internet(int billId, String billDate, String billType, double billAmount, String providerName, double internetDataUsage) {
        super(billId, billDate, billType, billAmount);
        this.providerName = providerName;
        this.internetDataUsage = internetDataUsage;
    }

    public double getInternetDataUsage() {
        return internetDataUsage;
    }

    public void setInternetDataUsage(double internetDataUsage) {
        this.internetDataUsage = internetDataUsage;
    }

    public String getProviderName() {
        return providerName;
    }

    public void setProviderName(String providerName) {
        this.providerName = providerName;
    }
}
