package exercise3;

public class Mobile extends Bill{
    private String manufacturer;
    private String plan;
    private int mobileNumber;
    private double dataUsage;
    private double minutesUsed;

    public Mobile(String manufacturer, String plan, int mobileNumber, double dataUsage, double minutesUsed) {
        this.manufacturer = manufacturer;
        this.plan = plan;
        this.mobileNumber = mobileNumber;
        this.dataUsage = dataUsage;
        this.minutesUsed = minutesUsed;
    }

    public Mobile(int billID, String billDate, String billType, double billAmount, String manufacturer, String plan, int mobileNumber, double dataUsage, double minutesUsed) {
        super(billID, billDate, billType, billAmount);
        this.manufacturer = manufacturer;
        this.plan = plan;
        this.mobileNumber = mobileNumber;
        this.dataUsage = dataUsage;
        this.minutesUsed = minutesUsed;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getPlan() {
        return plan;
    }

    public void setPlan(String plan) {
        this.plan = plan;
    }

    public int getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(int mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public double getDataUsage() {
        return dataUsage;
    }

    public void setDataUsage(double dataUsage) {
        this.dataUsage = dataUsage;
    }

    public double getMinutesUsed() {
        return minutesUsed;
    }

    public void setMinutesUsed(double minutesUsed) {
        this.minutesUsed = minutesUsed;
    }
}
