package rectangleOOP;

import java.util.Scanner;

public class RectangleOOP {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        Rectangle rectangle1 = new Rectangle();

        System.out.print("Enter the length: ");
        rectangle1.setLength(read.nextDouble());
        System.out.print("Enter the width: ");
        rectangle1.setWidth(read.nextDouble());

        System.out.println("The area of the rectangle is: " + rectangle1.calculateArea(rectangle1.getLength(), rectangle1.getWidth()));
        System.out.println("The perimeter of the rectangle is: " + rectangle1.calculatePerimeter(rectangle1.getLength(), rectangle1.getWidth()));
    }
}
