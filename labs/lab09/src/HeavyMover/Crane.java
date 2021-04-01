package HeavyMover;

public class Crane implements HeavyMoverObject{
    private Boolean hasGas;

    public Crane() {
        this.hasGas = true;
    }

    public Crane(boolean gas) {
        this.hasGas = gas;
    }

    public Boolean getHasGas() {
        return hasGas;
    }

    public void setHasGas(Boolean hasGas) {
        this.hasGas = hasGas;
    }

    @Override
    public void movesObject(){
        if (hasGas) {
            System.out.println("Moving object now!");
        } else {
            System.out.println("Cannot move object, not enough gas.");
        }
    }
}