package exercise3;

public class Hydro extends Bill{
    private String agencyName;
    private int unitConsumed;

    public Hydro(String agencyName, int unitConsumed) {
        this.agencyName = agencyName;
        this.unitConsumed = unitConsumed;
    }

    public Hydro(int billID, String billDate, String billType, double billAmount, String agencyName, int unitConsumed) {
        super(billID, billDate, billType, billAmount);
        this.agencyName = agencyName;
        this.unitConsumed = unitConsumed;
    }

    public String getAgencyName() {
        return agencyName;
    }

    public void setAgencyName(String agencyName) {
        this.agencyName = agencyName;
    }
}
