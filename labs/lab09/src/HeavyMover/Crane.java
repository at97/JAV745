package HeavyMover;

public class Crane implements HeavyMoverObject{
    private double gas;

    public Crane() {
        this.gas = 100;
    }

    public Crane(double gas) {
        this.gas = gas;
    }

    public double getGas() {
        return gas;
    }

    public void setGas(double gas) {
        this.gas = gas;
    }

    @Override
    public void movesObject(){
        if (gas > 0) {
            System.out.println("Moving object now!");
        } else {
            System.out.println("Cannot move object, not enough gas.");
        }
    }
}