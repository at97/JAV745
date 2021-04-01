package HeavyMover;

public class Elephant implements HeavyMoverObject{
    public String name;
    static int b;

    public Elephant() {
        this.name = null;
    }

    public Elephant(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void movesObject(){
        System.out.println("I am moving objects with my trunk!");
    }
}
