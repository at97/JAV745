package circleoop;

import java.util.Scanner;

public class CircleOOP {

    public static void main(String[] args) {
        Circle circle1 = new Circle();

        Scanner read = new Scanner(System.in);
        System.out.print("Enter the radius of a circle: ");
        circle1.setRadius(read.nextDouble());

        System.out.println("Area of the circle: " + circle1.calculateArea(circle1.getRadius()));
        System.out.println("Circumference of the circle " + circle1.calculateCircumference(circle1.getRadius()));
    }
}
