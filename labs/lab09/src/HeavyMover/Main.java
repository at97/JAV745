package HeavyMover;

public class Main {
    public static void main(String[] args) {
        Elephant elephant = new Elephant();
        Crane crane = new Crane();
        elephant.movesObject();
        crane.movesObject();
        crane.setHasGas(false);
        System.out.println("Crane has gas: " + crane.getHasGas());
        crane.movesObject();
    }
}
