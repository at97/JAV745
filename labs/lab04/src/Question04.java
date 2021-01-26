import java.util.Scanner;

public class Question04 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.print("Enter a number to cube: ");
        double num = read.nextDouble();

        // Invoke method
        double result = cube(num);
        System.out.println(num + "^3" + " = " + result);
    }

    public static double cube(double num) {
        double square = 0;
        square = num * num * num;
        return square;
    }
}