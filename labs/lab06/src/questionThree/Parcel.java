package questionThree;

public class Parcel {
    private double weight;

    public Parcel() {
    }

    public Parcel(double weight) {
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double calCost(double weight) {
        double cost;
        if (weight < 2.5) {
            cost = 3.5 * weight;
        } else if (weight < 5) {
            cost = 2.85 * weight;
        } else if (weight < 7) {
            cost = 2.45 * weight;
        } else {
            cost = 3.25 * weight;
        }
        return cost;
    }
}
