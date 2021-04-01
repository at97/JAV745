package exercise2;

public class RobotChicken implements IRobot, IFlyingObject {
    private int eggLayingRate;
    private String name;

    public RobotChicken() {
        this.eggLayingRate = 50;
        this.name = null;
    }

    public int getEggLayingRate() {
        return eggLayingRate;
    }

    public void setEggLayingRate(int eggLayingRate) {
        this.eggLayingRate = eggLayingRate;
    }

    public void speak() {
        System.out.println("Squawk squawk, beep beep");
    }

    @Override
    public int calculateChargingTime() {
        return eggLayingRate * 2;
    }

    @Override
    public void selfDestruct() {
        eggLayingRate = 0;
    }

    @Override
    public int getFlyingDistance() {
        return 250;
    }
}
