package HeavyMover;

public class Main {
    public static void main(String[] args) {
        Elephant elephant = new Elephant();
        Crane crane = new Crane();
        elephant.movesObject();
        crane.movesObject();
        crane.setGas(0);
        System.out.println("Crane gas: " + crane.getGas());
        crane.movesObject();
    }
}
