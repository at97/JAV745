import java.util.Scanner;

public class Question05 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.print("Enter the radius of a circle: ");
        double num = read.nextDouble();

        // Invoke method
        double result = areaCircle(num);
        System.out.println("Area of circle: " + result);
    }

    public static double areaCircle(double radius) {
        final double PI = 3.14;
        double area = 0;
        area = PI * radius * radius;
        return area;
    }
}