package questionThree;

public class StoreClerk {
    private String firstName;
    private String lastName;
    private int storeClerkID;

    public StoreClerk() {
    }

    public StoreClerk(String firstName, String lastName, int storeClerkID) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.storeClerkID = storeClerkID;
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

    public int getStoreClerkID() {
        return storeClerkID;
    }

    public void setStoreClerkID(int storeClerkID) {
        this.storeClerkID = storeClerkID;
    }
}
