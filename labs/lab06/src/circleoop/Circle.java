package circleoop;

public class Circle {
    private double radius;
    private static final double PI = 3.14;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double calculateArea(double radius) {
        return PI * radius * radius;
    }

    public double calculateCircumference(double radius) {
        return 2 * PI * radius;
    }
}
