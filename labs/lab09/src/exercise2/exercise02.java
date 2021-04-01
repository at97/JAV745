package exercise2;

public class exercise02 {
    public static void main(String[] args) {
        RobotChicken chicken1 = new RobotChicken();
        chicken1.speak();
        System.out.println("Egg laying rate: " + chicken1.getEggLayingRate() + " eggs/day");
        System.out.println("Flying distance: " + chicken1.getFlyingDistance() + " meters");
        System.out.println("Charging time: " + chicken1.calculateChargingTime() + " hours");
        chicken1.selfDestruct();
        System.out.println("Egg laying rate: " + chicken1.getEggLayingRate() + " eggs/day");
    }
}
